/**
 */
package vml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vml.Color;
import vml.NodeStyle;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.NodeStyleImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link vml.impl.NodeStyleImpl#getBorderHighlightColor <em>Border Highlight Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeStyleImpl extends GraphStyleImpl implements NodeStyle {
	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected int borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final int PADDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected int padding = PADDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color foregroundColor;

	/**
	 * The cached value of the '{@link #getHighlightColor() <em>Highlight Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightColor()
	 * @generated
	 * @ordered
	 */
	protected Color highlightColor;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected Color borderColor;

	/**
	 * The cached value of the '{@link #getBorderHighlightColor() <em>Border Highlight Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderHighlightColor()
	 * @generated
	 * @ordered
	 */
	protected Color borderHighlightColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.NODE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderWidth(int newBorderWidth) {
		int oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(int newPadding) {
		int oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		if (backgroundColor != null && backgroundColor.eIsProxy()) {
			InternalEObject oldBackgroundColor = (InternalEObject)backgroundColor;
			backgroundColor = (Color)eResolveProxy(oldBackgroundColor);
			if (backgroundColor != oldBackgroundColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.NODE_STYLE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
			}
		}
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForegroundColor() {
		if (foregroundColor != null && foregroundColor.eIsProxy()) {
			InternalEObject oldForegroundColor = (InternalEObject)foregroundColor;
			foregroundColor = (Color)eResolveProxy(oldForegroundColor);
			if (foregroundColor != oldForegroundColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.NODE_STYLE__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
			}
		}
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(Color newForegroundColor) {
		Color oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getHighlightColor() {
		if (highlightColor != null && highlightColor.eIsProxy()) {
			InternalEObject oldHighlightColor = (InternalEObject)highlightColor;
			highlightColor = (Color)eResolveProxy(oldHighlightColor);
			if (highlightColor != oldHighlightColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR, oldHighlightColor, highlightColor));
			}
		}
		return highlightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetHighlightColor() {
		return highlightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighlightColor(Color newHighlightColor) {
		Color oldHighlightColor = highlightColor;
		highlightColor = newHighlightColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR, oldHighlightColor, highlightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBorderColor() {
		if (borderColor != null && borderColor.eIsProxy()) {
			InternalEObject oldBorderColor = (InternalEObject)borderColor;
			borderColor = (Color)eResolveProxy(oldBorderColor);
			if (borderColor != oldBorderColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.NODE_STYLE__BORDER_COLOR, oldBorderColor, borderColor));
			}
		}
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(Color newBorderColor) {
		Color oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBorderHighlightColor() {
		if (borderHighlightColor != null && borderHighlightColor.eIsProxy()) {
			InternalEObject oldBorderHighlightColor = (InternalEObject)borderHighlightColor;
			borderHighlightColor = (Color)eResolveProxy(oldBorderHighlightColor);
			if (borderHighlightColor != oldBorderHighlightColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR, oldBorderHighlightColor, borderHighlightColor));
			}
		}
		return borderHighlightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetBorderHighlightColor() {
		return borderHighlightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderHighlightColor(Color newBorderHighlightColor) {
		Color oldBorderHighlightColor = borderHighlightColor;
		borderHighlightColor = newBorderHighlightColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR, oldBorderHighlightColor, borderHighlightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlPackage.NODE_STYLE__BORDER_WIDTH:
				return getBorderWidth();
			case VmlPackage.NODE_STYLE__PADDING:
				return getPadding();
			case VmlPackage.NODE_STYLE__BACKGROUND_COLOR:
				if (resolve) return getBackgroundColor();
				return basicGetBackgroundColor();
			case VmlPackage.NODE_STYLE__FOREGROUND_COLOR:
				if (resolve) return getForegroundColor();
				return basicGetForegroundColor();
			case VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR:
				if (resolve) return getHighlightColor();
				return basicGetHighlightColor();
			case VmlPackage.NODE_STYLE__BORDER_COLOR:
				if (resolve) return getBorderColor();
				return basicGetBorderColor();
			case VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR:
				if (resolve) return getBorderHighlightColor();
				return basicGetBorderHighlightColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmlPackage.NODE_STYLE__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case VmlPackage.NODE_STYLE__PADDING:
				setPadding((Integer)newValue);
				return;
			case VmlPackage.NODE_STYLE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case VmlPackage.NODE_STYLE__FOREGROUND_COLOR:
				setForegroundColor((Color)newValue);
				return;
			case VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR:
				setHighlightColor((Color)newValue);
				return;
			case VmlPackage.NODE_STYLE__BORDER_COLOR:
				setBorderColor((Color)newValue);
				return;
			case VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR:
				setBorderHighlightColor((Color)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmlPackage.NODE_STYLE__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case VmlPackage.NODE_STYLE__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case VmlPackage.NODE_STYLE__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case VmlPackage.NODE_STYLE__FOREGROUND_COLOR:
				setForegroundColor((Color)null);
				return;
			case VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR:
				setHighlightColor((Color)null);
				return;
			case VmlPackage.NODE_STYLE__BORDER_COLOR:
				setBorderColor((Color)null);
				return;
			case VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR:
				setBorderHighlightColor((Color)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmlPackage.NODE_STYLE__BORDER_WIDTH:
				return borderWidth != BORDER_WIDTH_EDEFAULT;
			case VmlPackage.NODE_STYLE__PADDING:
				return padding != PADDING_EDEFAULT;
			case VmlPackage.NODE_STYLE__BACKGROUND_COLOR:
				return backgroundColor != null;
			case VmlPackage.NODE_STYLE__FOREGROUND_COLOR:
				return foregroundColor != null;
			case VmlPackage.NODE_STYLE__HIGHLIGHT_COLOR:
				return highlightColor != null;
			case VmlPackage.NODE_STYLE__BORDER_COLOR:
				return borderColor != null;
			case VmlPackage.NODE_STYLE__BORDER_HIGHLIGHT_COLOR:
				return borderHighlightColor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (borderWidth: ");
		result.append(borderWidth);
		result.append(", padding: ");
		result.append(padding);
		result.append(')');
		return result.toString();
	}

} //NodeStyleImpl
