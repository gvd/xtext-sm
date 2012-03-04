/**
 * <copyright>
 * </copyright>
 *
 */
package com.ghvandoorn.xtext.statemachine.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ghvandoorn.xtext.statemachine.dsl.DslPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link com.ghvandoorn.xtext.statemachine.dsl.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see com.ghvandoorn.xtext.statemachine.dsl.DslPackage#getStateMachine_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial State</em>' reference.
   * @see #setInitialState(State)
   * @see com.ghvandoorn.xtext.statemachine.dsl.DslPackage#getStateMachine_InitialState()
   * @model
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getInitialState <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link com.ghvandoorn.xtext.statemachine.dsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see com.ghvandoorn.xtext.statemachine.dsl.DslPackage#getStateMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // StateMachine
