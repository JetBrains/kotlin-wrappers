// Automatically generated - do not modify!

package mui.base

external interface MenuItemMetadata {
    var id: String

    var disabled: Boolean

    var label: String?
}

external interface UseMenuItemParameters {
    var disabled: Boolean?

    var id: String?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var rootRef: react.Ref<web.dom.Element>

    var label: String?
}

external interface UseMenuItemReturnValue {
    /**
     * Resolver for the root slot's props.
     * @param otherHandlers event handlers for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseMenuItemRootSlotProps<TOther> */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * If `true`, the component is being focused using keyboard.
     */
    var focusVisible: Boolean

    /**
     * If `true`, the component is being highlighted.
     */
    var highlighted: Boolean

    /**
     * 0-based index of the item in the menu.
     */
    var index: Number

    /**
     * The ref to the component's root DOM element.
     */
    var rootRef: react.RefCallback<web.dom.Element>?

    /**
     * Total number of items in the menu.
     */
    var totalItemCount: Number
}
