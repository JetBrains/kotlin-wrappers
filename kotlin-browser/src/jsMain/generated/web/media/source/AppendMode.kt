// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.source

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AppendMode {
    companion object {
        @JsValue("segments")
        val segments: AppendMode

        @JsValue("sequence")
        val sequence: AppendMode
    }
}
