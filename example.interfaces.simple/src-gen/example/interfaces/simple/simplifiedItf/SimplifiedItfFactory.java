/**
 */
package example.interfaces.simple.simplifiedItf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see example.interfaces.simple.simplifiedItf.SimplifiedItfPackage
 * @generated
 */
public interface SimplifiedItfFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplifiedItfFactory eINSTANCE = example.interfaces.simple.simplifiedItf.impl.SimplifiedItfFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Definition</em>'.
   * @generated
   */
  InterfaceDefinition createInterfaceDefinition();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimplifiedItfPackage getSimplifiedItfPackage();

} //SimplifiedItfFactory
