/**
 */
package vml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import vml.Diagram;
import vml.DiagramElement;
import vml.Table;
import vml.VmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vml.impl.DiagramElementImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link vml.impl.DiagramElementImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement {
	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagrams;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagrams() {
		if (diagrams != null && diagrams.eIsProxy()) {
			InternalEObject oldDiagrams = (InternalEObject)diagrams;
			diagrams = (Diagram)eResolveProxy(oldDiagrams);
			if (diagrams != oldDiagrams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS, oldDiagrams, diagrams));
			}
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagrams() {
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagrams(Diagram newDiagrams) {
		Diagram oldDiagrams = diagrams;
		diagrams = newDiagrams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS, oldDiagrams, diagrams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmlPackage.DIAGRAM_ELEMENT__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlPackage.DIAGRAM_ELEMENT__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS:
				if (resolve) return getDiagrams();
				return basicGetDiagrams();
			case VmlPackage.DIAGRAM_ELEMENT__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
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
			case VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS:
				setDiagrams((Diagram)newValue);
				return;
			case VmlPackage.DIAGRAM_ELEMENT__TABLE:
				setTable((Table)newValue);
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
			case VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS:
				setDiagrams((Diagram)null);
				return;
			case VmlPackage.DIAGRAM_ELEMENT__TABLE:
				setTable((Table)null);
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
			case VmlPackage.DIAGRAM_ELEMENT__DIAGRAMS:
				return diagrams != null;
			case VmlPackage.DIAGRAM_ELEMENT__TABLE:
				return table != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementImpl
