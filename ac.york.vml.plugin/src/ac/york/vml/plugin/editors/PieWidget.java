package ac.york.vml.plugin.editors;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.birt.core.framework.PlatformConfig;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import vml.Diagram;

public class PieWidget extends Canvas {

	protected IDeviceRenderer render = null;
	protected Image cachedImage = null;
	protected GeneratedChartState state = null;
	protected Chart chart = null;

	PieWidget(Composite parent, int style, Diagram pie) {
		super(parent, style);

		PlatformConfig config = new PlatformConfig();
		config.setProperty("STANDALONE", "true");

		try {
			PluginSettings ps = PluginSettings.instance();
			render = ps.getDevice("dv.SWT");
			render.setProperty(IDeviceRenderer.UPDATE_NOTIFIER, this);
		} catch (ChartException pex) {
			pex.printStackTrace();
		}

		addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent e) {

				Composite co = (Composite) e.getSource();
				final Rectangle rect = co.getClientArea();

				if (cachedImage == null) {

					buildChart();
					drawToCachedImage(rect);
				}

				e.gc.drawImage(cachedImage, 0, 0, cachedImage.getBounds().width, cachedImage.getBounds().height, 0, 0,
						rect.width, rect.height);
			}
		});

		addControlListener(new ControlAdapter() {

			public void controlResized(ControlEvent e) {

				buildChart();
				cachedImage = null;
			}
		});
		
		chart = InteractivityCharts.createPieChart(pie);

		
	}

	private void buildChart() {
		Point size = getSize();
		Bounds bo = BoundsImpl.create(0, 0, size.x, size.y);
		int resolution = render.getDisplayServer().getDpiResolution();
		bo.scale(72d / resolution);
		try {
			Generator gr = Generator.instance();
			state = gr.build(render.getDisplayServer(), chart, bo, null, null, null);
		} catch (ChartException ex) {
			ex.printStackTrace();
		}
	}

	public void drawToCachedImage(Rectangle size) {
		GC gc = null;
		try {
			if (cachedImage != null)
				cachedImage.dispose();
			cachedImage = new Image(Display.getCurrent(), size.width, size.height);

			gc = new GC(cachedImage);
			render.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, gc);

			Generator gr = Generator.instance();
			gr.render(render, state);
		} catch (ChartException ex) {
			ex.printStackTrace();
		} finally {
			if (gc != null)
				gc.dispose();
		}

	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		if (cachedImage != null)
			cachedImage.dispose();

		cachedImage = null;
		this.chart = chart;
	}

	public void dispose() {
		if (cachedImage != null)
			cachedImage.dispose();
		super.dispose();
	}
}
