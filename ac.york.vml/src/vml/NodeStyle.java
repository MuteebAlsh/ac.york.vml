/**
 */
package vml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vml.NodeStyle#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link vml.NodeStyle#getPadding <em>Padding</em>}</li>
 *   <li>{@link vml.NodeStyle#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link vml.NodeStyle#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link vml.NodeStyle#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link vml.NodeStyle#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link vml.NodeStyle#getBorderHighlightColor <em>Border Highlight Color</em>}</li>
 * </ul>
 *
 * @see vml.VmlPackage#getNodeStyle()
 * @model
 * @generated
 */
public interface NodeStyle extends GraphStyle {
	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(int)
	 * @see vml.VmlPackage#getNodeStyle_BorderWidth()
	 * @model default="1"
	 * @generated
	 */
	int getBorderWidth();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(int value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(int)
	 * @see vml.VmlPackage#getNodeStyle_Padding()
	 * @model default="0"
	 * @generated
	 */
	int getPadding();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(int value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' reference.
	 * @see #setBackgroundColor(Color)
	 * @see vml.VmlPackage#getNodeStyle_BackgroundColor()
	 * @model
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getBackgroundColor <em>Background Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' reference.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Foreground Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color</em>' reference.
	 * @see #setForegroundColor(Color)
	 * @see vml.VmlPackage#getNodeStyle_ForegroundColor()
	 * @model
	 * @generated
	 */
	Color getForegroundColor();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getForegroundColor <em>Foreground Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' reference.
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(Color value);

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
	 * @see vml.VmlPackage#getNodeStyle_HighlightColor()
	 * @model
	 * @generated
	 */
	Color getHighlightColor();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getHighlightColor <em>Highlight Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight Color</em>' reference.
	 * @see #getHighlightColor()
	 * @generated
	 */
	void setHighlightColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' reference.
	 * @see #setBorderColor(Color)
	 * @see vml.VmlPackage#getNodeStyle_BorderColor()
	 * @model
	 * @generated
	 */
	Color getBorderColor();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getBorderColor <em>Border Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' reference.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border Highlight Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Highlight Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Highlight Color</em>' reference.
	 * @see #setBorderHighlightColor(Color)
	 * @see vml.VmlPackage#getNodeStyle_BorderHighlightColor()
	 * @model
	 * @generated
	 */
	Color getBorderHighlightColor();

	/**
	 * Sets the value of the '{@link vml.NodeStyle#getBorderHighlightColor <em>Border Highlight Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Highlight Color</em>' reference.
	 * @see #getBorderHighlightColor()
	 * @generated
	 */
	void setBorderHighlightColor(Color value);

} // NodeStyle
