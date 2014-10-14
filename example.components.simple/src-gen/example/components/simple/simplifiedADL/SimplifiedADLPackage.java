/**
 */
package example.components.simple.simplifiedADL;

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
 * @see example.components.simple.simplifiedADL.SimplifiedADLFactory
 * @model kind="package"
 * @generated
 */
public interface SimplifiedADLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simplifiedADL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.components.example/simple/SimplifiedADL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simplifiedADL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplifiedADLPackage eINSTANCE = example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl.init();

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.DefinitionImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Architecture</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__ARCHITECTURE = 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.ImportsImpl <em>Imports</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.ImportsImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getImports()
   * @generated
   */
  int IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.ArchitectureImpl <em>Architecture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.ArchitectureImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getArchitecture()
   * @generated
   */
  int ARCHITECTURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Architecture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.RequiredInterfaceImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getRequiredInterface()
   * @generated
   */
  int REQUIRED_INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE__NAME = 1;

  /**
   * The number of structural features of the '<em>Required Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.ProvidedInterfaceImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getProvidedInterface()
   * @generated
   */
  int PROVIDED_INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE__NAME = 1;

  /**
   * The number of structural features of the '<em>Provided Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.ComponentImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.components.simple.simplifiedADL.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.components.simple.simplifiedADL.impl.BindingImpl
   * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 6;

  /**
   * The feature id for the '<em><b>Source Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__SOURCE_COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Source Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__SOURCE_INTERFACE = 1;

  /**
   * The feature id for the '<em><b>Target Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TARGET_COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Target Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TARGET_INTERFACE = 3;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see example.components.simple.simplifiedADL.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link example.components.simple.simplifiedADL.Definition#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see example.components.simple.simplifiedADL.Definition#getImports()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Imports();

  /**
   * Returns the meta object for the containment reference '{@link example.components.simple.simplifiedADL.Definition#getArchitecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Architecture</em>'.
   * @see example.components.simple.simplifiedADL.Definition#getArchitecture()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Architecture();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports</em>'.
   * @see example.components.simple.simplifiedADL.Imports
   * @generated
   */
  EClass getImports();

  /**
   * Returns the meta object for the attribute '{@link example.components.simple.simplifiedADL.Imports#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see example.components.simple.simplifiedADL.Imports#getImportedNamespace()
   * @see #getImports()
   * @generated
   */
  EAttribute getImports_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.Architecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture</em>'.
   * @see example.components.simple.simplifiedADL.Architecture
   * @generated
   */
  EClass getArchitecture();

  /**
   * Returns the meta object for the attribute '{@link example.components.simple.simplifiedADL.Architecture#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.components.simple.simplifiedADL.Architecture#getName()
   * @see #getArchitecture()
   * @generated
   */
  EAttribute getArchitecture_Name();

  /**
   * Returns the meta object for the containment reference list '{@link example.components.simple.simplifiedADL.Architecture#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see example.components.simple.simplifiedADL.Architecture#getElements()
   * @see #getArchitecture()
   * @generated
   */
  EReference getArchitecture_Elements();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.RequiredInterface <em>Required Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Interface</em>'.
   * @see example.components.simple.simplifiedADL.RequiredInterface
   * @generated
   */
  EClass getRequiredInterface();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.RequiredInterface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see example.components.simple.simplifiedADL.RequiredInterface#getType()
   * @see #getRequiredInterface()
   * @generated
   */
  EReference getRequiredInterface_Type();

  /**
   * Returns the meta object for the attribute '{@link example.components.simple.simplifiedADL.RequiredInterface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.components.simple.simplifiedADL.RequiredInterface#getName()
   * @see #getRequiredInterface()
   * @generated
   */
  EAttribute getRequiredInterface_Name();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.ProvidedInterface <em>Provided Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Interface</em>'.
   * @see example.components.simple.simplifiedADL.ProvidedInterface
   * @generated
   */
  EClass getProvidedInterface();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.ProvidedInterface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see example.components.simple.simplifiedADL.ProvidedInterface#getType()
   * @see #getProvidedInterface()
   * @generated
   */
  EReference getProvidedInterface_Type();

  /**
   * Returns the meta object for the attribute '{@link example.components.simple.simplifiedADL.ProvidedInterface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.components.simple.simplifiedADL.ProvidedInterface#getName()
   * @see #getProvidedInterface()
   * @generated
   */
  EAttribute getProvidedInterface_Name();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see example.components.simple.simplifiedADL.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.Component#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see example.components.simple.simplifiedADL.Component#getType()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Type();

  /**
   * Returns the meta object for the attribute '{@link example.components.simple.simplifiedADL.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.components.simple.simplifiedADL.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for class '{@link example.components.simple.simplifiedADL.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see example.components.simple.simplifiedADL.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.Binding#getSourceComponent <em>Source Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Component</em>'.
   * @see example.components.simple.simplifiedADL.Binding#getSourceComponent()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_SourceComponent();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.Binding#getSourceInterface <em>Source Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Interface</em>'.
   * @see example.components.simple.simplifiedADL.Binding#getSourceInterface()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_SourceInterface();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.Binding#getTargetComponent <em>Target Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Component</em>'.
   * @see example.components.simple.simplifiedADL.Binding#getTargetComponent()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_TargetComponent();

  /**
   * Returns the meta object for the reference '{@link example.components.simple.simplifiedADL.Binding#getTargetInterface <em>Target Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Interface</em>'.
   * @see example.components.simple.simplifiedADL.Binding#getTargetInterface()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_TargetInterface();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimplifiedADLFactory getSimplifiedADLFactory();

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
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.DefinitionImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__IMPORTS = eINSTANCE.getDefinition_Imports();

    /**
     * The meta object literal for the '<em><b>Architecture</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__ARCHITECTURE = eINSTANCE.getDefinition_Architecture();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.ImportsImpl <em>Imports</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.ImportsImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getImports()
     * @generated
     */
    EClass IMPORTS = eINSTANCE.getImports();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS__IMPORTED_NAMESPACE = eINSTANCE.getImports_ImportedNamespace();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.ArchitectureImpl <em>Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.ArchitectureImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getArchitecture()
     * @generated
     */
    EClass ARCHITECTURE = eINSTANCE.getArchitecture();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE__ELEMENTS = eINSTANCE.getArchitecture_Elements();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.RequiredInterfaceImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getRequiredInterface()
     * @generated
     */
    EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_INTERFACE__TYPE = eINSTANCE.getRequiredInterface_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_INTERFACE__NAME = eINSTANCE.getRequiredInterface_Name();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.ProvidedInterfaceImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getProvidedInterface()
     * @generated
     */
    EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_INTERFACE__TYPE = eINSTANCE.getProvidedInterface_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_INTERFACE__NAME = eINSTANCE.getProvidedInterface_Name();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.ComponentImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '{@link example.components.simple.simplifiedADL.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.components.simple.simplifiedADL.impl.BindingImpl
     * @see example.components.simple.simplifiedADL.impl.SimplifiedADLPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Source Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__SOURCE_COMPONENT = eINSTANCE.getBinding_SourceComponent();

    /**
     * The meta object literal for the '<em><b>Source Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__SOURCE_INTERFACE = eINSTANCE.getBinding_SourceInterface();

    /**
     * The meta object literal for the '<em><b>Target Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TARGET_COMPONENT = eINSTANCE.getBinding_TargetComponent();

    /**
     * The meta object literal for the '<em><b>Target Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TARGET_INTERFACE = eINSTANCE.getBinding_TargetInterface();

  }

} //SimplifiedADLPackage
