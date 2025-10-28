package jszip

import js.buffer.ArrayBuffer
import js.buffer.internal.convertToByteArray
import js.core.JsPrimitives.toKotlinString
import js.date.Date
import js.promise.Promise
import js.promise.await
import js.typedarrays.Uint8Array
import web.blob.Blob
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * [Online Documentation](https://stuk.github.io/jszip/documentation/api_zipobject.html)
 */
external interface JSZipObject {
    val name: String

    /**
     * Present for files loadded with `loadAsync`. May contain ".." path components that could
     * result in a zip-slip attack. See https://snyk.io/research/zip-slip-vulnerability
     */
    val unsafeOriginalName: String?
    val dir: Boolean
    val date: Date
    val comment: String?

    /** The UNIX permissions of the file, if any. */
    val unixPermissions: Int?

    /** The UNIX permissions of the file, if any. */
    val dosPermissions: Int?
    val options: JSZipObjectOptions

    /**
     * Prepare the content in the asked type.
     * @param type the type of the result.
     * @param onUpdate a function to call on each internal update.
     * @return Promise the promise of the result.
     */
    fun <R : JsAny> async(
        type: OutputType<R>,
        onUpdate: OnUpdateCallback? = definedExternally,
    ): Promise<R>

    // nodeStream(type?: 'nodebuffer', onUpdate?: OnUpdateCallback): NodeJS.ReadableStream;
}

// default `async` aliases
suspend inline fun JSZipObject.arrayBuffer(): ArrayBuffer =
    async(OutputType.arraybuffer).await()

suspend inline fun JSZipObject.blob(): Blob =
    async(OutputType.blob).await()

suspend inline fun JSZipObject.bytes(): Uint8Array<ArrayBuffer> =
    async(OutputType.uint8array).await()

suspend inline fun JSZipObject.text(): String =
    async(OutputType.text).await().toKotlinString()

// additional `async` aliases
suspend fun JSZipObject.byteArray(): ByteArray =
    convertToByteArray(arrayBuffer())
