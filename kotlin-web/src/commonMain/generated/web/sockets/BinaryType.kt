// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.sockets

import seskar.js.JsValue

sealed external interface BinaryType {
    companion object {
        @JsValue("arraybuffer")
        val arraybuffer: BinaryType

        @JsValue("blob")
        val blob: BinaryType
    }
}
