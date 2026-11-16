// Automatically generated - do not modify!

package mui.material

import seskar.js.JsRawValue
import seskar.js.JsValue

sealed /* union */
external interface TabsVariant {
    companion object {
        @JsValue("standard")
        val standard: TabsVariant

        @JsValue("scrollable")
        val scrollable: TabsVariant

        @JsValue("fullWidth")
        val fullWidth: TabsVariant
    }
}

sealed /* union */
external interface TabsIndicatorColor {
    companion object {
        @JsValue("secondary")
        val secondary: TabsIndicatorColor

        @JsValue("primary")
        val primary: TabsIndicatorColor
    }
}

sealed /* union */
external interface TabsTextColor {
    companion object {
        @JsValue("secondary")
        val secondary: TabsTextColor

        @JsValue("primary")
        val primary: TabsTextColor

        @JsValue("inherit")
        val inherit: TabsTextColor
    }
}

sealed /* union */
external interface TabsScrollButtons {
    companion object {
        @JsValue("auto")
        val auto: TabsScrollButtons

        @JsRawValue("true")
        val `true`: TabsScrollButtons

        @JsRawValue("false")
        val `false`: TabsScrollButtons
    }
}
