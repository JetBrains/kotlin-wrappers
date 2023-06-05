// Automatically generated - do not modify!

package mui.base

external interface UseMenuItemParameters {
    var disabled: Boolean?

    var onClick: react.dom.events.MouseEventHandler<*>?

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
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the component is being focused using keyboard.
     * @default false
     */
    var focusVisible: Boolean

    /**
     * If `true`, the component is being highlighted.
     * @default false
     */
    var highlighted: Boolean
}
