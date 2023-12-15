// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface AlertColor {
    companion object {
        @JsValue("success")
        val success: AlertColor

        @JsValue("info")
        val info: AlertColor

        @JsValue("warning")
        val warning: AlertColor

        @JsValue("error")
        val error: AlertColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface AlertVariant {
    companion object {
        @JsValue("standard")
        val standard: AlertVariant

        @JsValue("filled")
        val filled: AlertVariant

        @JsValue("outlined")
        val outlined: AlertVariant
    }
}
