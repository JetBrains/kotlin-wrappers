// Automatically generated - do not modify!

package web.blob

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.Int53
import js.core.JsString
import js.promise.Promise
import js.typedarrays.Uint8Array
import seskar.js.JsAsync
import web.images.ImageBitmapSource
import web.streams.ReadableStream
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
 */
open external class Blob(
    blobParts: ReadonlyArray<BlobPart> = definedExternally,
    options: BlobPropertyBag = definedExternally,
) : ImageBitmapSource {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size)
     */
    val size: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type)
     */
    val type: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun arrayBuffer(): ArrayBuffer

    @JsName("arrayBuffer")
    fun arrayBufferAsync(): Promise<ArrayBuffer>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/bytes)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun bytes(): Uint8Array<*>

    @JsName("bytes")
    fun bytesAsync(): Promise<Uint8Array<*>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice)
     */
    fun slice(
        start: Int53 = definedExternally,
        end: Int53 = definedExternally,
        contentType: String = definedExternally,
    ): Blob

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream)
     */
    fun stream(): ReadableStream<Uint8Array<*>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun text(): String

    @JsName("text")
    fun textAsync(): Promise<JsString>
}
