// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.http

import js.buffer.ArrayBuffer
import js.core.JsString
import js.promise.Promise
import js.typedarrays.Uint8Array
import seskar.js.JsAsync
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream

sealed external interface Body {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body)
     */
    val body: ReadableStream<Uint8Array<*>>?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed)
     */
    val bodyUsed: Boolean
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun arrayBuffer(): ArrayBuffer = definedExternally

    @JsName("arrayBuffer")
    fun arrayBufferAsync(): Promise<ArrayBuffer> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun blob(): Blob = definedExternally

    @JsName("blob")
    fun blobAsync(): Promise<Blob> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun bytes(): Uint8Array<*> = definedExternally

    @JsName("bytes")
    fun bytesAsync(): Promise<Uint8Array<*>> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun formData(): FormData = definedExternally

    @JsName("formData")
    fun formDataAsync(): Promise<FormData> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun json(): Any? = definedExternally

    @JsName("json")
    fun jsonAsync(): Promise<*> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun text(): String = definedExternally

    @JsName("text")
    fun textAsync(): Promise<JsString> = definedExternally
}
