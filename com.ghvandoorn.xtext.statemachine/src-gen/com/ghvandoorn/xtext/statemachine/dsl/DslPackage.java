/**
 * <copyright>
 * </copyright>
 *
 */
package com.ghvandoorn.xtext.statemachine.dsl;

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
 * @see com.ghvandoorn.xtext.statemachine.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ghvandoorn.com/xtext/statemachine/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__INITIAL_STATE = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.StateImpl
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.TransitionImpl
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.EventImpl
   * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the containment reference list '{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getEvents()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Events();

  /**
   * Returns the meta object for the reference '{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial State</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getInitialState()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_InitialState();

  /**
   * Returns the meta object for the containment reference list '{@link com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.StateMachine#getStates()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_States();

  /**
   * Returns the meta object for class '{@link com.ghvandoorn.xtext.statemachine.dsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link com.ghvandoorn.xtext.statemachine.dsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ghvandoorn.xtext.statemachine.dsl.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link com.ghvandoorn.xtext.statemachine.dsl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link com.ghvandoorn.xtext.statemachine.dsl.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link com.ghvandoorn.xtext.statemachine.dsl.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for class '{@link com.ghvandoorn.xtext.statemachine.dsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link com.ghvandoorn.xtext.statemachine.dsl.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ghvandoorn.xtext.statemachine.dsl.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

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
     * The meta object literal for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.StateMachineImpl
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__EVENTS = eINSTANCE.getStateMachine_Events();

    /**
     * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__INITIAL_STATE = eINSTANCE.getStateMachine_InitialState();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

    /**
     * The meta object literal for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.StateImpl
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.TransitionImpl
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '{@link com.ghvandoorn.xtext.statemachine.dsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.EventImpl
     * @see com.ghvandoorn.xtext.statemachine.dsl.impl.DslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

  }

} //DslPackage
