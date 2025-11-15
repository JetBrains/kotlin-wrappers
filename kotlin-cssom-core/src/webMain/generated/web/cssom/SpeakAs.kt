// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface SpeakAs {
    companion object {
        @JsValue("digits")
        val digits: SpeakAs

        @JsValue("literal-punctuation")
        val literalPunctuation: SpeakAs

        @JsValue("no-punctuation")
        val noPunctuation: SpeakAs

        @JsValue("normal")
        val normal: SpeakAs

        @JsValue("spell-out")
        val spellOut: SpeakAs
    }
}
