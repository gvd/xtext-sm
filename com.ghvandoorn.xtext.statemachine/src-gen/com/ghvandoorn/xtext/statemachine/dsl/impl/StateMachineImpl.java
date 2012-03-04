/**
 * <copyright>
 * </copyright>
 *
 */
package com.ghvandoorn.xtext.statemachine.dsl.impl;

import com.ghvandoorn.xtext.statemachine.dsl.DslPackage;
import com.ghvandoorn.xtext.statemachine.dsl.Event;
import com.ghvandoorn.xtext.statemachine.dsl.State;
import com.ghvandoorn.xtext.statemachine.dsl.StateMachine;

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
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine
{
  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected State initialState;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateMachineImpl()
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
    return DslPackage.Literals.STATE_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, DslPackage.STATE_MACHINE__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialState()
  {
    if (initialState != null && initialState.eIsProxy())
    {
      InternalEObject oldInitialState = (InternalEObject)initialState;
      initialState = (State)eResolveProxy(oldInitialState);
      if (initialState != oldInitialState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.STATE_MACHINE__INITIAL_STATE, oldInitialState, initialState));
      }
    }
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitialState()
  {
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialState(State newInitialState)
  {
    State oldInitialState = initialState;
    initialState = newInitialState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.STATE_MACHINE__INITIAL_STATE, oldInitialState, initialState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, DslPackage.STATE_MACHINE__STATES);
    }
    return states;
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
      case DslPackage.STATE_MACHINE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case DslPackage.STATE_MACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case DslPackage.STATE_MACHINE__EVENTS:
        return getEvents();
      case DslPackage.STATE_MACHINE__INITIAL_STATE:
        if (resolve) return getInitialState();
        return basicGetInitialState();
      case DslPackage.STATE_MACHINE__STATES:
        return getStates();
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
      case DslPackage.STATE_MACHINE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DslPackage.STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)newValue);
        return;
      case DslPackage.STATE_MACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case DslPackage.STATE_MACHINE__EVENTS:
        getEvents().clear();
        return;
      case DslPackage.STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)null);
        return;
      case DslPackage.STATE_MACHINE__STATES:
        getStates().clear();
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
      case DslPackage.STATE_MACHINE__EVENTS:
        return events != null && !events.isEmpty();
      case DslPackage.STATE_MACHINE__INITIAL_STATE:
        return initialState != null;
      case DslPackage.STATE_MACHINE__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateMachineImpl
