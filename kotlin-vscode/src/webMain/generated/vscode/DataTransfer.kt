// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.Tuple2
import js.core.JsString
import js.iterable.JsIterable
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A map containing a mapping of the mime type of the corresponding transferred data.
 *
 * Drag and drop controllers that implement [`handleDrag`][TreeDragAndDropController.handleDrag] can add additional mime types to the
 * data transfer. These additional mime types will only be included in the `handleDrop` when the drag was initiated from
 * an element in the same drag and drop controller.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransfer)
 */
open external class DataTransfer :
    JsIterable<Tuple2</* mimeType: */ JsString, /* item: */ DataTransferItem>> {
    /**
     * Retrieves the data transfer item for a given mime type.
     *
     * @param mimeType The mime type to get the data transfer item for, such as `text/plain` or `image/png`.
     * Mimes type look ups are case-insensitive.
     *
     * Special mime types:
     * - `text/uri-list` — A string with `toString()`ed Uris separated by `\r\n`. To specify a cursor position in the file,
     * set the Uri's fragment to `L3,5`, where 3 is the line number and 5 is the column number.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransfer.get)
     */
    fun get(mimeType: String): DataTransferItem?

    /**
     * Sets a mime type to data transfer item mapping.
     *
     * @param mimeType The mime type to set the data for. Mimes types stored in lower case, with case-insensitive looks up.
     * @param value The data transfer item for the given mime type.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransfer.set)
     */
    fun set(
        mimeType: String,
        value: DataTransferItem,
    )

    /**
     * Allows iteration through the data transfer items.
     *
     * @param callbackfn Callback for iteration through the data transfer items.
     * @param thisArg The `this` context used when invoking the handler function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransfer.forEach)
     */
    fun forEach(
        callbackfn: (
            item: DataTransferItem,
            mimeType: String,
            dataTransfer: DataTransfer,
        ) -> Unit,
        thisArg: JsAny? = definedExternally,
    )

    /**
     * Get a new iterator with the `[mime, item]` pairs for each element in this data transfer.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransfer.[Symbol.iterator])
     */
    // [Symbol.iterator](): IterableIterator<[mimeType: string, item: DataTransferItem]>
}
