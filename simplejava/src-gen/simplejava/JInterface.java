/**
 */
package simplejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplejava.JInterface#getJpackage <em>Jpackage</em>}</li>
 *   <li>{@link simplejava.JInterface#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link simplejava.JInterface#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see simplejava.SimplejavaPackage#getJInterface()
 * @model
 * @generated
 */
public interface JInterface extends JType {
	/**
	 * Returns the value of the '<em><b>Jpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpackage</em>' container reference.
	 * @see #setJpackage(JPackage)
	 * @see simplejava.SimplejavaPackage#getJInterface_Jpackage()
	 * @see simplejava.JPackage#getInterfaces
	 * @model opposite="interfaces" required="true" transient="false"
	 * @generated
	 */
	JPackage getJpackage();

	/**
	 * Sets the value of the '{@link simplejava.JInterface#getJpackage <em>Jpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpackage</em>' container reference.
	 * @see #getJpackage()
	 * @generated
	 */
	void setJpackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JMethode}.
	 * It is bidirectional and its opposite is '{@link simplejava.JMethode#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodes</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJInterface_Methodes()
	 * @see simplejava.JMethode#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<JMethode> getMethodes();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JClass}.
	 * It is bidirectional and its opposite is '{@link simplejava.JClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJInterface_Classes()
	 * @see simplejava.JClass#getInterfaces
	 * @model opposite="interfaces"
	 * @generated
	 */
	EList<JClass> getClasses();

} // JInterface
