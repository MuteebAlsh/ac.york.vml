/**
 */
package vml.tests;

import junit.textui.TestRunner;

import vml.Point;
import vml.VmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointTest extends ChartElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PointTest.class);
	}

	/**
	 * Constructs a new Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Point getFixture() {
		return (Point)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmlFactory.eINSTANCE.createPoint());
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

} //PointTest
