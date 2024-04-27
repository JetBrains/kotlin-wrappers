// Automatically generated - do not modify!

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
