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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JMethode;
import simplejava.JParametre;
import simplejava.SimplejavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMethode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplejava.impl.JMethodeImpl#getParametres <em>Parametres</em>}</li>
 *   <li>{@link simplejava.impl.JMethodeImpl#getEstappelle <em>Estappelle</em>}</li>
 *   <li>{@link simplejava.impl.JMethodeImpl#getAppelle <em>Appelle</em>}</li>
 *   <li>{@link simplejava.impl.JMethodeImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link simplejava.impl.JMethodeImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JMethodeImpl extends JTypeImpl implements JMethode {
	/**
	 * The cached value of the '{@link #getParametres() <em>Parametres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametres()
	 * @generated
	 * @ordered
	 */
	protected EList<JParametre> parametres;

	/**
	 * The cached value of the '{@link #getEstappelle() <em>Estappelle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstappelle()
	 * @generated
	 * @ordered
	 */
	protected EList<JMethode> estappelle;

	/**
	 * The cached value of the '{@link #getAppelle() <em>Appelle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppelle()
	 * @generated
	 * @ordered
	 */
	protected EList<JMethode> appelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JMethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplejavaPackage.Literals.JMETHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JParametre> getParametres() {
		if (parametres == null) {
			parametres = new EObjectContainmentEList<JParametre>(JParametre.class, this,
					SimplejavaPackage.JMETHODE__PARAMETRES);
		}
		return parametres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethode> getEstappelle() {
		if (estappelle == null) {
			estappelle = new EObjectWithInverseResolvingEList.ManyInverse<JMethode>(JMethode.class, this,
					SimplejavaPackage.JMETHODE__ESTAPPELLE, SimplejavaPackage.JMETHODE__APPELLE);
		}
		return estappelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JMethode> getAppelle() {
		if (appelle == null) {
			appelle = new EObjectWithInverseResolvingEList.ManyInverse<JMethode>(JMethode.class, this,
					SimplejavaPackage.JMETHODE__APPELLE, SimplejavaPackage.JMETHODE__ESTAPPELLE);
		}
		return appelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getClasse() {
		if (eContainerFeatureID() != SimplejavaPackage.JMETHODE__CLASSE)
			return null;
		return (JClass) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasse(JClass newClasse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newClasse, SimplejavaPackage.JMETHODE__CLASSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(JClass newClasse) {
		if (newClasse != eInternalContainer()
				|| (eContainerFeatureID() != SimplejavaPackage.JMETHODE__CLASSE && newClasse != null)) {
			if (EcoreUtil.isAncestor(this, newClasse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClasse != null)
				msgs = ((InternalEObject) newClasse).eInverseAdd(this, SimplejavaPackage.JCLASS__METHODES, JClass.class,
						msgs);
			msgs = basicSetClasse(newClasse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JMETHODE__CLASSE, newClasse,
					newClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInterface getInterface() {
		if (eContainerFeatureID() != SimplejavaPackage.JMETHODE__INTERFACE)
			return null;
		return (JInterface) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(JInterface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInterface, SimplejavaPackage.JMETHODE__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(JInterface newInterface) {
		if (newInterface != eInternalContainer()
				|| (eContainerFeatureID() != SimplejavaPackage.JMETHODE__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this, SimplejavaPackage.JINTERFACE__METHODES,
						JInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.JMETHODE__INTERFACE, newInterface,
					newInterface));
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
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEstappelle()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__APPELLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppelle()).basicAdd(otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__CLASSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetClasse((JClass) otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__INTERFACE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInterface((JInterface) otherEnd, msgs);
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
		case SimplejavaPackage.JMETHODE__PARAMETRES:
			return ((InternalEList<?>) getParametres()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			return ((InternalEList<?>) getEstappelle()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__APPELLE:
			return ((InternalEList<?>) getAppelle()).basicRemove(otherEnd, msgs);
		case SimplejavaPackage.JMETHODE__CLASSE:
			return basicSetClasse(null, msgs);
		case SimplejavaPackage.JMETHODE__INTERFACE:
			return basicSetInterface(null, msgs);
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
		case SimplejavaPackage.JMETHODE__CLASSE:
			return eInternalContainer().eInverseRemove(this, SimplejavaPackage.JCLASS__METHODES, JClass.class, msgs);
		case SimplejavaPackage.JMETHODE__INTERFACE:
			return eInternalContainer().eInverseRemove(this, SimplejavaPackage.JINTERFACE__METHODES, JInterface.class,
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
		case SimplejavaPackage.JMETHODE__PARAMETRES:
			return getParametres();
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			return getEstappelle();
		case SimplejavaPackage.JMETHODE__APPELLE:
			return getAppelle();
		case SimplejavaPackage.JMETHODE__CLASSE:
			return getClasse();
		case SimplejavaPackage.JMETHODE__INTERFACE:
			return getInterface();
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
		case SimplejavaPackage.JMETHODE__PARAMETRES:
			getParametres().clear();
			getParametres().addAll((Collection<? extends JParametre>) newValue);
			return;
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			getEstappelle().clear();
			getEstappelle().addAll((Collection<? extends JMethode>) newValue);
			return;
		case SimplejavaPackage.JMETHODE__APPELLE:
			getAppelle().clear();
			getAppelle().addAll((Collection<? extends JMethode>) newValue);
			return;
		case SimplejavaPackage.JMETHODE__CLASSE:
			setClasse((JClass) newValue);
			return;
		case SimplejavaPackage.JMETHODE__INTERFACE:
			setInterface((JInterface) newValue);
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
		case SimplejavaPackage.JMETHODE__PARAMETRES:
			getParametres().clear();
			return;
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			getEstappelle().clear();
			return;
		case SimplejavaPackage.JMETHODE__APPELLE:
			getAppelle().clear();
			return;
		case SimplejavaPackage.JMETHODE__CLASSE:
			setClasse((JClass) null);
			return;
		case SimplejavaPackage.JMETHODE__INTERFACE:
			setInterface((JInterface) null);
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
		case SimplejavaPackage.JMETHODE__PARAMETRES:
			return parametres != null && !parametres.isEmpty();
		case SimplejavaPackage.JMETHODE__ESTAPPELLE:
			return estappelle != null && !estappelle.isEmpty();
		case SimplejavaPackage.JMETHODE__APPELLE:
			return appelle != null && !appelle.isEmpty();
		case SimplejavaPackage.JMETHODE__CLASSE:
			return getClasse() != null;
		case SimplejavaPackage.JMETHODE__INTERFACE:
			return getInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //JMethodeImpl
