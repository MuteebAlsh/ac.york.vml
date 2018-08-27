/**
 */
package vml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vml.Color;
import vml.EdgeStyle;
import vml.LineStyle;
import vml.Node;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.EdgeStyleImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#isDirected <em>Directed</em>}</li>
 *   <li>{@link vml.impl.EdgeStyleImpl#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStyleImpl extends GraphStyleImpl implements EdgeStyle {
	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected Color lineColor;

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
	 * The default value of the '{@link #isDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirected() <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean directed = DIRECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.SOLID;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.EDGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Node)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.EDGE_STYLE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Node newSource) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.EDGE_STYLE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Node newTarget) {
		Node oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getLineColor() {
		if (lineColor != null && lineColor.eIsProxy()) {
			InternalEObject oldLineColor = (InternalEObject)lineColor;
			lineColor = (Color)eResolveProxy(oldLineColor);
			if (lineColor != oldLineColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.EDGE_STYLE__LINE_COLOR, oldLineColor, lineColor));
			}
		}
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(Color newLineColor) {
		Color oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__LINE_COLOR, oldLineColor, lineColor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR, oldHighlightColor, highlightColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR, oldHighlightColor, highlightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirected() {
		return directed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirected(boolean newDirected) {
		boolean oldDirected = directed;
		directed = newDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__DIRECTED, oldDirected, directed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyle newLineStyle) {
		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.EDGE_STYLE__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlPackage.EDGE_STYLE__LINE_WIDTH:
				return getLineWidth();
			case VmlPackage.EDGE_STYLE__WEIGHT:
				return getWeight();
			case VmlPackage.EDGE_STYLE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case VmlPackage.EDGE_STYLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VmlPackage.EDGE_STYLE__LINE_COLOR:
				if (resolve) return getLineColor();
				return basicGetLineColor();
			case VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR:
				if (resolve) return getHighlightColor();
				return basicGetHighlightColor();
			case VmlPackage.EDGE_STYLE__DIRECTED:
				return isDirected();
			case VmlPackage.EDGE_STYLE__LINE_STYLE:
				return getLineStyle();
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
			case VmlPackage.EDGE_STYLE__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case VmlPackage.EDGE_STYLE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case VmlPackage.EDGE_STYLE__SOURCE:
				setSource((Node)newValue);
				return;
			case VmlPackage.EDGE_STYLE__TARGET:
				setTarget((Node)newValue);
				return;
			case VmlPackage.EDGE_STYLE__LINE_COLOR:
				setLineColor((Color)newValue);
				return;
			case VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR:
				setHighlightColor((Color)newValue);
				return;
			case VmlPackage.EDGE_STYLE__DIRECTED:
				setDirected((Boolean)newValue);
				return;
			case VmlPackage.EDGE_STYLE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
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
			case VmlPackage.EDGE_STYLE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case VmlPackage.EDGE_STYLE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case VmlPackage.EDGE_STYLE__SOURCE:
				setSource((Node)null);
				return;
			case VmlPackage.EDGE_STYLE__TARGET:
				setTarget((Node)null);
				return;
			case VmlPackage.EDGE_STYLE__LINE_COLOR:
				setLineColor((Color)null);
				return;
			case VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR:
				setHighlightColor((Color)null);
				return;
			case VmlPackage.EDGE_STYLE__DIRECTED:
				setDirected(DIRECTED_EDEFAULT);
				return;
			case VmlPackage.EDGE_STYLE__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
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
			case VmlPackage.EDGE_STYLE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case VmlPackage.EDGE_STYLE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case VmlPackage.EDGE_STYLE__SOURCE:
				return source != null;
			case VmlPackage.EDGE_STYLE__TARGET:
				return target != null;
			case VmlPackage.EDGE_STYLE__LINE_COLOR:
				return lineColor != null;
			case VmlPackage.EDGE_STYLE__HIGHLIGHT_COLOR:
				return highlightColor != null;
			case VmlPackage.EDGE_STYLE__DIRECTED:
				return directed != DIRECTED_EDEFAULT;
			case VmlPackage.EDGE_STYLE__LINE_STYLE:
				return lineStyle != LINE_STYLE_EDEFAULT;
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
		result.append(" (lineWidth: ");
		result.append(lineWidth);
		result.append(", weight: ");
		result.append(weight);
		result.append(", directed: ");
		result.append(directed);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(')');
		return result.toString();
	}

} //EdgeStyleImpl
