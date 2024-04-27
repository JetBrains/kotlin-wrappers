// Automatically generated - do not modify!

package web.fs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
