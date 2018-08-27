/**
 */
package vml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.EdgeStyle#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link vml.EdgeStyle#getWeight <em>Weight</em>}</li>
 *   <li>{@link vml.EdgeStyle#getSource <em>Source</em>}</li>
 *   <li>{@link vml.EdgeStyle#getTarget <em>Target</em>}</li>
 *   <li>{@link vml.EdgeStyle#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link vml.EdgeStyle#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link vml.EdgeStyle#isDirected <em>Directed</em>}</li>
 *   <li>{@link vml.EdgeStyle#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getEdgeStyle()
 * @model
 * @generated
 */
public interface EdgeStyle extends GraphStyle {
	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see vml.VmlPackage#getEdgeStyle_LineWidth()
	 * @model default="1"
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see vml.VmlPackage#getEdgeStyle_Weight()
	 * @model default="1"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see vml.VmlPackage#getEdgeStyle_Source()
	 * @model
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see vml.VmlPackage#getEdgeStyle_Target()
	 * @model
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' reference.
	 * @see #setLineColor(Color)
	 * @see vml.VmlPackage#getEdgeStyle_LineColor()
	 * @model
	 * @generated
	 */
	Color getLineColor();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getLineColor <em>Line Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' reference.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(Color value);

	/**
	 * Returns the value of the '<em><b>Highlight Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highlight Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlight Color</em>' reference.
	 * @see #setHighlightColor(Color)
	 * @see vml.VmlPackage#getEdgeStyle_HighlightColor()
	 * @model
	 * @generated
	 */
	Color getHighlightColor();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getHighlightColor <em>Highlight Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight Color</em>' reference.
	 * @see #getHighlightColor()
	 * @generated
	 */
	void setHighlightColor(Color value);

	/**
	 * Returns the value of the '<em><b>Directed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed</em>' attribute.
	 * @see #setDirected(boolean)
	 * @see vml.VmlPackage#getEdgeStyle_Directed()
	 * @model default="false"
	 * @generated
	 */
	boolean isDirected();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#isDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed</em>' attribute.
	 * @see #isDirected()
	 * @generated
	 */
	void setDirected(boolean value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link vml.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see vml.LineStyle
	 * @see #setLineStyle(LineStyle)
	 * @see vml.VmlPackage#getEdgeStyle_LineStyle()
	 * @model
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link vml.EdgeStyle#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see vml.LineStyle
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

} // EdgeStyle
