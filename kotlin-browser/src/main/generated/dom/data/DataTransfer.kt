// Automatically generated - do not modify!

package dom.data

import dom.Element
import js.core.ReadonlyArray
import web.file.FileList

external class DataTransfer {
    /**
     * Returns the kind of operation that is currently selected. If the kind of operation isn't one of those that is allowed by the effectAllowed attribute, then the operation will fail.
     *
     * Can be set, to change the selected operation.
     *
     * The possible values are "none", "copy", "link", and "move".
     */
    var dropEffect: String /* "none" | "copy" | "link" | "move" */

    /**
     * Returns the kinds of operations that are to be allowed.
     *
     * Can be set (during the dragstart event), to change the allowed operations.
     *
     * The possible values are "none", "copy", "copyLink", "copyMove", "link", "linkMove", "move", "all", and "uninitialized",
     */
    var effectAllowed: String /* "none" | "copy" | "copyLink" | "copyMove" | "link" | "linkMove" | "move" | "all" | "uninitialized" */

    /** Returns a FileList of the files being dragged, if any. */
    val files: FileList

    /** Returns a DataTransferItemList object, with the drag data. */
    val items: DataTransferItemList

    /** Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being dragged, then one of the types will be the string "Files". */
    val types: ReadonlyArray<String>

    /** Removes the data of the specified formats. Removes all data if the argument is omitted. */
    fun clearData(format: String = definedExternally)

    /** Returns the specified data. If there is no such data, returns the empty string. */
    fun getData(format: String): String

    /** Adds the specified data. */
    fun setData(
        format: String,
        data: String,
    )

    /** Uses the given element to update the drag feedback, replacing any previously specified feedback. */
    fun setDragImage(
        image: Element,
        x: Number,
        y: Number,
    )
}
