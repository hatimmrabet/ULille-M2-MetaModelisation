/**
 */
package simplejava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplejava.JPackage#getContienent <em>Contienent</em>}</li>
 *   <li>{@link simplejava.JPackage#getContient <em>Contient</em>}</li>
 *   <li>{@link simplejava.JPackage#getClasses <em>Classes</em>}</li>
 *   <li>{@link simplejava.JPackage#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see simplejava.SimplejavaPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Contienent</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JPackage}.
	 * It is bidirectional and its opposite is '{@link simplejava.JPackage#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contienent</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJPackage_Contienent()
	 * @see simplejava.JPackage#getContient
	 * @model opposite="contient"
	 * @generated
	 */
	EList<JPackage> getContienent();

	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JPackage#getContienent <em>Contienent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference.
	 * @see #setContient(JPackage)
	 * @see simplejava.SimplejavaPackage#getJPackage_Contient()
	 * @see simplejava.JPackage#getContienent
	 * @model opposite="contienent"
	 * @generated
	 */
	JPackage getContient();

	/**
	 * Sets the value of the '{@link simplejava.JPackage#getContient <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(JPackage value);

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

} // JPackage
