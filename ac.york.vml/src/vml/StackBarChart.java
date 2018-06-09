/**
 */
package vml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.StackBarChart#getStackBar <em>Stack Bar</em>}</li>
 *   <li>{@link vml.StackBarChart#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getStackBarChart()
 * @model
 * @generated
 */
public interface StackBarChart extends Chart {
	/**
	 * Returns the value of the '<em><b>Stack Bar</b></em>' containment reference list.
	 * The list contents are of type {@link vml.StackBars}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Bar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Bar</em>' containment reference list.
	 * @see vml.VmlPackage#getStackBarChart_StackBar()
	 * @model containment="true"
	 * @generated
	 */
	EList<StackBars> getStackBar();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see vml.VmlPackage#getStackBarChart_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

} // StackBarChart
