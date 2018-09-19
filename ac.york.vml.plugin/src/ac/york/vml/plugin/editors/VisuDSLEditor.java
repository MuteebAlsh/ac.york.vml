package ac.york.vml.plugin.editors;

import java.io.IOException;
import java.util.List;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import ac.york.vml.plugin.widget.chart.AbstractChartBuilder;
import ac.york.vml.plugin.widget.chart.BarChartBuilder;
import ac.york.vml.plugin.widget.chart.GraphWidget;
import ac.york.vml.plugin.widget.chart.LineChartBuilder;
import ac.york.vml.plugin.widget.chart.PieChartBuilder;
import ac.york.vml.plugin.widget.chart.ScatterChartBuilder;
import ac.york.vml.plugin.widget.chart.TableWidget;
import vml.BarChart;
import vml.Diagram;
import vml.LineChart;
import vml.Model;
import vml.Pie;
import vml.Scatter;
import vml.VmlPackage;

public class VisuDSLEditor extends EditorPart implements IResourceChangeListener, IVisuDSLEditor {

	protected Resource resource;
	protected IFile file;
	protected Chart chart;

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);

		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		if (input instanceof FileEditorInput) {
			FileEditorInput fileInputEditor = (FileEditorInput) input;
			file = fileInputEditor.getFile();
			setPartName(file.getName());
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(VmlPackage.eINSTANCE.getNsURI(), VmlPackage.eINSTANCE);
			resource = resourceSet.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
			try {
				resource.load(null);
			} catch (IOException e) {
				throw new PartInitException(e.getMessage(), e);
			}
		}
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parentElement) {

		Model model = (Model) resource.getContents().get(0);

		CTabFolder tabs = new CTabFolder(parentElement, SWT.BOTTOM);
		List<Diagram> iteratorGraph = model.getDiagrams();

		for (Diagram diagram : iteratorGraph) {
			CTabItem item = new CTabItem(tabs, SWT.NONE);

			Composite diagramComposite = new Composite(tabs, SWT.NONE);
			diagramComposite.setLayout(new FillLayout());
			item.setControl(diagramComposite);

			if (diagram instanceof vml.Graph) {

				createGraph(tabs, diagram, item, diagramComposite);

			} else if (diagram instanceof Pie) {
				createPie(diagram, item, diagramComposite);

			} else if (diagram instanceof BarChart) {
				createBarChart(diagram, item, diagramComposite);
			} else if (diagram instanceof LineChart) {
				createLineChart(diagram, item, diagramComposite);

			} else if (diagram instanceof Scatter) {
				createScatterChart(diagram, item, diagramComposite);

			}
		}
		createTable(model, tabs);

		tabs.setSelection(0);
	}

	private void createTable(Model model, CTabFolder tabs) {
		List<vml.Table> iteratorTable = model.getTables();

		for (vml.Table table : iteratorTable) {

			CTabItem item = new CTabItem(tabs, SWT.NONE);

			Composite tableComposite = new Composite(tabs, SWT.NONE);
			tableComposite.setLayout(new FillLayout());
			item.setControl(tableComposite);

			vml.Table vmlTable = (vml.Table) table;

			if (vmlTable.getTableTitle() == null) {
				item.setText("Table");
			} else
				item.setText(vmlTable.getTableTitle());
			item.setData(vmlTable);

			TableWidget tableWidget = new TableWidget(tableComposite, SWT.None, table);

		}
	}

	private void createScatterChart(Diagram diagram, CTabItem item, Composite diagramComposite) {
		Scatter scatter = (Scatter) diagram;
		Chart chart = createChart(scatter);
		item.setText(scatter.getTitle() != null ? scatter.getTitle() : "Untitiled");

		ChartCanvas canvas = new ChartCanvas(diagramComposite, SWT.NONE);
		canvas.setChart(chart);
		canvas.setSize(800, 600);
	}

	private void createLineChart(Diagram diagram, CTabItem item, Composite diagramComposite) {
		LineChart line = (LineChart) diagram;
		Chart chart = createChart(line);
		item.setText(line.getTitle() != null ? line.getTitle() : "Untitiled");

		ChartCanvas canvas = new ChartCanvas(diagramComposite, SWT.NONE);
		canvas.setChart(chart);
		canvas.setSize(800, 600);
	}

	private void createBarChart(Diagram diagram, CTabItem item, Composite diagramComposite) {
		BarChart bar = (BarChart) diagram;
		Chart chart = createChart(bar);
		item.setText(bar.getTitle() != null ? bar.getTitle() : "Untitiled");

		ChartCanvas canvas = new ChartCanvas(diagramComposite, SWT.NONE);
		canvas.setChart(chart);
		canvas.setSize(800, 600);
	}

	private void createPie(Diagram diagram, CTabItem item, Composite diagramComposite) {
		Pie vmlPie = (Pie) diagram;
		Chart chart = createChart(vmlPie);
		if (vmlPie.getTitle() == null)
			item.setText("Pie Chart");
		else
			item.setText(vmlPie.getTitle());
		item.setData(vmlPie);
		ChartCanvas canvas = new ChartCanvas(diagramComposite, SWT.NONE);
		canvas.setChart(chart);
		canvas.setSize(800, 600);
	}

	protected void createGraph(CTabFolder tabs, Diagram diagram, CTabItem item, Composite diagramComposite) {
		vml.Graph vmlGraph = (vml.Graph) diagram;

		if (vmlGraph.getTitle() == null) {
			item.setText("Graph Chart");
		} else
			item.setText(vmlGraph.getTitle());
		item.setData(vmlGraph);
		GraphWidget graphWidget = new GraphWidget(diagramComposite, SWT.None, diagram, tabs);
		graphWidget.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}

	private Chart createChart(Diagram diagram) {
		AbstractChartBuilder builder = null;

		if (diagram instanceof Pie) {
			Pie pie_ = (Pie) diagram;
			builder = new PieChartBuilder(pie_);
		} else if (diagram instanceof BarChart) {
			BarChart bar = (BarChart) diagram;
			builder = new BarChartBuilder(bar);
		} else if (diagram instanceof LineChart) {
			LineChart line = (LineChart) diagram;
			builder = new LineChartBuilder(line);
		} else if (diagram instanceof Scatter) {
			Scatter scatter = (Scatter) diagram;
			builder = new ScatterChartBuilder(scatter);
		}
		builder.build();
		Chart chart = builder.getChart();

		return chart;

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		/*
		 * if (event.getResource().getLocation().toOSString().equalsIgnoreCase(file.
		 * getLocation().toOSString()) && event.getDelta().getKind() ==
		 * IResourceDelta.CHANGED) { System.out.println("Here we are"); }
		 */
	}

	@Override
	public void dispose() {
		super.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

}
