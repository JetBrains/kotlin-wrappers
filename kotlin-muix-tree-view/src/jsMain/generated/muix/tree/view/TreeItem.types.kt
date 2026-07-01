// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.Props
import react.PropsWithClassName
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler
import web.cssom.ClassName
import web.html.HTMLLIElement

external interface TreeItemProps :
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
    var onBlur: Any? /* TreeViewCancellableEventHandler<React.FocusEvent<HTMLLIElement>> */

    /**
     * Callback fired when a key is pressed on the keyboard and the tree is in focus.
     */
    var onKeyDown: KeyboardEventHandler<HTMLLIElement>?
}

external interface TreeItemSlots : TreeItemIconSlots {
    /**
     * The component that renders the root.
     * @default TreeItemRoot
     */
    var root: ElementType<*>?

    /**
     * The component that renders the content of the item.
     * (e.g.: everything related to this item, not to its children).
     * @default TreeItemContent
     */
    var content: ElementType<*>?

    /**
     * The component that renders the children of the item.
     * @default TreeItemGroupTransition
     */
    var groupTransition: ElementType<*>?

    /**
     * The component that renders the icon.
     * @default TreeItemIconContainer
     */
    var iconContainer: ElementType<*>?

    /**
     * The component that renders the item checkbox for selection.
     * @default TreeItemCheckbox
     */
    var checkbox: ElementType<*>?

    /**
     * The component that renders the item label.
     * @default TreeItemLabel
     */
    var label: ElementType<*>?

    /**
     * The component that renders the input to edit the label when the item is editable and is currently being edited.
     * @default TreeItemLabelInput
     */
    var labelInput: ElementType<*>?

    /**
     * The component that renders the overlay when an item reordering is ongoing.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component.
     * @default TreeItemDragAndDropOverlay
     */
    var dragAndDropOverlay: ElementType<*>?

    /**
     * The component that is rendered when the item is in an error state.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component is lazy loading is enabled.
     * @default TreeItemErrorContainer
     */
    var errorIcon: ElementType<*>?

    /**
     * The component that is rendered when the item is in a loading state.
     * Warning: This slot is only useful when using the `<RichTreeViewPro />` component is lazy loading is enabled.
     * @default TreeItemLoadingContainer
     */
    var loadingIcon: ElementType<*>?
}

external interface TreeItemSlotProps :
    TreeItemIconSlotProps {
    var root: Props?

    var content: Props?

    var groupTransition: Props?

    var iconContainer: Props?

    var checkbox: Props?

    var label: Props?

    var labelInput: Props?

    var dragAndDropOverlay: Props?

    var errorIcon: Props?

    var loadingIcon: Props?
}

external interface TreeItemOwnerState
