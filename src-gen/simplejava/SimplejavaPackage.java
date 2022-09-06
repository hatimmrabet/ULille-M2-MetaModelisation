/**
 */
package simplejava;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simplejava.SimplejavaFactory
 * @model kind="package"
 * @generated
 */
public interface SimplejavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplejava";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simplejava";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplejava";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplejavaPackage eINSTANCE = simplejava.impl.SimplejavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplejava.impl.JPackageImpl <em>JPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JPackageImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJPackage()
	 * @generated
	 */
	int JPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Contienent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__CONTIENENT = 0;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__CONTIENT = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__INTERFACES = 3;

	/**
	 * The number of structural features of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JNamedElementImpl <em>JNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JNamedElementImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJNamedElement()
	 * @generated
	 */
	int JNAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNAMED_ELEMENT__NOM = 0;

	/**
	 * The number of structural features of the '<em>JNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JTypeImpl <em>JType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JTypeImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJType()
	 * @generated
	 */
	int JTYPE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE__NOM = JNAMED_ELEMENT__NOM;

	/**
	 * The number of structural features of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_FEATURE_COUNT = JNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JTYPE_OPERATION_COUNT = JNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JClassImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NOM = JTYPE__NOM;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__METHODES = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__FILLES = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__MERE = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JPACKAGE = JTYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__ATTRIBUTS = JTYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__INTERFACES = JTYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JInterfaceImpl <em>JInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JInterfaceImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJInterface()
	 * @generated
	 */
	int JINTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__NOM = JTYPE__NOM;

	/**
	 * The feature id for the '<em><b>Mere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__MERE = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__FILLES = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__JPACKAGE = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__METHODES = JTYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE__CLASSES = JTYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>JInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JINTERFACE_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JVariableImpl <em>JVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JVariableImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJVariable()
	 * @generated
	 */
	int JVARIABLE = 6;

	/**
	 * The number of structural features of the '<em>JVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JAttributImpl <em>JAttribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JAttributImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJAttribut()
	 * @generated
	 */
	int JATTRIBUT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT__NOM = JVARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JAttribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT_FEATURE_COUNT = JVARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JAttribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUT_OPERATION_COUNT = JVARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JParametreImpl <em>JParametre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JParametreImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJParametre()
	 * @generated
	 */
	int JPARAMETRE = 5;

	/**
	 * The number of structural features of the '<em>JParametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE_FEATURE_COUNT = JVARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JParametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETRE_OPERATION_COUNT = JVARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplejava.impl.JMethodeImpl <em>JMethode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplejava.impl.JMethodeImpl
	 * @see simplejava.impl.SimplejavaPackageImpl#getJMethode()
	 * @generated
	 */
	int JMETHODE = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__NOM = JTYPE__NOM;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__PARAMETRES = JTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estappelle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__ESTAPPELLE = JTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appelle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__APPELLE = JTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__CLASSE = JTYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE__INTERFACE = JTYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JMethode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE_FEATURE_COUNT = JTYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>JMethode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHODE_OPERATION_COUNT = JTYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link simplejava.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPackage</em>'.
	 * @see simplejava.JPackage
	 * @generated
	 */
	EClass getJPackage();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JPackage#getContienent <em>Contienent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contienent</em>'.
	 * @see simplejava.JPackage#getContienent()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Contienent();

	/**
	 * Returns the meta object for the reference '{@link simplejava.JPackage#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contient</em>'.
	 * @see simplejava.JPackage#getContient()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Contient();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see simplejava.JPackage#getClasses()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see simplejava.JPackage#getInterfaces()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Interfaces();

	/**
	 * Returns the meta object for class '{@link simplejava.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see simplejava.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JClass#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see simplejava.JClass#getMethodes()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Methodes();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JClass#getFilles <em>Filles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filles</em>'.
	 * @see simplejava.JClass#getFilles()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Filles();

	/**
	 * Returns the meta object for the reference '{@link simplejava.JClass#getMere <em>Mere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mere</em>'.
	 * @see simplejava.JClass#getMere()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Mere();

	/**
	 * Returns the meta object for the container reference '{@link simplejava.JClass#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jpackage</em>'.
	 * @see simplejava.JClass#getJpackage()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Jpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JClass#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributs</em>'.
	 * @see simplejava.JClass#getAttributs()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Attributs();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see simplejava.JClass#getInterfaces()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Interfaces();

	/**
	 * Returns the meta object for class '{@link simplejava.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JInterface</em>'.
	 * @see simplejava.JInterface
	 * @generated
	 */
	EClass getJInterface();

	/**
	 * Returns the meta object for the reference '{@link simplejava.JInterface#getMere <em>Mere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mere</em>'.
	 * @see simplejava.JInterface#getMere()
	 * @see #getJInterface()
	 * @generated
	 */
	EReference getJInterface_Mere();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JInterface#getFilles <em>Filles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filles</em>'.
	 * @see simplejava.JInterface#getFilles()
	 * @see #getJInterface()
	 * @generated
	 */
	EReference getJInterface_Filles();

	/**
	 * Returns the meta object for the container reference '{@link simplejava.JInterface#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Jpackage</em>'.
	 * @see simplejava.JInterface#getJpackage()
	 * @see #getJInterface()
	 * @generated
	 */
	EReference getJInterface_Jpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JInterface#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see simplejava.JInterface#getMethodes()
	 * @see #getJInterface()
	 * @generated
	 */
	EReference getJInterface_Methodes();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JInterface#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see simplejava.JInterface#getClasses()
	 * @see #getJInterface()
	 * @generated
	 */
	EReference getJInterface_Classes();

	/**
	 * Returns the meta object for class '{@link simplejava.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JType</em>'.
	 * @see simplejava.JType
	 * @generated
	 */
	EClass getJType();

	/**
	 * Returns the meta object for class '{@link simplejava.JAttribut <em>JAttribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAttribut</em>'.
	 * @see simplejava.JAttribut
	 * @generated
	 */
	EClass getJAttribut();

	/**
	 * Returns the meta object for class '{@link simplejava.JParametre <em>JParametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParametre</em>'.
	 * @see simplejava.JParametre
	 * @generated
	 */
	EClass getJParametre();

	/**
	 * Returns the meta object for class '{@link simplejava.JVariable <em>JVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JVariable</em>'.
	 * @see simplejava.JVariable
	 * @generated
	 */
	EClass getJVariable();

	/**
	 * Returns the meta object for class '{@link simplejava.JNamedElement <em>JNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JNamed Element</em>'.
	 * @see simplejava.JNamedElement
	 * @generated
	 */
	EClass getJNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link simplejava.JNamedElement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see simplejava.JNamedElement#getNom()
	 * @see #getJNamedElement()
	 * @generated
	 */
	EAttribute getJNamedElement_Nom();

	/**
	 * Returns the meta object for class '{@link simplejava.JMethode <em>JMethode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethode</em>'.
	 * @see simplejava.JMethode
	 * @generated
	 */
	EClass getJMethode();

	/**
	 * Returns the meta object for the containment reference list '{@link simplejava.JMethode#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametres</em>'.
	 * @see simplejava.JMethode#getParametres()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Parametres();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JMethode#getEstappelle <em>Estappelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Estappelle</em>'.
	 * @see simplejava.JMethode#getEstappelle()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Estappelle();

	/**
	 * Returns the meta object for the reference list '{@link simplejava.JMethode#getAppelle <em>Appelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appelle</em>'.
	 * @see simplejava.JMethode#getAppelle()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Appelle();

	/**
	 * Returns the meta object for the container reference '{@link simplejava.JMethode#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Classe</em>'.
	 * @see simplejava.JMethode#getClasse()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Classe();

	/**
	 * Returns the meta object for the container reference '{@link simplejava.JMethode#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see simplejava.JMethode#getInterface()
	 * @see #getJMethode()
	 * @generated
	 */
	EReference getJMethode_Interface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplejavaFactory getSimplejavaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simplejava.impl.JPackageImpl <em>JPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JPackageImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJPackage()
		 * @generated
		 */
		EClass JPACKAGE = eINSTANCE.getJPackage();

		/**
		 * The meta object literal for the '<em><b>Contienent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__CONTIENENT = eINSTANCE.getJPackage_Contienent();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__CONTIENT = eINSTANCE.getJPackage_Contient();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__CLASSES = eINSTANCE.getJPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__INTERFACES = eINSTANCE.getJPackage_Interfaces();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JClassImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__METHODES = eINSTANCE.getJClass_Methodes();

		/**
		 * The meta object literal for the '<em><b>Filles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__FILLES = eINSTANCE.getJClass_Filles();

		/**
		 * The meta object literal for the '<em><b>Mere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__MERE = eINSTANCE.getJClass_Mere();

		/**
		 * The meta object literal for the '<em><b>Jpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JPACKAGE = eINSTANCE.getJClass_Jpackage();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__ATTRIBUTS = eINSTANCE.getJClass_Attributs();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__INTERFACES = eINSTANCE.getJClass_Interfaces();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JInterfaceImpl <em>JInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JInterfaceImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJInterface()
		 * @generated
		 */
		EClass JINTERFACE = eINSTANCE.getJInterface();

		/**
		 * The meta object literal for the '<em><b>Mere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINTERFACE__MERE = eINSTANCE.getJInterface_Mere();

		/**
		 * The meta object literal for the '<em><b>Filles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINTERFACE__FILLES = eINSTANCE.getJInterface_Filles();

		/**
		 * The meta object literal for the '<em><b>Jpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINTERFACE__JPACKAGE = eINSTANCE.getJInterface_Jpackage();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINTERFACE__METHODES = eINSTANCE.getJInterface_Methodes();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JINTERFACE__CLASSES = eINSTANCE.getJInterface_Classes();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JTypeImpl <em>JType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JTypeImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJType()
		 * @generated
		 */
		EClass JTYPE = eINSTANCE.getJType();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JAttributImpl <em>JAttribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JAttributImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJAttribut()
		 * @generated
		 */
		EClass JATTRIBUT = eINSTANCE.getJAttribut();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JParametreImpl <em>JParametre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JParametreImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJParametre()
		 * @generated
		 */
		EClass JPARAMETRE = eINSTANCE.getJParametre();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JVariableImpl <em>JVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JVariableImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJVariable()
		 * @generated
		 */
		EClass JVARIABLE = eINSTANCE.getJVariable();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JNamedElementImpl <em>JNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JNamedElementImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJNamedElement()
		 * @generated
		 */
		EClass JNAMED_ELEMENT = eINSTANCE.getJNamedElement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNAMED_ELEMENT__NOM = eINSTANCE.getJNamedElement_Nom();

		/**
		 * The meta object literal for the '{@link simplejava.impl.JMethodeImpl <em>JMethode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplejava.impl.JMethodeImpl
		 * @see simplejava.impl.SimplejavaPackageImpl#getJMethode()
		 * @generated
		 */
		EClass JMETHODE = eINSTANCE.getJMethode();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__PARAMETRES = eINSTANCE.getJMethode_Parametres();

		/**
		 * The meta object literal for the '<em><b>Estappelle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__ESTAPPELLE = eINSTANCE.getJMethode_Estappelle();

		/**
		 * The meta object literal for the '<em><b>Appelle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__APPELLE = eINSTANCE.getJMethode_Appelle();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__CLASSE = eINSTANCE.getJMethode_Classe();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHODE__INTERFACE = eINSTANCE.getJMethode_Interface();

	}

} //SimplejavaPackage
