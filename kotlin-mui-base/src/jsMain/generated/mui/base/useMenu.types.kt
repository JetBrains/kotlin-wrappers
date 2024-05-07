// Automatically generated - do not modify!

package mui.base

import js.array.ReadonlyArray
import web.dom.Element
import web.html.HTMLElement

external interface UseMenuParameters {
    /**
     * If `true` (Default) will focus the highligted item. If you set this prop to `false`
     * the focus will not be moved inside the Menu component. This has severe accessibility implications
     * and should only be considered if you manage focus otherwise.
     * @default true
     */
    var autoFocus: Boolean?

    /**
     * The id of the menu. If not provided, it will be generated.
     */
    var id: String?

    /**
     * If `true`, it will be possible to highlight disabled items.
     * @default true
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true`, the highlight will not wrap around the list if arrow keys are used.
     * @default false
     */
    var disableListWrap: Boolean?

    /**
     * Callback fired when the menu items change.
     */
    var onItemsChange: ((items: ReadonlyArray<String>) -> Unit)?

    /**
     * The ref to the menu's listbox node.
     */
    var listboxRef: react.Ref<Element>?

    /**
     * The name of the component using useMenu.
     * For debugging purposes.
     * @default 'useMenu'
     */
    var componentName: String?
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
    var dispatch: (action: Any /* ListAction<String> */) -> Unit

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
    var listboxRef: react.RefCallback<Element>?

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
    var triggerElement: HTMLElement?
}
