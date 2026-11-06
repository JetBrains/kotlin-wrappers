// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import mui.system.Union
import react.*
import react.dom.aria.AriaChecked
import react.dom.events.ChangeEventHandler
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler
import react.dom.events.MouseEventHandler
import web.dom.Element
import web.dom.ElementId
import web.html.HTMLElement
import web.html.HTMLInputElement
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
    var itemId: TreeViewItemId

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

external interface UseTreeItemRootSlotPropsFromUseTreeItem : Props {
    var role: Union /* 'treeitem' */

    var tabIndex: Int

    var id: ElementId?

    @JsName("aria-expanded")
    var ariaExpanded: Boolean

    @JsName("aria-disabled")
    var ariaDisabled: Boolean

    var onFocus: FocusEventHandler<HTMLElement>

    var onBlur: FocusEventHandler<HTMLElement>

    var onKeyDown: KeyboardEventHandler<HTMLElement>

    var style: CSSProperties
}

external interface UseTreeItemRootSlotOwnProps :
    UseTreeItemRootSlotPropsFromUseTreeItem {
    @JsName("aria-checked")
    var ariaChecked: AriaChecked

    @JsName("aria-selected")
    var ariaSelected: Boolean
}

external interface UseTreeItemContentSlotPropsFromUseTreeItem : Props {
    var onClick: MouseEventHandler<Element>

    var onMouseDown: MouseEventHandler<Element>

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

external interface UseTreeItemContentSlotOwnProps : UseTreeItemContentSlotPropsFromUseTreeItem

external interface UseTreeItemIconContainerSlotOwnProps : Props {
    var onClick: MouseEventHandler<Element>
}

external interface UseTreeItemLabelSlotOwnProps : PropsWithChildren {
    override var children: ReactNode?

    var onDoubleClick: MouseEventHandler<Element>

    var editable: Boolean?
}

external interface UseTreeItemLabelInputSlotOwnProps : TreeItemLabelInputProps

external interface UseTreeItemCheckboxSlotOwnProps : Props {
    @JsName("aria-hidden")
    var ariaHidden: Boolean

    var visible: Boolean?

    var checked: Boolean?

    var indeterminate: Boolean?

    var disabled: Boolean?

    var tabIndex: Int? /* -1 */

    var onChange: ChangeEventHandler<HTMLInputElement, *>?
}

external interface UseTreeItemGroupTransitionSlotOwnProps : PropsWithChildren {
    var unmountOnExit: Boolean

    var `in`: Boolean

    var component: Union /* 'ul' */

    var role: Union /* 'group' */

    override var children: ReactNode?
}

external interface UseTreeItemDragAndDropOverlaySlotOwnProps : Props

@JsPlainObject
external interface UseTreeItemStatus {
    val expandable: Boolean

    val expanded: Boolean

    val focused: Boolean

    val selected: Boolean

    /**
     * `true` when the item is not selected but some of its selectable descendants are.
     */
    val indeterminate: Boolean?

    val disabled: Boolean

    val editing: Boolean

    val editable: Boolean

    val loading: Boolean

    val error: Boolean
}

@JsPlainObject
external interface UseTreeItemReturnValue {
    /**
     * Resolver for the context provider's props.
     * @returns {UseTreeItemContextProviderProps} Props that should be spread on the context provider slot.
     */
    val getContextProviderProps: () -> UseTreeItemContextProviderProps

    /**
     * Resolver for the root slot's props.
     * @param {ExternalProps} externalProps Additional props for the root slot.
     * @returns {UseTreeItemRootSlotProps<ExternalProps>} Props that should be spread on the root slot.
     */
    val getRootProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the content slot's props.
     * @param {ExternalProps} externalProps Additional props for the content slot.
     * @returns {UseTreeItemContentSlotProps<ExternalProps>} Props that should be spread on the content slot.
     */
    val getContentProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the label slot's props.
     * @param {ExternalProps} externalProps Additional props for the label slot.
     * @returns {UseTreeItemLabelSlotProps<ExternalProps>} Props that should be spread on the label slot.
     */
    val getLabelProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the labelInput slot's props.
     * @param {ExternalProps} externalProps Additional props for the labelInput slot.
     * @returns {UseTreeItemLabelInputSlotProps<ExternalProps>} Props that should be spread on the labelInput slot.
     */
    val getLabelInputProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the checkbox slot's props.
     * @param {ExternalProps} externalProps Additional props for the checkbox slot.
     * @returns {UseTreeItemCheckboxSlotProps<ExternalProps>} Props that should be spread on the checkbox slot.
     */
    val getCheckboxProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the iconContainer slot's props.
     * @param {ExternalProps} externalProps Additional props for the iconContainer slot.
     * @returns {UseTreeItemIconContainerSlotProps<ExternalProps>} Props that should be spread on the iconContainer slot.
     */
    val getIconContainerProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the GroupTransition slot's props.
     * @param {ExternalProps} externalProps Additional props for the GroupTransition slot.
     * @returns {UseTreeItemGroupTransitionSlotProps<ExternalProps>} Props that should be spread on the GroupTransition slot.
     */
    val getGroupTransitionProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the DragAndDropOverlay slot's props.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component.
     * @param {ExternalProps} externalProps Additional props for the DragAndDropOverlay slot.
     * @returns {UseTreeItemDragAndDropOverlaySlotProps<ExternalProps>} Props that should be spread on the DragAndDropOverlay slot.
     */
    val getDragAndDropOverlayProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the ErrorIcon slot's props.
     * Warning: This slot is only useful when using the `<RichTreeView />` component when lazy loading is enabled.
     * @param {ExternalProps} externalProps Additional props for the ErrorIcon slot.
     * @returns {UseTreeItemErrorContainerSlotProps<ExternalProps>} Props that should be spread on the ErrorIcon slot.
     */
    val getErrorContainerProps: (externalProps: Props?) -> Props

    /**
     * Resolver for the LoadingIcon slot's props.
     * Warning: This slot is only useful when using the `<RichTreeView />` component when lazy loading is enabled.
     * @param {ExternalProps} externalProps Additional props for the LoadingIcon slot.
     * @returns {UseTreeItemLoadingContainerSlotProps<ExternalProps>} Props that should be spread on the LoadingIcon slot.
     */
    val getLoadingContainerProps: (externalProps: Props?) -> Props

    /**
     * A ref to the component's root DOM element.
     */
    val rootRef: RefCallback<HTMLLIElement>?

    /**
     * Current status of the item.
     */
    val status: UseTreeItemStatus

    /**
     * The object the allows Tree View manipulation.
     */
    val publicAPI: TreeViewPublicAPI<*>
}
