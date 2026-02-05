// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.promise.PromiseLike
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.JsName
import kotlin.js.JsString

/**
 * Encapsulates data transferred during drag and drop operations.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferItem)
 */
open external class DataTransferItem {
    /**
     * Get a string representation of this item.
     *
     * If [DataTransferItem.value] is an object, this returns the result of json stringifying [DataTransferItem.value] value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferItem.asString)
     */
    @JsName("asString")
    fun asStringAsync(): PromiseLike<JsString>

    /**
     * Try getting the [file][DataTransferFile] associated with this data transfer item.
     *
     * Note that the file object is only valid for the scope of the drag and drop operation.
     *
     * @returns The file for the data transfer or `undefined` if the item is either not a file or the
     * file data cannot be accessed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferItem.asFile)
     */
    fun asFile(): DataTransferFile?

    /**
     * Custom data stored on this item.
     *
     * You can use `value` to share data across operations. The original object can be retrieved so long as the extension that
     * created the `DataTransferItem` runs in the same extension host.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferItem.value)
     */
    val value: JsAny?

    /**
     * @param value Custom data stored on this item. Can be retrieved using [DataTransferItem.value].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DataTransferItem.constructor)
     */
    constructor(value: JsAny?)
}
