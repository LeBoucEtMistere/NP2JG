/**
 */
package fr.supelec.plong9.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getName <em>Name</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getFinalState <em>Final State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#isIsServer <em>Is Server</em>}</li>
 * </ul>
 *
 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
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
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.State}.
	 * It is bidirectional and its opposite is '{@link fr.supelec.plong9.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_OwnedStates()
	 * @see fr.supelec.plong9.fsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

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
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_CurrentState()
	 * @model required="true"
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference.
	 * @see #setFinalState(State)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_FinalState()
	 * @model
	 * @generated
	 */
	State getFinalState();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#getFinalState <em>Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(State value);

	/**
	 * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Events</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_OwnedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getOwnedEvents();

	/**
	 * Returns the value of the '<em><b>Is Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Server</em>' attribute.
	 * @see #setIsServer(boolean)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_IsServer()
	 * @model
	 * @generated
	 */
	boolean isIsServer();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#isIsServer <em>Is Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Server</em>' attribute.
	 * @see #isIsServer()
	 * @generated
	 */
	void setIsServer(boolean value);

} // FSM
