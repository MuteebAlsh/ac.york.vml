/**
 */
package vml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.Cell#getCol <em>Col</em>}</li>
 *   <li>{@link vml.Cell#getTextValue <em>Text Value</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Col</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' reference.
	 * @see #setCol(Column)
	 * @see vml.VmlPackage#getCell_Col()
	 * @model
	 * @generated
	 */
	Column getCol();

	/**
	 * Sets the value of the '{@link vml.Cell#getCol <em>Col</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' reference.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(Column value);

	/**
	 * Returns the value of the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Value</em>' attribute.
	 * @see #setTextValue(String)
	 * @see vml.VmlPackage#getCell_TextValue()
	 * @model
	 * @generated
	 */
	String getTextValue();

	/**
	 * Sets the value of the '{@link vml.Cell#getTextValue <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Value</em>' attribute.
	 * @see #getTextValue()
	 * @generated
	 */
	void setTextValue(String value);

} // Cell
