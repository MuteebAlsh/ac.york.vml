/**
 */
package vml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Bars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.StackBars#getCategory <em>Category</em>}</li>
 *   <li>{@link vml.StackBars#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getStackBars()
 * @model
 * @generated
 */
public interface StackBars extends ChartElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see vml.VmlPackage#getStackBars_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link vml.StackBars#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link vml.ChartElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see vml.VmlPackage#getStackBars_Bars()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChartElement> getBars();

} // StackBars
