/**
 */
package crystal.provider;


import crystal.CrystalFactory;
import crystal.CrystalPackage;
import crystal.Options;

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
 * This is the item provider adapter for a {@link crystal.Options} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsItemProvider(AdapterFactory adapterFactory) {
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

			addClassNamePropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Options_className_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Options_className_feature", "_UI_Options_type"),
				 CrystalPackage.Literals.OPTIONS__CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Options_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Options_condition_feature", "_UI_Options_type"),
				 CrystalPackage.Literals.OPTIONS__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Options_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Options_description_feature", "_UI_Options_type"),
				 CrystalPackage.Literals.OPTIONS__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS);
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
	 * This returns Options.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Options"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Options)object).getClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_Options_type") :
			getString("_UI_Options_type") + " " + label;
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

		switch (notification.getFeatureID(Options.class)) {
			case CrystalPackage.OPTIONS__CLASS_NAME:
			case CrystalPackage.OPTIONS__CONDITION:
			case CrystalPackage.OPTIONS__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CrystalPackage.OPTIONS__CASE_STATEMENTS:
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

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createInsert()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createFor()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createOpen()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createFetch()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createClose()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createCallProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CrystalPackage.Literals.OPTIONS__CASE_STATEMENTS,
				 CrystalFactory.eINSTANCE.createCallFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CrystalEditPlugin.INSTANCE;
	}

}
