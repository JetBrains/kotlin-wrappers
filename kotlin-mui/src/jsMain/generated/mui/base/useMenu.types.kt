// Automatically generated - do not modify!

package mui.base

external interface UseMenuParameters {
    /**
     * If `true`, the menu will be initially open.
     * @default false
     */
    var defaultOpen: Boolean?

    /**
     * If `true`, the menu will be open.
     * This is the controlled equivalent of the `defaultOpen` parameter.
     */
    var open: Boolean?

    /**
     * Callback fired when the menu is opened or closed.
     */
    var onOpenChange: ((open: Boolean) -> Unit)?

    /**
     * Id of the menu listbox.
     */
    var listboxId: String?

    /**
     * Ref of the menu listbox.
     */
    var listboxRef: react.Ref<web.html.HTMLElement>?
}

external interface UseMenuReturnValue {
    /**
     * The value to be passed into the MenuProvider.
     */
    var contextValue: dynamic

    /**
     * Action dispatcher for the menu component.
     * Allows to programmatically control the menu.
     */
    var dispatch: (action: Any /* ListAction<string> */) -> Unit

    /**
     * Resolver for the listbox component's props.
     * @param otherHandlers event handlers for the listbox component
     * @returns props that should be spread on the listbox component
     */
    var getListboxProps: Any /* <TOther extends EventHandlers>(otherHandlers?: TOther) => UseMenuListboxSlotProps */

    /**
     * The highlighted option in the menu listbox.
     */
    var highlightedValue: String?

    /**
     * The ref to the listbox DOM node.
     */
    var listboxRef: react.RefCallback<web.html.HTMLElement>?

    /**
     * Items in the menu listbox.
     */
    var menuItems: dynamic

    /**
     * If `true`, the menu is open.
     */
    var open: Boolean
}

external interface MenuInternalState {
    /**
     * If `true`, the menu is open.
     */
    var open: Boolean
}
