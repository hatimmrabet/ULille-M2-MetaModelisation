/**
 */
package simplejava.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplejava.JAttribut;
import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JMethode;
import simplejava.JNamedElement;
import simplejava.JPackage;
import simplejava.JParametre;
import simplejava.JType;
import simplejava.JVariable;
import simplejava.SimplejavaFactory;
import simplejava.SimplejavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplejavaPackageImpl extends EPackageImpl implements SimplejavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAttributEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jParametreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplejava.SimplejavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplejavaPackageImpl() {
		super(eNS_URI, SimplejavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimplejavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplejavaPackage init() {
		if (isInited)
			return (SimplejavaPackage) EPackage.Registry.INSTANCE.getEPackage(SimplejavaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimplejavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimplejavaPackageImpl theSimplejavaPackage = registeredSimplejavaPackage instanceof SimplejavaPackageImpl
				? (SimplejavaPackageImpl) registeredSimplejavaPackage
				: new SimplejavaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSimplejavaPackage.createPackageContents();

		// Initialize created meta-data
		theSimplejavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplejavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplejavaPackage.eNS_URI, theSimplejavaPackage);
		return theSimplejavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPackage() {
		return jPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Contienent() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Contient() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Classes() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Interfaces() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Methodes() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Filles() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Mere() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Jpackage() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Attributs() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Interfaces() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJInterface() {
		return jInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInterface_Mere() {
		return (EReference) jInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInterface_Filles() {
		return (EReference) jInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInterface_Jpackage() {
		return (EReference) jInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInterface_Methodes() {
		return (EReference) jInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJInterface_Classes() {
		return (EReference) jInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJType() {
		return jTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAttribut() {
		return jAttributEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJParametre() {
		return jParametreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJVariable() {
		return jVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNamedElement() {
		return jNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNamedElement_Nom() {
		return (EAttribute) jNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethode() {
		return jMethodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Parametres() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Estappelle() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Appelle() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Classe() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethode_Interface() {
		return (EReference) jMethodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplejavaFactory getSimplejavaFactory() {
		return (SimplejavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jPackageEClass = createEClass(JPACKAGE);
		createEReference(jPackageEClass, JPACKAGE__CONTIENENT);
		createEReference(jPackageEClass, JPACKAGE__CONTIENT);
		createEReference(jPackageEClass, JPACKAGE__CLASSES);
		createEReference(jPackageEClass, JPACKAGE__INTERFACES);

		jClassEClass = createEClass(JCLASS);
		createEReference(jClassEClass, JCLASS__METHODES);
		createEReference(jClassEClass, JCLASS__FILLES);
		createEReference(jClassEClass, JCLASS__MERE);
		createEReference(jClassEClass, JCLASS__JPACKAGE);
		createEReference(jClassEClass, JCLASS__ATTRIBUTS);
		createEReference(jClassEClass, JCLASS__INTERFACES);

		jInterfaceEClass = createEClass(JINTERFACE);
		createEReference(jInterfaceEClass, JINTERFACE__MERE);
		createEReference(jInterfaceEClass, JINTERFACE__FILLES);
		createEReference(jInterfaceEClass, JINTERFACE__JPACKAGE);
		createEReference(jInterfaceEClass, JINTERFACE__METHODES);
		createEReference(jInterfaceEClass, JINTERFACE__CLASSES);

		jTypeEClass = createEClass(JTYPE);

		jAttributEClass = createEClass(JATTRIBUT);

		jParametreEClass = createEClass(JPARAMETRE);

		jVariableEClass = createEClass(JVARIABLE);

		jNamedElementEClass = createEClass(JNAMED_ELEMENT);
		createEAttribute(jNamedElementEClass, JNAMED_ELEMENT__NOM);

		jMethodeEClass = createEClass(JMETHODE);
		createEReference(jMethodeEClass, JMETHODE__PARAMETRES);
		createEReference(jMethodeEClass, JMETHODE__ESTAPPELLE);
		createEReference(jMethodeEClass, JMETHODE__APPELLE);
		createEReference(jMethodeEClass, JMETHODE__CLASSE);
		createEReference(jMethodeEClass, JMETHODE__INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jClassEClass.getESuperTypes().add(this.getJType());
		jInterfaceEClass.getESuperTypes().add(this.getJType());
		jTypeEClass.getESuperTypes().add(this.getJNamedElement());
		jAttributEClass.getESuperTypes().add(this.getJVariable());
		jAttributEClass.getESuperTypes().add(this.getJType());
		jParametreEClass.getESuperTypes().add(this.getJVariable());
		jMethodeEClass.getESuperTypes().add(this.getJType());

		// Initialize classes, features, and operations; add parameters
		initEClass(jPackageEClass, JPackage.class, "JPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPackage_Contienent(), this.getJPackage(), this.getJPackage_Contient(), "contienent", null, 0,
				-1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Contient(), this.getJPackage(), this.getJPackage_Contienent(), "contient", null, 0,
				1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Classes(), this.getJClass(), this.getJClass_Jpackage(), "classes", null, 0, -1,
				JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJPackage_Interfaces(), this.getJInterface(), this.getJInterface_Jpackage(), "interfaces",
				null, 0, -1, JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJClass_Methodes(), this.getJMethode(), this.getJMethode_Classe(), "methodes", null, 0, -1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Filles(), this.getJClass(), this.getJClass_Mere(), "filles", null, 0, -1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Mere(), this.getJClass(), this.getJClass_Filles(), "mere", null, 0, 1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Jpackage(), this.getJPackage(), this.getJPackage_Classes(), "jpackage", null, 1, 1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Attributs(), this.getJAttribut(), null, "attributs", null, 0, -1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Interfaces(), this.getJInterface(), this.getJInterface_Classes(), "interfaces", null,
				0, -1, JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jInterfaceEClass, JInterface.class, "JInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJInterface_Mere(), this.getJInterface(), this.getJInterface_Filles(), "mere", null, 0, 1,
				JInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJInterface_Filles(), this.getJInterface(), this.getJInterface_Mere(), "filles", null, 0, -1,
				JInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJInterface_Jpackage(), this.getJPackage(), this.getJPackage_Interfaces(), "jpackage", null, 1,
				1, JInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJInterface_Methodes(), this.getJMethode(), this.getJMethode_Interface(), "methodes", null, 0,
				-1, JInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJInterface_Classes(), this.getJClass(), this.getJClass_Interfaces(), "classes", null, 0, -1,
				JInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jTypeEClass, JType.class, "JType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jAttributEClass, JAttribut.class, "JAttribut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jParametreEClass, JParametre.class, "JParametre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jVariableEClass, JVariable.class, "JVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(jNamedElementEClass, JNamedElement.class, "JNamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNamedElement_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, JNamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jMethodeEClass, JMethode.class, "JMethode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJMethode_Parametres(), this.getJParametre(), null, "parametres", null, 0, -1, JMethode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Estappelle(), this.getJMethode(), this.getJMethode_Appelle(), "estappelle", null, 0,
				-1, JMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Appelle(), this.getJMethode(), this.getJMethode_Estappelle(), "appelle", null, 0, -1,
				JMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Classe(), this.getJClass(), this.getJClass_Methodes(), "classe", null, 0, 1,
				JMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJMethode_Interface(), this.getJInterface(), this.getJInterface_Methodes(), "interface", null,
				0, 1, JMethode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplejavaPackageImpl
