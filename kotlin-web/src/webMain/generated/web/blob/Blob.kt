// Automatically generated - do not modify!

package web.blob

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.Int53
import js.core.UInt53
import js.promise.Promise
import js.promise.await
import js.serialization.Serializable
import js.typedarrays.Uint8Array
import web.images.ImageBitmapSource
import web.streams.ReadableStream
import kotlin.String
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`Blob`** interface represents a blob, which is a file-like object of immutable, raw data; they can be read as text or binary data, or converted into a ReadableStream so its methods can be used for processing the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
 */
open external class Blob(
    blobParts: ReadonlyArray<BlobPart> = definedExternally,
    options: BlobPropertyBag = definedExternally,
) : ImageBitmapSource,
    Serializable {
    /**
     * The **`size`** read-only property of the Blob interface returns the size of the Blob or File in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size)
     */
    val size: UInt53

    /**
     * The **`type`** read-only property of the Blob interface returns the MIME type of the file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type)
     */
    val type: String

    /**
     * The **`arrayBuffer()`** method of the Blob interface returns a Promise that resolves with the contents of the blob as binary data contained in an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
     */
    @JsName("arrayBuffer")
    fun arrayBufferAsync(): Promise<ArrayBuffer>

    /**
     * The **`bytes()`** method of the Blob interface returns a Promise that resolves with a Uint8Array containing the contents of the blob as an array of bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/bytes)
     */
    @JsName("bytes")
    fun bytesAsync(): Promise<Uint8Array<ArrayBuffer>>

    /**
     * The **`slice()`** method of the Blob interface creates and returns a new `Blob` object which contains data from a subset of the blob on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice)
     */
    fun slice(
        start: Int53 = definedExternally,
        end: Int53 = definedExternally,
        contentType: String = definedExternally,
    ): Blob

    /**
     * The **`stream()`** method of the Blob interface returns a ReadableStream which upon reading returns the data contained within the `Blob`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream)
     */
    fun stream(): ReadableStream<Uint8Array<ArrayBuffer>>

    /**
     * The **`text()`** method of the Blob interface returns a Promise that resolves with a string containing the contents of the blob, interpreted as UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
     */
    @JsName("text")
    fun textAsync(): Promise<JsString>
}

/**
 * The **`arrayBuffer()`** method of the Blob interface returns a Promise that resolves with the contents of the blob as binary data contained in an ArrayBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
 */
suspend inline fun Blob.arrayBuffer(): ArrayBuffer {
    return arrayBufferAsync().await()
}

/**
 * The **`bytes()`** method of the Blob interface returns a Promise that resolves with a Uint8Array containing the contents of the blob as an array of bytes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/bytes)
 */
suspend inline fun Blob.bytes(): Uint8Array<ArrayBuffer> {
    return bytesAsync().await()
}

/**
 * The **`text()`** method of the Blob interface returns a Promise that resolves with a string containing the contents of the blob, interpreted as UTF-8.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
 */
suspend inline fun Blob.text(): String {
    return textAsync().await().toString()
}
