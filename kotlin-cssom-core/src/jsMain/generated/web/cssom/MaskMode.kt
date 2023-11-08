// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
