/**
 */
package simplejava.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simplejava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simplejava.SimplejavaPackage
 * @generated
 */
public class SimplejavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplejavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplejavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplejavaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplejavaSwitch<Adapter> modelSwitch = new SimplejavaSwitch<Adapter>() {
		@Override
		public Adapter caseJPackage(JPackage object) {
			return createJPackageAdapter();
		}

		@Override
		public Adapter caseJClass(JClass object) {
			return createJClassAdapter();
		}

		@Override
		public Adapter caseJInterface(JInterface object) {
			return createJInterfaceAdapter();
		}

		@Override
		public Adapter caseJType(JType object) {
			return createJTypeAdapter();
		}

		@Override
		public Adapter caseJAttribut(JAttribut object) {
			return createJAttributAdapter();
		}

		@Override
		public Adapter caseJParametre(JParametre object) {
			return createJParametreAdapter();
		}

		@Override
		public Adapter caseJVariable(JVariable object) {
			return createJVariableAdapter();
		}

		@Override
		public Adapter caseJNamedElement(JNamedElement object) {
			return createJNamedElementAdapter();
		}

		@Override
		public Adapter caseJMethode(JMethode object) {
			return createJMethodeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JPackage
	 * @generated
	 */
	public Adapter createJPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JInterface <em>JInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JInterface
	 * @generated
	 */
	public Adapter createJInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JType <em>JType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JType
	 * @generated
	 */
	public Adapter createJTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JAttribut <em>JAttribut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JAttribut
	 * @generated
	 */
	public Adapter createJAttributAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JParametre <em>JParametre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JParametre
	 * @generated
	 */
	public Adapter createJParametreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JVariable <em>JVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JVariable
	 * @generated
	 */
	public Adapter createJVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JNamedElement <em>JNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JNamedElement
	 * @generated
	 */
	public Adapter createJNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simplejava.JMethode <em>JMethode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simplejava.JMethode
	 * @generated
	 */
	public Adapter createJMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplejavaAdapterFactory
