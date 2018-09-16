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
import org.eclipse.birt.chart.model.attribute.ActionType;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.TriggerCondition;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.URLValueImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.Trigger;
import org.eclipse.birt.chart.model.data.impl.ActionImpl;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.TriggerImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.impl.BarSeriesImpl;
import org.eclipse.emf.common.util.EList;

import vml.Bar;
import vml.BarChart;

/**
 * Builds bar chart.
 * 
 * @author Qi Liang
 */
public class BarChartBuilder extends AbstractChartWithAxisBuilder {

	/**
	 * Constructor.
	 * 
	 * @param dataSet
	 *            data for chart
	 */
	protected BarChart bar = null;

	public BarChartBuilder(BarChart dataSet) {
		super(dataSet);
		bar = (BarChart) dataSet;

		title = bar.getTitle();
		xTitle = bar.getXTitle();
		yTitle = bar.getYTitle();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildChart()
	 */
	protected void createChart() {
		chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildLegend()
	 */
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

		yAxis.getMajorGrid().getLineAttributes().setVisible(true);
		yAxis.getMajorGrid().getLineAttributes().setColor(ColorDefinitionImpl.GREY());
		yAxis.getMajorGrid().getLineAttributes().setStyle(LineStyle.DASHED_LITERAL);
		yAxis.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);

		yAxis.setType(AxisType.LINEAR_LITERAL);
		yAxis.getOrigin().setType(IntersectionType.VALUE_LITERAL);

//		yAxis.getScale().setStep(10.0);
        yAxis.getScale().setStepNumber(5);

	}

	
	protected List<String> getXValue() {
		EList<Bar> bars = bar.getBars();
		List<String> barTitle = new ArrayList<>();
		for (Bar singleBar : bars) {
			barTitle.add(singleBar.getXValue());
		}
		return barTitle;
	}

	protected List<Double> getYValue() {

		EList<Bar> bars = bar.getBars();
		List<Double> barValue = new ArrayList<>();
		for (Bar singleBar : bars) {
			barValue.add(singleBar.getYValue());
		}
		return barValue;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildXSeries()
	 */

	protected void buildXSeries() {

		TextDataSet categoryValues = TextDataSetImpl.create(getXValue());

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
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildYSeries()
	 */
	protected void buildYSeries() {

		NumberDataSet orthoValuesDataSet1 = NumberDataSetImpl.create(getYValue());

		BarSeries bs1 = (BarSeries) BarSeriesImpl.create();
		bs1.setDataSet(orthoValuesDataSet1);
		bs1.setRiserOutline(null);
		
		Trigger triger = TriggerImpl.create( TriggerCondition.ONMOUSEOVER_LITERAL,
				ActionImpl.create( ActionType.URL_REDIRECT_LITERAL,
						URLValueImpl.create( "http://www.actuate.com", //$NON-NLS-1$
								null, null, null, null ) ) );
		
		bs1.getTriggers().add(triger);
		
		SeriesDefinition sdY = SeriesDefinitionImpl.create();
//		System.out.println("query: " + sdY.getQuery().getDefinition());
		yAxis.getSeriesDefinitions().add(sdY);
		sdY.getSeries().add(bs1);
	}

}
