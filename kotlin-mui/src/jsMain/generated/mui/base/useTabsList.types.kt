// Automatically generated - do not modify!

package mui.base

external interface UseTabsListParameters {
    /**
     * Ref to the root element.
     */

}

external interface UseTabsListReturnValue {
    /**
     * Action dispatcher for the tabs list component.
     * Allows to programmatically control the tabs list.
     */
    var dispatch: (action: Any /* ListAction<string | number> */) -> Unit

    /**
     * The value of the currently highlighted tab.
     */
    var highlightedValue: Any /* String or Number */

    /**
     * If `true`, it will indicate that the text's direction in right-to-left.
     * @default false
     */
    var isRtl: Boolean

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation

    /**
     * The value of the currently selected tab.
     */
    var selectedValue: Any /* String or Number */

    /**
     * Resolver for the root slot's props.
     * @param externalProps props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends Record<string, any> = {}>(externalProps?: TOther) => UseTabsListRootSlotProps<TOther> */

    /**
     * The value to be passed to the TabListProvider above all the tabs.
     */
    var contextValue: dynamic
}

external interface ValueChangeAction {
    var type: dynamic

    var value: Any /* String or Number */
}
