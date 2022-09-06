/**
 */
package simplejava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simplejava.SimplejavaPackage
 * @generated
 */
public interface SimplejavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplejavaFactory eINSTANCE = simplejava.impl.SimplejavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPackage</em>'.
	 * @generated
	 */
	JPackage createJPackage();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JInterface</em>'.
	 * @generated
	 */
	JInterface createJInterface();

	/**
	 * Returns a new object of class '<em>JType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JType</em>'.
	 * @generated
	 */
	JType createJType();

	/**
	 * Returns a new object of class '<em>JAttribut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JAttribut</em>'.
	 * @generated
	 */
	JAttribut createJAttribut();

	/**
	 * Returns a new object of class '<em>JParametre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JParametre</em>'.
	 * @generated
	 */
	JParametre createJParametre();

	/**
	 * Returns a new object of class '<em>JVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JVariable</em>'.
	 * @generated
	 */
	JVariable createJVariable();

	/**
	 * Returns a new object of class '<em>JNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNamed Element</em>'.
	 * @generated
	 */
	JNamedElement createJNamedElement();

	/**
	 * Returns a new object of class '<em>JMethode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JMethode</em>'.
	 * @generated
	 */
	JMethode createJMethode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplejavaPackage getSimplejavaPackage();

} //SimplejavaFactory
