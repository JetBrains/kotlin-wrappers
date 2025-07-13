// Automatically generated - do not modify!

package web.fs

import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemDirectoryEntry`** interface of the File and Directory Entries API represents a directory in a file system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry)
 */
external class FileSystemDirectoryEntry
private constructor() :
    FileSystemEntry {
    /**
     * The FileSystemDirectoryEntry interface's method **`createReader()`** returns a the directory.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/createReader)
     */
    fun createReader(): FileSystemDirectoryReader

    /**
     * The FileSystemDirectoryEntry interface's method **`getDirectory()`** returns a somewhere within the directory subtree rooted at the directory on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getDirectory)
     */
    @JsName("getDirectory")
    fun getDirectoryWithCallbacks(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )

    /**
     * The FileSystemDirectoryEntry interface's method **`getFile()`** returns a within the directory subtree rooted at the directory on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getFile)
     */
    @JsName("getFile")
    fun getFileWithCallbacks(
        path: String? = definedExternally,
        options: FileSystemFlags = definedExternally,
        successCallback: FileSystemEntryCallback = definedExternally,
        errorCallback: ErrorCallback = definedExternally,
    )
}
