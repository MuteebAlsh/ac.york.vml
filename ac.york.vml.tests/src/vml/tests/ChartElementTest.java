/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.ChartElement;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chart Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartElementTest extends DiagramElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChartElementTest.class);
	}

	/**
	 * Constructs a new Chart Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Chart Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChartElement getFixture() {
		return (ChartElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createChartElement());
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

} //ChartElementTest
