// Automatically generated - do not modify!

package web.data

import web.file.File
import web.fs.FileSystemEntry

/**
 * The **`DataTransferItem`** object represents one drag data item. During a drag operation, each DragEvent has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem)
 */
open external class DataTransferItem
private constructor() {
    /**
     * The read-only **`DataTransferItem.kind`** property returns the kind–a string or a file–of the DataTransferItem object representing the drag data item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/kind)
     */
    val kind: String

    /**
     * The read-only **`DataTransferItem.type`** property returns the type (format) of the DataTransferItem object representing the drag data item. The type is a Unicode string generally given by a MIME type, although a MIME type is not required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/type)
     */
    val type: String

    /**
     * If the item is a file, the **`DataTransferItem.getAsFile()`** method returns the drag data item's File object. If the item is not a file, this method returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsFile)
     */
    fun getAsFile(): File?

    /**
     * The **`DataTransferItem.getAsString()`** method invokes the given callback with the drag data item's string data as the argument if the item's kind is a Plain unicode string (i.e., kind is string).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsString)
     */
    fun getAsString(callback: FunctionStringCallback?)

    /**
     * If the item described by the DataTransferItem is a file, **`webkitGetAsEntry()`** returns a FileSystemFileEntry or FileSystemDirectoryEntry representing it. If the item isn't a file, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/webkitGetAsEntry)
     */
    fun webkitGetAsEntry(): FileSystemEntry?
}
