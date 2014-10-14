/**
 */
package example.components.simple.simplifiedADL.impl;

import example.components.simple.simplifiedADL.*;

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
public class SimplifiedADLFactoryImpl extends EFactoryImpl implements SimplifiedADLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimplifiedADLFactory init()
  {
    try
    {
      SimplifiedADLFactory theSimplifiedADLFactory = (SimplifiedADLFactory)EPackage.Registry.INSTANCE.getEFactory(SimplifiedADLPackage.eNS_URI);
      if (theSimplifiedADLFactory != null)
      {
        return theSimplifiedADLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimplifiedADLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplifiedADLFactoryImpl()
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
      case SimplifiedADLPackage.DEFINITION: return createDefinition();
      case SimplifiedADLPackage.IMPORTS: return createImports();
      case SimplifiedADLPackage.ARCHITECTURE: return createArchitecture();
      case SimplifiedADLPackage.REQUIRED_INTERFACE: return createRequiredInterface();
      case SimplifiedADLPackage.PROVIDED_INTERFACE: return createProvidedInterface();
      case SimplifiedADLPackage.COMPONENT: return createComponent();
      case SimplifiedADLPackage.BINDING: return createBinding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architecture createArchitecture()
  {
    ArchitectureImpl architecture = new ArchitectureImpl();
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredInterface createRequiredInterface()
  {
    RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
    return requiredInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedInterface createProvidedInterface()
  {
    ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
    return providedInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplifiedADLPackage getSimplifiedADLPackage()
  {
    return (SimplifiedADLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimplifiedADLPackage getPackage()
  {
    return SimplifiedADLPackage.eINSTANCE;
  }

} //SimplifiedADLFactoryImpl
