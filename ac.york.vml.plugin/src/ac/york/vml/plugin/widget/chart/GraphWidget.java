package ac.york.vml.plugin.widget.chart;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;

import vml.Diagram;
import vml.Edge;
import vml.Node;

public class GraphWidget extends Graph{

	
	public GraphWidget(Composite parent, int style, Diagram myGraph) {
		
		super(parent,style);
		
		vml.Graph vmlGraph = (vml.Graph) myGraph;
		
		
		//Graph graph = new Graph(parent, SWT.NONE);

		Map<Node, GraphNode> nodeMap = new HashMap<Node, GraphNode>();

		for (Node node : vmlGraph.getNodes()) {
			int nodeStyle = ZestStyles.NODES_CACHE_LABEL;
			GraphNode graphNode = new GraphNode(this, SWT.NONE, node.getTitle());
			graphNode.setData(node);
			graphNode.setNodeStyle(nodeStyle);
			nodeMap.put(node, graphNode);

		}

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
}
