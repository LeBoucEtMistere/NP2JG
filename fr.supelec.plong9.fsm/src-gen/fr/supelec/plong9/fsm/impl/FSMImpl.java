/**
 */
package fr.supelec.plong9.fsm.impl;

import fr.supelec.plong9.fsm.Action;
import fr.supelec.plong9.fsm.Event;
import fr.supelec.plong9.fsm.FSM;
import fr.supelec.plong9.fsm.FsmPackage;
import fr.supelec.plong9.fsm.Guard;
import fr.supelec.plong9.fsm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#isIsServer <em>Is Server</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getOwnedActions <em>Owned Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getOwnedGuards <em>Owned Guards</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.FSMImpl#getGroupId <em>Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

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
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected State finalState;

	/**
	 * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> ownedEvents;

	/**
	 * The default value of the '{@link #isIsServer() <em>Is Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsServer() <em>Is Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsServer()
	 * @generated
	 * @ordered
	 */
	protected boolean isServer = IS_SERVER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedActions() <em>Owned Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> ownedActions;

	/**
	 * The cached value of the '{@link #getOwnedGuards() <em>Owned Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> ownedGuards;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this, FsmPackage.FSM__OWNED_STATES,
					FsmPackage.STATE__OWNING_FSM);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (State) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__INITIAL_STATE,
							oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__INITIAL_STATE, oldInitialState,
					initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject) currentState;
			currentState = (State) eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__CURRENT_STATE,
							oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__CURRENT_STATE, oldCurrentState,
					currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFinalState() {
		if (finalState != null && finalState.eIsProxy()) {
			InternalEObject oldFinalState = (InternalEObject) finalState;
			finalState = (State) eResolveProxy(oldFinalState);
			if (finalState != oldFinalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__FINAL_STATE,
							oldFinalState, finalState));
			}
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(State newFinalState) {
		State oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__FINAL_STATE, oldFinalState,
					finalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOwnedEvents() {
		if (ownedEvents == null) {
			ownedEvents = new EObjectContainmentEList<Event>(Event.class, this, FsmPackage.FSM__OWNED_EVENTS);
		}
		return ownedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsServer() {
		return isServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsServer(boolean newIsServer) {
		boolean oldIsServer = isServer;
		isServer = newIsServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__IS_SERVER, oldIsServer, isServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOwnedActions() {
		if (ownedActions == null) {
			ownedActions = new EObjectContainmentEList<Action>(Action.class, this, FsmPackage.FSM__OWNED_ACTIONS);
		}
		return ownedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getOwnedGuards() {
		if (ownedGuards == null) {
			ownedGuards = new EObjectContainmentEList<Guard>(Guard.class, this, FsmPackage.FSM__OWNED_GUARDS);
		}
		return ownedGuards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FsmPackage.FSM__OWNED_STATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FsmPackage.FSM__OWNED_STATES:
			return ((InternalEList<?>) getOwnedStates()).basicRemove(otherEnd, msgs);
		case FsmPackage.FSM__OWNED_EVENTS:
			return ((InternalEList<?>) getOwnedEvents()).basicRemove(otherEnd, msgs);
		case FsmPackage.FSM__OWNED_ACTIONS:
			return ((InternalEList<?>) getOwnedActions()).basicRemove(otherEnd, msgs);
		case FsmPackage.FSM__OWNED_GUARDS:
			return ((InternalEList<?>) getOwnedGuards()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FsmPackage.FSM__NAME:
			return getName();
		case FsmPackage.FSM__OWNED_STATES:
			return getOwnedStates();
		case FsmPackage.FSM__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		case FsmPackage.FSM__CURRENT_STATE:
			if (resolve)
				return getCurrentState();
			return basicGetCurrentState();
		case FsmPackage.FSM__FINAL_STATE:
			if (resolve)
				return getFinalState();
			return basicGetFinalState();
		case FsmPackage.FSM__OWNED_EVENTS:
			return getOwnedEvents();
		case FsmPackage.FSM__IS_SERVER:
			return isIsServer();
		case FsmPackage.FSM__OWNED_ACTIONS:
			return getOwnedActions();
		case FsmPackage.FSM__OWNED_GUARDS:
			return getOwnedGuards();
		case FsmPackage.FSM__GROUP_ID:
			return getGroupId();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FsmPackage.FSM__NAME:
			setName((String) newValue);
			return;
		case FsmPackage.FSM__OWNED_STATES:
			getOwnedStates().clear();
			getOwnedStates().addAll((Collection<? extends State>) newValue);
			return;
		case FsmPackage.FSM__INITIAL_STATE:
			setInitialState((State) newValue);
			return;
		case FsmPackage.FSM__CURRENT_STATE:
			setCurrentState((State) newValue);
			return;
		case FsmPackage.FSM__FINAL_STATE:
			setFinalState((State) newValue);
			return;
		case FsmPackage.FSM__OWNED_EVENTS:
			getOwnedEvents().clear();
			getOwnedEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case FsmPackage.FSM__IS_SERVER:
			setIsServer((Boolean) newValue);
			return;
		case FsmPackage.FSM__OWNED_ACTIONS:
			getOwnedActions().clear();
			getOwnedActions().addAll((Collection<? extends Action>) newValue);
			return;
		case FsmPackage.FSM__OWNED_GUARDS:
			getOwnedGuards().clear();
			getOwnedGuards().addAll((Collection<? extends Guard>) newValue);
			return;
		case FsmPackage.FSM__GROUP_ID:
			setGroupId((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case FsmPackage.FSM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FsmPackage.FSM__OWNED_STATES:
			getOwnedStates().clear();
			return;
		case FsmPackage.FSM__INITIAL_STATE:
			setInitialState((State) null);
			return;
		case FsmPackage.FSM__CURRENT_STATE:
			setCurrentState((State) null);
			return;
		case FsmPackage.FSM__FINAL_STATE:
			setFinalState((State) null);
			return;
		case FsmPackage.FSM__OWNED_EVENTS:
			getOwnedEvents().clear();
			return;
		case FsmPackage.FSM__IS_SERVER:
			setIsServer(IS_SERVER_EDEFAULT);
			return;
		case FsmPackage.FSM__OWNED_ACTIONS:
			getOwnedActions().clear();
			return;
		case FsmPackage.FSM__OWNED_GUARDS:
			getOwnedGuards().clear();
			return;
		case FsmPackage.FSM__GROUP_ID:
			setGroupId(GROUP_ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FsmPackage.FSM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FsmPackage.FSM__OWNED_STATES:
			return ownedStates != null && !ownedStates.isEmpty();
		case FsmPackage.FSM__INITIAL_STATE:
			return initialState != null;
		case FsmPackage.FSM__CURRENT_STATE:
			return currentState != null;
		case FsmPackage.FSM__FINAL_STATE:
			return finalState != null;
		case FsmPackage.FSM__OWNED_EVENTS:
			return ownedEvents != null && !ownedEvents.isEmpty();
		case FsmPackage.FSM__IS_SERVER:
			return isServer != IS_SERVER_EDEFAULT;
		case FsmPackage.FSM__OWNED_ACTIONS:
			return ownedActions != null && !ownedActions.isEmpty();
		case FsmPackage.FSM__OWNED_GUARDS:
			return ownedGuards != null && !ownedGuards.isEmpty();
		case FsmPackage.FSM__GROUP_ID:
			return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isServer: ");
		result.append(isServer);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(')');
		return result.toString();
	}

} //FSMImpl
