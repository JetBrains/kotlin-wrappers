// Automatically generated - do not modify!

package dom.data

import js.core.ArrayLike
import web.file.File

sealed external class DataTransferItemList :
    ArrayLike<DataTransferItem> {
    /** Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be provided also. */
    fun add(
        data: String,
        type: String,
    ): DataTransferItem?

    fun add(data: File): DataTransferItem?

    /** Removes all the entries in the drag data store. */
    fun clear()

    /** Removes the indexth entry in the drag data store. */
    fun remove(index: Int)
}
