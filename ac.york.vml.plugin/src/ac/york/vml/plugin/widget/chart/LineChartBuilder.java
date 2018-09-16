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

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.MarkerType;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
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
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.emf.common.util.EList;

import vml.LineChart;
import vml.Point;

/**
 * Builds line chart.
 * 
 * @author Qi Liang
 */
public class LineChartBuilder extends AbstractChartWithAxisBuilder {

	
	protected LineChart line = null;
    /**
     * Constructor.
     * 
     * @param dataSet
     *            data for chart
     */
    public LineChartBuilder(LineChart dataSet) {
        super(dataSet);
        line = (LineChart) dataSet;
        title = line.getTitle();
        xTitle = line.getXTitle();
        yTitle = line.getYTitle();
    }
    
    
	protected void createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);
	}
	
	
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildLegend()
//	 */
//	protected void buildLegend() {
//		chart.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
//		chart.getLegend().setVisible(true);
//	}

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildXAxis()
     */
    protected void buildXAxis() {
        xAxis = ((ChartWithAxes) chart).getPrimaryBaseAxes()[0];

        xAxis.getTitle().setVisible(true);
        xAxis.getTitle().getCaption().setValue(xTitle);
        xAxis.getTitle().getCaption().getFont().setBold(false);
        xAxis.getTitle().getCaption().getFont().setSize(11);
        xAxis.getTitle().getCaption().getFont().setName(FONT_NAME);

        xAxis.getLabel().setVisible(true);
        xAxis.getLabel().getCaption().getFont().setSize(8);
        xAxis.getLabel().getCaption().getFont().setName(FONT_NAME);

        xAxis.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);

        xAxis.setType(AxisType.TEXT_LITERAL);
        xAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildYAxis()
     */
    protected void buildYAxis() {
        yAxis = ((ChartWithAxes) chart).getPrimaryOrthogonalAxis(xAxis);

        yAxis.getTitle().setVisible(true);
        yAxis.getTitle().getCaption().setValue(yTitle);
        yAxis.getTitle().getCaption().getFont().setBold(false);
        yAxis.getTitle().getCaption().getFont().setRotation(90);
        yAxis.getTitle().getCaption().getFont().setSize(11);
        yAxis.getTitle().getCaption().getFont().setName(FONT_NAME);

        yAxis.getLabel().setVisible(true);
        yAxis.getLabel().getCaption().getFont().setSize(8);
        yAxis.getLabel().getCaption().getFont().setName(FONT_NAME);

        yAxis.getMajorGrid().getLineAttributes().setVisible(true);
        yAxis.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl
                .GREY());
        yAxis.getMajorGrid().getLineAttributes()
                .setStyle(LineStyle.DASHED_LITERAL);
        yAxis.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);

        yAxis.setType(AxisType.LINEAR_LITERAL);
        yAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);
        
//        yAxis.getScale().setStep(1.0);
        yAxis.getScale().setStepNumber(5);

    }
    
    
    protected List<String> getXValue() {
		EList<Point> lines = line.getPoints();
		List<String> lineTitle = new ArrayList<>();
		for (Point singleBar : lines) {
			lineTitle.add(singleBar.getXValue());
		}
		return lineTitle;
	}

	protected List<Double> getYValue() {

		EList<Point> lines = line.getPoints();
		List<Double> lineValue = new ArrayList<>();
		for (Point singleBar : lines) {
			lineValue.add(singleBar.getYValue());
		}
		return lineValue;
	}

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildXSeries()
     */
    protected void buildXSeries() {

        TextDataSet categoryValues = TextDataSetImpl
                .create(getXValue());

        Series seCategory = SeriesImpl.create();
        seCategory.setDataSet(categoryValues);

        // Apply the color palette
        SeriesDefinition sdX = SeriesDefinitionImpl.create();
        sdX.getSeriesPalette().shift(0);;

        xAxis.getSeriesDefinitions().add(sdX);
        sdX.getSeries().add(seCategory);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildYSeries()
     */
	protected void buildYSeries() {

        NumberDataSet orthoValuesDataSet1 = NumberDataSetImpl.create(getYValue());

        LineSeries ls = (LineSeries) LineSeriesImpl.create();
        ls.setDataSet(orthoValuesDataSet1);
        ls.getLineAttributes().setColor(ColorDefinitionImpl.BLUE());
        ls.getMarkers().get(0).setType(MarkerType.CIRCLE_LITERAL);
        ls.getLabel().setVisible(true);

        SeriesDefinition sdY = SeriesDefinitionImpl.create();
        yAxis.getSeriesDefinitions().add(sdY);
        sdY.getSeries().add(ls);
    }

}
