/**
 */
package fr.supelec.plong9.fsm.provider;

import fr.supelec.plong9.fsm.FSM;
import fr.supelec.plong9.fsm.FsmFactory;
import fr.supelec.plong9.fsm.FsmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.supelec.plong9.fsm.FSM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addInitialStatePropertyDescriptor(object);
			addFinalStatePropertyDescriptor(object);
			addIsServerPropertyDescriptor(object);
			addGroupIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FSM_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FSM_name_feature", "_UI_FSM_type"),
						FsmPackage.Literals.FSM__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FSM_initialState_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FSM_initialState_feature", "_UI_FSM_type"),
						FsmPackage.Literals.FSM__INITIAL_STATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Final State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FSM_finalState_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FSM_finalState_feature", "_UI_FSM_type"),
						FsmPackage.Literals.FSM__FINAL_STATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Server feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FSM_isServer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FSM_isServer_feature", "_UI_FSM_type"),
						FsmPackage.Literals.FSM__IS_SERVER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FSM_groupId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FSM_groupId_feature", "_UI_FSM_type"),
						FsmPackage.Literals.FSM__GROUP_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FsmPackage.Literals.FSM__OWNED_STATES);
			childrenFeatures.add(FsmPackage.Literals.FSM__OWNED_EVENTS);
			childrenFeatures.add(FsmPackage.Literals.FSM__OWNED_ACTIONS);
			childrenFeatures.add(FsmPackage.Literals.FSM__OWNED_GUARDS);
			childrenFeatures.add(FsmPackage.Literals.FSM__OWNED_MESSAGES);
			childrenFeatures.add(FsmPackage.Literals.FSM__DATA_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FSM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FSM"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FSM) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FSM_type")
				: getString("_UI_FSM_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FSM.class)) {
		case FsmPackage.FSM__NAME:
		case FsmPackage.FSM__IS_SERVER:
		case FsmPackage.FSM__GROUP_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FsmPackage.FSM__OWNED_STATES:
		case FsmPackage.FSM__OWNED_EVENTS:
		case FsmPackage.FSM__OWNED_ACTIONS:
		case FsmPackage.FSM__OWNED_GUARDS:
		case FsmPackage.FSM__OWNED_MESSAGES:
		case FsmPackage.FSM__DATA_TYPES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(FsmPackage.Literals.FSM__OWNED_STATES, FsmFactory.eINSTANCE.createState()));

		newChildDescriptors
				.add(createChildParameter(FsmPackage.Literals.FSM__OWNED_EVENTS, FsmFactory.eINSTANCE.createEvent()));

		newChildDescriptors
				.add(createChildParameter(FsmPackage.Literals.FSM__OWNED_ACTIONS, FsmFactory.eINSTANCE.createAction()));

		newChildDescriptors
				.add(createChildParameter(FsmPackage.Literals.FSM__OWNED_GUARDS, FsmFactory.eINSTANCE.createGuard()));

		newChildDescriptors.add(
				createChildParameter(FsmPackage.Literals.FSM__OWNED_MESSAGES, FsmFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(FsmPackage.Literals.FSM__DATA_TYPES,
				FsmFactory.eINSTANCE.create(FsmPackage.Literals.STRING_TO_STRING_MAP)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FsmEditPlugin.INSTANCE;
	}

}
