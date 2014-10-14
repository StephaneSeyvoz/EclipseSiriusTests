/**
 */
package example.components.simple.simplifiedADL.impl;

import example.components.simple.simplifiedADL.Binding;
import example.components.simple.simplifiedADL.Component;
import example.components.simple.simplifiedADL.ProvidedInterface;
import example.components.simple.simplifiedADL.RequiredInterface;
import example.components.simple.simplifiedADL.SimplifiedADLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.components.simple.simplifiedADL.impl.BindingImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.impl.BindingImpl#getSourceInterface <em>Source Interface</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.impl.BindingImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link example.components.simple.simplifiedADL.impl.BindingImpl#getTargetInterface <em>Target Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getSourceComponent() <em>Source Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceComponent()
   * @generated
   * @ordered
   */
  protected Component sourceComponent;

  /**
   * The cached value of the '{@link #getSourceInterface() <em>Source Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceInterface()
   * @generated
   * @ordered
   */
  protected RequiredInterface sourceInterface;

  /**
   * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetComponent()
   * @generated
   * @ordered
   */
  protected Component targetComponent;

  /**
   * The cached value of the '{@link #getTargetInterface() <em>Target Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetInterface()
   * @generated
   * @ordered
   */
  protected ProvidedInterface targetInterface;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return SimplifiedADLPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getSourceComponent()
  {
    if (sourceComponent != null && sourceComponent.eIsProxy())
    {
      InternalEObject oldSourceComponent = (InternalEObject)sourceComponent;
      sourceComponent = (Component)eResolveProxy(oldSourceComponent);
      if (sourceComponent != oldSourceComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedADLPackage.BINDING__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
      }
    }
    return sourceComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetSourceComponent()
  {
    return sourceComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceComponent(Component newSourceComponent)
  {
    Component oldSourceComponent = sourceComponent;
    sourceComponent = newSourceComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.BINDING__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredInterface getSourceInterface()
  {
    if (sourceInterface != null && sourceInterface.eIsProxy())
    {
      InternalEObject oldSourceInterface = (InternalEObject)sourceInterface;
      sourceInterface = (RequiredInterface)eResolveProxy(oldSourceInterface);
      if (sourceInterface != oldSourceInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedADLPackage.BINDING__SOURCE_INTERFACE, oldSourceInterface, sourceInterface));
      }
    }
    return sourceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredInterface basicGetSourceInterface()
  {
    return sourceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceInterface(RequiredInterface newSourceInterface)
  {
    RequiredInterface oldSourceInterface = sourceInterface;
    sourceInterface = newSourceInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.BINDING__SOURCE_INTERFACE, oldSourceInterface, sourceInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getTargetComponent()
  {
    if (targetComponent != null && targetComponent.eIsProxy())
    {
      InternalEObject oldTargetComponent = (InternalEObject)targetComponent;
      targetComponent = (Component)eResolveProxy(oldTargetComponent);
      if (targetComponent != oldTargetComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedADLPackage.BINDING__TARGET_COMPONENT, oldTargetComponent, targetComponent));
      }
    }
    return targetComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetTargetComponent()
  {
    return targetComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetComponent(Component newTargetComponent)
  {
    Component oldTargetComponent = targetComponent;
    targetComponent = newTargetComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.BINDING__TARGET_COMPONENT, oldTargetComponent, targetComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedInterface getTargetInterface()
  {
    if (targetInterface != null && targetInterface.eIsProxy())
    {
      InternalEObject oldTargetInterface = (InternalEObject)targetInterface;
      targetInterface = (ProvidedInterface)eResolveProxy(oldTargetInterface);
      if (targetInterface != oldTargetInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedADLPackage.BINDING__TARGET_INTERFACE, oldTargetInterface, targetInterface));
      }
    }
    return targetInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedInterface basicGetTargetInterface()
  {
    return targetInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetInterface(ProvidedInterface newTargetInterface)
  {
    ProvidedInterface oldTargetInterface = targetInterface;
    targetInterface = newTargetInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedADLPackage.BINDING__TARGET_INTERFACE, oldTargetInterface, targetInterface));
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
      case SimplifiedADLPackage.BINDING__SOURCE_COMPONENT:
        if (resolve) return getSourceComponent();
        return basicGetSourceComponent();
      case SimplifiedADLPackage.BINDING__SOURCE_INTERFACE:
        if (resolve) return getSourceInterface();
        return basicGetSourceInterface();
      case SimplifiedADLPackage.BINDING__TARGET_COMPONENT:
        if (resolve) return getTargetComponent();
        return basicGetTargetComponent();
      case SimplifiedADLPackage.BINDING__TARGET_INTERFACE:
        if (resolve) return getTargetInterface();
        return basicGetTargetInterface();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimplifiedADLPackage.BINDING__SOURCE_COMPONENT:
        setSourceComponent((Component)newValue);
        return;
      case SimplifiedADLPackage.BINDING__SOURCE_INTERFACE:
        setSourceInterface((RequiredInterface)newValue);
        return;
      case SimplifiedADLPackage.BINDING__TARGET_COMPONENT:
        setTargetComponent((Component)newValue);
        return;
      case SimplifiedADLPackage.BINDING__TARGET_INTERFACE:
        setTargetInterface((ProvidedInterface)newValue);
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
      case SimplifiedADLPackage.BINDING__SOURCE_COMPONENT:
        setSourceComponent((Component)null);
        return;
      case SimplifiedADLPackage.BINDING__SOURCE_INTERFACE:
        setSourceInterface((RequiredInterface)null);
        return;
      case SimplifiedADLPackage.BINDING__TARGET_COMPONENT:
        setTargetComponent((Component)null);
        return;
      case SimplifiedADLPackage.BINDING__TARGET_INTERFACE:
        setTargetInterface((ProvidedInterface)null);
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
      case SimplifiedADLPackage.BINDING__SOURCE_COMPONENT:
        return sourceComponent != null;
      case SimplifiedADLPackage.BINDING__SOURCE_INTERFACE:
        return sourceInterface != null;
      case SimplifiedADLPackage.BINDING__TARGET_COMPONENT:
        return targetComponent != null;
      case SimplifiedADLPackage.BINDING__TARGET_INTERFACE:
        return targetInterface != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
