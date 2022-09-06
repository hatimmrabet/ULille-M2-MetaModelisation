/**
 */
package simplejava.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simplejava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simplejava.SimplejavaPackage
 * @generated
 */
public class SimplejavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplejavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplejavaSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplejavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SimplejavaPackage.JPACKAGE: {
			JPackage jPackage = (JPackage) theEObject;
			T result = caseJPackage(jPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JCLASS: {
			JClass jClass = (JClass) theEObject;
			T result = caseJClass(jClass);
			if (result == null)
				result = caseJType(jClass);
			if (result == null)
				result = caseJNamedElement(jClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JINTERFACE: {
			JInterface jInterface = (JInterface) theEObject;
			T result = caseJInterface(jInterface);
			if (result == null)
				result = caseJType(jInterface);
			if (result == null)
				result = caseJNamedElement(jInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JTYPE: {
			JType jType = (JType) theEObject;
			T result = caseJType(jType);
			if (result == null)
				result = caseJNamedElement(jType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JATTRIBUT: {
			JAttribut jAttribut = (JAttribut) theEObject;
			T result = caseJAttribut(jAttribut);
			if (result == null)
				result = caseJVariable(jAttribut);
			if (result == null)
				result = caseJType(jAttribut);
			if (result == null)
				result = caseJNamedElement(jAttribut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JPARAMETRE: {
			JParametre jParametre = (JParametre) theEObject;
			T result = caseJParametre(jParametre);
			if (result == null)
				result = caseJVariable(jParametre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JVARIABLE: {
			JVariable jVariable = (JVariable) theEObject;
			T result = caseJVariable(jVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JNAMED_ELEMENT: {
			JNamedElement jNamedElement = (JNamedElement) theEObject;
			T result = caseJNamedElement(jNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplejavaPackage.JMETHODE: {
			JMethode jMethode = (JMethode) theEObject;
			T result = caseJMethode(jMethode);
			if (result == null)
				result = caseJType(jMethode);
			if (result == null)
				result = caseJNamedElement(jMethode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPackage(JPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJInterface(JInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJType(JType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAttribut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAttribut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAttribut(JAttribut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JParametre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JParametre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJParametre(JParametre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJVariable(JVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNamedElement(JNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMethode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMethode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMethode(JMethode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplejavaSwitch
