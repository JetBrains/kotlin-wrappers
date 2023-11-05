// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface SpeakAs {
    companion object {
        @JsValue("bullets")
        val bullets: SpeakAs

        @JsValue("numbers")
        val numbers: SpeakAs

        @JsValue("spell-out")
        val spellOut: SpeakAs

        @JsValue("words")
        val words: SpeakAs
    }
}
