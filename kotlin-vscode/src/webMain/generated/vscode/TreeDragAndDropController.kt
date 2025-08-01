// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.core.Void
import js.objects.JsPlainObject
import js.promise.PromiseLike

/**
 * Provides support for drag and drop in `TreeView`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeDragAndDropController)
 */
@JsPlainObject
external interface TreeDragAndDropController<T : JsAny?> {
    /**
     * The mime types that the [`handleDrop`][TreeDragAndDropController.handleDrop] method of this `DragAndDropController` supports.
     * This could be well-defined, existing, mime types, and also mime types defined by the extension.
     *
     * To support drops from trees, you will need to add the mime type of that tree.
     * This includes drops from within the same tree.
     * The mime type of a tree is recommended to be of the format `application/vnd.code.tree.<treeidlowercase>`.
     *
     * Use the special `files` mime type to support all types of dropped files [files][DataTransferFile], regardless of the file's actual mime type.
     *
     * To learn the mime type of a dragged item:
     * 1. Set up your `DragAndDropController`
     * 2. Use the Developer: Set Log Level... command to set the level to "Debug"
     * 3. Open the developer tools and drag the item with unknown mime type over your tree. The mime types will be logged to the developer console
     *
     * Note that mime types that cannot be sent to the extension will be omitted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeDragAndDropController.dropMimeTypes)
     */
    val dropMimeTypes: ReadonlyArray<JsString>

    /**
     * The mime types that the [`handleDrag`][TreeDragAndDropController.handleDrag] method of this `TreeDragAndDropController` may add to the tree data transfer.
     * This could be well-defined, existing, mime types, and also mime types defined by the extension.
     *
     * The recommended mime type of the tree (`application/vnd.code.tree.<treeidlowercase>`) will be automatically added.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeDragAndDropController.dragMimeTypes)
     */
    val dragMimeTypes: ReadonlyArray<JsString>

    /**
     * When the user starts dragging items from this `DragAndDropController`, `handleDrag` will be called.
     * Extensions can use `handleDrag` to add their [`DataTransferItem`][DataTransferItem] items to the drag and drop.
     *
     * Mime types added in `handleDrag` won't be available outside the application.
     *
     * When the items are dropped on **another tree item** in **the same tree**, your `DataTransferItem` objects
     * will be preserved. Use the recommended mime type for the tree (`application/vnd.code.tree.<treeidlowercase>`) to add
     * tree objects in a data transfer. See the documentation for `DataTransferItem` for how best to take advantage of this.
     *
     * To add a data transfer item that can be dragged into the editor, use the application specific mime type "text/uri-list".
     * The data for "text/uri-list" should be a string with `toString()`ed Uris separated by `\r\n`. To specify a cursor position in the file,
     * set the Uri's fragment to `L3,5`, where 3 is the line number and 5 is the column number.
     *
     * @param source The source items for the drag and drop operation.
     * @param dataTransfer The data transfer associated with this drag.
     * @param token A cancellation token indicating that drag has been cancelled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeDragAndDropController.handleDrag)
     */
    var handleDrag: ((
        source: ReadonlyArray<T>,
        dataTransfer: DataTransfer,
        token: CancellationToken,
    ) -> PromiseLike<Void>?)?

    /**
     * Called when a drag and drop action results in a drop on the tree that this `DragAndDropController` belongs to.
     *
     * Extensions should fire [onDidChangeTreeData][TreeDataProvider.onDidChangeTreeData] for any elements that need to be refreshed.
     *
     * @param target The target tree element that the drop is occurring on. When undefined, the target is the root.
     * @param dataTransfer The data transfer items of the source of the drag.
     * @param token A cancellation token indicating that the drop has been cancelled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeDragAndDropController.handleDrop)
     */
    var handleDrop: ((
        target: T?,
        dataTransfer: DataTransfer,
        token: CancellationToken,
    ) -> PromiseLike<Void>?)?
}
