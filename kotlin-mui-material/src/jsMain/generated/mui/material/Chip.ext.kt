// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface ChipColor {
    companion object {
        @JsValue("default")
        val default: ChipColor

        @JsValue("primary")
        val primary: ChipColor

        @JsValue("secondary")
        val secondary: ChipColor

        @JsValue("error")
        val error: ChipColor

        @JsValue("info")
        val info: ChipColor

        @JsValue("success")
        val success: ChipColor

        @JsValue("warning")
        val warning: ChipColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface ChipVariant {
    companion object {
        @JsValue("filled")
        val filled: ChipVariant

        @JsValue("outlined")
        val outlined: ChipVariant
    }
}
