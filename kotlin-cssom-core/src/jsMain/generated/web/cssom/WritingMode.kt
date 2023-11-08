// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WritingMode {
    companion object {
        @JsValue("horizontal-tb")
        val horizontalTb: WritingMode

        @JsValue("sideways-lr")
        val sidewaysLr: WritingMode

        @JsValue("sideways-rl")
        val sidewaysRl: WritingMode

        @JsValue("vertical-lr")
        val verticalLr: WritingMode

        @JsValue("vertical-rl")
        val verticalRl: WritingMode
    }
}
