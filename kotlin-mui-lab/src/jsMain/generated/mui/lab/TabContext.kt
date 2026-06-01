// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabContext")

package mui.lab

import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface TabContextProps : PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
 * - [Tabs](https://v6.mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabContext API](https://v6.mui.com/material-ui/api/tab-context/)
 */
@JsName("default")
external val TabContext: FC<TabContextProps>
