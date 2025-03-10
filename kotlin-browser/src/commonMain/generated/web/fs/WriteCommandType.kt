// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.fs

import seskar.js.JsValue

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
