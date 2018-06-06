package ac.york.vml.plugin.editors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import vml.Edge;
import vml.Model;
import vml.Node;
import vml.VmlPackage;

public class VmlEditior extends EditorPart implements IResourceChangeListener{

	protected Resource resource;
	protected IFile file;
	

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
		if (model.getDiagrams().get(0) instanceof vml.Graph) {
			System.out.println("it's a graph");
		}
		
		CTabFolder tabs = new CTabFolder(parentElement, SWT.BOTTOM);
		vml.Graph vmlGraph = (vml.Graph) model.getDiagrams().get(0);

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
			if(edge.getRelation() == null) {
				graphConnection.setText("Untitile");
			} else {
				graphConnection.setText(edge.getRelation());
			}
		}
		
        graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);

	}

	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		/*
		if (event.getResource().getLocation().toOSString().equalsIgnoreCase(file.getLocation().toOSString()) && event.getDelta().getKind() == IResourceDelta.CHANGED) {
			System.out.println("Here we are");
		}*/
	}
	
	@Override
	public void dispose() {
		super.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

}
