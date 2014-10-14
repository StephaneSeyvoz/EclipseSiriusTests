/**
 */
package example.interfaces.simple.simplifiedItf.impl;

import example.interfaces.simple.simplifiedItf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedItfFactoryImpl extends EFactoryImpl implements SimplifiedItfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimplifiedItfFactory init()
  {
    try
    {
      SimplifiedItfFactory theSimplifiedItfFactory = (SimplifiedItfFactory)EPackage.Registry.INSTANCE.getEFactory(SimplifiedItfPackage.eNS_URI);
      if (theSimplifiedItfFactory != null)
      {
        return theSimplifiedItfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimplifiedItfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplifiedItfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimplifiedItfPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
      case SimplifiedItfPackage.METHOD: return createMethod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition createInterfaceDefinition()
  {
    InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
    return interfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplifiedItfPackage getSimplifiedItfPackage()
  {
    return (SimplifiedItfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimplifiedItfPackage getPackage()
  {
    return SimplifiedItfPackage.eINSTANCE;
  }

} //SimplifiedItfFactoryImpl
