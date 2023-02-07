// Automatically generated - do not modify!

package web.http

import js.buffer.ArrayBuffer
import js.typedarrays.Uint8Array
import web.buffer.Blob
import web.streams.ReadableStream
import kotlin.js.Promise

@JsName("Object")
sealed external class /* interface */ Body {
    val body: ReadableStream<Uint8Array>?
    val bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<*>
    fun text(): Promise<String>
}
