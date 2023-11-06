// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
