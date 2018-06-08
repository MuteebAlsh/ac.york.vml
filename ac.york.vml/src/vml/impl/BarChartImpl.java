/**
 */
package vml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import vml.Bar;
import vml.BarChart;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.BarChartImpl#getID <em>ID</em>}</li>
 *   <li>{@link vml.impl.BarChartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link vml.impl.BarChartImpl#getXTitle <em>XTitle</em>}</li>
 *   <li>{@link vml.impl.BarChartImpl#getYTitle <em>YTitle</em>}</li>
 *   <li>{@link vml.impl.BarChartImpl#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarChartImpl extends DiagramImpl implements BarChart {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXTitle() <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String XTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXTitle() <em>XTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTitle()
	 * @generated
	 * @ordered
	 */
	protected String xTitle = XTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYTitle() <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String YTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYTitle() <em>YTitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTitle()
	 * @generated
	 * @ordered
	 */
	protected String yTitle = YTITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected EList<Bar> bars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.BAR_CHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.BAR_CHART__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.BAR_CHART__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXTitle() {
		return xTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTitle(String newXTitle) {
		String oldXTitle = xTitle;
		xTitle = newXTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.BAR_CHART__XTITLE, oldXTitle, xTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYTitle() {
		return yTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYTitle(String newYTitle) {
		String oldYTitle = yTitle;
		yTitle = newYTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.BAR_CHART__YTITLE, oldYTitle, yTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bar> getBars() {
		if (bars == null) {
			bars = new EObjectContainmentEList<Bar>(Bar.class, this, VmlPackage.BAR_CHART__BARS);
		}
		return bars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmlPackage.BAR_CHART__BARS:
				return ((InternalEList<?>)getBars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlPackage.BAR_CHART__ID:
				return getID();
			case VmlPackage.BAR_CHART__TITLE:
				return getTitle();
			case VmlPackage.BAR_CHART__XTITLE:
				return getXTitle();
			case VmlPackage.BAR_CHART__YTITLE:
				return getYTitle();
			case VmlPackage.BAR_CHART__BARS:
				return getBars();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmlPackage.BAR_CHART__ID:
				setID((Integer)newValue);
				return;
			case VmlPackage.BAR_CHART__TITLE:
				setTitle((String)newValue);
				return;
			case VmlPackage.BAR_CHART__XTITLE:
				setXTitle((String)newValue);
				return;
			case VmlPackage.BAR_CHART__YTITLE:
				setYTitle((String)newValue);
				return;
			case VmlPackage.BAR_CHART__BARS:
				getBars().clear();
				getBars().addAll((Collection<? extends Bar>)newValue);
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
			case VmlPackage.BAR_CHART__ID:
				setID(ID_EDEFAULT);
				return;
			case VmlPackage.BAR_CHART__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case VmlPackage.BAR_CHART__XTITLE:
				setXTitle(XTITLE_EDEFAULT);
				return;
			case VmlPackage.BAR_CHART__YTITLE:
				setYTitle(YTITLE_EDEFAULT);
				return;
			case VmlPackage.BAR_CHART__BARS:
				getBars().clear();
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
			case VmlPackage.BAR_CHART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VmlPackage.BAR_CHART__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case VmlPackage.BAR_CHART__XTITLE:
				return XTITLE_EDEFAULT == null ? xTitle != null : !XTITLE_EDEFAULT.equals(xTitle);
			case VmlPackage.BAR_CHART__YTITLE:
				return YTITLE_EDEFAULT == null ? yTitle != null : !YTITLE_EDEFAULT.equals(yTitle);
			case VmlPackage.BAR_CHART__BARS:
				return bars != null && !bars.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", xTitle: ");
		result.append(xTitle);
		result.append(", yTitle: ");
		result.append(yTitle);
		result.append(')');
		return result.toString();
	}

} //BarChartImpl
