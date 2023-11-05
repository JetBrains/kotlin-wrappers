// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MaskBorder {
    companion object {
        @JsValue("alpha")
        val alpha: MaskBorder

        @JsValue("luminance")
        val luminance: MaskBorder

        @JsValue("repeat")
        val repeat: MaskBorder

        @JsValue("round")
        val round: MaskBorder

        @JsValue("space")
        val space: MaskBorder

        @JsValue("stretch")
        val stretch: MaskBorder
    }
}
