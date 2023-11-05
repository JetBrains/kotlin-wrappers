// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MaskMode {
    companion object {
        @JsValue("alpha")
        val alpha: MaskMode

        @JsValue("luminance")
        val luminance: MaskMode

        @JsValue("match-source")
        val matchSource: MaskMode
    }
}
