// Automatically generated - do not modify!

package mui.base

external interface TabsUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface TabsUnstyledOwnProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The value of the currently selected `Tab`.
     * If you don't want any selected `Tab`, you can set this prop to `false`.
     */
    var value: dynamic

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: dynamic

    /**
     * The component orientation (layout flow direction).
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation?

    /**
     * The direction of the text.
     * @default 'ltr'
     */
    var direction: TabsUnstyledDirection?

    var className: String?

    /**
     * The components used for each slot inside the Tabs.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Tabs.
     * @default {}
     */
    var componentsProps: dynamic

    /**
     * Callback invoked when new value is being set.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * If `true` the selected tab changes on focus. Otherwise it only
     * changes on activation.
     */
    var selectionFollowsFocus: Boolean?
}
