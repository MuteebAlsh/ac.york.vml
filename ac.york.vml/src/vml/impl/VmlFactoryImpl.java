/**
 */
package vml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmlFactoryImpl extends EFactoryImpl implements VmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmlFactory init() {
		try {
			VmlFactory theVmlFactory = (VmlFactory)EPackage.Registry.INSTANCE.getEFactory(VmlPackage.eNS_URI);
			if (theVmlFactory != null) {
				return theVmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VmlPackage.MODEL: return createModel();
			case VmlPackage.DIAGRAM: return createDiagram();
			case VmlPackage.DIAGRAM_ELEMENT: return createDiagramElement();
			case VmlPackage.PIE: return createPie();
			case VmlPackage.SLICE: return createSlice();
			case VmlPackage.GRAPH: return createGraph();
			case VmlPackage.NODE: return createNode();
			case VmlPackage.EDGE: return createEdge();
			case VmlPackage.CHART: return createChart();
			case VmlPackage.CHART_ELEMENT: return createChartElement();
			case VmlPackage.BAR_CHART: return createBarChart();
			case VmlPackage.BAR: return createBar();
			case VmlPackage.STACK_BAR_CHART: return createStackBarChart();
			case VmlPackage.CATEGORY: return createCategory();
			case VmlPackage.STACK_BARS: return createStackBars();
			case VmlPackage.LINE_CHART: return createLineChart();
			case VmlPackage.POINT: return createPoint();
			case VmlPackage.SCATTER: return createScatter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement createDiagramElement() {
		DiagramElementImpl diagramElement = new DiagramElementImpl();
		return diagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pie createPie() {
		PieImpl pie = new PieImpl();
		return pie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice createSlice() {
		SliceImpl slice = new SliceImpl();
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartElement createChartElement() {
		ChartElementImpl chartElement = new ChartElementImpl();
		return chartElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarChart createBarChart() {
		BarChartImpl barChart = new BarChartImpl();
		return barChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackBarChart createStackBarChart() {
		StackBarChartImpl stackBarChart = new StackBarChartImpl();
		return stackBarChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackBars createStackBars() {
		StackBarsImpl stackBars = new StackBarsImpl();
		return stackBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineChart createLineChart() {
		LineChartImpl lineChart = new LineChartImpl();
		return lineChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scatter createScatter() {
		ScatterImpl scatter = new ScatterImpl();
		return scatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmlPackage getVmlPackage() {
		return (VmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmlPackage getPackage() {
		return VmlPackage.eINSTANCE;
	}

} //VmlFactoryImpl
