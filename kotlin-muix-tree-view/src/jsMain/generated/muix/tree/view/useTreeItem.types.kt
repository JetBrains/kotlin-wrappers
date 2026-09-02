// Automatically generated - do not modify!

package muix.tree.view

import mui.system.Union
import react.*
import web.dom.ElementId
import web.html.HTMLLIElement

external interface UseTreeItemParameters : PropsWithChildren {
    /**
     * The id attribute of the item. If not provided, it will be generated.
     */
    var id: ElementId?

    /**
     * If `true`, the item is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the item cannot be selected.
     * @default false
     */
    var disableSelection: Boolean?

    /**
     * The id of the item.
     * Must be unique.
     */
    var itemId: String

    /**
     * The label of the item.
     */
    var label: ReactNode?

    var rootRef: Ref<HTMLLIElement>?

    /**
     * The content of the component.
     */
    override var children: ReactNode?
}

external interface UseTreeItemContextProviderProps : Props {
    var itemId: String

    var id: ElementId?
}

external interface UseTreeItemRootSlotPropsFromUseTreeItem {
    var role: Union /* 'treeitem' */

    var tabIndex: Int

    var id: ElementId?

    @JsName("aria-expanded")
    var ariaExpanded: Boolean

    @JsName("aria-disabled")
    var ariaDisabled: Boolean

    var onFocus: Any? /* TreeViewCancellableEventHandler<React.FocusEvent<HTMLElement>> */

    var onBlur: Any? /* TreeViewCancellableEventHandler<React.FocusEvent<HTMLElement>> */

    var onKeyDown: Any? /* TreeViewCancellableEventHandler<React.KeyboardEvent<HTMLElement>> */

    var style: CSSProperties
}

external interface UseTreeItemRootSlotOwnProps : Props

external interface UseTreeItemContentSlotPropsFromUseTreeItem {
    var onClick: Any? /* TreeViewCancellableEventHandler<React.MouseEvent> */

    var onMouseDown: Any? /* TreeViewCancellableEventHandler<React.MouseEvent> */

    @JsName("data-expanded")
    var dataExpanded: Union? /* '' */

    @JsName("data-selected")
    var dataSelected: Union? /* '' */

    @JsName("data-focused")
    var dataFocused: Union? /* '' */

    @JsName("data-disabled")
    var dataDisabled: Union? /* '' */

    @JsName("data-editing")
    var dataEditing: Union? /* '' */

    @JsName("data-editable")
    var dataEditable: Union? /* '' */
}

external interface UseTreeItemContentSlotOwnProps : Props

external interface UseTreeItemIconContainerSlotOwnProps : Props {
    var onClick: Any? /* TreeViewCancellableEventHandler<React.MouseEvent> */
}

external interface UseTreeItemLabelSlotOwnProps : PropsWithChildren {
    override var children: ReactNode?

    var onDoubleClick: Any? /* TreeViewCancellableEventHandler<React.MouseEvent> */
}

external interface UseTreeItemLabelInputSlotOwnProps : Props

external interface UseTreeItemCheckboxSlotOwnProps : Props {
    @JsName("aria-hidden")
    var ariaHidden: Boolean
}

external interface UseTreeItemGroupTransitionSlotOwnProps : PropsWithChildren {
    var unmountOnExit: Boolean

    var `in`: Boolean

    var component: Union /* 'ul' */

    var role: Union /* 'group' */

    override var children: ReactNode?
}

external interface UseTreeItemDragAndDropOverlaySlotOwnProps : Props

external interface UseTreeItemStatus {
    var expandable: Boolean

    var expanded: Boolean

    var focused: Boolean

    var selected: Boolean

    /**
     * `true` when the item is not selected but some of its selectable descendants are.
     */
    var indeterminate: Boolean?

    var disabled: Boolean

    var editing: Boolean

    var editable: Boolean

    var loading: Boolean

    var error: Boolean
}

external interface UseTreeItemReturnValue {
    /**
     * Resolver for the context provider's props.
     * @returns {UseTreeItemContextProviderProps} Props that should be spread on the context provider slot.
     */
    var getContextProviderProps: () -> UseTreeItemContextProviderProps

    /**
     * Resolver for the root slot's props.
     * @param {ExternalProps} externalProps Additional props for the root slot.
     * @returns {UseTreeItemRootSlotProps<ExternalProps>} Props that should be spread on the root slot.
     */
    var getRootProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the content slot's props.
     * @param {ExternalProps} externalProps Additional props for the content slot.
     * @returns {UseTreeItemContentSlotProps<ExternalProps>} Props that should be spread on the content slot.
     */
    var getContentProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the label slot's props.
     * @param {ExternalProps} externalProps Additional props for the label slot.
     * @returns {UseTreeItemLabelSlotProps<ExternalProps>} Props that should be spread on the label slot.
     */
    var getLabelProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the labelInput slot's props.
     * @param {ExternalProps} externalProps Additional props for the labelInput slot.
     * @returns {UseTreeItemLabelInputSlotProps<ExternalProps>} Props that should be spread on the labelInput slot.
     */
    var getLabelInputProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the checkbox slot's props.
     * @param {ExternalProps} externalProps Additional props for the checkbox slot.
     * @returns {UseTreeItemCheckboxSlotProps<ExternalProps>} Props that should be spread on the checkbox slot.
     */
    var getCheckboxProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the iconContainer slot's props.
     * @param {ExternalProps} externalProps Additional props for the iconContainer slot.
     * @returns {UseTreeItemIconContainerSlotProps<ExternalProps>} Props that should be spread on the iconContainer slot.
     */
    var getIconContainerProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the GroupTransition slot's props.
     * @param {ExternalProps} externalProps Additional props for the GroupTransition slot.
     * @returns {UseTreeItemGroupTransitionSlotProps<ExternalProps>} Props that should be spread on the GroupTransition slot.
     */
    var getGroupTransitionProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the DragAndDropOverlay slot's props.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component.
     * @param {ExternalProps} externalProps Additional props for the DragAndDropOverlay slot.
     * @returns {UseTreeItemDragAndDropOverlaySlotProps<ExternalProps>} Props that should be spread on the DragAndDropOverlay slot.
     */
    var getDragAndDropOverlayProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the ErrorIcon slot's props.
     * Warning: This slot is only useful when using the `<RichTreeView />` component when lazy loading is enabled.
     * @param {ExternalProps} externalProps Additional props for the ErrorIcon slot.
     * @returns {UseTreeItemErrorContainerSlotProps<ExternalProps>} Props that should be spread on the ErrorIcon slot.
     */
    var getErrorContainerProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the LoadingIcon slot's props.
     * Warning: This slot is only useful when using the `<RichTreeView />` component when lazy loading is enabled.
     * @param {ExternalProps} externalProps Additional props for the LoadingIcon slot.
     * @returns {UseTreeItemLoadingContainerSlotProps<ExternalProps>} Props that should be spread on the LoadingIcon slot.
     */
    var getLoadingContainerProps: (externalProps: Props?) -> Props

    /**
     * A ref to the component's root DOM element.
     */
    var rootRef: RefCallback<HTMLLIElement>?

    /**
     * Current status of the item.
     */
    var status: Any? /* UseTreeItemStatus */

    /**
     * The object the allows Tree View manipulation.
     */
    var publicAPI: Any? /* TreeViewPublicAPI<TStore> */
}
