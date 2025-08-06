package jszip

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsAny
import js.core.JsString
import js.core.Void
import js.objects.ReadonlyRecord
import js.promise.Promise
import js.promise.await
import js.regexp.RegExp
import js.typedarrays.Uint8Array
import web.blob.Blob
import kotlin.js.JsModule
import kotlin.js.definedExternally
import kotlin.js.undefined

/**
 * [Online Documentation](https://stuk.github.io/jszip/documentation/api_jszip.html)
 */
@JsModule("jszip")
external class JSZip {
    val files: ReadonlyRecord<JsString, JSZipObject>

    /**
     * Get a file from the archive
     *
     * @param Path relative path to file
     * @return File matching path, null if no file found
     */
    fun file(path: String): JSZipObject?

    /**
     * Get files matching a RegExp from archive
     *
     * @param path RegExp to match
     * @return Return all matching files or an empty array
     */
    fun file(path: RegExp): ReadonlyArray<JSZipObject>

    /**
     * Add a file to the archive
     *
     * @param path Relative path to file
     * @param data Content of the file
     * @param options Optional information about the file
     * @return JSZip object
     */
    fun file(
        name: String,
        data: String,
        options: JSZipFileOptions? = definedExternally,
    )

    fun file(
        name: String,
        data: Uint8Array<*>,
        options: JSZipFileOptions? = definedExternally,
    )

    fun file(
        name: String,
        data: ArrayBuffer,
        options: JSZipFileOptions? = definedExternally,
    )

    fun file(
        name: String,
        data: Blob,
        options: JSZipFileOptions? = definedExternally,
    )

    fun file(
        path: String,
        @Suppress("WRONG_JS_INTEROP_TYPE")
        data: Void,
        options: JSZipFileOptions,
    )

    /**
     * Returns an new JSZip instance with the given folder as root
     *
     * @param name Name of the folder
     * @return New JSZip object with the given folder as root or null
     */
    fun folder(name: String): JSZip?

    /**
     * Returns new JSZip instances with the matching folders as root
     *
     * @param name RegExp to match
     * @return New array of JSZipFile objects which match the RegExp
     */
    fun folder(name: RegExp): ReadonlyArray<JSZipObject>

    /**
     * Call a callback function for each entry at this folder level.
     *
     * @param action function
     */
    fun forEach(action: (relativePath: String, file: JSZipObject) -> Unit)

    /**
     * Get all files which match the given filter function
     *
     * @param predicate Filter function
     * @return Array of matched elements
     */
    fun filter(predicate: (relativePath: String, file: JSZipObject) -> Boolean): ReadonlyArray<JSZipObject>

    /**
     * Removes the file or folder from the archive
     *
     * @param path Relative path of file or folder
     * @return Returns the JSZip instance
     */
    fun remove(path: String): JSZip

    /**
     * Generates a new archive asynchronously
     *
     * @param options Optional options for the generator
     * @param onUpdate The optional function called on each internal update with the metadata.
     * @return The serialized archive
     */
    fun <T : JsAny> generateAsync(
        options: JSZipGeneratorOptions<T>,
        onUpdate: OnUpdateCallback? = definedExternally,
    ): Promise<T>


    /**
     * Deserialize zip file asynchronously
     *
     * @param data Serialized zip file
     * @param options Options for deserializing
     * @return Returns promise
     */
    fun loadAsync(
        data: String,
        options: JSZipLoadOptions? = definedExternally,
    ): Promise<JSZip>

    fun loadAsync(
        data: Uint8Array<*>,
        options: JSZipLoadOptions? = definedExternally,
    ): Promise<JSZip>

    fun loadAsync(
        data: ArrayBuffer,
        options: JSZipLoadOptions? = definedExternally,
    ): Promise<JSZip>

    fun loadAsync(
        data: Blob,
        options: JSZipLoadOptions? = definedExternally,
    ): Promise<JSZip>

    companion object {
        val support: JSZipSupport
        val version: String
    }
}

suspend inline fun <T : JsAny> JSZip.generate(
    options: JSZipGeneratorOptions<T>,
): T =
    generateAsync(options).await()

/**
 * Deserialize zip file asynchronously
 *
 * @param data Serialized zip file
 * @param options Options for deserializing
 * @return Returns promise
 */
suspend inline fun JSZip.load(
    data: String,
    options: JSZipLoadOptions? = undefined,
): JSZip =
    loadAsync(data, options).await()

suspend inline fun JSZip.load(
    data: Uint8Array<*>,
    options: JSZipLoadOptions? = undefined,
): JSZip =
    loadAsync(data, options).await()

suspend inline fun JSZip.load(
    data: ArrayBuffer,
    options: JSZipLoadOptions? = undefined,
): JSZip =
    loadAsync(data, options).await()

suspend inline fun JSZip.load(
    data: Blob,
    options: JSZipLoadOptions? = undefined,
): JSZip =
    loadAsync(data, options).await()
