// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.*
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLElement
import web.html.HTMLLIElement

external interface TreeItemProps :
    HTMLAttributes<HTMLLIElement>,
    PropsWithChildren,
    PropsWithClassName,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    override var className: ClassName?

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
     * The component used to render the content of the item.
     * @deprecated Consider using the `<TreeItem2 />` component or the `useTreeItem2` hook instead. For more details, see https://mui.com/x/react-tree-view/tree-item-customization/.
     * @default TreeItemContent
     */
    var ContentComponent: ComponentType<TreeItemContentProps>?

    /**
     * Props applied to ContentComponent.
     * @deprecated Consider using the `<TreeItem2 />` component or the `useTreeItem2` hook instead. For more details, see https://mui.com/x/react-tree-view/tree-item-customization/.
     */
    var ContentProps: HTMLAttributes<HTMLElement>?

    /**
     * If `true`, the item is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * This prop isn't supported.
     * Use the `onItemFocus` callback on the tree if you need to monitor a item's focus.
     */
    @Deprecated("See documentation")
    override var onFocus: FocusEventHandler<HTMLLIElement>?

    /**
     * The Tree Item label.
     */
    var label: ReactNode?

    /**
     * The id of the item.
     */
    var itemId: String

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Callback fired when a key of the keyboard is pressed on the item.
     */
    override var onKeyDown: KeyboardEventHandler<HTMLLIElement>?
}

external interface TreeItemSlots {
    /**
     * The icon used to collapse the item.
     */
    var collapseIcon: ElementType<*>?

    /**
     * The icon used to expand the item.
     */
    var expandIcon: ElementType<*>?

    /**
     * The icon displayed next to an end item.
     */
    var endIcon: ElementType<*>?

    /**
     * The icon to display next to the Tree Item's label.
     */
    var icon: ElementType<*>?

    /**
     * The component that animates the appearance / disappearance of the item's children.
     * @default TreeItem2Group
     */
    var groupTransition: ElementType<*>?
}

external interface TreeItemSlotProps : Props {
    var collapseIcon: Props?

    var expandIcon: Props?

    var endIcon: Props?

    var icon: Props?

    var groupTransition: Props?
}

external interface TreeItemOwnerState : TreeItemProps {
    var expanded: Boolean

    var focused: Boolean

    var selected: Boolean

    override var disabled: Boolean?

    var indentationAtItemLevel: Boolean
}
