/**
 */
package vml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.BarChart#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getBarChart()
 * @model
 * @generated
 */
public interface BarChart extends Chart {
	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Bar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see vml.VmlPackage#getBarChart_Bars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bar> getBars();

} // BarChart
