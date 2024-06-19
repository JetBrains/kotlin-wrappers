// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

sealed external interface LanguageServiceMode {
    companion object {
        @JsIntValue(0)
        val Semantic: LanguageServiceMode

        @JsIntValue(1)
        val PartialSemantic: LanguageServiceMode

        @JsIntValue(2)
        val Syntactic: LanguageServiceMode
    }
}
