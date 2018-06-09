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
import vml.Category;
import vml.ChartElement;
import vml.StackBars;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Bars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.StackBarsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link vml.impl.StackBarsImpl#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackBarsImpl extends ChartElementImpl implements StackBars {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The cached value of the '{@link #getBars() <em>Bars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBars()
	 * @generated
	 * @ordered
	 */
	protected EList<ChartElement> bars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBarsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.STACK_BARS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.STACK_BARS__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.STACK_BARS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChartElement> getBars() {
		if (bars == null) {
			bars = new EObjectContainmentEList<ChartElement>(ChartElement.class, this, VmlPackage.STACK_BARS__BARS);
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
			case VmlPackage.STACK_BARS__BARS:
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
			case VmlPackage.STACK_BARS__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case VmlPackage.STACK_BARS__BARS:
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
			case VmlPackage.STACK_BARS__CATEGORY:
				setCategory((Category)newValue);
				return;
			case VmlPackage.STACK_BARS__BARS:
				getBars().clear();
				getBars().addAll((Collection<? extends ChartElement>)newValue);
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
			case VmlPackage.STACK_BARS__CATEGORY:
				setCategory((Category)null);
				return;
			case VmlPackage.STACK_BARS__BARS:
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
			case VmlPackage.STACK_BARS__CATEGORY:
				return category != null;
			case VmlPackage.STACK_BARS__BARS:
				return bars != null && !bars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StackBarsImpl
