/**
 */
package vml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vml.ChartElement;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.ChartElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link vml.impl.ChartElementImpl#getXValue <em>XValue</em>}</li>
 *   <li>{@link vml.impl.ChartElementImpl#getYValue <em>YValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartElementImpl extends DiagramElementImpl implements ChartElement {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXValue() <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValue()
	 * @generated
	 * @ordered
	 */
	protected static final String XVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXValue() <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValue()
	 * @generated
	 * @ordered
	 */
	protected String xValue = XVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYValue() <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double YVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYValue() <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValue()
	 * @generated
	 * @ordered
	 */
	protected Double yValue = YVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.CHART_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(Integer newID) {
		Integer oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.CHART_ELEMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXValue() {
		return xValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXValue(String newXValue) {
		String oldXValue = xValue;
		xValue = newXValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.CHART_ELEMENT__XVALUE, oldXValue, xValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYValue() {
		return yValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYValue(Double newYValue) {
		Double oldYValue = yValue;
		yValue = newYValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.CHART_ELEMENT__YVALUE, oldYValue, yValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlPackage.CHART_ELEMENT__ID:
				return getID();
			case VmlPackage.CHART_ELEMENT__XVALUE:
				return getXValue();
			case VmlPackage.CHART_ELEMENT__YVALUE:
				return getYValue();
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
			case VmlPackage.CHART_ELEMENT__ID:
				setID((Integer)newValue);
				return;
			case VmlPackage.CHART_ELEMENT__XVALUE:
				setXValue((String)newValue);
				return;
			case VmlPackage.CHART_ELEMENT__YVALUE:
				setYValue((Double)newValue);
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
			case VmlPackage.CHART_ELEMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case VmlPackage.CHART_ELEMENT__XVALUE:
				setXValue(XVALUE_EDEFAULT);
				return;
			case VmlPackage.CHART_ELEMENT__YVALUE:
				setYValue(YVALUE_EDEFAULT);
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
			case VmlPackage.CHART_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VmlPackage.CHART_ELEMENT__XVALUE:
				return XVALUE_EDEFAULT == null ? xValue != null : !XVALUE_EDEFAULT.equals(xValue);
			case VmlPackage.CHART_ELEMENT__YVALUE:
				return YVALUE_EDEFAULT == null ? yValue != null : !YVALUE_EDEFAULT.equals(yValue);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", xValue: ");
		result.append(xValue);
		result.append(", yValue: ");
		result.append(yValue);
		result.append(')');
		return result.toString();
	}

} //ChartElementImpl
