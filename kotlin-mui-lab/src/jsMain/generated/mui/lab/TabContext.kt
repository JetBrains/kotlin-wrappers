// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabContext")

package mui.lab

external interface TabContextProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * The value of the currently selected `Tab`.
     */
    var value: Any /* String or Number */
}

external interface TabContextValue {
    var idPrefix: String

    var value: String
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabContext API](https://mui.com/material-ui/api/tab-context/)
 */
@JsName("default")
external val TabContext: react.FC<TabContextProps>
