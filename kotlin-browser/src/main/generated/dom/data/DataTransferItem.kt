// Automatically generated - do not modify!

package dom.data

import web.file.File
import web.filesystem.FileSystemEntry

sealed external class DataTransferItem {
    /** Returns the drag data item kind, one of: "string", "file". */
    val kind: String

    /** Returns the drag data item type string. */
    val type: String

    /** Returns a File object, if the drag data item kind is File. */
    fun getAsFile(): File?

    /** Invokes the callback with the string data as the argument, if the drag data item kind is text. */
    fun getAsString(callback: FunctionStringCallback?)
    fun webkitGetAsEntry(): FileSystemEntry?
}
