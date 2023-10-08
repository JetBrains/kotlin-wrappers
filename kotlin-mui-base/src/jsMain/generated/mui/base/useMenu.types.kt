// Automatically generated - do not modify!

package mui.base

import js.core.ReadonlyArray

external interface UseMenuParameters {
    /**
     * The id of the menu. If not provided, it will be generated.
     */
    var id: String?

    /**
     * Callback fired when the menu items change.
     */
    var onItemsChange: ((items: ReadonlyArray<String>) -> Unit)?

    /**
     * The ref to the menu's listbox node.
     */
    var listboxRef: react.Ref<web.dom.Element>?
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
     * Resolver for the listbox slot's props.
     * @param externalProps additional props for the listbox component
     * @returns props that should be spread on the listbox component
     */
    var getListboxProps: Any /* <ExternalProps extends Record<string, unknown> = {}>(externalProps?: ExternalProps) => UseMenuListboxSlotProps */

    /**
     * The highlighted option in the menu listbox.
     */
    var highlightedValue: String?

    /**
     * The ref to the menu's listbox node.
     */
    var listboxRef: react.RefCallback<web.dom.Element>?

    /**
     * Items in the menu listbox.
     */
    var menuItems: dynamic

    /**
     * If `true`, the menu is open.
     */
    var open: Boolean

    /**
     * An element that triggers the visibility of the menu.
     */
    var triggerElement: web.html.HTMLElement?
}
