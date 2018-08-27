/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.ChartWithAxisStyle;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chart With Axis Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartWithAxisStyleTest extends StyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChartWithAxisStyleTest.class);
	}

	/**
	 * Constructs a new Chart With Axis Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartWithAxisStyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chart With Axis Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChartWithAxisStyle getFixture() {
		return (ChartWithAxisStyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createChartWithAxisStyle());
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

} //ChartWithAxisStyleTest
