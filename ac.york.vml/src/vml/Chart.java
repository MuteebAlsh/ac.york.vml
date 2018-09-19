/**
 */
package vml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.Chart#getID <em>ID</em>}</li>
 *   <li>{@link vml.Chart#getTitle <em>Title</em>}</li>
 *   <li>{@link vml.Chart#getXTitle <em>XTitle</em>}</li>
 *   <li>{@link vml.Chart#getYTitle <em>YTitle</em>}</li>
 *   <li>{@link vml.Chart#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getChart()
 * @model abstract="true"
 * @generated
 */
public interface Chart extends Diagram {
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
	 * @see vml.VmlPackage#getChart_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link vml.Chart#getID <em>ID</em>}' attribute.
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
	 * @see vml.VmlPackage#getChart_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link vml.Chart#getTitle <em>Title</em>}' attribute.
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
	 * @see vml.VmlPackage#getChart_XTitle()
	 * @model
	 * @generated
	 */
	String getXTitle();

	/**
	 * Sets the value of the '{@link vml.Chart#getXTitle <em>XTitle</em>}' attribute.
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
	 * @see vml.VmlPackage#getChart_YTitle()
	 * @model
	 * @generated
	 */
	String getYTitle();

	/**
	 * Sets the value of the '{@link vml.Chart#getYTitle <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YTitle</em>' attribute.
	 * @see #getYTitle()
	 * @generated
	 */
	void setYTitle(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(ChartWithAxisStyle)
	 * @see vml.VmlPackage#getChart_Style()
	 * @model containment="true"
	 * @generated
	 */
	ChartWithAxisStyle getStyle();

	/**
	 * Sets the value of the '{@link vml.Chart#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ChartWithAxisStyle value);

} // Chart
