// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Granularity {
    companion object {
        @JsValue("grapheme")
        val grapheme: Granularity

        @JsValue("word")
        val word: Granularity

        @JsValue("sentence")
        val sentence: Granularity
    }
}
