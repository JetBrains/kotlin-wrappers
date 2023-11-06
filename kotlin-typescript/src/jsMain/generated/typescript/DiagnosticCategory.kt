// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface DiagnosticCategory {
    companion object {
        @JsIntValue(0)
        val Warning: DiagnosticCategory

        @JsIntValue(1)
        val Error: DiagnosticCategory

        @JsIntValue(2)
        val Suggestion: DiagnosticCategory

        @JsIntValue(3)
        val Message: DiagnosticCategory
    }
}
