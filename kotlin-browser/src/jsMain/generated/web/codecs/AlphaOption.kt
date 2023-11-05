// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AlphaOption {
    companion object {
        @JsValue("discard")
        val discard: AlphaOption

        @JsValue("keep")
        val keep: AlphaOption
    }
}
