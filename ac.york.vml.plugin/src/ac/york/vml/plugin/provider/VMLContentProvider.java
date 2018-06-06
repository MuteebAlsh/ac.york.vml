//package ac.york.vml.plugin.provider;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.IResource;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.jface.viewers.ITreeContentProvider;
//
//import vml.Diagram;
//import vml.Graph;
//import vml.Model;
//import vml.Pie;
//import vml.VmlPackage;
//
//public class VMLContentProvider implements ITreeContentProvider {
//
//	private static final Object[] EMPTY_ARRAY = new Object[0];
//	protected Resource resource;
//	protected IFile file;
//
//	@Override
//	public Object[] getChildren(Object parentElement) {
//
//		if (parentElement instanceof IResource) {
//			IResource iResource = (IResource) parentElement;
//			ResourceSet resourceSet = new ResourceSetImpl();
//			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
//			resourceSet.getPackageRegistry().put(VmlPackage.eINSTANCE.getNsURI(), VmlPackage.eINSTANCE);
//			resource = resourceSet
//					.createResource(URI.createPlatformResourceURI(iResource.getFullPath().toString(), true));
//			parentElement = resource;
//			return getChildren(parentElement);
//			// Model model = (Model) resource.getContents().get(0);
//			// System.out.println("Model: " + model.getDiagrams().toString());
//
//		}
//
//
//		if (parentElement instanceof Resource) {
//			Resource resource1 = (Resource) parentElement;
//			Model model = (Model) resource1.getContents().get(0);
//			List<Object> diagramContents = new ArrayList<>();
//			diagramContents.add(((Diagram) parentElement).getGraph());
//			diagramContents.add(((Diagram) parentElement).getPies());
//		}
//		return EMPTY_ARRAY;
//		// if (parentElement instanceof IFile) {
//		// String path = ((IFile) parentElement).getFullPath().toString();
//		// URI uri = URI.createPlatformResourceURI(path, true);
//		// parentElement = resourceSet.getResource(uri, true);
//		// }
//		// return super.getChildren(parentElement);
//	}
//
//	@Override
//	public Object[] getElements(Object inputElement) {
//		return getChildren(inputElement);
//	}
//
//	@Override
//	public Object getParent(Object element) {
//
//		if (element instanceof Graph) {
//			return ((Graph) element).eContainmentFeature();
//		} else if (element instanceof Pie) {
//			return ((Pie) element).eContainmentFeature();
//		}
//		return null;
//
//		// if (element instanceof IFile)
//		// return ((IResource) element).getParent();
//		// return super.getParent(element);
//
//	}
//
//	@Override
//	public boolean hasChildren(Object element) {
//		return (element instanceof Diagram || element instanceof Graph || element instanceof Pie);
//		// if (element instanceof IFile)
//		// return true;
//		// return super.hasChildren(element);
//	}
//
//}
