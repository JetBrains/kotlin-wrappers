// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsString
import js.promise.PromiseLike

/**
 * Encapsulates data transferred during drag and drop operations.
 */
open external class DataTransferItem {
    /**
     * Get a string representation of this item.
     *
     * If {@linkcode DataTransferItem.value} is an object, this returns the result of json stringifying {@linkcode DataTransferItem.value} value.
     */
    fun asString(): PromiseLike<JsString>

    /**
     * Try getting the {@link DataTransferFile file} associated with this data transfer item.
     *
     * Note that the file object is only valid for the scope of the drag and drop operation.
     *
     * @returns The file for the data transfer or `undefined` if the item is either not a file or the
     * file data cannot be accessed.
     */
    fun asFile(): DataTransferFile?

    /**
     * Custom data stored on this item.
     *
     * You can use `value` to share data across operations. The original object can be retrieved so long as the extension that
     * created the `DataTransferItem` runs in the same extension host.
     */
    val value: Any?

    /**
     * @param value Custom data stored on this item. Can be retrieved using {@linkcode DataTransferItem.value}.
     */
    constructor(value: Any?)
}
