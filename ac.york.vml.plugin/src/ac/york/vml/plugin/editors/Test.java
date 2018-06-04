//package ac.york.vml.plugin.editors;
//
//import vml.Diagram;
//import vml.Edge;
//import vml.Graph;
//import vml.Model;
//import vml.Node;
//import vml.VmlFactory;
//import vml.impl.VmlFactoryImpl;
//import vml.impl.VmlPackageImpl;
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//		VmlPackageImpl.init();
//		
//		VmlFactory factory = new VmlFactoryImpl();
//		
//		Model model = factory.createModel();
//		
//		Diagram diagram = factory.createDiagram();
//		
//		diagram.setTitle("First Diagram");
//		
//		model.getDiagrams().add(diagram);
//		
//		Graph graph = factory.createGraph();
//		
//		graph.setTitle("First Graph");
//		
//		diagram.getGraph().add(graph);
//		
//		Node node1 = factory.createNode();
//		node1.setTitle("Node 1");
//		
//		Node node2 = factory.createNode();
//		node2.setTitle("Node 2");
//		
//		Edge edge = factory.createEdge();
//		edge.setRelation("has");
//		edge.setSource(node1);
//		edge.setTarget(node2);
//		
//		graph.getNodes().add(node1);
//		graph.getNodes().add(node2);
//		graph.getEdges().add(edge);
//		
//		
//		
//		
//	}
//}
