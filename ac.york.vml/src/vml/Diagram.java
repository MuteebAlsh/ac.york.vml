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
 *   <li>{@link vml.Diagram#getTitle <em>Title</em>}</li>
 *   <li>{@link vml.Diagram#getPies <em>Pies</em>}</li>
 *   <li>{@link vml.Diagram#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see vml.VmlPackage#getDiagram_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link vml.Diagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pies</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Pie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pies</em>' containment reference list.
	 * @see vml.VmlPackage#getDiagram_Pies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pie> getPies();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference list.
	 * The list contents are of type {@link vml.Graph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference list.
	 * @see vml.VmlPackage#getDiagram_Graph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graph> getGraph();

} // Diagram
