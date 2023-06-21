// Automatically generated - do not modify!

package web.data

import web.file.File
import web.filesystem.FileSystemEntry

sealed external class DataTransferItem {
    /**
     * Returns the drag data item kind, one of: "string", "file".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/kind)
     */
    val kind: String

    /**
     * Returns the drag data item type string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/type)
     */
    val type: String

    /**
     * Returns a File object, if the drag data item kind is File.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsFile)
     */
    fun getAsFile(): File?

    /**
     * Invokes the callback with the string data as the argument, if the drag data item kind is text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsString)
     */
    fun getAsString(callback: FunctionStringCallback?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/webkitGetAsEntry) */
    fun webkitGetAsEntry(): FileSystemEntry?
}
