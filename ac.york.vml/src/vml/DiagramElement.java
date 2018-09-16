/**
 */
package vml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.DiagramElement#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link vml.DiagramElement#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getDiagramElement()
 * @model
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference.
	 * @see #setDiagrams(Diagram)
	 * @see vml.VmlPackage#getDiagramElement_Diagrams()
	 * @model
	 * @generated
	 */
	Diagram getDiagrams();

	/**
	 * Sets the value of the '{@link vml.DiagramElement#getDiagrams <em>Diagrams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagrams</em>' reference.
	 * @see #getDiagrams()
	 * @generated
	 */
	void setDiagrams(Diagram value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see vml.VmlPackage#getDiagramElement_Table()
	 * @model
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link vml.DiagramElement#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // DiagramElement
