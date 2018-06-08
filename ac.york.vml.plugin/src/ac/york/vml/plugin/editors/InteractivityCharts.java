package ac.york.vml.plugin.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithoutAxes;
import org.eclipse.birt.chart.model.attribute.DataPointComponent;
import org.eclipse.birt.chart.model.attribute.DataPointComponentType;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.DataPointComponentImpl;
import org.eclipse.birt.chart.model.attribute.impl.JavaNumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.BaseSampleData;
import org.eclipse.birt.chart.model.data.DataFactory;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.OrthogonalSampleData;
import org.eclipse.birt.chart.model.data.SampleData;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithoutAxesImpl;
import org.eclipse.birt.chart.model.type.PieSeries;
import org.eclipse.birt.chart.model.type.impl.PieSeriesImpl;
import org.eclipse.emf.common.util.EList;

import vml.Diagram;
import vml.Pie;
import vml.Slice;

public class InteractivityCharts {
	
	protected static final Chart createPieChart(Diagram pie) {
		Pie pie_ = (Pie) pie;

		ChartWithoutAxes pieChart = ChartWithoutAxesImpl.create();
		pieChart.setType("Pie Chart");
		pieChart.setSubType("Standard Pie Chart");

		pieChart.setSeriesThickness(25);
		pieChart.getBlock().setBackground(ColorDefinitionImpl.WHITE());

		pieChart.getLegend().getText().getFont().setBold(true);

		pieChart.getTitle().getLabel().getCaption().setValue(pie_.getTitle() != null ? pie_.getTitle() : "Untitile");
		pieChart.getTitle().getOutline().setVisible(true);

		EList<Slice> slices = pie_.getSlices();

		List<String> slicesTitle = new ArrayList<>();
		List<Integer> slicesValue = new ArrayList<>();

		for (Slice slice : slices) {
			slicesTitle.add(slice.getTitle());
			slicesValue.add(slice.getValue());
		}

		TextDataSet categoryValues = TextDataSetImpl.create(slicesTitle);
		NumberDataSet seriesValues = NumberDataSetImpl.create(slicesValue);

		SampleData sdata = DataFactory.eINSTANCE.createSampleData();
		BaseSampleData sdBase = DataFactory.eINSTANCE.createBaseSampleData();
		sdBase.setDataSetRepresentation("");
		sdata.getBaseSampleData().add(sdBase);

		OrthogonalSampleData sdOrthogonal = DataFactory.eINSTANCE.createOrthogonalSampleData();
		sdOrthogonal.setDataSetRepresentation("");//$NON-NLS-1$
		sdOrthogonal.setSeriesDefinitionIndex(0);
		sdata.getOrthogonalSampleData().add(sdOrthogonal);

		pieChart.setSampleData(sdata);

		Series seCategory = SeriesImpl.create();
		seCategory.setDataSet(categoryValues);

		SeriesDefinition sd = SeriesDefinitionImpl.create();
		pieChart.getSeriesDefinitions().add(sd);
		sd.getSeriesPalette().shift(0);
		sd.getSeries().add(seCategory);

		// Orthogonal Series
		PieSeries sePie = (PieSeries) PieSeriesImpl.create();
		sePie.setDataSet(seriesValues);
		sePie.setExplosion(3);

		SeriesDefinition sdCity = SeriesDefinitionImpl.create();
		sd.getSeriesDefinitions().add(sdCity);
		sdCity.getSeries().add(sePie);

		DataPointComponent dpc = DataPointComponentImpl.create(
				DataPointComponentType.PERCENTILE_ORTHOGONAL_VALUE_LITERAL,
				JavaNumberFormatSpecifierImpl.create("##.##%")); //$NON-NLS-1$
		sePie.getDataPoint().getComponents().clear();
		sePie.getDataPoint().getComponents().add(dpc);
		
		return pieChart;

	}

}
