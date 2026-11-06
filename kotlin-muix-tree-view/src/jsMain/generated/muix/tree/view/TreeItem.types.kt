// Automatically generated - do not modify!

package muix.tree.view

import kotlinx.js.JsPlainObject
import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.Props
import react.PropsWithClassName
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler
import react.dom.html.HTMLAttributes
import react.dom.html.InputHTMLAttributes
import react.dom.html.LiHTMLAttributes
import web.cssom.ClassName
import web.html.HTMLDivElement
import web.html.HTMLInputElement
import web.html.HTMLLIElement

external interface TreeItemProps :
    UseTreeItemParameters,
    PropsWithClassName,
    PropsWithSx {
    override var className: ClassName?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeItemClasses?

    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: TreeItemSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: TreeItemSlotProps?

    /**
     * This prop isn't supported.
     * Use the `onItemFocus` callback on the tree if you need to monitor an item's focus.
     */
    @Deprecated("See documentation")
    var onFocus: FocusEventHandler<HTMLLIElement>?

    /**
     * Callback fired when the item root is blurred.
     */
    var onBlur: FocusEventHandler<HTMLLIElement>?

    /**
     * Callback fired when a key is pressed on the keyboard and the tree is in focus.
     */
    var onKeyDown: KeyboardEventHandler<HTMLLIElement>?
}

@JsPlainObject
external interface TreeItemSlots : TreeItemIconSlots {
    /**
     * The component that renders the root.
     * @default TreeItemRoot
     */
    val root: ElementType<*>?

    /**
     * The component that renders the content of the item.
     * (e.g.: everything related to this item, not to its children).
     * @default TreeItemContent
     */
    val content: ElementType<*>?

    /**
     * The component that renders the children of the item.
     * @default TreeItemGroupTransition
     */
    val groupTransition: ElementType<*>?

    /**
     * The component that renders the icon.
     * @default TreeItemIconContainer
     */
    val iconContainer: ElementType<*>?

    /**
     * The component that renders the item checkbox for selection.
     * @default TreeItemCheckbox
     */
    val checkbox: ElementType<*>?

    /**
     * The component that renders the item label.
     * @default TreeItemLabel
     */
    val label: ElementType<*>?

    /**
     * The component that renders the input to edit the label when the item is editable and is currently being edited.
     * @default TreeItemLabelInput
     */
    val labelInput: ElementType<*>?

    /**
     * The component that renders the overlay when an item reordering is ongoing.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component.
     * @default TreeItemDragAndDropOverlay
     */
    val dragAndDropOverlay: ElementType<*>?

    /**
     * The component that is rendered when the item is in an error state.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component is lazy loading is enabled.
     * @default TreeItemErrorContainer
     */
    val errorIcon: ElementType<*>?

    /**
     * The component that is rendered when the item is in a loading state.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component is lazy loading is enabled.
     * @default TreeItemLoadingContainer
     */
    val loadingIcon: ElementType<*>?
}

external interface TreeItemSlotProps :
    TreeItemIconSlotProps {
    var root: LiHTMLAttributes<HTMLLIElement>?

    var content: HTMLAttributes<HTMLDivElement>?

    var groupTransition: TransitionProps?

    var iconContainer: HTMLAttributes<HTMLDivElement>?

    var checkbox: Props?

    var label: HTMLAttributes<HTMLDivElement>?

    var labelInput: InputHTMLAttributes<HTMLInputElement>?

    var dragAndDropOverlay: HTMLAttributes<HTMLDivElement>?

    var errorIcon: HTMLAttributes<HTMLDivElement>?

    var loadingIcon: HTMLAttributes<HTMLDivElement>?
}

@JsPlainObject
external interface TreeItemOwnerState
