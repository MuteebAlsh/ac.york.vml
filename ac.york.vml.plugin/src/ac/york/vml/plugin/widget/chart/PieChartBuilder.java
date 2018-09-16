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

import org.eclipse.birt.chart.model.ChartWithoutAxes;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithoutAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.PieSeries;
import org.eclipse.birt.chart.model.type.impl.PieSeriesImpl;
import org.eclipse.emf.common.util.EList;

import vml.Pie;
import vml.Slice;

/**
 * Builds pie chart.
 * 
 * @author Qi Liang
 */
public class PieChartBuilder extends AbstractChartBuilder {

	SeriesDefinition sdX = null;
	
	private Pie pie_ = null;

	/**
	 * Constructor.
	 * 
	 * @param dataSet
	 *            data for chart
	 */
	public PieChartBuilder(Pie dataSet) {
		super(dataSet);
		pie_ = (Pie) dataSet;
		if (pie_.getTitle() != null)
			title = pie_.getTitle();
		else
			title = "Pie Chart";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#createChart()
	 */
	protected void createChart() {
		chart = ChartWithoutAxesImpl.create();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildPlot()
	 */
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
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildLegend()
	 */
		protected void buildLegend() {
			Legend lg = chart.getLegend();
			lg.getText().getFont().setSize(16);
			lg.getOutline().setVisible(true);
		}

	protected List<String> getTitle() {
		
		EList<Slice> slices = pie_.getSlices();

		List<String> slicesTitle = new ArrayList<>();

		for (Slice slice : slices) {
			slicesTitle.add(slice.getTitle());
		}
		return slicesTitle;
	}

	protected List<Integer> getValue() {

		EList<Slice> slices = pie_.getSlices();

		List<Integer> slicesValue = new ArrayList<>();

		for (Slice slice : slices) {
			slicesValue.add(slice.getValue());
		}
		return slicesValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.AbstractChartBuilder#buildXSeries()
	 */
	protected void buildXSeries() {

		TextDataSet categoryValues = TextDataSetImpl.create(getTitle());

		Series seCategory = SeriesImpl.create();
		seCategory.setDataSet(categoryValues);

		// Apply the color palette
		sdX = SeriesDefinitionImpl.create();
		sdX.getSeriesPalette().shift(0);

		((ChartWithoutAxes) chart).getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(seCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.examples.chart.widget.chart.AbstractChartBuilder#buildYSeries()
	 */
	protected void buildYSeries() {

		NumberDataSet orthoValuesDataSet = NumberDataSetImpl.create(getValue());

		PieSeries sePie = (PieSeries) PieSeriesImpl.create();
		sePie.setDataSet(orthoValuesDataSet);
		sePie.setSeriesIdentifier(pie_.getIdentifier() != null ? pie_.getIdentifier() : "Untitiled");

		SeriesDefinition sdCity = SeriesDefinitionImpl.create();
		sdX.getSeriesDefinitions().add(sdCity);
		sdCity.getSeries().add(sePie);

	}

}
