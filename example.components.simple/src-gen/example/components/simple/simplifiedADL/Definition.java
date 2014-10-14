/**
 */
package example.components.simple.simplifiedADL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.components.simple.simplifiedADL.Definition#getImports <em>Imports</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.Definition#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link example.components.simple.simplifiedADL.Imports}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getDefinition_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Imports> getImports();

  /**
   * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecture</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture</em>' containment reference.
   * @see #setArchitecture(Architecture)
   * @see example.components.simple.simplifiedADL.SimplifiedADLPackage#getDefinition_Architecture()
   * @model containment="true"
   * @generated
   */
  Architecture getArchitecture();

  /**
   * Sets the value of the '{@link example.components.simple.simplifiedADL.Definition#getArchitecture <em>Architecture</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture</em>' containment reference.
   * @see #getArchitecture()
   * @generated
   */
  void setArchitecture(Architecture value);

} // Definition
