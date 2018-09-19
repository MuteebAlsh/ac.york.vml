package pluginTest;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;

import ac.york.vml.plugin.editors.VisuDSLEditor;
import junit.framework.TestCase;

public class TestClass extends TestCase{

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		
		IEditorPart editor = new VisuDSLEditor();
		
		editor.createPartControl(shell);

		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
			
		}

	}

}
