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
     * The **`kind`** read-only property of the DataTransferItem interface returns the kind–a string or a file–of the object representing the drag data item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/kind)
     */
    open val kind: String

    /**
     * The **`type`** read-only property of the DataTransferItem interface returns the type (format) of the object representing the drag data item. The type is a Unicode string generally given by a MIME type, although a MIME type is not required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/type)
     */
    open val type: String

    /**
     * The **`getAsFile()`** method of the DataTransferItem interface returns the drag data item's File object if the item is a file. If the item is not a file, this method returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsFile)
     */
    open fun getAsFile(): File?

    /**
     * The **`getAsString()`** method of the DataTransferItem interface invokes the given callback with the drag data item's string data as the argument if the item's kind is a Plain unicode string (i.e., kind is string).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsString)
     */
    open fun getAsString(callback: FunctionStringCallback?)

    /**
     * The **`webkitGetAsEntry()`** method of the DataTransferItem interface returns a FileSystemFileEntry or FileSystemDirectoryEntry representing the item if it is a file. If the item isn't a file, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/webkitGetAsEntry)
     */
    open fun webkitGetAsEntry(): FileSystemEntry?
}
