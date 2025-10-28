// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.http

import js.buffer.ArrayBuffer
import js.core.JsPrimitives.toKotlinString
import js.promise.Promise
import js.promise.await
import js.typedarrays.Uint8Array
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream
import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally

/* mixin */
sealed
external interface Body {
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
    return arrayBufferAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
 */
suspend inline fun Body.blob(): Blob {
    return blobAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
 */
suspend inline fun Body.bytes(): Uint8Array<ArrayBuffer> {
    return bytesAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
 */
suspend inline fun Body.formData(): FormData {
    return formDataAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
 */
suspend inline fun Body.json(): JsAny? {
    return jsonAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
 */
suspend inline fun Body.text(): String {
    return textAsync().await().toKotlinString()
}
