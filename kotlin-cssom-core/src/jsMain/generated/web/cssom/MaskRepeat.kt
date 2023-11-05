// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MaskRepeat {
    companion object {
        @JsValue("no-repeat")
        val noRepeat: MaskRepeat

        @JsValue("repeat")
        val repeat: MaskRepeat

        @JsValue("repeat-x")
        val repeatX: MaskRepeat

        @JsValue("repeat-y")
        val repeatY: MaskRepeat

        @JsValue("round")
        val round: MaskRepeat

        @JsValue("space")
        val space: MaskRepeat
    }
}
