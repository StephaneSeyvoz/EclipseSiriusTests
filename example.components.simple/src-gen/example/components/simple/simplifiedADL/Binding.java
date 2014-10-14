/**
 */
package example.components.simple.simplifiedADL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.components.simple.simplifiedADL.Binding#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.Binding#getSourceInterface <em>Source Interface</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.Binding#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.Binding#getTargetInterface <em>Target Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends ArchitectureElements
{
  /**
   * Returns the value of the '<em><b>Source Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Component</em>' reference.
   * @see #setSourceComponent(Component)
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getBinding_SourceComponent()
   * @model
   * @generated
   */
  Component getSourceComponent();

  /**
   * Sets the value of the '{@link example.components.simple.simplifiedADL.Binding#getSourceComponent <em>Source Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Component</em>' reference.
   * @see #getSourceComponent()
   * @generated
   */
  void setSourceComponent(Component value);

  /**
   * Returns the value of the '<em><b>Source Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Interface</em>' reference.
   * @see #setSourceInterface(RequiredInterface)
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getBinding_SourceInterface()
   * @model
   * @generated
   */
  RequiredInterface getSourceInterface();

  /**
   * Sets the value of the '{@link example.components.simple.simplifiedADL.Binding#getSourceInterface <em>Source Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Interface</em>' reference.
   * @see #getSourceInterface()
   * @generated
   */
  void setSourceInterface(RequiredInterface value);

  /**
   * Returns the value of the '<em><b>Target Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Component</em>' reference.
   * @see #setTargetComponent(Component)
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getBinding_TargetComponent()
   * @model
   * @generated
   */
  Component getTargetComponent();

  /**
   * Sets the value of the '{@link example.components.simple.simplifiedADL.Binding#getTargetComponent <em>Target Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Component</em>' reference.
   * @see #getTargetComponent()
   * @generated
   */
  void setTargetComponent(Component value);

  /**
   * Returns the value of the '<em><b>Target Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Interface</em>' reference.
   * @see #setTargetInterface(ProvidedInterface)
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getBinding_TargetInterface()
   * @model
   * @generated
   */
  ProvidedInterface getTargetInterface();

  /**
   * Sets the value of the '{@link example.components.simple.simplifiedADL.Binding#getTargetInterface <em>Target Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Interface</em>' reference.
   * @see #getTargetInterface()
   * @generated
   */
  void setTargetInterface(ProvidedInterface value);

} // Binding
