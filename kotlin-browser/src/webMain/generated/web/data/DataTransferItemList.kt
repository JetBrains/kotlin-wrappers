// Automatically generated - do not modify!

package web.data

import js.array.ArrayLike
import js.iterable.JsIterable
import web.file.File

/**
 * The **`DataTransferItemList`** object is a list of DataTransferItem objects representing items being dragged.
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
     * The **`DataTransferItemList.add()`** method creates a new DataTransferItem using the specified data and adds it to the drag data list.
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
     * The **`DataTransferItemList.remove()`** method removes the DataTransferItem at the specified index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/remove)
     */
    fun remove(index: Int)
}
