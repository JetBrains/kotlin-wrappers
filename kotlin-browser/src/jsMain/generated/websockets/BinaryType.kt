// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package websockets

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BinaryType {
    companion object {
        @JsValue("arraybuffer")
        val arraybuffer: BinaryType

        @JsValue("blob")
        val blob: BinaryType
    }
}
