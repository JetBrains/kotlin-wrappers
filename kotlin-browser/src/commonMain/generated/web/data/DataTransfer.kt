// Automatically generated - do not modify!

package web.data

import js.array.ReadonlyArray
import js.core.JsString
import web.dom.Element
import web.file.FileList
import kotlin.js.definedExternally

/**
 * The **`DataTransfer`** object is used to hold any data transferred between contexts, such as a drag and drop operation, or clipboard read/write.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer)
 */
open external class DataTransfer {
    /**
     * Returns the kind of operation that is currently selected. If the kind of operation isn't one of those that is allowed by the effectAllowed attribute, then the operation will fail.
     *
     * Can be set, to change the selected operation.
     *
     * The possible values are "none", "copy", "link", and "move".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect)
     */
    var dropEffect: DropEffect

    /**
     * Returns the kinds of operations that are to be allowed.
     *
     * Can be set (during the dragstart event), to change the allowed operations.
     *
     * The possible values are "none", "copy", "copyLink", "copyMove", "link", "linkMove", "move", "all", and "uninitialized",
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed)
     */
    var effectAllowed: AllowedEffect

    /**
     * Returns a FileList of the files being dragged, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/files)
     */
    val files: FileList

    /**
     * Returns a DataTransferItemList object, with the drag data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/items)
     */
    val items: DataTransferItemList

    /**
     * Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being dragged, then one of the types will be the string "Files".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/types)
     */
    val types: ReadonlyArray<JsString>

    /**
     * Removes the data of the specified formats. Removes all data if the argument is omitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/clearData)
     */
    fun clearData(format: String = definedExternally)

    /**
     * Returns the specified data. If there is no such data, returns the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/getData)
     */
    fun getData(format: String): String

    /**
     * Adds the specified data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setData)
     */
    fun setData(
        format: String,
        data: String,
    )

    /**
     * Uses the given element to update the drag feedback, replacing any previously specified feedback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setDragImage)
     */
    fun setDragImage(
        image: Element,
        x: Int,
        y: Int,
    )
}
