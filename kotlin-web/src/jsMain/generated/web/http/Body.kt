// Automatically generated - do not modify!

package web.http

import js.buffer.ArrayBuffer
import js.promise.Promise
import js.typedarrays.Uint8Array
import web.buffer.Blob
import web.streams.ReadableStream

@JsName("Object")
sealed external class /* interface */ Body {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
    val body: ReadableStream<Uint8Array>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
    val bodyUsed: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer) */
    fun arrayBuffer(): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob) */
    fun blob(): Promise<Blob>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData) */
    fun formData(): Promise<FormData>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json) */
    fun json(): Promise<*>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text) */
    fun text(): Promise<String>
}
