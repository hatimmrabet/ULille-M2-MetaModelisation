/**
 */
package simplejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplejava.JPackage#getClasses <em>Classes</em>}</li>
 *   <li>{@link simplejava.JPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link simplejava.JPackage#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see simplejava.SimplejavaPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JType {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JClass}.
	 * It is bidirectional and its opposite is '{@link simplejava.JClass#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJPackage_Classes()
	 * @see simplejava.JClass#getJpackage
	 * @model opposite="jpackage" containment="true"
	 * @generated
	 */
	EList<JClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JInterface}.
	 * It is bidirectional and its opposite is '{@link simplejava.JInterface#getJpackage <em>Jpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJPackage_Interfaces()
	 * @see simplejava.JInterface#getJpackage
	 * @model opposite="jpackage" containment="true"
	 * @generated
	 */
	EList<JInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJPackage_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<JPackage> getPackages();

} // JPackage
