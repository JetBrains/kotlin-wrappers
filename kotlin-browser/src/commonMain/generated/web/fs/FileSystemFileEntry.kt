// Automatically generated - do not modify!

package web.fs

import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FileSystemFileEntry`** interface of the File and Directory Entries API represents a file in a file system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileEntry)
 */
external class FileSystemFileEntry
private constructor() :
    FileSystemEntry {
    /**
     * The FileSystemFileEntry interface's method **`file()`** returns a the directory entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileEntry/file)
     */
    @JsName("file")
    fun fileWithCallbacks(
        successCallback: FileCallback,
        errorCallback: ErrorCallback = definedExternally,
    )
}
