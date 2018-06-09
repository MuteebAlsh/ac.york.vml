/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.LineChart;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Line Chart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LineChartTest extends ChartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LineChartTest.class);
	}

	/**
	 * Constructs a new Line Chart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineChartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Line Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LineChart getFixture() {
		return (LineChart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createLineChart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LineChartTest
