// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WordBreak {
    companion object {
        @JsValue("break-all")
        val breakAll: WordBreak

        @JsValue("break-word")
        val breakWord: WordBreak

        @JsValue("keep-all")
        val keepAll: WordBreak

        @JsValue("normal")
        val normal: WordBreak
    }
}
