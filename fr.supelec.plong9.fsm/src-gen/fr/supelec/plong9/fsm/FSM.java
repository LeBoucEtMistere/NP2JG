/**
 */
package fr.supelec.plong9.fsm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

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
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getFinalState <em>Final State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#isIsServer <em>Is Server</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedActions <em>Owned Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedGuards <em>Owned Guards</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.FSM#getDataTypes <em>Data Types</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Owned Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actions</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_OwnedActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getOwnedActions();

	/**
	 * Returns the value of the '<em><b>Owned Guards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Guards</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_OwnedGuards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getOwnedGuards();

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_GroupId()
	 * @model required="true"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link fr.supelec.plong9.fsm.FSM#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Owned Messages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.supelec.plong9.fsm.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Messages</em>' containment reference list.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_OwnedMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getOwnedMessages();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' map.
	 * @see fr.supelec.plong9.fsm.FsmPackage#getFSM_DataTypes()
	 * @model mapType="fr.supelec.plong9.fsm.StringToStringMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getDataTypes();

} // FSM
