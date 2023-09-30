// Automatically generated - do not modify!

package mui.base

external interface UseTabPanelParameters {
    /**
     * The id of the TabPanel.
     */
    var id: String?

    /**
     * The ref of the TabPanel.
     */
    var rootRef: react.Ref<web.html.HTMLElement>?

    /**
     * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
     */
    var value: dynamic
}

external interface UseTabPanelRootSlotProps : react.Props {
    // var `aria-labelledby`: String?

    var hidden: Boolean?

    var id: String?
}

external interface UseTabPanelReturnValue {
    /**
     * If `true`, it indicates that the tab panel will be hidden.
     */
    var hidden: Boolean

    /**
     * Resolver for the root slot's props.
     * @returns props that should be spread on the root slot
     */
    var getRootProps: () -> UseTabPanelRootSlotProps

    var rootRef: react.Ref<web.html.HTMLElement>
}
