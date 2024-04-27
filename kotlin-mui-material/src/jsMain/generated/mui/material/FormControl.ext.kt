// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FormControlColor {
    companion object {
        @JsValue("primary")
        val primary: FormControlColor

        @JsValue("secondary")
        val secondary: FormControlColor

        @JsValue("error")
        val error: FormControlColor

        @JsValue("info")
        val info: FormControlColor

        @JsValue("success")
        val success: FormControlColor

        @JsValue("warning")
        val warning: FormControlColor
    }
}

@JsVirtual
sealed external interface FormControlVariant {
    companion object {
        @JsValue("standard")
        val standard: FormControlVariant

        @JsValue("outlined")
        val outlined: FormControlVariant

        @JsValue("filled")
        val filled: FormControlVariant
    }
}

@JsVirtual
sealed external interface FormControlMargin {
    companion object {
        @JsValue("dense")
        val dense: FormControlMargin

        @JsValue("normal")
        val normal: FormControlMargin

        @JsValue("none")
        val none: FormControlMargin
    }
}
