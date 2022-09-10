/**
 */
package simplejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplejava.JClass#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link simplejava.JClass#getFilles <em>Filles</em>}</li>
 *   <li>{@link simplejava.JClass#getMere <em>Mere</em>}</li>
 *   <li>{@link simplejava.JClass#getJpackage <em>Jpackage</em>}</li>
 *   <li>{@link simplejava.JClass#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link simplejava.JClass#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see simplejava.SimplejavaPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends JType {
	/**
	 * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JMethode}.
	 * It is bidirectional and its opposite is '{@link simplejava.JMethode#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodes</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJClass_Methodes()
	 * @see simplejava.JMethode#getClasse
	 * @model opposite="classe" containment="true"
	 * @generated
	 */
	EList<JMethode> getMethodes();

	/**
	 * Returns the value of the '<em><b>Filles</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JClass}.
	 * It is bidirectional and its opposite is '{@link simplejava.JClass#getMere <em>Mere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filles</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJClass_Filles()
	 * @see simplejava.JClass#getMere
	 * @model opposite="mere"
	 * @generated
	 */
	EList<JClass> getFilles();

	/**
	 * Returns the value of the '<em><b>Mere</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JClass#getFilles <em>Filles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mere</em>' reference.
	 * @see #setMere(JClass)
	 * @see simplejava.SimplejavaPackage#getJClass_Mere()
	 * @see simplejava.JClass#getFilles
	 * @model opposite="filles"
	 * @generated
	 */
	JClass getMere();

	/**
	 * Sets the value of the '{@link simplejava.JClass#getMere <em>Mere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mere</em>' reference.
	 * @see #getMere()
	 * @generated
	 */
	void setMere(JClass value);

	/**
	 * Returns the value of the '<em><b>Jpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpackage</em>' container reference.
	 * @see #setJpackage(JPackage)
	 * @see simplejava.SimplejavaPackage#getJClass_Jpackage()
	 * @see simplejava.JPackage#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	JPackage getJpackage();

	/**
	 * Sets the value of the '{@link simplejava.JClass#getJpackage <em>Jpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpackage</em>' container reference.
	 * @see #getJpackage()
	 * @generated
	 */
	void setJpackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JAttribut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributs</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJClass_Attributs()
	 * @model containment="true"
	 * @generated
	 */
	EList<JAttribut> getAttributs();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JInterface}.
	 * It is bidirectional and its opposite is '{@link simplejava.JInterface#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJClass_Interfaces()
	 * @see simplejava.JInterface#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	EList<JInterface> getInterfaces();

} // JClass
