@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsAny
import js.core.JsString
import js.core.JsUByte
import js.typedarrays.Uint8Array
import web.blob.Blob
import seskar.js.JsValue

sealed external interface OutputType<T : JsAny> {
    companion object {
        @JsValue("base64")
        val base64: OutputType<JsString>

        @JsValue("string")
        val string: OutputType<JsString>

        @JsValue("text")
        val text: OutputType<JsString>

        @JsValue("binarystring")
        val binarystring: OutputType<JsString>

        @JsValue("array")
        val array: OutputType<ReadonlyArray<JsUByte>>

        @JsValue("uint8array")
        val uint8array: OutputType<Uint8Array<*>>

        @JsValue("arraybuffer")
        val arraybuffer: OutputType<ArrayBuffer>

        @JsValue("blob")
        val blob: OutputType<Blob>
    }
}
