// Automatically generated - do not modify!

package web.data

import js.array.ReadonlyArray
import web.dom.Element
import web.file.FileList
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The **`DataTransfer`** object is used to hold any data transferred between contexts, such as a drag and drop operation, or clipboard read/write. It may hold one or more data items, each of one or more data types.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer)
 */
open external class DataTransfer {
    /**
     * The **`DataTransfer.dropEffect`** property controls the feedback (typically visual) the user is given during a drag and drop operation. It will affect which cursor is displayed while dragging. For example, when the user hovers over a target drop element, the browser's cursor may indicate which type of operation will occur.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect)
     */
    var dropEffect: DropEffect

    /**
     * The **`DataTransfer.effectAllowed`** property specifies the effect that is allowed for a drag operation. The copy operation is used to indicate that the data being dragged will be copied from its present location to the drop location. The move operation is used to indicate that the data being dragged will be moved, and the link operation is used to indicate that some form of relationship or connection will be created between the source and drop locations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed)
     */
    var effectAllowed: AllowedEffect

    /**
     * The **`files`** read-only property of DataTransfer objects is a list of the files in the drag operation. If the operation includes no files, the list is empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/files)
     */
    val files: FileList

    /**
     * The read-only **`items`** property of the DataTransfer interface is a list of the data transfer items in a drag operation. The list includes one item for each item in the operation and if the operation had no items, the list is empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/items)
     */
    val items: DataTransferItemList

    /**
     * The **`DataTransfer.types`** read-only property returns the available types that exist in the items.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/types)
     */
    val types: ReadonlyArray<JsString>

    /**
     * The **`DataTransfer.clearData()`** method removes the drag operation's drag data for the given type. If data for the given type does not exist, this method does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/clearData)
     */
    fun clearData(format: String = definedExternally)

    /**
     * The **`DataTransfer.getData()`** method retrieves drag data (as a string) for the specified type. If the drag operation does not include data, this method returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/getData)
     */
    fun getData(format: String): String

    /**
     * The **`DataTransfer.setData()`** method sets the drag operation's drag data to the specified data and type. If data for the given type does not exist, it is added at the end of the drag data store, such that the last item in the types list will be the new type. If data for the given type already exists, the existing data is replaced in the same position. That is, the order of the types list is not changed when replacing data of the same type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setData)
     */
    fun setData(
        format: String,
        data: String,
    )

    /**
     * When a drag occurs, a translucent image is generated from the drag target (the element the dragstart event is fired at), and follows the mouse pointer during the drag. This image is created automatically, so you do not need to create it yourself. However, if a custom image is desired, the **`DataTransfer.setDragImage()`** method can be used to set the custom image to be used. The image will typically be an <img> element but it can also be a <canvas> or any other visible element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setDragImage)
     */
    fun setDragImage(
        image: Element,
        x: Int,
        y: Int,
    )
}
