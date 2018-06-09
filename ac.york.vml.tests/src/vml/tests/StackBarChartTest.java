/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.StackBarChart;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stack Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StackBarChartTest extends ChartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StackBarChartTest.class);
	}

	/**
	 * Constructs a new Stack Bar Chart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackBarChartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stack Bar Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StackBarChart getFixture() {
		return (StackBarChart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createStackBarChart());
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

} //StackBarChartTest
