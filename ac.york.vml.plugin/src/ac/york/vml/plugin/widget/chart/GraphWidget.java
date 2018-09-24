package ac.york.vml.plugin.widget.chart;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;

import vml.Diagram;
import vml.Edge;
import vml.Node;

public class GraphWidget extends Graph {

	public GraphWidget(Composite parent, int style, Diagram myGraph, CTabFolder tabs) {

		super(parent, style);

		vml.Graph vmlGraph = (vml.Graph) myGraph;

		CTabFolder tabfolder = (CTabFolder) tabs;

		Map<Node, GraphNode> nodeMap = new HashMap<Node, GraphNode>();

		createNode(vmlGraph, nodeMap);

		createEdge(vmlGraph, nodeMap);

		this.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				int item = tabfolder.getItemCount();
				for (int i = 0; i < item; i++) {
					if (e.item != null && (tabfolder.getItem(i).getData() == e.item.getData("Diagram")
							|| tabfolder.getItem(i).getData() == e.item.getData("Table"))
							&& tabfolder.getItem(i).getData() != null && i != tabfolder.getSelectionIndex()) {
						System.out.println("---------- I get it --------");
						tabfolder.setSelection(i);
					}
	
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {

			}
		});

	}

	private void createEdge(vml.Graph vmlGraph, Map<Node, GraphNode> nodeMap) {
		for (Edge edge : vmlGraph.getEdges()) {
			int edgeStyle = ZestStyles.CONNECTIONS_SOLID;
			GraphConnection graphConnection = new GraphConnection(this, edgeStyle, nodeMap.get(edge.getSource()),
					nodeMap.get(edge.getTarget()));
			graphConnection.setData(edge);
			if (edge.getRelation() == null) {
				graphConnection.setText("Untitile");
			} else {
				graphConnection.setText(edge.getRelation());
			}
		}
	}

	private void createNode(vml.Graph vmlGraph, Map<Node, GraphNode> nodeMap) {
		for (Node node : vmlGraph.getNodes()) {
			int nodeStyle = ZestStyles.NODES_CACHE_LABEL;
			GraphNode graphNode = new GraphNode(this, SWT.NONE, node.getTitle());
			graphNode.setData(node);
			graphNode.setNodeStyle(nodeStyle);
			if (node.getDiagrams() != null) {
				graphNode.setData("Diagram", node.getDiagrams());
			}
			if (node.getTable() != null) {
				graphNode.setData("Table", node.getTable());
			}

			System.out.println("graphNode with references: " + graphNode.getData("reference"));
			nodeMap.put(node, graphNode);

		}
	}

}
