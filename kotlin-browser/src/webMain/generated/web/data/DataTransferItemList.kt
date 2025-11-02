// Automatically generated - do not modify!

package web.data

import js.array.ArrayLike
import js.iterable.JsIterable
import web.file.File

/**
 * The **`DataTransferItemList`** object is a list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList)
 */
open external class DataTransferItemList
private constructor() :
    ArrayLike<DataTransferItem>,
    JsIterable<DataTransferItem> {
    /**
     * The read-only **`length`** property of the DataTransferItemList interface returns the number of items currently in the drag item list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/length)
     */
    override val length: Int

    /**
     * The **`DataTransferItemList.add()`** method creates a new DataTransferItem using the specified data and adds it to the drag data list. The item may be a File or a string of a given type. If the item is successfully added to the list, the newly-created DataTransferItem object is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/add)
     */
    fun add(
        data: String,
        type: String,
    ): DataTransferItem?

    fun add(data: File): DataTransferItem?

    /**
     * The DataTransferItemList method **`clear()`** removes all DataTransferItem objects from the drag data items list, leaving the list empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/clear)
     */
    fun clear()

    /**
     * The **`DataTransferItemList.remove()`** method removes the DataTransferItem at the specified index from the list. If the index is less than zero or greater than one less than the length of the list, the list will not be changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/remove)
     */
    fun remove(index: Int)
}
