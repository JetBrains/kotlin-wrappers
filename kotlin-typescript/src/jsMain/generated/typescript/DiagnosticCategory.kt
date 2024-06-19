// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

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
