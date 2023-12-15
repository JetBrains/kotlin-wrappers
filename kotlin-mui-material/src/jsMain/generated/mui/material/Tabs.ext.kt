// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface TabsVariant {
    companion object {
        @JsValue("standard")
        val standard: TabsVariant

        @JsValue("scrollable")
        val scrollable: TabsVariant

        @JsValue("fullWidth")
        val fullWidth: TabsVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface TabsIndicatorColor {
    companion object {
        @JsValue("secondary")
        val secondary: TabsIndicatorColor

        @JsValue("primary")
        val primary: TabsIndicatorColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface TabsTextColor {
    companion object {
        @JsValue("secondary")
        val secondary: TabsTextColor

        @JsValue("primary")
        val primary: TabsTextColor

        @JsValue("inherit")
        val inherit: TabsTextColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface TabsScrollButtons {
    companion object {
        @JsValue("auto")
        val auto: TabsScrollButtons

        @JsValue("`true`")
        val `true`: TabsScrollButtons

        @JsValue("`false`")
        val `false`: TabsScrollButtons
    }
}
