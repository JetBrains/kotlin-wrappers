// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.http

import js.buffer.ArrayBuffer
import js.promise.Promise
import js.typedarrays.Uint8Array
import web.buffer.Blob
import web.streams.ReadableStream

sealed external interface Body {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
    val body: ReadableStream<Uint8Array>?
        get() = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
    val bodyUsed: Boolean
        get() = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer) */
    fun arrayBuffer(): Promise<ArrayBuffer> = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob) */
    fun blob(): Promise<Blob> = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData) */
    fun formData(): Promise<FormData> = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json) */
    fun json(): Promise<*> = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text) */
    fun text(): Promise<String> = definedExternally
}
