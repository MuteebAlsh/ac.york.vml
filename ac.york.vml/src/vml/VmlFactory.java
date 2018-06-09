/**
 */
package vml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vml.VmlPackage
 * @generated
 */
public interface VmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmlFactory eINSTANCE = vml.impl.VmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Element</em>'.
	 * @generated
	 */
	DiagramElement createDiagramElement();

	/**
	 * Returns a new object of class '<em>Pie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pie</em>'.
	 * @generated
	 */
	Pie createPie();

	/**
	 * Returns a new object of class '<em>Slice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slice</em>'.
	 * @generated
	 */
	Slice createSlice();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart</em>'.
	 * @generated
	 */
	Chart createChart();

	/**
	 * Returns a new object of class '<em>Chart Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart Element</em>'.
	 * @generated
	 */
	ChartElement createChartElement();

	/**
	 * Returns a new object of class '<em>Bar Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Chart</em>'.
	 * @generated
	 */
	BarChart createBarChart();

	/**
	 * Returns a new object of class '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar</em>'.
	 * @generated
	 */
	Bar createBar();

	/**
	 * Returns a new object of class '<em>Stack Bar Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Bar Chart</em>'.
	 * @generated
	 */
	StackBarChart createStackBarChart();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Stack Bars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Bars</em>'.
	 * @generated
	 */
	StackBars createStackBars();

	/**
	 * Returns a new object of class '<em>Line Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Chart</em>'.
	 * @generated
	 */
	LineChart createLineChart();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmlPackage getVmlPackage();

} //VmlFactory
