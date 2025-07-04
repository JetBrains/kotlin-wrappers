// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.http

import js.buffer.ArrayBuffer
import js.core.JsAny
import js.core.JsString
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import js.typedarrays.Uint8Array
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream
import kotlin.js.JsName
import kotlin.js.definedExternally

sealed external interface Body {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body)
     */
    val body: ReadableStream<Uint8Array<ArrayBuffer>>?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed)
     */
    val bodyUsed: Boolean
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
     */
    @JsName("arrayBuffer")
    fun arrayBufferAsync(): Promise<ArrayBuffer> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
     */
    @JsName("blob")
    fun blobAsync(): Promise<Blob> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
     */
    @JsName("bytes")
    fun bytesAsync(): Promise<Uint8Array<ArrayBuffer>> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
     */
    @JsName("formData")
    fun formDataAsync(): Promise<FormData> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
     */
    @JsName("json")
    fun jsonAsync(): Promise<*> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
     */
    @JsName("text")
    fun textAsync(): Promise<JsString> = definedExternally
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
 */
suspend inline fun Body.arrayBuffer(): ArrayBuffer {
    return awaitPromiseLike(arrayBufferAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
 */
suspend inline fun Body.blob(): Blob {
    return awaitPromiseLike(blobAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
 */
suspend inline fun Body.bytes(): Uint8Array<ArrayBuffer> {
    return awaitPromiseLike(bytesAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
 */
suspend inline fun Body.formData(): FormData {
    return awaitPromiseLike(formDataAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
 */
suspend inline fun Body.json(): JsAny? {
    return awaitPromiseLike(jsonAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
 */
suspend inline fun Body.text(): String {
    return awaitPromiseLike(textAsync()).toString()
}
