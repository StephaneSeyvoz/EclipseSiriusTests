/**
 */
package example.interfaces.simple.simplifiedItf.impl;

import example.interfaces.simple.simplifiedItf.InterfaceDefinition;
import example.interfaces.simple.simplifiedItf.Method;
import example.interfaces.simple.simplifiedItf.SimplifiedItfFactory;
import example.interfaces.simple.simplifiedItf.SimplifiedItfPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedItfPackageImpl extends EPackageImpl implements SimplifiedItfPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see example.interfaces.simple.simplifiedItf.SimplifiedItfPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimplifiedItfPackageImpl()
  {
    super(eNS_URI, SimplifiedItfFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SimplifiedItfPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimplifiedItfPackage init()
  {
    if (isInited) return (SimplifiedItfPackage)EPackage.Registry.INSTANCE.getEPackage(SimplifiedItfPackage.eNS_URI);

    // Obtain or create and register package
    SimplifiedItfPackageImpl theSimplifiedItfPackage = (SimplifiedItfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplifiedItfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplifiedItfPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimplifiedItfPackage.createPackageContents();

    // Initialize created meta-data
    theSimplifiedItfPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimplifiedItfPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimplifiedItfPackage.eNS_URI, theSimplifiedItfPackage);
    return theSimplifiedItfPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDefinition()
  {
    return interfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDefinition_Name()
  {
    return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDefinition_Methods()
  {
    return (EReference)interfaceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_ReturnType()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_TypesList()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplifiedItfFactory getSimplifiedItfFactory()
  {
    return (SimplifiedItfFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
    createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__NAME);
    createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__METHODS);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__RETURN_TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEAttribute(methodEClass, METHOD__TYPES_LIST);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDefinition_Methods(), this.getMethod(), null, "methods", null, 0, -1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_TypesList(), ecorePackage.getEString(), "typesList", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimplifiedItfPackageImpl
