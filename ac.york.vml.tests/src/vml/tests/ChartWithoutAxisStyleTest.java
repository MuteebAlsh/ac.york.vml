/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.ChartWithoutAxisStyle;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chart Without Axis Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartWithoutAxisStyleTest extends StyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChartWithoutAxisStyleTest.class);
	}

	/**
	 * Constructs a new Chart Without Axis Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartWithoutAxisStyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chart Without Axis Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChartWithoutAxisStyle getFixture() {
		return (ChartWithoutAxisStyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createChartWithoutAxisStyle());
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

} //ChartWithoutAxisStyleTest
