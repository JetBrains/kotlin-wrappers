// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface CircularProgressColor {
    companion object {
        @JsValue("primary")
        val primary: CircularProgressColor

        @JsValue("secondary")
        val secondary: CircularProgressColor

        @JsValue("error")
        val error: CircularProgressColor

        @JsValue("info")
        val info: CircularProgressColor

        @JsValue("success")
        val success: CircularProgressColor

        @JsValue("warning")
        val warning: CircularProgressColor

        @JsValue("inherit")
        val inherit: CircularProgressColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface CircularProgressVariant {
    companion object {
        @JsValue("determinate")
        val determinate: CircularProgressVariant

        @JsValue("indeterminate")
        val indeterminate: CircularProgressVariant
    }
}
