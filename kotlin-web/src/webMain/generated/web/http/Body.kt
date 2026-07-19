// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.http

import js.buffer.ArrayBuffer
import js.internal.InternalApi
import js.promise.Promise
import js.promise.await
import js.string.JsStrings.toKotlinString
import js.typedarrays.Uint8Array
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface Body {
    /**
     * The **`body`** read-only property of the Request interface contains a ReadableStream with the body contents that have been added to the request. Note that a request using the GET or HEAD method cannot have a body and null is returned in these cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body)
     */
    val body: ReadableStream<Uint8Array<ArrayBuffer>>?
        get() = definedExternally

    /**
     * The **`bodyUsed`** read-only property of the Request interface is a boolean value that indicates whether the request body has been read yet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed)
     */
    val bodyUsed: Boolean
        get() = definedExternally

    /**
     * The **`arrayBuffer()`** method of the Request interface reads the request body and returns it as a promise that resolves with an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
     */
    @JsName("arrayBuffer")
    fun arrayBufferAsync(): Promise<ArrayBuffer> = definedExternally

    /**
     * The **`blob()`** method of the Request interface reads the request body and returns it as a promise that resolves with a Blob.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
     */
    @JsName("blob")
    fun blobAsync(): Promise<Blob> = definedExternally

    /**
     * The **`bytes()`** method of the Request interface reads the request body and returns it as a promise that resolves with a Uint8Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
     */
    @JsName("bytes")
    fun bytesAsync(): Promise<Uint8Array<ArrayBuffer>> = definedExternally

    /**
     * The **`formData()`** method of the Request interface reads the request body and returns it as a promise that resolves with a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
     */
    @JsName("formData")
    fun formDataAsync(): Promise<FormData> = definedExternally

    /**
     * The **`json()`** method of the Request interface reads the request body and returns it as a promise that resolves with the result of parsing the body text as JSON.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
     */
    @JsName("json")
    fun jsonAsync(): Promise<*> = definedExternally

    /**
     * The **`text()`** method of the Request interface reads the request body and returns it as a promise that resolves with a String. The response is always decoded using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
     */
    @JsName("text")
    fun textAsync(): Promise<JsString> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/textStream)
     */
    fun textStream(): ReadableStream<JsString> = definedExternally
}

/**
 * The **`arrayBuffer()`** method of the Request interface reads the request body and returns it as a promise that resolves with an ArrayBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
 */
suspend inline fun Body.arrayBuffer(): ArrayBuffer {
    return arrayBufferAsync().await()
}

/**
 * The **`blob()`** method of the Request interface reads the request body and returns it as a promise that resolves with a Blob.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
 */
suspend inline fun Body.blob(): Blob {
    return blobAsync().await()
}

/**
 * The **`bytes()`** method of the Request interface reads the request body and returns it as a promise that resolves with a Uint8Array.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
 */
suspend inline fun Body.bytes(): Uint8Array<ArrayBuffer> {
    return bytesAsync().await()
}

/**
 * The **`formData()`** method of the Request interface reads the request body and returns it as a promise that resolves with a FormData object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
 */
suspend inline fun Body.formData(): FormData {
    return formDataAsync().await()
}

/**
 * The **`json()`** method of the Request interface reads the request body and returns it as a promise that resolves with the result of parsing the body text as JSON.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
 */
suspend inline fun Body.json(): JsAny? {
    return jsonAsync().await()
}

/**
 * The **`text()`** method of the Request interface reads the request body and returns it as a promise that resolves with a String. The response is always decoded using UTF-8.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
 */
suspend inline fun Body.text(): String {
    return textAsync().await().toKotlinString()
}
