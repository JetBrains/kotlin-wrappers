// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface SemanticClassificationFormat {
    companion object {
        @JsValue("original")
        val Original: SemanticClassificationFormat

        @JsValue("2020")
        val TwentyTwenty: SemanticClassificationFormat
    }
}
