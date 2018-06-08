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
 *   <li>{@link vml.BarChart#getID <em>ID</em>}</li>
 *   <li>{@link vml.BarChart#getTitle <em>Title</em>}</li>
 *   <li>{@link vml.BarChart#getXTitle <em>XTitle</em>}</li>
 *   <li>{@link vml.BarChart#getYTitle <em>YTitle</em>}</li>
 *   <li>{@link vml.BarChart#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getBarChart()
 * @model
 * @generated
 */
public interface BarChart extends Diagram {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(Integer)
	 * @see vml.VmlPackage#getBarChart_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link vml.BarChart#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

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
	 * @see vml.VmlPackage#getBarChart_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link vml.BarChart#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>XTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XTitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XTitle</em>' attribute.
	 * @see #setXTitle(String)
	 * @see vml.VmlPackage#getBarChart_XTitle()
	 * @model
	 * @generated
	 */
	String getXTitle();

	/**
	 * Sets the value of the '{@link vml.BarChart#getXTitle <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XTitle</em>' attribute.
	 * @see #getXTitle()
	 * @generated
	 */
	void setXTitle(String value);

	/**
	 * Returns the value of the '<em><b>YTitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YTitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YTitle</em>' attribute.
	 * @see #setYTitle(String)
	 * @see vml.VmlPackage#getBarChart_YTitle()
	 * @model
	 * @generated
	 */
	String getYTitle();

	/**
	 * Sets the value of the '{@link vml.BarChart#getYTitle <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YTitle</em>' attribute.
	 * @see #getYTitle()
	 * @generated
	 */
	void setYTitle(String value);

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
