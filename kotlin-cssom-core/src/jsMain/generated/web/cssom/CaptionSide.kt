// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CaptionSide {
    companion object {
        @JsValue("block-end")
        val blockEnd: CaptionSide

        @JsValue("block-start")
        val blockStart: CaptionSide

        @JsValue("bottom")
        val bottom: CaptionSide

        @JsValue("inline-end")
        val inlineEnd: CaptionSide

        @JsValue("inline-start")
        val inlineStart: CaptionSide

        @JsValue("top")
        val top: CaptionSide
    }
}
