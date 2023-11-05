// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MaskBorderRepeat {
    companion object {
        @JsValue("repeat")
        val repeat: MaskBorderRepeat

        @JsValue("round")
        val round: MaskBorderRepeat

        @JsValue("space")
        val space: MaskBorderRepeat

        @JsValue("stretch")
        val stretch: MaskBorderRepeat
    }
}
