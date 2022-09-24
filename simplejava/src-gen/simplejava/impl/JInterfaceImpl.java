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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JMethode;
import simplejava.JPackage;
import simplejava.SimplejavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplejava.impl.JInterfaceImpl#getJpackage <em>Jpackage</em>}</li>
 *   <li>{@link simplejava.impl.JInterfaceImpl#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link simplejava.impl.JInterfaceImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JInterfaceImpl extends JTypeImpl implements JInterface {
	/**
	 * The cached value of the '{@link #getMethodes() <em>Methodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodes()
	 * @generated
	 * @ordered
	 */
	protected EList<JMethode> methodes;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplejavaPackage.Literals.JINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getJpackage() {
		if (eContainerFeatureID() != SimplejavaPackage.JINTERFACE__JPACKAGE)
			return null;
		return (JPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJpackage(JPackage newJpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newJpackage, SimplejavaPackage.JINTERFACE__JPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJpackage(JPackage newJpackage) {
		if (newJpackage != eInternalContainer()
				|| (eContainerFeatureID() != SimplejavaPackage.JINTERFACE__JPACKAGE && newJpackage != null)) {
			if (EcoreUtil.isAncestor(this, newJpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJpackage != null)
				msgs = ((InternalEObject) newJpackage).eInverseAdd(this, SimplejavaPackage.JPACKAGE__INTERFACES,
						JPackage.class, msgs);
			msgs = basicSetJpackage(newJpackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JINTERFACE__JPACKAGE, newJpackage,
					newJpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethode> getMethodes() {
		if (methodes == null) {
			methodes = new EObjectContainmentWithInverseEList<JMethode>(JMethode.class, this,
					SimplejavaPackage.JINTERFACE__METHODES, SimplejavaPackage.JMETHODE__INTERFACE);
		}
		return methodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getClasses() {
		if (classes == null) {
			classes = new EObjectWithInverseResolvingEList.ManyInverse<JClass>(JClass.class, this,
					SimplejavaPackage.JINTERFACE__CLASSES, SimplejavaPackage.JCLASS__INTERFACES);
		}
		return classes;
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
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetJpackage((JPackage) otherEnd, msgs);
		case SimplejavaPackage.JINTERFACE__METHODES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethodes()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JINTERFACE__CLASSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClasses()).basicAdd(otherEnd, msgs);
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
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			return basicSetJpackage(null, msgs);
		case SimplejavaPackage.JINTERFACE__METHODES:
			return ((InternalEList<?>) getMethodes()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JINTERFACE__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			return eInternalContainer().eInverseRemove(this, SimplejavaPackage.JPACKAGE__INTERFACES, JPackage.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			return getJpackage();
		case SimplejavaPackage.JINTERFACE__METHODES:
			return getMethodes();
		case SimplejavaPackage.JINTERFACE__CLASSES:
			return getClasses();
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
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			setJpackage((JPackage) newValue);
			return;
		case SimplejavaPackage.JINTERFACE__METHODES:
			getMethodes().clear();
			getMethodes().addAll((Collection<? extends JMethode>) newValue);
			return;
		case SimplejavaPackage.JINTERFACE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends JClass>) newValue);
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
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			setJpackage((JPackage) null);
			return;
		case SimplejavaPackage.JINTERFACE__METHODES:
			getMethodes().clear();
			return;
		case SimplejavaPackage.JINTERFACE__CLASSES:
			getClasses().clear();
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
		case SimplejavaPackage.JINTERFACE__JPACKAGE:
			return getJpackage() != null;
		case SimplejavaPackage.JINTERFACE__METHODES:
			return methodes != null && !methodes.isEmpty();
		case SimplejavaPackage.JINTERFACE__CLASSES:
			return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JInterfaceImpl
