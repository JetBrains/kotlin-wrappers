// Automatically generated - do not modify!

package web.data

import js.array.ReadonlyArray
import web.dom.Element
import web.file.FileList
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`DataTransfer`** object is used to hold any data transferred between contexts, such as a drag and drop operation, or clipboard read/write.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer)
 */
open external class DataTransfer {
    /**
     * The **`DataTransfer.dropEffect`** property controls the feedback (typically visual) the user is given during a drag and drop operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect)
     */
    var dropEffect: DropEffect

    /**
     * The **`DataTransfer.effectAllowed`** property specifies the effect that is allowed for a drag operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed)
     */
    var effectAllowed: AllowedEffect

    /**
     * The **`files`** read-only property of `DataTransfer` objects is a list of the files in the drag operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/files)
     */
    val files: FileList

    /**
     * The read-only `items` property of the DataTransfer interface is a DataTransferItemList of the DataTransferItem in a drag operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/items)
     */
    val items: DataTransferItemList

    /**
     * The **`DataTransfer.types`** read-only property returns the available types that exist in the DataTransfer.items.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/types)
     */
    val types: ReadonlyArray<JsString>

    /**
     * The **`DataTransfer.clearData()`** method removes the drag operation's drag data for the given type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/clearData)
     */
    fun clearData(format: String = definedExternally)

    /**
     * The **`DataTransfer.getData()`** method retrieves drag data (as a string) for the specified type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/getData)
     */
    fun getData(format: String): String

    /**
     * The **`DataTransfer.setData()`** method sets the drag operation's drag data to the specified data and type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setData)
     */
    fun setData(
        format: String,
        data: String,
    )

    /**
     * When a drag occurs, a translucent image is generated from the drag target (the element the HTMLElement/dragstart_event event is fired at), and follows the mouse pointer during the drag.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setDragImage)
     */
    fun setDragImage(
        image: Element,
        x: Int,
        y: Int,
    )
}
