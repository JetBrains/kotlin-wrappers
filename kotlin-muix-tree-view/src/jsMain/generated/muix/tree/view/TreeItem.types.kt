// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface TreeItemProps :
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
     * @default TreeItemContent
     */
    var ContentComponent: react.ComponentType<TreeItemContentProps>?

    /**
     * Props applied to ContentComponent.
     */
    var ContentProps: react.Props? /* React.HTMLAttributes<HTMLElement> & { ref?: React.Ref<HTMLElement>; } */

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
    override var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLLIElement>?

    /**
     * The tree item label.
     */
    var label: react.ReactNode?

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
    override var onKeyDown: react.dom.events.KeyboardEventHandler<web.html.HTMLLIElement>?
}

external interface TreeItemSlots {
    /**
     * The icon used to collapse the item.
     */
    var collapseIcon: react.ElementType<*>?

    /**
     * The icon used to expand the item.
     */
    var expandIcon: react.ElementType<*>?

    /**
     * The icon displayed next to an end item.
     */
    var endIcon: react.ElementType<*>?

    /**
     * The icon to display next to the tree item's label.
     */
    var icon: react.ElementType<*>?

    /**
     * The component that animates the appearance / disappearance of the item's children.
     * @default TreeItem2Group
     */
    var groupTransition: react.ElementType<*>?
}

external interface TreeItemSlotProps : react.Props {
    var collapseIcon: react.Props?

    var expandIcon: react.Props?

    var endIcon: react.Props?

    var icon: react.Props?

    var groupTransition: react.Props?
}

external interface TreeItemOwnerState {
    var expanded: Boolean

    var focused: Boolean

    var selected: Boolean

    var disabled: Boolean

    var indentationAtItemLevel: Boolean
}
