/**
 */
package vml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.ChartElement#getID <em>ID</em>}</li>
 *   <li>{@link vml.ChartElement#getXValue <em>XValue</em>}</li>
 *   <li>{@link vml.ChartElement#getYValue <em>YValue</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getChartElement()
 * @model
 * @generated
 */
public interface ChartElement extends DiagramElement {
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
	 * @see vml.VmlPackage#getChartElement_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link vml.ChartElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

	/**
	 * Returns the value of the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XValue</em>' attribute.
	 * @see #setXValue(String)
	 * @see vml.VmlPackage#getChartElement_XValue()
	 * @model
	 * @generated
	 */
	String getXValue();

	/**
	 * Sets the value of the '{@link vml.ChartElement#getXValue <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XValue</em>' attribute.
	 * @see #getXValue()
	 * @generated
	 */
	void setXValue(String value);

	/**
	 * Returns the value of the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YValue</em>' attribute.
	 * @see #setYValue(Double)
	 * @see vml.VmlPackage#getChartElement_YValue()
	 * @model
	 * @generated
	 */
	Double getYValue();

	/**
	 * Sets the value of the '{@link vml.ChartElement#getYValue <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YValue</em>' attribute.
	 * @see #getYValue()
	 * @generated
	 */
	void setYValue(Double value);

} // ChartElement
