// Automatically generated - do not modify!

package web.fs

import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemEntry`** interface of the File and Directory Entries API represents a single entry in a file system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry)
 */
open external class FileSystemEntry
private constructor() {
    /**
     * The read-only **`filesystem`** property of the FileSystemEntry interface contains a FileSystem object that represents the file system on which the entry resides.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/filesystem)
     */
    val filesystem: FileSystem

    /**
     * The read-only **`fullPath`** property of the FileSystemEntry interface returns a string specifying the full, absolute path from the file system's root to the file represented by the entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/fullPath)
     */
    val fullPath: String

    /**
     * The read-only **`isDirectory`** property of the FileSystemEntry interface is `true` if the entry represents a directory (meaning it's a FileSystemDirectoryEntry) and `false` if it's not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isDirectory)
     */
    val isDirectory: Boolean

    /**
     * The read-only **`isFile`** property of the FileSystemEntry interface is `true` if the entry represents a file (meaning it's a FileSystemFileEntry) and `false` if it's not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/isFile)
     */
    val isFile: Boolean

    /**
     * The read-only **`name`** property of the FileSystemEntry interface returns a string specifying the entry's name; this is the entry within its parent directory (the last component of the path as indicated by the FileSystemEntry.fullPath property).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/name)
     */
    val name: String

    /**
     * The FileSystemEntry interface's method **`getParent()`** obtains a FileSystemDirectoryEntry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/getParent)
     */
    @JsName("getParent")
    fun getParentWithCallbacks(
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
