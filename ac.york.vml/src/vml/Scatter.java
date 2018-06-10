/**
 */
package vml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scatter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.Scatter#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getScatter()
 * @model
 * @generated
 */
public interface Scatter extends Chart {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see vml.VmlPackage#getScatter_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Scatter
