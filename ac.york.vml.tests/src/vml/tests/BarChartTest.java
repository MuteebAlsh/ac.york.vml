/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.BarChart;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarChartTest extends ChartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BarChartTest.class);
	}

	/**
	 * Constructs a new Bar Chart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarChartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bar Chart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BarChart getFixture() {
		return (BarChart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createBarChart());
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

} //BarChartTest
