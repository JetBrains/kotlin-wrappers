// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed /* union */
external interface ChipColor {
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

sealed /* union */
external interface ChipVariant {
    companion object {
        @JsValue("filled")
        val filled: ChipVariant

        @JsValue("outlined")
        val outlined: ChipVariant
    }
}
