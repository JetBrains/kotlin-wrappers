// Automatically generated - do not modify!

package web.fs

import js.array.ReadonlyArray
import js.collections.AsyncMapLike
import js.core.JsString
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import js.serialization.Serializable
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemDirectoryHandle`** interface of the File System API provides a handle to a file system directory.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle)
 */
sealed /* final */
external class FileSystemDirectoryHandle
protected /* private */ constructor() :
    FileSystemHandle,
    AsyncMapLike<JsString, FileSystemHandle>,
    Serializable {
    override val kind: FileSystemHandleKind.directory

    /**
     * The **`getDirectoryHandle()`** method of the within the directory handle on which the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getDirectoryHandle(
        name: String,
        options: FileSystemGetDirectoryOptions = definedExternally,
    ): FileSystemDirectoryHandle

    @JsName("getDirectoryHandle")
    fun getDirectoryHandleAsync(
        name: String,
        options: FileSystemGetDirectoryOptions = definedExternally,
    ): Promise<FileSystemDirectoryHandle>

    /**
     * The **`getFileHandle()`** method of the directory the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getFileHandle(
        name: String,
        options: FileSystemGetFileOptions = definedExternally,
    ): FileSystemFileHandle

    @JsName("getFileHandle")
    fun getFileHandleAsync(
        name: String,
        options: FileSystemGetFileOptions = definedExternally,
    ): Promise<FileSystemFileHandle>

    /**
     * The **`removeEntry()`** method of the directory handle contains a file or directory called the name specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun removeEntry(
        name: String,
        options: FileSystemRemoveOptions = definedExternally,
    )

    @JsName("removeEntry")
    fun removeEntryAsync(
        name: String,
        options: FileSystemRemoveOptions = definedExternally,
    ): Promise<Void>

    /**
     * The **`resolve()`** method of the directory names from the parent handle to the specified child entry, with the name of the child entry as the last array item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve)
     */
    @JsName("resolve")
    fun resolveAsync(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<JsString>?>
}

/**
 * The **`resolve()`** method of the directory names from the parent handle to the specified child entry, with the name of the child entry as the last array item.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve)
 */
suspend inline fun FileSystemDirectoryHandle.resolve(possibleDescendant: FileSystemHandle): ReadonlyArray<JsString>? {
    return awaitPromiseLike(resolveAsync(possibleDescendant))
}
