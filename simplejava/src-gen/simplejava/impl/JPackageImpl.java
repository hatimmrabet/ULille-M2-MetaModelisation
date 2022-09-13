/**
 */
package simplejava.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JPackage;
import simplejava.SimplejavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplejava.impl.JPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link simplejava.impl.JPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link simplejava.impl.JPackageImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends JTypeImpl implements JPackage {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> classes;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<JInterface> interfaces;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<JPackage> packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplejavaPackage.Literals.JPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<JClass>(JClass.class, this,
					SimplejavaPackage.JPACKAGE__CLASSES, SimplejavaPackage.JCLASS__JPACKAGE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList<JInterface>(JInterface.class, this,
					SimplejavaPackage.JPACKAGE__INTERFACES, SimplejavaPackage.JINTERFACE__JPACKAGE);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<JPackage>(JPackage.class, this,
					SimplejavaPackage.JPACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClasses()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
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
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return getClasses();
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return getInterfaces();
		case SimplejavaPackage.JPACKAGE__PACKAGES:
			return getPackages();
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
		case SimplejavaPackage.JPACKAGE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends JClass>) newValue);
			return;
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends JInterface>) newValue);
			return;
		case SimplejavaPackage.JPACKAGE__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends JPackage>) newValue);
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
		case SimplejavaPackage.JPACKAGE__CLASSES:
			getClasses().clear();
			return;
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			getInterfaces().clear();
			return;
		case SimplejavaPackage.JPACKAGE__PACKAGES:
			getPackages().clear();
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
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return classes != null && !classes.isEmpty();
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case SimplejavaPackage.JPACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JPackageImpl
