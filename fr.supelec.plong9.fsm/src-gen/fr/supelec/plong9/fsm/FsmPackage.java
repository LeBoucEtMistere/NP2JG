/**
 */
package fr.supelec.plong9.fsm;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.supelec.plong9.fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.supelec.plong9.fsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = fr.supelec.plong9.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.FSMImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_STATES = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__FINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Owned Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_EVENTS = 4;

	/**
	 * The feature id for the '<em><b>Is Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__IS_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Owned Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_ACTIONS = 6;

	/**
	 * The feature id for the '<em><b>Owned Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_GUARDS = 7;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__GROUP_ID = 8;

	/**
	 * The feature id for the '<em><b>Owned Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_MESSAGES = 9;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__DATA_TYPES = 10;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.StateImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getState()
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
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>On Entered Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ON_ENTERED_ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>On Exited Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ON_EXITED_ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Expected Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXPECTED_MESSAGE = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.TransitionImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Inverse Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INVERSE_GUARD = 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.EventImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getEvent()
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
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.ActionImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.GuardImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.MessageImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Enums Def</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ENUMS_DEF = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.supelec.plong9.fsm.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.supelec.plong9.fsm.impl.StringToStringMapImpl
	 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see fr.supelec.plong9.fsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.FSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getName()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.FSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedStates()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.FSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getInitialState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_InitialState();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.FSM#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final State</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getFinalState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_FinalState();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.FSM#getOwnedEvents <em>Owned Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Events</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedEvents()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedEvents();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.FSM#isIsServer <em>Is Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Server</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#isIsServer()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_IsServer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.FSM#getOwnedActions <em>Owned Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actions</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedActions()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedActions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.FSM#getOwnedGuards <em>Owned Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Guards</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedGuards()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedGuards();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.FSM#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getGroupId()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_GroupId();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.FSM#getOwnedMessages <em>Owned Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Messages</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedMessages()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedMessages();

	/**
	 * Returns the meta object for the map '{@link fr.supelec.plong9.fsm.FSM#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data Types</em>'.
	 * @see fr.supelec.plong9.fsm.FSM#getDataTypes()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_DataTypes();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.supelec.plong9.fsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the container reference '{@link fr.supelec.plong9.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see fr.supelec.plong9.fsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.supelec.plong9.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
	 * @see fr.supelec.plong9.fsm.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link fr.supelec.plong9.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see fr.supelec.plong9.fsm.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link fr.supelec.plong9.fsm.State#getOnEnteredActions <em>On Entered Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Entered Actions</em>'.
	 * @see fr.supelec.plong9.fsm.State#getOnEnteredActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OnEnteredActions();

	/**
	 * Returns the meta object for the reference list '{@link fr.supelec.plong9.fsm.State#getOnExitedActions <em>On Exited Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Exited Actions</em>'.
	 * @see fr.supelec.plong9.fsm.State#getOnExitedActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OnExitedActions();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.State#getExpectedMessage <em>Expected Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Message</em>'.
	 * @see fr.supelec.plong9.fsm.State#getExpectedMessage()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExpectedMessage();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.supelec.plong9.fsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the container reference '{@link fr.supelec.plong9.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference list '{@link fr.supelec.plong9.fsm.Transition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getActions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Actions();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Transition#isInverseGuard <em>Inverse Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Guard</em>'.
	 * @see fr.supelec.plong9.fsm.Transition#isInverseGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_InverseGuard();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.supelec.plong9.fsm.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.supelec.plong9.fsm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see fr.supelec.plong9.fsm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Guard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.Guard#getName()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Name();

	/**
	 * Returns the meta object for class '{@link fr.supelec.plong9.fsm.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see fr.supelec.plong9.fsm.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link fr.supelec.plong9.fsm.Message#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.supelec.plong9.fsm.Message#getEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Event();

	/**
	 * Returns the meta object for the map '{@link fr.supelec.plong9.fsm.Message#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Data</em>'.
	 * @see fr.supelec.plong9.fsm.Message#getData()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Data();

	/**
	 * Returns the meta object for the attribute '{@link fr.supelec.plong9.fsm.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.supelec.plong9.fsm.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the map '{@link fr.supelec.plong9.fsm.Message#getEnumsDef <em>Enums Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Enums Def</em>'.
	 * @see fr.supelec.plong9.fsm.Message#getEnumsDef()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_EnumsDef();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.FSMImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__NAME = eINSTANCE.getFSM_Name();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_STATES = eINSTANCE.getFSM_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__INITIAL_STATE = eINSTANCE.getFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__FINAL_STATE = eINSTANCE.getFSM_FinalState();

		/**
		 * The meta object literal for the '<em><b>Owned Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_EVENTS = eINSTANCE.getFSM_OwnedEvents();

		/**
		 * The meta object literal for the '<em><b>Is Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__IS_SERVER = eINSTANCE.getFSM_IsServer();

		/**
		 * The meta object literal for the '<em><b>Owned Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_ACTIONS = eINSTANCE.getFSM_OwnedActions();

		/**
		 * The meta object literal for the '<em><b>Owned Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_GUARDS = eINSTANCE.getFSM_OwnedGuards();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__GROUP_ID = eINSTANCE.getFSM_GroupId();

		/**
		 * The meta object literal for the '<em><b>Owned Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_MESSAGES = eINSTANCE.getFSM_OwnedMessages();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__DATA_TYPES = eINSTANCE.getFSM_DataTypes();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.StateImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getState()
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
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>On Entered Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ON_ENTERED_ACTIONS = eINSTANCE.getState_OnEnteredActions();

		/**
		 * The meta object literal for the '<em><b>On Exited Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ON_EXITED_ACTIONS = eINSTANCE.getState_OnExitedActions();

		/**
		 * The meta object literal for the '<em><b>Expected Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXPECTED_MESSAGE = eINSTANCE.getState_ExpectedMessage();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.TransitionImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTIONS = eINSTANCE.getTransition_Actions();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Inverse Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INVERSE_GUARD = eINSTANCE.getTransition_InverseGuard();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.EventImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getEvent()
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

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.ActionImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.GuardImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.MessageImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__EVENT = eINSTANCE.getMessage_Event();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__DATA = eINSTANCE.getMessage_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Enums Def</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ENUMS_DEF = eINSTANCE.getMessage_EnumsDef();

		/**
		 * The meta object literal for the '{@link fr.supelec.plong9.fsm.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.supelec.plong9.fsm.impl.StringToStringMapImpl
		 * @see fr.supelec.plong9.fsm.impl.FsmPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

	}

} //FsmPackage
