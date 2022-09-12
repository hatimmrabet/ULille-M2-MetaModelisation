/**
 */
package simplejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMethode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplejava.JMethode#getParametres <em>Parametres</em>}</li>
 *   <li>{@link simplejava.JMethode#getEstappelle <em>Estappelle</em>}</li>
 *   <li>{@link simplejava.JMethode#getAppelle <em>Appelle</em>}</li>
 *   <li>{@link simplejava.JMethode#getClasse <em>Classe</em>}</li>
 *   <li>{@link simplejava.JMethode#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see simplejava.SimplejavaPackage#getJMethode()
 * @model
 * @generated
 */
public interface JMethode extends JType {
	/**
	 * Returns the value of the '<em><b>Parametres</b></em>' containment reference list.
	 * The list contents are of type {@link simplejava.JParametre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres</em>' containment reference list.
	 * @see simplejava.SimplejavaPackage#getJMethode_Parametres()
	 * @model containment="true"
	 * @generated
	 */
	EList<JParametre> getParametres();

	/**
	 * Returns the value of the '<em><b>Estappelle</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JMethode}.
	 * It is bidirectional and its opposite is '{@link simplejava.JMethode#getAppelle <em>Appelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estappelle</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJMethode_Estappelle()
	 * @see simplejava.JMethode#getAppelle
	 * @model opposite="appelle"
	 * @generated
	 */
	EList<JMethode> getEstappelle();

	/**
	 * Returns the value of the '<em><b>Appelle</b></em>' reference list.
	 * The list contents are of type {@link simplejava.JMethode}.
	 * It is bidirectional and its opposite is '{@link simplejava.JMethode#getEstappelle <em>Estappelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appelle</em>' reference list.
	 * @see simplejava.SimplejavaPackage#getJMethode_Appelle()
	 * @see simplejava.JMethode#getEstappelle
	 * @model opposite="estappelle"
	 * @generated
	 */
	EList<JMethode> getAppelle();

	/**
	 * Returns the value of the '<em><b>Classe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JClass#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' container reference.
	 * @see #setClasse(JClass)
	 * @see simplejava.SimplejavaPackage#getJMethode_Classe()
	 * @see simplejava.JClass#getMethodes
	 * @model opposite="methodes" transient="false"
	 * @generated
	 */
	JClass getClasse();

	/**
	 * Sets the value of the '{@link simplejava.JMethode#getClasse <em>Classe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' container reference.
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(JClass value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplejava.JInterface#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(JInterface)
	 * @see simplejava.SimplejavaPackage#getJMethode_Interface()
	 * @see simplejava.JInterface#getMethodes
	 * @model opposite="methodes" transient="false"
	 * @generated
	 */
	JInterface getInterface();

	/**
	 * Sets the value of the '{@link simplejava.JMethode#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(JInterface value);

} // JMethode
