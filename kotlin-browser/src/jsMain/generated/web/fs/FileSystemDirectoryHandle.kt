// Automatically generated - do not modify!

package web.fs

import js.array.ReadonlyArray
import js.collections.AsyncMapLike
import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle)
 */
sealed external class FileSystemDirectoryHandle :
    FileSystemHandle,
    AsyncMapLike<String, FileSystemHandle> {
    override val kind: FileSystemHandleKind.directory

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle)
     */
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
    suspend fun resolve(possibleDescendant: FileSystemHandle): ReadonlyArray<String>?

    @JsName("resolve")
    fun resolveAsync(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<String>?>
}
