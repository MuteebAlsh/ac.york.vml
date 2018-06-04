package ac.york.vml.plugin.provider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;

import vml.Diagram;
import vml.Graph;
import vml.Model;
import vml.Pie;

public class VMLContentProvider implements ITreeContentProvider {

	

	private static final Object[] EMPTY_ARRAY = new Object[0];
	private static ResourceSetImpl resourceSet = new ResourceSetImpl();

	@Override
	public Object[] getChildren(Object parentElement) {

		 if (parentElement instanceof IResource) {
		 IResource resource = (IResource) parentElement;
		 try {
			
			System.out.println("Resource:" + resource.getLocationURI().toURL().openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 }
		 if (parentElement instanceof Diagram) {
		 List<Object> diagramContents = new ArrayList<>();
		 diagramContents.add(((Diagram) parentElement).getGraph());
		 diagramContents.add(((Diagram) parentElement).getPies());
		 }
		 return EMPTY_ARRAY;
//		if (parentElement instanceof IFile) {
//			String path = ((IFile) parentElement).getFullPath().toString();
//			URI uri = URI.createPlatformResourceURI(path, true);
//			parentElement = resourceSet.getResource(uri, true);
//		}
//		return super.getChildren(parentElement);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object getParent(Object element) {

		 if (element instanceof Graph) {
		 return ((Graph) element).eContainmentFeature();
		 } else if (element instanceof Pie) {
		 return ((Pie) element).eContainmentFeature();
		 }
		 return null;

//		if (element instanceof IFile)
//			return ((IResource) element).getParent();
//		return super.getParent(element);

	}

	@Override
	public boolean hasChildren(Object element) {
		 return (element instanceof Diagram || element instanceof Graph || element
		 instanceof Pie);
//		if (element instanceof IFile)
//			return true;
//		return super.hasChildren(element);
	}

}
