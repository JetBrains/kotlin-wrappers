// Automatically generated - do not modify!

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface InlayHintKind {
    companion object {
        @JsValue("Type")
        val Type: InlayHintKind

        @JsValue("Parameter")
        val Parameter: InlayHintKind

        @JsValue("Enum")
        val Enum: InlayHintKind
    }
}
