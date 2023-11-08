// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TextJustify {
    companion object {
        @JsValue("inter-character")
        val interCharacter: TextJustify

        @JsValue("inter-word")
        val interWord: TextJustify
    }
}
