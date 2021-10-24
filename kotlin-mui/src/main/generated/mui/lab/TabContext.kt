// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabContext")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface TabContextProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * The value of the currently selected `Tab`.
     */
    var value: String
}

external interface TabContextValue {
    var idPrefix: String

    var value: String
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [TabContext API](https://mui.com/api/tab-context/)
 */
@JsName("default")
external val TabContext: react.FC<TabContextProps>
