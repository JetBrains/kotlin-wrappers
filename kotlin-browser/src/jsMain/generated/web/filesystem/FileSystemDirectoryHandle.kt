// Automatically generated - do not modify!

package web.filesystem

import js.core.ReadonlyArray
import js.core.Void
import kotlin.js.Promise

sealed external class FileSystemDirectoryHandle :
    FileSystemHandle {
    /* val kind: "directory" */
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getDirectoryHandle) */
    fun getDirectoryHandle(
        name: String,
        options: FileSystemGetDirectoryOptions = definedExternally,
    ): Promise<FileSystemDirectoryHandle>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/getFileHandle) */
    fun getFileHandle(
        name: String,
        options: FileSystemGetFileOptions = definedExternally,
    ): Promise<FileSystemFileHandle>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/removeEntry) */
    fun removeEntry(
        name: String,
        options: FileSystemRemoveOptions = definedExternally,
    ): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryHandle/resolve) */
    fun resolve(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<String>?>
}
