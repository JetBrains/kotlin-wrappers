// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.filesystem

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WriteCommandType {
    companion object {
        @JsValue("seek")
        val seek: WriteCommandType

        @JsValue("truncate")
        val truncate: WriteCommandType

        @JsValue("write")
        val write: WriteCommandType
    }
}
