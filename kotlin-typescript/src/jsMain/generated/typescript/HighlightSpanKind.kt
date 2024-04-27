// Automatically generated - do not modify!

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface HighlightSpanKind {
    companion object {
        @JsValue("none")
        val none: HighlightSpanKind

        @JsValue("definition")
        val definition: HighlightSpanKind

        @JsValue("reference")
        val reference: HighlightSpanKind

        @JsValue("writtenReference")
        val writtenReference: HighlightSpanKind
    }
}
