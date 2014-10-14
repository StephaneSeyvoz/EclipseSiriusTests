/**
 */
package example.components.simple.simplifiedADL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see example.components.simple.simplifiedADL.SimplifiedADLPackage
 * @generated
 */
public interface SimplifiedADLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplifiedADLFactory eINSTANCE = example.components.simple.simplifiedADL.impl.SimplifiedADLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imports</em>'.
   * @generated
   */
  Imports createImports();

  /**
   * Returns a new object of class '<em>Architecture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture</em>'.
   * @generated
   */
  Architecture createArchitecture();

  /**
   * Returns a new object of class '<em>Required Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Interface</em>'.
   * @generated
   */
  RequiredInterface createRequiredInterface();

  /**
   * Returns a new object of class '<em>Provided Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Interface</em>'.
   * @generated
   */
  ProvidedInterface createProvidedInterface();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimplifiedADLPackage getSimplifiedADLPackage();

} //SimplifiedADLFactory
