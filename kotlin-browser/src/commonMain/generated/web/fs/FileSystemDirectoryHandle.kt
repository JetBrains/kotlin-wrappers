// Automatically generated - do not modify!

package web.fs

import js.array.ReadonlyArray
import js.collections.AsyncMapLike
import js.core.JsString
import js.core.Void
import js.promise.Promise
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
    AsyncMapLike<JsString, FileSystemHandle> {
    override val kind: FileSystemHandleKind.directory

    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun resolve(possibleDescendant: FileSystemHandle): ReadonlyArray<JsString>?

    @JsName("resolve")
    fun resolveAsync(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<JsString>?>
}
