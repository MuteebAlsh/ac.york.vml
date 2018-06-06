//package ac.york.vml.plugin.provider;
//
//import org.eclipse.jface.viewers.ILabelProvider;
//import org.eclipse.jface.viewers.ILabelProviderListener;
//import org.eclipse.jface.viewers.LabelProvider;
//import org.eclipse.swt.graphics.Image;
//
//import vml.Diagram;
//import vml.Graph;
//import vml.Pie;
//
//public class VMLLableProvider extends LabelProvider implements ILabelProvider {
//
//	@Override
//	public void addListener(ILabelProviderListener arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void dispose() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public boolean isLabelProperty(Object arg0, String arg1) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void removeListener(ILabelProviderListener arg0) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Image getImage(Object arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getText(Object element) {
//		
//		if (element instanceof Diagram) {
//			return ((Diagram) element).getTitle();
//		} else if (element instanceof Graph) {
//			return ((Graph) element).getTitle();
//		} else if (element instanceof Pie) {
//			return ((Pie) element).getTitle();
//		}
//		return null;
//	}
//
//}
