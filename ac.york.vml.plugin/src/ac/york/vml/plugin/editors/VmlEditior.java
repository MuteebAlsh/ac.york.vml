package ac.york.vml.plugin.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import vml.Diagram;
import vml.Edge;
import vml.Model;
import vml.Node;

public class VmlEditior extends EditorPart{

//	protected Resource resource;
//	protected IFile file;
	
	

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
		//ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
//		
//		FileEditorInput fileInputEditor = (FileEditorInput) input;
//		file = fileInputEditor.getFile();
//		setPartName(file.getName());
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
//		resourceSet.getPackageRegistry().put(VmlPackage.eINSTANCE.getNsURI(), VmlPackage.eINSTANCE);
//		resource = resourceSet.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
//		try {
//			resource.load(null);
//		} catch (IOException e) {
//			throw new PartInitException(e.getMessage(), e);
//		}
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
		Model model = (Model) parentElement;;
		Diagram diagram = (Diagram) model.getDiagrams().get(0);
		vml.Graph vmlGraph = (vml.Graph) diagram.getGraph().get(0);
		Graph graph = new Graph(parentElement, SWT.NONE);
		
		Map<Node, GraphNode> nodeMap = new HashMap<Node, GraphNode>();
		
		for (Node node : vmlGraph.getNodes()) {
			GraphNode graphNode = new GraphNode(graph, SWT.NONE, node.getTitle());
			graphNode.setData(node);
			nodeMap.put(node, graphNode);
			
		}
		
		for (Edge edge : vmlGraph.getEdges()) {
			int style = ZestStyles.CONNECTIONS_SOLID;
			GraphConnection graphConnection = new GraphConnection(graph, style, nodeMap.get(edge.getSource()), nodeMap.get(edge.getTarget()));
			graphConnection.setData(edge);
			graphConnection.setText(edge.getRelation());
		}
		
        graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);

		
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dispose() {
		super.dispose();
//		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

}
