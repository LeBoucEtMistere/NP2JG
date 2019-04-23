/**
 */
package fr.supelec.plong9.fsm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getName <em>Name</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Source()
	 * @see fr.supelec.plong9.fsm.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Guard)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.Transition#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Target()
	 * @see fr.supelec.plong9.fsm.State#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getTransition_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.Transition#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Transition
