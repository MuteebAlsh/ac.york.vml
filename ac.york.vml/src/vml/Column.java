/**
 */
package vml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.Column#getColumnTitle <em>Column Title</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Title</em>' attribute.
	 * @see #setColumnTitle(String)
	 * @see vml.VmlPackage#getColumn_ColumnTitle()
	 * @model
	 * @generated
	 */
	String getColumnTitle();

	/**
	 * Sets the value of the '{@link vml.Column#getColumnTitle <em>Column Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Title</em>' attribute.
	 * @see #getColumnTitle()
	 * @generated
	 */
	void setColumnTitle(String value);

} // Column
