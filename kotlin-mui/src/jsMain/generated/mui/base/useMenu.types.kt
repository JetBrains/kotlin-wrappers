// Automatically generated - do not modify!

package mui.base

external interface UseMenuParameters {
    var open: Boolean?

    var onClose: (() -> Unit)?

    var listboxId: String?

    var listboxRef: react.Ref<*>?
}

external interface UseMenuReturnValue {
    /**
     * The value for the menu context.
     */
    var contextValue: Any /* mui.base.MenuUnstyledContextType */

    /**
     * Resolver for the listbox component's props.
     * @param otherHandlers event handlers for the listbox component
     * @returns props that should be spread on the listbox component
     */
    var getListboxProps: Any /* <TOther extends EventHandlers>(otherHandlers?: TOther) => UseMenuListboxSlotProps */

    /**
     * The highlighted option in the menu listbox.
     */
    var highlightedOption: String?

    /**
     * Callback for highlighting the first item in the menu listbox.
     */
    var highlightFirstItem: () -> Unit

    /**
     * Callback for highlighting the last item in the menu listbox.
     */
    var highlightLastItem: () -> Unit

    /**
     * Items in the menu listbox.
     */
    var menuItems: Any /* Record<string, MenuItemMetadata> */
}
