package pluginTest;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.junit.Before;
import org.junit.Test;

import ac.york.vml.plugin.editors.VisuDSLEditor;
import junit.framework.TestCase;

public class TestOne extends TestCase{
	
	IWorkbenchWindow window;
	IWorkbenchPage page;
	EditorPart editor;


	@Before
	public void setUp() throws Exception {
		window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		page = window.getActivePage();
		editor = new VisuDSLEditor();
	}

	@Test
	public void testInitIEditorSiteIEditorInput() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePartControlComposite() {
		fail("Not yet implemented");
	}

}
