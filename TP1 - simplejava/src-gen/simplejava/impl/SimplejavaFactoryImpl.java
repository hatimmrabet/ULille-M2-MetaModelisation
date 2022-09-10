/**
 */
package simplejava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplejava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplejavaFactoryImpl extends EFactoryImpl implements SimplejavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplejavaFactory init() {
		try {
			SimplejavaFactory theSimplejavaFactory = (SimplejavaFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplejavaPackage.eNS_URI);
			if (theSimplejavaFactory != null) {
				return theSimplejavaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplejavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplejavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SimplejavaPackage.JPACKAGE:
			return createJPackage();
		case SimplejavaPackage.JCLASS:
			return createJClass();
		case SimplejavaPackage.JINTERFACE:
			return createJInterface();
		case SimplejavaPackage.JTYPE:
			return createJType();
		case SimplejavaPackage.JATTRIBUT:
			return createJAttribut();
		case SimplejavaPackage.JPARAMETRE:
			return createJParametre();
		case SimplejavaPackage.JVARIABLE:
			return createJVariable();
		case SimplejavaPackage.JNAMED_ELEMENT:
			return createJNamedElement();
		case SimplejavaPackage.JMETHODE:
			return createJMethode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage createJPackage() {
		JPackageImpl jPackage = new JPackageImpl();
		return jPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass createJClass() {
		JClassImpl jClass = new JClassImpl();
		return jClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInterface createJInterface() {
		JInterfaceImpl jInterface = new JInterfaceImpl();
		return jInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JType createJType() {
		JTypeImpl jType = new JTypeImpl();
		return jType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAttribut createJAttribut() {
		JAttributImpl jAttribut = new JAttributImpl();
		return jAttribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JParametre createJParametre() {
		JParametreImpl jParametre = new JParametreImpl();
		return jParametre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JVariable createJVariable() {
		JVariableImpl jVariable = new JVariableImpl();
		return jVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNamedElement createJNamedElement() {
		JNamedElementImpl jNamedElement = new JNamedElementImpl();
		return jNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMethode createJMethode() {
		JMethodeImpl jMethode = new JMethodeImpl();
		return jMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplejavaPackage getSimplejavaPackage() {
		return (SimplejavaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplejavaPackage getPackage() {
		return SimplejavaPackage.eINSTANCE;
	}

} //SimplejavaFactoryImpl
