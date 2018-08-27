/**
 */
package vml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vml.VmlFactory
 * @model kind="package"
 * @generated
 */
public interface VmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "vml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmlPackage eINSTANCE = vml.impl.VmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link vml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ModelImpl
	 * @see vml.impl.VmlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DIAGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.TableImpl
	 * @see vml.impl.VmlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Table Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_TITLE = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ColumnImpl
	 * @see vml.impl.VmlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_TITLE = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.RowImpl
	 * @see vml.impl.VmlPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 3;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.CellImpl
	 * @see vml.impl.VmlPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 4;

	/**
	 * The feature id for the '<em><b>Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COL = 0;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__TEXT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.DiagramImpl
	 * @see vml.impl.VmlPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DIGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.StyleImpl
	 * @see vml.impl.VmlPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 6;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.GraphStyleImpl <em>Graph Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.GraphStyleImpl
	 * @see vml.impl.VmlPackageImpl#getGraphStyle()
	 * @generated
	 */
	int GRAPH_STYLE = 7;

	/**
	 * The number of structural features of the '<em>Graph Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.NodeStyleImpl <em>Node Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.NodeStyleImpl
	 * @see vml.impl.VmlPackageImpl#getNodeStyle()
	 * @generated
	 */
	int NODE_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__BORDER_WIDTH = GRAPH_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__PADDING = GRAPH_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__BACKGROUND_COLOR = GRAPH_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__FOREGROUND_COLOR = GRAPH_STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Highlight Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__HIGHLIGHT_COLOR = GRAPH_STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__BORDER_COLOR = GRAPH_STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Border Highlight Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE__BORDER_HIGHLIGHT_COLOR = GRAPH_STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_FEATURE_COUNT = GRAPH_STYLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Node Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STYLE_OPERATION_COUNT = GRAPH_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.EdgeStyleImpl
	 * @see vml.impl.VmlPackageImpl#getEdgeStyle()
	 * @generated
	 */
	int EDGE_STYLE = 9;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_WIDTH = GRAPH_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__WEIGHT = GRAPH_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__SOURCE = GRAPH_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__TARGET = GRAPH_STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_COLOR = GRAPH_STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Highlight Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__HIGHLIGHT_COLOR = GRAPH_STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__DIRECTED = GRAPH_STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE__LINE_STYLE = GRAPH_STYLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_FEATURE_COUNT = GRAPH_STYLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Edge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_STYLE_OPERATION_COUNT = GRAPH_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.ChartWithAxisStyleImpl <em>Chart With Axis Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ChartWithAxisStyleImpl
	 * @see vml.impl.VmlPackageImpl#getChartWithAxisStyle()
	 * @generated
	 */
	int CHART_WITH_AXIS_STYLE = 10;

	/**
	 * The number of structural features of the '<em>Chart With Axis Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chart With Axis Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXIS_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.ChartWithoutAxisStyleImpl <em>Chart Without Axis Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ChartWithoutAxisStyleImpl
	 * @see vml.impl.VmlPackageImpl#getChartWithoutAxisStyle()
	 * @generated
	 */
	int CHART_WITHOUT_AXIS_STYLE = 11;

	/**
	 * The number of structural features of the '<em>Chart Without Axis Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXIS_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chart Without Axis Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXIS_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.DiagramElementImpl
	 * @see vml.impl.VmlPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.PieImpl <em>Pie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.PieImpl
	 * @see vml.impl.VmlPackageImpl#getPie()
	 * @generated
	 */
	int PIE = 13;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE__DIGRAMS = DIAGRAM__DIGRAMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE__TITLE = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE__IDENTIFIER = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE__SLICES = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE__STYLE = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.SliceImpl <em>Slice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.SliceImpl
	 * @see vml.impl.VmlPackageImpl#getSlice()
	 * @generated
	 */
	int SLICE = 14;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__DIAGRAMS = DIAGRAM_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__TITLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE__VALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.GraphImpl
	 * @see vml.impl.VmlPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 15;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DIGRAMS = DIAGRAM__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TITLE = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__STYLE = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.NodeImpl
	 * @see vml.impl.VmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 16;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DIAGRAMS = DIAGRAM_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TITLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ICONE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.EdgeImpl
	 * @see vml.impl.VmlPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 17;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DIAGRAMS = DIAGRAM_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__RELATION = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link vml.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ChartImpl
	 * @see vml.impl.VmlPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 18;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DIGRAMS = DIAGRAM__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ID = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TITLE = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__XTITLE = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__YTITLE = DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__STYLE = DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.ChartElementImpl <em>Chart Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ChartElementImpl
	 * @see vml.impl.VmlPackageImpl#getChartElement()
	 * @generated
	 */
	int CHART_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT__DIAGRAMS = DIAGRAM_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT__ID = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT__XVALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT__YVALUE = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chart Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Chart Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_ELEMENT_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.BarChartImpl <em>Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.BarChartImpl
	 * @see vml.impl.VmlPackageImpl#getBarChart()
	 * @generated
	 */
	int BAR_CHART = 20;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DIGRAMS = CHART__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__ID = CHART__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__XTITLE = CHART__XTITLE;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__YTITLE = CHART__YTITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__STYLE = CHART__STYLE;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__BARS = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FEATURE_COUNT = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.BarImpl
	 * @see vml.impl.VmlPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 21;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__DIAGRAMS = CHART_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__ID = CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__XVALUE = CHART_ELEMENT__XVALUE;

	/**
	 * The feature id for the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__YVALUE = CHART_ELEMENT__YVALUE;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = CHART_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link vml.impl.StackBarChartImpl <em>Stack Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.StackBarChartImpl
	 * @see vml.impl.VmlPackageImpl#getStackBarChart()
	 * @generated
	 */
	int STACK_BAR_CHART = 22;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__DIGRAMS = CHART__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__ID = CHART__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__XTITLE = CHART__XTITLE;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__YTITLE = CHART__YTITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__STYLE = CHART__STYLE;

	/**
	 * The feature id for the '<em><b>Stack Bar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__STACK_BAR = CHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART__CATEGORIES = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stack Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART_FEATURE_COUNT = CHART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stack Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BAR_CHART_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.CategoryImpl
	 * @see vml.impl.VmlPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 23;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.impl.StackBarsImpl <em>Stack Bars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.StackBarsImpl
	 * @see vml.impl.VmlPackageImpl#getStackBars()
	 * @generated
	 */
	int STACK_BARS = 24;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__DIAGRAMS = CHART_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__ID = CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__XVALUE = CHART_ELEMENT__XVALUE;

	/**
	 * The feature id for the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__YVALUE = CHART_ELEMENT__YVALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__CATEGORY = CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS__BARS = CHART_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stack Bars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS_FEATURE_COUNT = CHART_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stack Bars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BARS_OPERATION_COUNT = CHART_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.LineChartImpl <em>Line Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.LineChartImpl
	 * @see vml.impl.VmlPackageImpl#getLineChart()
	 * @generated
	 */
	int LINE_CHART = 25;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__DIGRAMS = CHART__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__ID = CHART__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__XTITLE = CHART__XTITLE;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__YTITLE = CHART__YTITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__STYLE = CHART__STYLE;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__POINTS = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FEATURE_COUNT = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.PointImpl
	 * @see vml.impl.VmlPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 26;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__DIAGRAMS = CHART_ELEMENT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XVALUE = CHART_ELEMENT__XVALUE;

	/**
	 * The feature id for the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YVALUE = CHART_ELEMENT__YVALUE;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = CHART_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.ScatterImpl <em>Scatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ScatterImpl
	 * @see vml.impl.VmlPackageImpl#getScatter()
	 * @generated
	 */
	int SCATTER = 27;

	/**
	 * The feature id for the '<em><b>Digrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__DIGRAMS = CHART__DIGRAMS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__ID = CHART__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__TITLE = CHART__TITLE;

	/**
	 * The feature id for the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__XTITLE = CHART__XTITLE;

	/**
	 * The feature id for the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__YTITLE = CHART__YTITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__STYLE = CHART__STYLE;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__POINTS = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_FEATURE_COUNT = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vml.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.impl.ColorImpl
	 * @see vml.impl.VmlPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vml.LineStyle <em>Line Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vml.LineStyle
	 * @see vml.impl.VmlPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 29;

	/**
	 * Returns the meta object for class '{@link vml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see vml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Model#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see vml.Model#getDiagrams()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Diagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Model#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see vml.Model#getTables()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tables();

	/**
	 * Returns the meta object for class '{@link vml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see vml.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see vml.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see vml.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the attribute '{@link vml.Table#getTableTitle <em>Table Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Title</em>'.
	 * @see vml.Table#getTableTitle()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableTitle();

	/**
	 * Returns the meta object for class '{@link vml.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see vml.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link vml.Column#getColumnTitle <em>Column Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Title</em>'.
	 * @see vml.Column#getColumnTitle()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnTitle();

	/**
	 * Returns the meta object for class '{@link vml.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see vml.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see vml.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link vml.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see vml.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference '{@link vml.Cell#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col</em>'.
	 * @see vml.Cell#getCol()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Col();

	/**
	 * Returns the meta object for the attribute '{@link vml.Cell#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see vml.Cell#getTextValue()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_TextValue();

	/**
	 * Returns the meta object for class '{@link vml.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see vml.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Diagram#getDigrams <em>Digrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digrams</em>'.
	 * @see vml.Diagram#getDigrams()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Digrams();

	/**
	 * Returns the meta object for class '{@link vml.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see vml.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link vml.GraphStyle <em>Graph Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Style</em>'.
	 * @see vml.GraphStyle
	 * @generated
	 */
	EClass getGraphStyle();

	/**
	 * Returns the meta object for class '{@link vml.NodeStyle <em>Node Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Style</em>'.
	 * @see vml.NodeStyle
	 * @generated
	 */
	EClass getNodeStyle();

	/**
	 * Returns the meta object for the attribute '{@link vml.NodeStyle#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see vml.NodeStyle#getBorderWidth()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link vml.NodeStyle#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see vml.NodeStyle#getPadding()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EAttribute getNodeStyle_Padding();

	/**
	 * Returns the meta object for the reference '{@link vml.NodeStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Background Color</em>'.
	 * @see vml.NodeStyle#getBackgroundColor()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EReference getNodeStyle_BackgroundColor();

	/**
	 * Returns the meta object for the reference '{@link vml.NodeStyle#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreground Color</em>'.
	 * @see vml.NodeStyle#getForegroundColor()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EReference getNodeStyle_ForegroundColor();

	/**
	 * Returns the meta object for the reference '{@link vml.NodeStyle#getHighlightColor <em>Highlight Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Highlight Color</em>'.
	 * @see vml.NodeStyle#getHighlightColor()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EReference getNodeStyle_HighlightColor();

	/**
	 * Returns the meta object for the reference '{@link vml.NodeStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Border Color</em>'.
	 * @see vml.NodeStyle#getBorderColor()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EReference getNodeStyle_BorderColor();

	/**
	 * Returns the meta object for the reference '{@link vml.NodeStyle#getBorderHighlightColor <em>Border Highlight Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Border Highlight Color</em>'.
	 * @see vml.NodeStyle#getBorderHighlightColor()
	 * @see #getNodeStyle()
	 * @generated
	 */
	EReference getNodeStyle_BorderHighlightColor();

	/**
	 * Returns the meta object for class '{@link vml.EdgeStyle <em>Edge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Style</em>'.
	 * @see vml.EdgeStyle
	 * @generated
	 */
	EClass getEdgeStyle();

	/**
	 * Returns the meta object for the attribute '{@link vml.EdgeStyle#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see vml.EdgeStyle#getLineWidth()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link vml.EdgeStyle#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see vml.EdgeStyle#getWeight()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Weight();

	/**
	 * Returns the meta object for the reference '{@link vml.EdgeStyle#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see vml.EdgeStyle#getSource()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EReference getEdgeStyle_Source();

	/**
	 * Returns the meta object for the reference '{@link vml.EdgeStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see vml.EdgeStyle#getTarget()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EReference getEdgeStyle_Target();

	/**
	 * Returns the meta object for the reference '{@link vml.EdgeStyle#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line Color</em>'.
	 * @see vml.EdgeStyle#getLineColor()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EReference getEdgeStyle_LineColor();

	/**
	 * Returns the meta object for the reference '{@link vml.EdgeStyle#getHighlightColor <em>Highlight Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Highlight Color</em>'.
	 * @see vml.EdgeStyle#getHighlightColor()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EReference getEdgeStyle_HighlightColor();

	/**
	 * Returns the meta object for the attribute '{@link vml.EdgeStyle#isDirected <em>Directed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directed</em>'.
	 * @see vml.EdgeStyle#isDirected()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_Directed();

	/**
	 * Returns the meta object for the attribute '{@link vml.EdgeStyle#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see vml.EdgeStyle#getLineStyle()
	 * @see #getEdgeStyle()
	 * @generated
	 */
	EAttribute getEdgeStyle_LineStyle();

	/**
	 * Returns the meta object for class '{@link vml.ChartWithAxisStyle <em>Chart With Axis Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart With Axis Style</em>'.
	 * @see vml.ChartWithAxisStyle
	 * @generated
	 */
	EClass getChartWithAxisStyle();

	/**
	 * Returns the meta object for class '{@link vml.ChartWithoutAxisStyle <em>Chart Without Axis Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Without Axis Style</em>'.
	 * @see vml.ChartWithoutAxisStyle
	 * @generated
	 */
	EClass getChartWithoutAxisStyle();

	/**
	 * Returns the meta object for class '{@link vml.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see vml.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link vml.DiagramElement#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagrams</em>'.
	 * @see vml.DiagramElement#getDiagrams()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Diagrams();

	/**
	 * Returns the meta object for class '{@link vml.Pie <em>Pie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie</em>'.
	 * @see vml.Pie
	 * @generated
	 */
	EClass getPie();

	/**
	 * Returns the meta object for the attribute '{@link vml.Pie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vml.Pie#getTitle()
	 * @see #getPie()
	 * @generated
	 */
	EAttribute getPie_Title();

	/**
	 * Returns the meta object for the attribute '{@link vml.Pie#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see vml.Pie#getIdentifier()
	 * @see #getPie()
	 * @generated
	 */
	EAttribute getPie_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Pie#getSlices <em>Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slices</em>'.
	 * @see vml.Pie#getSlices()
	 * @see #getPie()
	 * @generated
	 */
	EReference getPie_Slices();

	/**
	 * Returns the meta object for the containment reference '{@link vml.Pie#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see vml.Pie#getStyle()
	 * @see #getPie()
	 * @generated
	 */
	EReference getPie_Style();

	/**
	 * Returns the meta object for class '{@link vml.Slice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slice</em>'.
	 * @see vml.Slice
	 * @generated
	 */
	EClass getSlice();

	/**
	 * Returns the meta object for the attribute '{@link vml.Slice#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vml.Slice#getTitle()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_Title();

	/**
	 * Returns the meta object for the attribute '{@link vml.Slice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see vml.Slice#getValue()
	 * @see #getSlice()
	 * @generated
	 */
	EAttribute getSlice_Value();

	/**
	 * Returns the meta object for class '{@link vml.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see vml.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link vml.Graph#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see vml.Graph#getID()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_ID();

	/**
	 * Returns the meta object for the attribute '{@link vml.Graph#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vml.Graph#getTitle()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see vml.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see vml.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for the containment reference '{@link vml.Graph#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see vml.Graph#getStyle()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Style();

	/**
	 * Returns the meta object for class '{@link vml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see vml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link vml.Node#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vml.Node#getTitle()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link vml.Node#getIcone <em>Icone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icone</em>'.
	 * @see vml.Node#getIcone()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Icone();

	/**
	 * Returns the meta object for the reference list '{@link vml.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see vml.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link vml.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see vml.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for class '{@link vml.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see vml.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link vml.Edge#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see vml.Edge#getRelation()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Relation();

	/**
	 * Returns the meta object for the reference '{@link vml.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see vml.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link vml.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see vml.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link vml.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see vml.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the attribute '{@link vml.Chart#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see vml.Chart#getID()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_ID();

	/**
	 * Returns the meta object for the attribute '{@link vml.Chart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see vml.Chart#getTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Title();

	/**
	 * Returns the meta object for the attribute '{@link vml.Chart#getXTitle <em>XTitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTitle</em>'.
	 * @see vml.Chart#getXTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_XTitle();

	/**
	 * Returns the meta object for the attribute '{@link vml.Chart#getYTitle <em>YTitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTitle</em>'.
	 * @see vml.Chart#getYTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_YTitle();

	/**
	 * Returns the meta object for the containment reference '{@link vml.Chart#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see vml.Chart#getStyle()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Style();

	/**
	 * Returns the meta object for class '{@link vml.ChartElement <em>Chart Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Element</em>'.
	 * @see vml.ChartElement
	 * @generated
	 */
	EClass getChartElement();

	/**
	 * Returns the meta object for the attribute '{@link vml.ChartElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see vml.ChartElement#getID()
	 * @see #getChartElement()
	 * @generated
	 */
	EAttribute getChartElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link vml.ChartElement#getXValue <em>XValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XValue</em>'.
	 * @see vml.ChartElement#getXValue()
	 * @see #getChartElement()
	 * @generated
	 */
	EAttribute getChartElement_XValue();

	/**
	 * Returns the meta object for the attribute '{@link vml.ChartElement#getYValue <em>YValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YValue</em>'.
	 * @see vml.ChartElement#getYValue()
	 * @see #getChartElement()
	 * @generated
	 */
	EAttribute getChartElement_YValue();

	/**
	 * Returns the meta object for class '{@link vml.BarChart <em>Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart</em>'.
	 * @see vml.BarChart
	 * @generated
	 */
	EClass getBarChart();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.BarChart#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see vml.BarChart#getBars()
	 * @see #getBarChart()
	 * @generated
	 */
	EReference getBarChart_Bars();

	/**
	 * Returns the meta object for class '{@link vml.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see vml.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for class '{@link vml.StackBarChart <em>Stack Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Bar Chart</em>'.
	 * @see vml.StackBarChart
	 * @generated
	 */
	EClass getStackBarChart();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.StackBarChart#getStackBar <em>Stack Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stack Bar</em>'.
	 * @see vml.StackBarChart#getStackBar()
	 * @see #getStackBarChart()
	 * @generated
	 */
	EReference getStackBarChart_StackBar();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.StackBarChart#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see vml.StackBarChart#getCategories()
	 * @see #getStackBarChart()
	 * @generated
	 */
	EReference getStackBarChart_Categories();

	/**
	 * Returns the meta object for class '{@link vml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see vml.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link vml.Category#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see vml.Category#getCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Category();

	/**
	 * Returns the meta object for class '{@link vml.StackBars <em>Stack Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Bars</em>'.
	 * @see vml.StackBars
	 * @generated
	 */
	EClass getStackBars();

	/**
	 * Returns the meta object for the reference '{@link vml.StackBars#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see vml.StackBars#getCategory()
	 * @see #getStackBars()
	 * @generated
	 */
	EReference getStackBars_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.StackBars#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see vml.StackBars#getBars()
	 * @see #getStackBars()
	 * @generated
	 */
	EReference getStackBars_Bars();

	/**
	 * Returns the meta object for class '{@link vml.LineChart <em>Line Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Chart</em>'.
	 * @see vml.LineChart
	 * @generated
	 */
	EClass getLineChart();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.LineChart#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see vml.LineChart#getPoints()
	 * @see #getLineChart()
	 * @generated
	 */
	EReference getLineChart_Points();

	/**
	 * Returns the meta object for class '{@link vml.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see vml.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for class '{@link vml.Scatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter</em>'.
	 * @see vml.Scatter
	 * @generated
	 */
	EClass getScatter();

	/**
	 * Returns the meta object for the containment reference list '{@link vml.Scatter#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see vml.Scatter#getPoints()
	 * @see #getScatter()
	 * @generated
	 */
	EReference getScatter_Points();

	/**
	 * Returns the meta object for class '{@link vml.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see vml.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link vml.Color#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vml.Color#getName()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Name();

	/**
	 * Returns the meta object for the attribute '{@link vml.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see vml.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link vml.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see vml.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link vml.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see vml.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for enum '{@link vml.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Style</em>'.
	 * @see vml.LineStyle
	 * @generated
	 */
	EEnum getLineStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmlFactory getVmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ModelImpl
		 * @see vml.impl.VmlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DIAGRAMS = eINSTANCE.getModel_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TABLES = eINSTANCE.getModel_Tables();

		/**
		 * The meta object literal for the '{@link vml.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.TableImpl
		 * @see vml.impl.VmlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Table Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_TITLE = eINSTANCE.getTable_TableTitle();

		/**
		 * The meta object literal for the '{@link vml.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ColumnImpl
		 * @see vml.impl.VmlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Column Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_TITLE = eINSTANCE.getColumn_ColumnTitle();

		/**
		 * The meta object literal for the '{@link vml.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.RowImpl
		 * @see vml.impl.VmlPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link vml.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.CellImpl
		 * @see vml.impl.VmlPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__COL = eINSTANCE.getCell_Col();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__TEXT_VALUE = eINSTANCE.getCell_TextValue();

		/**
		 * The meta object literal for the '{@link vml.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.DiagramImpl
		 * @see vml.impl.VmlPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Digrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__DIGRAMS = eINSTANCE.getDiagram_Digrams();

		/**
		 * The meta object literal for the '{@link vml.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.StyleImpl
		 * @see vml.impl.VmlPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '{@link vml.impl.GraphStyleImpl <em>Graph Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.GraphStyleImpl
		 * @see vml.impl.VmlPackageImpl#getGraphStyle()
		 * @generated
		 */
		EClass GRAPH_STYLE = eINSTANCE.getGraphStyle();

		/**
		 * The meta object literal for the '{@link vml.impl.NodeStyleImpl <em>Node Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.NodeStyleImpl
		 * @see vml.impl.VmlPackageImpl#getNodeStyle()
		 * @generated
		 */
		EClass NODE_STYLE = eINSTANCE.getNodeStyle();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__BORDER_WIDTH = eINSTANCE.getNodeStyle_BorderWidth();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_STYLE__PADDING = eINSTANCE.getNodeStyle_Padding();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE__BACKGROUND_COLOR = eINSTANCE.getNodeStyle_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE__FOREGROUND_COLOR = eINSTANCE.getNodeStyle_ForegroundColor();

		/**
		 * The meta object literal for the '<em><b>Highlight Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE__HIGHLIGHT_COLOR = eINSTANCE.getNodeStyle_HighlightColor();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE__BORDER_COLOR = eINSTANCE.getNodeStyle_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Border Highlight Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_STYLE__BORDER_HIGHLIGHT_COLOR = eINSTANCE.getNodeStyle_BorderHighlightColor();

		/**
		 * The meta object literal for the '{@link vml.impl.EdgeStyleImpl <em>Edge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.EdgeStyleImpl
		 * @see vml.impl.VmlPackageImpl#getEdgeStyle()
		 * @generated
		 */
		EClass EDGE_STYLE = eINSTANCE.getEdgeStyle();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__LINE_WIDTH = eINSTANCE.getEdgeStyle_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__WEIGHT = eINSTANCE.getEdgeStyle_Weight();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE__SOURCE = eINSTANCE.getEdgeStyle_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE__TARGET = eINSTANCE.getEdgeStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE__LINE_COLOR = eINSTANCE.getEdgeStyle_LineColor();

		/**
		 * The meta object literal for the '<em><b>Highlight Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_STYLE__HIGHLIGHT_COLOR = eINSTANCE.getEdgeStyle_HighlightColor();

		/**
		 * The meta object literal for the '<em><b>Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__DIRECTED = eINSTANCE.getEdgeStyle_Directed();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_STYLE__LINE_STYLE = eINSTANCE.getEdgeStyle_LineStyle();

		/**
		 * The meta object literal for the '{@link vml.impl.ChartWithAxisStyleImpl <em>Chart With Axis Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ChartWithAxisStyleImpl
		 * @see vml.impl.VmlPackageImpl#getChartWithAxisStyle()
		 * @generated
		 */
		EClass CHART_WITH_AXIS_STYLE = eINSTANCE.getChartWithAxisStyle();

		/**
		 * The meta object literal for the '{@link vml.impl.ChartWithoutAxisStyleImpl <em>Chart Without Axis Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ChartWithoutAxisStyleImpl
		 * @see vml.impl.VmlPackageImpl#getChartWithoutAxisStyle()
		 * @generated
		 */
		EClass CHART_WITHOUT_AXIS_STYLE = eINSTANCE.getChartWithoutAxisStyle();

		/**
		 * The meta object literal for the '{@link vml.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.DiagramElementImpl
		 * @see vml.impl.VmlPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__DIAGRAMS = eINSTANCE.getDiagramElement_Diagrams();

		/**
		 * The meta object literal for the '{@link vml.impl.PieImpl <em>Pie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.PieImpl
		 * @see vml.impl.VmlPackageImpl#getPie()
		 * @generated
		 */
		EClass PIE = eINSTANCE.getPie();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIE__TITLE = eINSTANCE.getPie_Title();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIE__IDENTIFIER = eINSTANCE.getPie_Identifier();

		/**
		 * The meta object literal for the '<em><b>Slices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIE__SLICES = eINSTANCE.getPie_Slices();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIE__STYLE = eINSTANCE.getPie_Style();

		/**
		 * The meta object literal for the '{@link vml.impl.SliceImpl <em>Slice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.SliceImpl
		 * @see vml.impl.VmlPackageImpl#getSlice()
		 * @generated
		 */
		EClass SLICE = eINSTANCE.getSlice();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__TITLE = eINSTANCE.getSlice_Title();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLICE__VALUE = eINSTANCE.getSlice_Value();

		/**
		 * The meta object literal for the '{@link vml.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.GraphImpl
		 * @see vml.impl.VmlPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__ID = eINSTANCE.getGraph_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__TITLE = eINSTANCE.getGraph_Title();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__STYLE = eINSTANCE.getGraph_Style();

		/**
		 * The meta object literal for the '{@link vml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.NodeImpl
		 * @see vml.impl.VmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TITLE = eINSTANCE.getNode_Title();

		/**
		 * The meta object literal for the '<em><b>Icone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ICONE = eINSTANCE.getNode_Icone();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link vml.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.EdgeImpl
		 * @see vml.impl.VmlPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__RELATION = eINSTANCE.getEdge_Relation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link vml.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ChartImpl
		 * @see vml.impl.VmlPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__ID = eINSTANCE.getChart_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TITLE = eINSTANCE.getChart_Title();

		/**
		 * The meta object literal for the '<em><b>XTitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__XTITLE = eINSTANCE.getChart_XTitle();

		/**
		 * The meta object literal for the '<em><b>YTitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__YTITLE = eINSTANCE.getChart_YTitle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__STYLE = eINSTANCE.getChart_Style();

		/**
		 * The meta object literal for the '{@link vml.impl.ChartElementImpl <em>Chart Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ChartElementImpl
		 * @see vml.impl.VmlPackageImpl#getChartElement()
		 * @generated
		 */
		EClass CHART_ELEMENT = eINSTANCE.getChartElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_ELEMENT__ID = eINSTANCE.getChartElement_ID();

		/**
		 * The meta object literal for the '<em><b>XValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_ELEMENT__XVALUE = eINSTANCE.getChartElement_XValue();

		/**
		 * The meta object literal for the '<em><b>YValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_ELEMENT__YVALUE = eINSTANCE.getChartElement_YValue();

		/**
		 * The meta object literal for the '{@link vml.impl.BarChartImpl <em>Bar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.BarChartImpl
		 * @see vml.impl.VmlPackageImpl#getBarChart()
		 * @generated
		 */
		EClass BAR_CHART = eINSTANCE.getBarChart();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR_CHART__BARS = eINSTANCE.getBarChart_Bars();

		/**
		 * The meta object literal for the '{@link vml.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.BarImpl
		 * @see vml.impl.VmlPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '{@link vml.impl.StackBarChartImpl <em>Stack Bar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.StackBarChartImpl
		 * @see vml.impl.VmlPackageImpl#getStackBarChart()
		 * @generated
		 */
		EClass STACK_BAR_CHART = eINSTANCE.getStackBarChart();

		/**
		 * The meta object literal for the '<em><b>Stack Bar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BAR_CHART__STACK_BAR = eINSTANCE.getStackBarChart_StackBar();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BAR_CHART__CATEGORIES = eINSTANCE.getStackBarChart_Categories();

		/**
		 * The meta object literal for the '{@link vml.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.CategoryImpl
		 * @see vml.impl.VmlPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY = eINSTANCE.getCategory_Category();

		/**
		 * The meta object literal for the '{@link vml.impl.StackBarsImpl <em>Stack Bars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.StackBarsImpl
		 * @see vml.impl.VmlPackageImpl#getStackBars()
		 * @generated
		 */
		EClass STACK_BARS = eINSTANCE.getStackBars();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BARS__CATEGORY = eINSTANCE.getStackBars_Category();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BARS__BARS = eINSTANCE.getStackBars_Bars();

		/**
		 * The meta object literal for the '{@link vml.impl.LineChartImpl <em>Line Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.LineChartImpl
		 * @see vml.impl.VmlPackageImpl#getLineChart()
		 * @generated
		 */
		EClass LINE_CHART = eINSTANCE.getLineChart();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_CHART__POINTS = eINSTANCE.getLineChart_Points();

		/**
		 * The meta object literal for the '{@link vml.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.PointImpl
		 * @see vml.impl.VmlPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '{@link vml.impl.ScatterImpl <em>Scatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ScatterImpl
		 * @see vml.impl.VmlPackageImpl#getScatter()
		 * @generated
		 */
		EClass SCATTER = eINSTANCE.getScatter();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCATTER__POINTS = eINSTANCE.getScatter_Points();

		/**
		 * The meta object literal for the '{@link vml.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.impl.ColorImpl
		 * @see vml.impl.VmlPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '{@link vml.LineStyle <em>Line Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vml.LineStyle
		 * @see vml.impl.VmlPackageImpl#getLineStyle()
		 * @generated
		 */
		EEnum LINE_STYLE = eINSTANCE.getLineStyle();

	}

} //VmlPackage
