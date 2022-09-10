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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simplejava.JAttribut;
import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JMethode;
import simplejava.JPackage;
import simplejava.SimplejavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplejava.impl.JClassImpl#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link simplejava.impl.JClassImpl#getFilles <em>Filles</em>}</li>
 *   <li>{@link simplejava.impl.JClassImpl#getMere <em>Mere</em>}</li>
 *   <li>{@link simplejava.impl.JClassImpl#getJpackage <em>Jpackage</em>}</li>
 *   <li>{@link simplejava.impl.JClassImpl#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link simplejava.impl.JClassImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends JTypeImpl implements JClass {
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
	 * The cached value of the '{@link #getFilles() <em>Filles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilles()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> filles;

	/**
	 * The cached value of the '{@link #getMere() <em>Mere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMere()
	 * @generated
	 * @ordered
	 */
	protected JClass mere;

	/**
	 * The cached value of the '{@link #getAttributs() <em>Attributs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributs()
	 * @generated
	 * @ordered
	 */
	protected EList<JAttribut> attributs;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
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
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplejavaPackage.Literals.JCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethode> getMethodes() {
		if (methodes == null) {
			methodes = new EObjectContainmentWithInverseEList<JMethode>(JMethode.class, this,
					SimplejavaPackage.JCLASS__METHODES, SimplejavaPackage.JMETHODE__CLASSE);
		}
		return methodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getFilles() {
		if (filles == null) {
			filles = new EObjectWithInverseResolvingEList<JClass>(JClass.class, this, SimplejavaPackage.JCLASS__FILLES,
					SimplejavaPackage.JCLASS__MERE);
		}
		return filles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getMere() {
		if (mere != null && mere.eIsProxy()) {
			InternalEObject oldMere = (InternalEObject) mere;
			mere = (JClass) eResolveProxy(oldMere);
			if (mere != oldMere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplejavaPackage.JCLASS__MERE, oldMere,
							mere));
			}
		}
		return mere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetMere() {
		return mere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMere(JClass newMere, NotificationChain msgs) {
		JClass oldMere = mere;
		mere = newMere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplejavaPackage.JCLASS__MERE, oldMere, newMere);
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
	public void setMere(JClass newMere) {
		if (newMere != mere) {
			NotificationChain msgs = null;
			if (mere != null)
				msgs = ((InternalEObject) mere).eInverseRemove(this, SimplejavaPackage.JCLASS__FILLES, JClass.class,
						msgs);
			if (newMere != null)
				msgs = ((InternalEObject) newMere).eInverseAdd(this, SimplejavaPackage.JCLASS__FILLES, JClass.class,
						msgs);
			msgs = basicSetMere(newMere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JCLASS__MERE, newMere, newMere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getJpackage() {
		if (eContainerFeatureID() != SimplejavaPackage.JCLASS__JPACKAGE)
			return null;
		return (JPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJpackage(JPackage newJpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newJpackage, SimplejavaPackage.JCLASS__JPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJpackage(JPackage newJpackage) {
		if (newJpackage != eInternalContainer()
				|| (eContainerFeatureID() != SimplejavaPackage.JCLASS__JPACKAGE && newJpackage != null)) {
			if (EcoreUtil.isAncestor(this, newJpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJpackage != null)
				msgs = ((InternalEObject) newJpackage).eInverseAdd(this, SimplejavaPackage.JPACKAGE__CLASSES,
						JPackage.class, msgs);
			msgs = basicSetJpackage(newJpackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JCLASS__JPACKAGE, newJpackage,
					newJpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JAttribut> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectContainmentEList<JAttribut>(JAttribut.class, this,
					SimplejavaPackage.JCLASS__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectWithInverseResolvingEList.ManyInverse<JInterface>(JInterface.class, this,
					SimplejavaPackage.JCLASS__INTERFACES, SimplejavaPackage.JINTERFACE__CLASSES);
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
		case SimplejavaPackage.JCLASS__METHODES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethodes()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JCLASS__FILLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFilles()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JCLASS__MERE:
			if (mere != null)
				msgs = ((InternalEObject) mere).eInverseRemove(this, SimplejavaPackage.JCLASS__FILLES, JClass.class,
						msgs);
			return basicSetMere((JClass) otherEnd, msgs);
		case SimplejavaPackage.JCLASS__JPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetJpackage((JPackage) otherEnd, msgs);
		case SimplejavaPackage.JCLASS__INTERFACES:
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
		case SimplejavaPackage.JCLASS__METHODES:
			return ((InternalEList<?>) getMethodes()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JCLASS__FILLES:
			return ((InternalEList<?>) getFilles()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JCLASS__MERE:
			return basicSetMere(null, msgs);
		case SimplejavaPackage.JCLASS__JPACKAGE:
			return basicSetJpackage(null, msgs);
		case SimplejavaPackage.JCLASS__ATTRIBUTS:
			return ((InternalEList<?>) getAttributs()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JCLASS__INTERFACES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SimplejavaPackage.JCLASS__JPACKAGE:
			return eInternalContainer().eInverseRemove(this, SimplejavaPackage.JPACKAGE__CLASSES, JPackage.class, msgs);
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
		case SimplejavaPackage.JCLASS__METHODES:
			return getMethodes();
		case SimplejavaPackage.JCLASS__FILLES:
			return getFilles();
		case SimplejavaPackage.JCLASS__MERE:
			if (resolve)
				return getMere();
			return basicGetMere();
		case SimplejavaPackage.JCLASS__JPACKAGE:
			return getJpackage();
		case SimplejavaPackage.JCLASS__ATTRIBUTS:
			return getAttributs();
		case SimplejavaPackage.JCLASS__INTERFACES:
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
		case SimplejavaPackage.JCLASS__METHODES:
			getMethodes().clear();
			getMethodes().addAll((Collection<? extends JMethode>) newValue);
			return;
		case SimplejavaPackage.JCLASS__FILLES:
			getFilles().clear();
			getFilles().addAll((Collection<? extends JClass>) newValue);
			return;
		case SimplejavaPackage.JCLASS__MERE:
			setMere((JClass) newValue);
			return;
		case SimplejavaPackage.JCLASS__JPACKAGE:
			setJpackage((JPackage) newValue);
			return;
		case SimplejavaPackage.JCLASS__ATTRIBUTS:
			getAttributs().clear();
			getAttributs().addAll((Collection<? extends JAttribut>) newValue);
			return;
		case SimplejavaPackage.JCLASS__INTERFACES:
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
		case SimplejavaPackage.JCLASS__METHODES:
			getMethodes().clear();
			return;
		case SimplejavaPackage.JCLASS__FILLES:
			getFilles().clear();
			return;
		case SimplejavaPackage.JCLASS__MERE:
			setMere((JClass) null);
			return;
		case SimplejavaPackage.JCLASS__JPACKAGE:
			setJpackage((JPackage) null);
			return;
		case SimplejavaPackage.JCLASS__ATTRIBUTS:
			getAttributs().clear();
			return;
		case SimplejavaPackage.JCLASS__INTERFACES:
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
		case SimplejavaPackage.JCLASS__METHODES:
			return methodes != null && !methodes.isEmpty();
		case SimplejavaPackage.JCLASS__FILLES:
			return filles != null && !filles.isEmpty();
		case SimplejavaPackage.JCLASS__MERE:
			return mere != null;
		case SimplejavaPackage.JCLASS__JPACKAGE:
			return getJpackage() != null;
		case SimplejavaPackage.JCLASS__ATTRIBUTS:
			return attributs != null && !attributs.isEmpty();
		case SimplejavaPackage.JCLASS__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JClassImpl
