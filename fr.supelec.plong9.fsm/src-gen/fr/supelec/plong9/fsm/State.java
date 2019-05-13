/**
 */
package fr.supelec.plong9.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.supelec.plong9.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getOnEnteredActions <em>On Entered Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getOnExitedActions <em>On Exited Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.State#getExpectedMessage <em>Expected Message</em>}</li>
 * </ul>
 *
 * @see fr.supelec.plong9.fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.FSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_OwningFSM()
	 * @see fr.supelec.plong9.fsm.FSM#getOwnedStates
	 * @model opposite="ownedStates" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_OutgoingTransitions()
	 * @see fr.supelec.plong9.fsm.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_IncomingTransitions()
	 * @see fr.supelec.plong9.fsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>On Entered Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Entered Actions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Entered Actions</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_OnEnteredActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getOnEnteredActions();

	/**
	 * Returns the value of the '<em><b>On Exited Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exited Actions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Exited Actions</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_OnExitedActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getOnExitedActions();

	/**
	 * Returns the value of the '<em><b>Expected Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Message</em>' reference.
	 * @see #setExpectedMessage(Message)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getState_ExpectedMessage()
	 * @model
	 * @generated
	 */
	Message getExpectedMessage();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.State#getExpectedMessage <em>Expected Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Message</em>' reference.
	 * @see #getExpectedMessage()
	 * @generated
	 */
	void setExpectedMessage(Message value);

} // State
