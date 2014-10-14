/**
 */
package example.components.simple.simplifiedADL.impl;

import example.components.simple.simplifiedADL.Architecture;
import example.components.simple.simplifiedADL.Definition;
import example.components.simple.simplifiedADL.Imports;
import example.components.simple.simplifiedADL.SimplifiedADLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.components.simple.simplifiedADL.impl.DefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.impl.DefinitionImpl#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Imports> imports;

  /**
   * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitecture()
   * @generated
   * @ordered
   */
  protected Architecture architecture;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimplifiedADLPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Imports> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Imports>(Imports.class, this, SimplifiedADLPackage.DEFINITION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architecture getArchitecture()
  {
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchitecture(Architecture newArchitecture, NotificationChain msgs)
  {
    Architecture oldArchitecture = architecture;
    architecture = newArchitecture;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.DEFINITION__ARCHITECTURE, oldArchitecture, newArchitecture);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitecture(Architecture newArchitecture)
  {
    if (newArchitecture != architecture)
    {
      NotificationChain msgs = null;
      if (architecture != null)
        msgs = ((InternalEObject)architecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplifiedADLPackage.DEFINITION__ARCHITECTURE, null, msgs);
      if (newArchitecture != null)
        msgs = ((InternalEObject)newArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplifiedADLPackage.DEFINITION__ARCHITECTURE, null, msgs);
      msgs = basicSetArchitecture(newArchitecture, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.DEFINITION__ARCHITECTURE, newArchitecture, newArchitecture));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.DEFINITION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SimplifiedADLPackage.DEFINITION__ARCHITECTURE:
        return basicSetArchitecture(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.DEFINITION__IMPORTS:
        return getImports();
      case SimplifiedADLPackage.DEFINITION__ARCHITECTURE:
        return getArchitecture();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.DEFINITION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Imports>)newValue);
        return;
      case SimplifiedADLPackage.DEFINITION__ARCHITECTURE:
        setArchitecture((Architecture)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.DEFINITION__IMPORTS:
        getImports().clear();
        return;
      case SimplifiedADLPackage.DEFINITION__ARCHITECTURE:
        setArchitecture((Architecture)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.DEFINITION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SimplifiedADLPackage.DEFINITION__ARCHITECTURE:
        return architecture != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
