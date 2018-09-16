package ac.york.vml.plugin.widget.chart;

import java.util.List;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import ac.york.vml.plugin.provider.AppContentProvider;

public class TableWidget extends TableViewer {

    private Table table;

	public TableWidget(Composite parent, int style, vml.Table myTable) {
		super(parent, style);

		vml.Table vmltable = (vml.Table) myTable;

		table = getTable();
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		table.setLayoutData(gridData);
		createColumns(vmltable);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		setContentProvider(new AppContentProvider());
	}

	private void createColumns(vml.Table myTable) {
		vml.Table vmlTable = (vml.Table) myTable;
		List<vml.Column> column = vmlTable.getColumns();
		List<vml.Row> rows = vmlTable.getRows();
		int i = 0;

		for (vml.Column column2 : column) {
			createTableViewerColumn(column2.getColumnTitle(), 100, i);
			i++;
		}
		for (vml.Row row : rows) {
			i = 0;
			List<vml.Cell> cell = row.getCells();
            TableItem item=new TableItem(table, SWT.NONE);
			for (vml.Cell cell2 : cell) {
				item.setText(i,cell2.getTextValue());
				i++;
			}
		}
		

	}

	private TableViewerColumn createTableViewerColumn(String header, int width, int idx) {
		TableViewerColumn column = new TableViewerColumn(this, SWT.LEFT, idx);
		column.getColumn().setText(header);
		column.getColumn().setWidth(width);
		column.getColumn().setResizable(true);
		column.getColumn().setMoveable(true);

		return column;
	}

}
