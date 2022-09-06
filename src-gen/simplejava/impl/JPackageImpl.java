/**
 */
package simplejava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link simplejava.impl.JPackageImpl#getContienent <em>Contienent</em>}</li>
 *   <li>{@link simplejava.impl.JPackageImpl#getContient <em>Contient</em>}</li>
 *   <li>{@link simplejava.impl.JPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link simplejava.impl.JPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends MinimalEObjectImpl.Container implements JPackage {
	/**
	 * The cached value of the '{@link #getContienent() <em>Contienent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContienent()
	 * @generated
	 * @ordered
	 */
	protected EList<JPackage> contienent;

	/**
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected JPackage contient;

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
	public EList<JPackage> getContienent() {
		if (contienent == null) {
			contienent = new EObjectWithInverseResolvingEList<JPackage>(JPackage.class, this,
					SimplejavaPackage.JPACKAGE__CONTIENENT, SimplejavaPackage.JPACKAGE__CONTIENT);
		}
		return contienent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getContient() {
		if (contient != null && contient.eIsProxy()) {
			InternalEObject oldContient = (InternalEObject) contient;
			contient = (JPackage) eResolveProxy(oldContient);
			if (contient != oldContient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplejavaPackage.JPACKAGE__CONTIENT,
							oldContient, contient));
			}
		}
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage basicGetContient() {
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContient(JPackage newContient, NotificationChain msgs) {
		JPackage oldContient = contient;
		contient = newContient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplejavaPackage.JPACKAGE__CONTIENT, oldContient, newContient);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContient(JPackage newContient) {
		if (newContient != contient) {
			NotificationChain msgs = null;
			if (contient != null)
				msgs = ((InternalEObject) contient).eInverseRemove(this, SimplejavaPackage.JPACKAGE__CONTIENENT,
						JPackage.class, msgs);
			if (newContient != null)
				msgs = ((InternalEObject) newContient).eInverseAdd(this, SimplejavaPackage.JPACKAGE__CONTIENENT,
						JPackage.class, msgs);
			msgs = basicSetContient(newContient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JPACKAGE__CONTIENT, newContient,
					newContient));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContienent()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			if (contient != null)
				msgs = ((InternalEObject) contient).eInverseRemove(this, SimplejavaPackage.JPACKAGE__CONTIENENT,
						JPackage.class, msgs);
			return basicSetContient((JPackage) otherEnd, msgs);
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
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			return ((InternalEList<?>) getContienent()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			return basicSetContient(null, msgs);
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
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
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			return getContienent();
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			if (resolve)
				return getContient();
			return basicGetContient();
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return getClasses();
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return getInterfaces();
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
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			getContienent().clear();
			getContienent().addAll((Collection<? extends JPackage>) newValue);
			return;
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			setContient((JPackage) newValue);
			return;
		case SimplejavaPackage.JPACKAGE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends JClass>) newValue);
			return;
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends JInterface>) newValue);
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
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			getContienent().clear();
			return;
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			setContient((JPackage) null);
			return;
		case SimplejavaPackage.JPACKAGE__CLASSES:
			getClasses().clear();
			return;
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			getInterfaces().clear();
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
		case SimplejavaPackage.JPACKAGE__CONTIENENT:
			return contienent != null && !contienent.isEmpty();
		case SimplejavaPackage.JPACKAGE__CONTIENT:
			return contient != null;
		case SimplejavaPackage.JPACKAGE__CLASSES:
			return classes != null && !classes.isEmpty();
		case SimplejavaPackage.JPACKAGE__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JPackageImpl
