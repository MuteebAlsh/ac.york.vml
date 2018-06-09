/**
 */
package vml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import vml.Category;
import vml.StackBarChart;
import vml.StackBars;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Bar Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.StackBarChartImpl#getStackBar <em>Stack Bar</em>}</li>
 *   <li>{@link vml.impl.StackBarChartImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackBarChartImpl extends ChartImpl implements StackBarChart {
	/**
	 * The cached value of the '{@link #getStackBar() <em>Stack Bar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackBar()
	 * @generated
	 * @ordered
	 */
	protected EList<StackBars> stackBar;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackBarChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.STACK_BAR_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StackBars> getStackBar() {
		if (stackBar == null) {
			stackBar = new EObjectContainmentEList<StackBars>(StackBars.class, this, VmlPackage.STACK_BAR_CHART__STACK_BAR);
		}
		return stackBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, VmlPackage.STACK_BAR_CHART__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmlPackage.STACK_BAR_CHART__STACK_BAR:
				return ((InternalEList<?>)getStackBar()).basicRemove(otherEnd, msgs);
			case VmlPackage.STACK_BAR_CHART__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
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
			case VmlPackage.STACK_BAR_CHART__STACK_BAR:
				return getStackBar();
			case VmlPackage.STACK_BAR_CHART__CATEGORIES:
				return getCategories();
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
			case VmlPackage.STACK_BAR_CHART__STACK_BAR:
				getStackBar().clear();
				getStackBar().addAll((Collection<? extends StackBars>)newValue);
				return;
			case VmlPackage.STACK_BAR_CHART__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
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
			case VmlPackage.STACK_BAR_CHART__STACK_BAR:
				getStackBar().clear();
				return;
			case VmlPackage.STACK_BAR_CHART__CATEGORIES:
				getCategories().clear();
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
			case VmlPackage.STACK_BAR_CHART__STACK_BAR:
				return stackBar != null && !stackBar.isEmpty();
			case VmlPackage.STACK_BAR_CHART__CATEGORIES:
				return categories != null && !categories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StackBarChartImpl
