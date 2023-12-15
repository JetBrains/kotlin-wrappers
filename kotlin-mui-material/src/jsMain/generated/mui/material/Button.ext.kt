// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface ButtonColor {
    companion object {
        @JsValue("inherit")
        val inherit: ButtonColor

        @JsValue("primary")
        val primary: ButtonColor

        @JsValue("secondary")
        val secondary: ButtonColor

        @JsValue("success")
        val success: ButtonColor

        @JsValue("error")
        val error: ButtonColor

        @JsValue("info")
        val info: ButtonColor

        @JsValue("warning")
        val warning: ButtonColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface ButtonVariant {
    companion object {
        @JsValue("text")
        val text: ButtonVariant

        @JsValue("outlined")
        val outlined: ButtonVariant

        @JsValue("contained")
        val contained: ButtonVariant
    }
}
