/**
 */
package vml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.Diagram#getDigrams <em>Digrams</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends EObject {

	/**
	 * Returns the value of the '<em><b>Digrams</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digrams</em>' containment reference list.
	 * @see vml.VmlPackage#getDiagram_Digrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diagram> getDigrams();

} // Diagram
