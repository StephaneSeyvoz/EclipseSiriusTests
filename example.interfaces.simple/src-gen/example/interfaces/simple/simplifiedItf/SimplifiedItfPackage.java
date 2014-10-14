/**
 */
package example.interfaces.simple.simplifiedItf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see example.interfaces.simple.simplifiedItf.SimplifiedItfFactory
 * @model kind="package"
 * @generated
 */
public interface SimplifiedItfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simplifiedItf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.interfaces.example/simple/SimplifiedItf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simplifiedItf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplifiedItfPackage eINSTANCE = example.interfaces.simple.simplifiedItf.impl.SimplifiedItfPackageImpl.init();

  /**
   * The meta object id for the '{@link example.interfaces.simple.simplifiedItf.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.interfaces.simple.simplifiedItf.impl.InterfaceDefinitionImpl
   * @see example.interfaces.simple.simplifiedItf.impl.SimplifiedItfPackageImpl#getInterfaceDefinition()
   * @generated
   */
  int INTERFACE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__METHODS = 1;

  /**
   * The number of structural features of the '<em>Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.interfaces.simple.simplifiedItf.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.interfaces.simple.simplifiedItf.impl.MethodImpl
   * @see example.interfaces.simple.simplifiedItf.impl.SimplifiedItfPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Types List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPES_LIST = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Definition</em>'.
   * @see example.interfaces.simple.simplifiedItf.InterfaceDefinition
   * @generated
   */
  EClass getInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.interfaces.simple.simplifiedItf.InterfaceDefinition#getName()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see example.interfaces.simple.simplifiedItf.InterfaceDefinition#getMethods()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EReference getInterfaceDefinition_Methods();

  /**
   * Returns the meta object for class '{@link example.interfaces.simple.simplifiedItf.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see example.interfaces.simple.simplifiedItf.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link example.interfaces.simple.simplifiedItf.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see example.interfaces.simple.simplifiedItf.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link example.interfaces.simple.simplifiedItf.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.interfaces.simple.simplifiedItf.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the attribute list '{@link example.interfaces.simple.simplifiedItf.Method#getTypesList <em>Types List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Types List</em>'.
   * @see example.interfaces.simple.simplifiedItf.Method#getTypesList()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_TypesList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimplifiedItfFactory getSimplifiedItfFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link example.interfaces.simple.simplifiedItf.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.interfaces.simple.simplifiedItf.impl.InterfaceDefinitionImpl
     * @see example.interfaces.simple.simplifiedItf.impl.SimplifiedItfPackageImpl#getInterfaceDefinition()
     * @generated
     */
    EClass INTERFACE_DEFINITION = eINSTANCE.getInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__NAME = eINSTANCE.getInterfaceDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DEFINITION__METHODS = eINSTANCE.getInterfaceDefinition_Methods();

    /**
     * The meta object literal for the '{@link example.interfaces.simple.simplifiedItf.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.interfaces.simple.simplifiedItf.impl.MethodImpl
     * @see example.interfaces.simple.simplifiedItf.impl.SimplifiedItfPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Types List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__TYPES_LIST = eINSTANCE.getMethod_TypesList();

  }

} //SimplifiedItfPackage
