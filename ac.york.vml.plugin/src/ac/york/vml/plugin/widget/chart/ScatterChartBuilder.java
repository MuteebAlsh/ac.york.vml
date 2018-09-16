/*******************************************************************************
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Qi Liang (IBM Corporation)
*******************************************************************************/
package ac.york.vml.plugin.widget.chart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.DataPoint;
import org.eclipse.birt.chart.model.attribute.DataPointComponentType;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.MarkerType;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.DataPointComponentImpl;
import org.eclipse.birt.chart.model.attribute.impl.JavaNumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.ScatterSeries;
import org.eclipse.birt.chart.model.type.impl.ScatterSeriesImpl;
import org.eclipse.emf.common.util.EList;

import ac.york.vml.plugin.provider.YAxisSteps;
import vml.Point;
import vml.Scatter;

/**
 * Builds scatter chart.
 * 
 * @author Qi Liang
 */
public class ScatterChartBuilder extends AbstractChartWithAxisBuilder {

	
	protected Scatter scatter = null;
    /**
     * Constructor.
     * 
     * @param dataSet
     *            data for chart
     */
    public ScatterChartBuilder(Scatter dataSet) {
        super(dataSet);
        scatter = (Scatter) dataSet;
        title = scatter.getTitle();
        xTitle = scatter.getXTitle();
        yTitle = scatter.getYTitle();
    }
    
    protected void buildPlot() {
		chart.setSeriesThickness(25);
		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		Plot p = chart.getPlot();
		p.getClientArea().setBackground(null);
		p.getClientArea().getOutline().setVisible(true);
		p.getOutline().setVisible(true);
	}

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildXAxis()
     */
    protected void buildXAxis() {
        xAxis = ((ChartWithAxesImpl) chart).getPrimaryBaseAxes()[0];

        xAxis.getTitle().getCaption().setValue(xTitle);
        xAxis.getLabel().getCaption().setColor(ColorDefinitionImpl.GREEN()
                .darker());
        xAxis.getTitle().setVisible(true);

        xAxis.setType(AxisType.TEXT_LITERAL);

        xAxis.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
        xAxis.getMajorGrid().getLineAttributes()
                .setStyle(LineStyle.DOTTED_LITERAL);
        xAxis.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl
                .GREY());
        xAxis.getMajorGrid().getLineAttributes().setVisible(true);

        xAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildYAxis()
     */
    protected void buildYAxis() {
        yAxis = ((ChartWithAxesImpl) chart).getPrimaryOrthogonalAxis(xAxis);

        yAxis.getTitle().setVisible(true);
        yAxis.getTitle().getCaption().setValue(yTitle);

        yAxis.setType(AxisType.LINEAR_LITERAL);

        yAxis.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
        yAxis.getMajorGrid().getLineAttributes()
                .setStyle(LineStyle.DOTTED_LITERAL);
        yAxis.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl
                .GREY());
        yAxis.getMajorGrid().getLineAttributes().setVisible(true);

        yAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
        
//        new YAxisSteps().getStepsValue(yAxis.getScale().getMax());
//        yAxis.getScale().setStep(new YAxisSteps().getStepsValue(getYValue()));
        yAxis.getScale().setStepNumber(5);
    }
    
    
    protected List<String> getXValue() {
		EList<Point> lines = scatter.getPoints();
		List<String> lineTitle = new ArrayList<>();
		for (Point singleBar : lines) {
			lineTitle.add(singleBar.getXValue());
		}
		return lineTitle;
	}

	protected List<Double> getYValue() {

		EList<Point> lines = scatter.getPoints();
		List<Double> lineValue = new ArrayList<>();
		for (Point singleBar : lines) {
			lineValue.add(singleBar.getYValue());
		}
		return lineValue;
	}

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildXSeries()
     */
    protected void buildXSeries() {
        TextDataSet categoryValues = TextDataSetImpl
                .create(getXValue());

        Series seBase = SeriesImpl.create();
        seBase.setDataSet(categoryValues);

        SeriesDefinition sdX = SeriesDefinitionImpl.create();
        xAxis.getSeriesDefinitions().add(sdX);
        sdX.getSeries().add(seBase);
    }

    protected void buildYSeries() {

        NumberDataSet orthoValuesDataSet1 = NumberDataSetImpl.create(getYValue());

        ScatterSeries ss = (ScatterSeries) ScatterSeriesImpl.create();
//        ss.setSeriesIdentifier("");
        ss.getMarkers().get(0).setType(MarkerType.CIRCLE_LITERAL);;
//        DataPoint dp = ss.getDataPoint();
//        dp.getComponents().clear();
//        dp.setPrefix("(");
//        dp.setSuffix(")");
//        dp.getComponents().add(DataPointComponentImpl
//                .create(DataPointComponentType.BASE_VALUE_LITERAL,
//                        JavaNumberFormatSpecifierImpl.create("0")));
//        dp.getComponents().add(DataPointComponentImpl
//                .create(DataPointComponentType.ORTHOGONAL_VALUE_LITERAL,
//                        JavaNumberFormatSpecifierImpl.create("0")));
        ss.getLabel().getCaption().setColor(ColorDefinitionImpl.RED());
        ss.getLabel().setBackground(ColorDefinitionImpl.CYAN());
        ss.getLabel().setVisible(true);
        ss.setDataSet(orthoValuesDataSet1);

        SeriesDefinition sdY = SeriesDefinitionImpl.create();
        yAxis.getSeriesDefinitions().add(sdY);
        sdY.getSeriesPalette().update(ColorDefinitionImpl.BLUE());
        sdY.getSeries().add(ss);
    }

}
