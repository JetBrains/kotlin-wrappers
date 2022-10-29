// Automatically generated - do not modify!

package web.filesystem

import kotlinx.js.ReadonlyArray
import kotlinx.js.Void
import kotlin.js.Promise

sealed external class FileSystemDirectoryHandle :
    FileSystemHandle {
    /* val kind: "directory" */
    fun getDirectoryHandle(
        name: String,
        options: FileSystemGetDirectoryOptions = definedExternally,
    ): Promise<FileSystemDirectoryHandle>

    fun getFileHandle(
        name: String,
        options: FileSystemGetFileOptions = definedExternally,
    ): Promise<FileSystemFileHandle>

    fun removeEntry(
        name: String,
        options: FileSystemRemoveOptions = definedExternally,
    ): Promise<Void>

    fun resolve(possibleDescendant: FileSystemHandle): Promise<ReadonlyArray<String>?>
}
