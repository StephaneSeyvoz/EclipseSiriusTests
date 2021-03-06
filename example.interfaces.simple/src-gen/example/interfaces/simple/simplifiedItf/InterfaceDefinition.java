/**
 */
package example.interfaces.simple.simplifiedItf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.interfaces.simple.simplifiedItf.SimplifiedItfPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see example.interfaces.simple.simplifiedItf.SimplifiedItfPackage#getInterfaceDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link example.interfaces.simple.simplifiedItf.InterfaceDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link example.interfaces.simple.simplifiedItf.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see example.interfaces.simple.simplifiedItf.SimplifiedItfPackage#getInterfaceDefinition_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // InterfaceDefinition
