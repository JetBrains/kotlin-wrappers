// Automatically generated - do not modify!

package web.sockets

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
