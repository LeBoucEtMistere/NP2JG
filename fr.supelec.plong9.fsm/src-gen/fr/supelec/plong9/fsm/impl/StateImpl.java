/**
 */
package fr.supelec.plong9.fsm.impl;

import fr.supelec.plong9.fsm.Action;
import fr.supelec.plong9.fsm.FSM;
import fr.supelec.plong9.fsm.FsmPackage;
import fr.supelec.plong9.fsm.Message;
import fr.supelec.plong9.fsm.State;
import fr.supelec.plong9.fsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getOnEnteredActions <em>On Entered Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getOnExitedActions <em>On Exited Actions</em>}</li>
 *   <li>{@link fr.supelec.plong9.fsm.impl.StateImpl#getExpectedMessage <em>Expected Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getOnEnteredActions() <em>On Entered Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEnteredActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> onEnteredActions;

	/**
	 * The cached value of the '{@link #getOnExitedActions() <em>On Exited Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExitedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> onExitedActions;

	/**
	 * The cached value of the '{@link #getExpectedMessage() <em>Expected Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedMessage()
	 * @generated
	 * @ordered
	 */
	protected Message expectedMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOwningFSM() {
		if (eContainerFeatureID() != FsmPackage.STATE__OWNING_FSM)
			return null;
		return (FSM) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFSM(FSM newOwningFSM, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningFSM, FsmPackage.STATE__OWNING_FSM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFSM(FSM newOwningFSM) {
		if (newOwningFSM != eInternalContainer()
				|| (eContainerFeatureID() != FsmPackage.STATE__OWNING_FSM && newOwningFSM != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFSM))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFSM != null)
				msgs = ((InternalEObject) newOwningFSM).eInverseAdd(this, FsmPackage.FSM__OWNED_STATES, FSM.class,
						msgs);
			msgs = basicSetOwningFSM(newOwningFSM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__OWNING_FSM, newOwningFSM,
					newOwningFSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					FsmPackage.STATE__OUTGOING_TRANSITIONS, FsmPackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					FsmPackage.STATE__INCOMING_TRANSITIONS, FsmPackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOnEnteredActions() {
		if (onEnteredActions == null) {
			onEnteredActions = new EObjectResolvingEList<Action>(Action.class, this,
					FsmPackage.STATE__ON_ENTERED_ACTIONS);
		}
		return onEnteredActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOnExitedActions() {
		if (onExitedActions == null) {
			onExitedActions = new EObjectResolvingEList<Action>(Action.class, this,
					FsmPackage.STATE__ON_EXITED_ACTIONS);
		}
		return onExitedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getExpectedMessage() {
		if (expectedMessage != null && expectedMessage.eIsProxy()) {
			InternalEObject oldExpectedMessage = (InternalEObject) expectedMessage;
			expectedMessage = (Message) eResolveProxy(oldExpectedMessage);
			if (expectedMessage != oldExpectedMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.STATE__EXPECTED_MESSAGE,
							oldExpectedMessage, expectedMessage));
			}
		}
		return expectedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetExpectedMessage() {
		return expectedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedMessage(Message newExpectedMessage) {
		Message oldExpectedMessage = expectedMessage;
		expectedMessage = newExpectedMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__EXPECTED_MESSAGE,
					oldExpectedMessage, expectedMessage));
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
		case FsmPackage.STATE__OWNING_FSM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningFSM((FSM) otherEnd, msgs);
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingTransitions()).basicAdd(otherEnd,
					msgs);
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingTransitions()).basicAdd(otherEnd,
					msgs);
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
		case FsmPackage.STATE__OWNING_FSM:
			return basicSetOwningFSM(null, msgs);
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			return ((InternalEList<?>) getOutgoingTransitions()).basicRemove(otherEnd, msgs);
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			return ((InternalEList<?>) getIncomingTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case FsmPackage.STATE__OWNING_FSM:
			return eInternalContainer().eInverseRemove(this, FsmPackage.FSM__OWNED_STATES, FSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FsmPackage.STATE__NAME:
			return getName();
		case FsmPackage.STATE__OWNING_FSM:
			return getOwningFSM();
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			return getOutgoingTransitions();
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			return getIncomingTransitions();
		case FsmPackage.STATE__ON_ENTERED_ACTIONS:
			return getOnEnteredActions();
		case FsmPackage.STATE__ON_EXITED_ACTIONS:
			return getOnExitedActions();
		case FsmPackage.STATE__EXPECTED_MESSAGE:
			if (resolve)
				return getExpectedMessage();
			return basicGetExpectedMessage();
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
		case FsmPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case FsmPackage.STATE__OWNING_FSM:
			setOwningFSM((FSM) newValue);
			return;
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			getOutgoingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			getIncomingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case FsmPackage.STATE__ON_ENTERED_ACTIONS:
			getOnEnteredActions().clear();
			getOnEnteredActions().addAll((Collection<? extends Action>) newValue);
			return;
		case FsmPackage.STATE__ON_EXITED_ACTIONS:
			getOnExitedActions().clear();
			getOnExitedActions().addAll((Collection<? extends Action>) newValue);
			return;
		case FsmPackage.STATE__EXPECTED_MESSAGE:
			setExpectedMessage((Message) newValue);
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
		case FsmPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FsmPackage.STATE__OWNING_FSM:
			setOwningFSM((FSM) null);
			return;
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			return;
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			return;
		case FsmPackage.STATE__ON_ENTERED_ACTIONS:
			getOnEnteredActions().clear();
			return;
		case FsmPackage.STATE__ON_EXITED_ACTIONS:
			getOnExitedActions().clear();
			return;
		case FsmPackage.STATE__EXPECTED_MESSAGE:
			setExpectedMessage((Message) null);
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
		case FsmPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FsmPackage.STATE__OWNING_FSM:
			return getOwningFSM() != null;
		case FsmPackage.STATE__OUTGOING_TRANSITIONS:
			return outgoingTransitions != null && !outgoingTransitions.isEmpty();
		case FsmPackage.STATE__INCOMING_TRANSITIONS:
			return incomingTransitions != null && !incomingTransitions.isEmpty();
		case FsmPackage.STATE__ON_ENTERED_ACTIONS:
			return onEnteredActions != null && !onEnteredActions.isEmpty();
		case FsmPackage.STATE__ON_EXITED_ACTIONS:
			return onExitedActions != null && !onExitedActions.isEmpty();
		case FsmPackage.STATE__EXPECTED_MESSAGE:
			return expectedMessage != null;
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
		result.append(')');
		return result.toString();
	}

} //StateImpl
