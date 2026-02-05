// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.errors.JsError
import js.typedarrays.Uint8Array
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * One representation of a [notebook output][NotebookCellOutput], defined by MIME type and data.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem)
 */
open external class NotebookCellOutputItem {
    /**
     * The mime type which determines how the [data][NotebookCellOutputItem.data]-property
     * is interpreted.
     *
     * Notebooks have built-in support for certain mime-types, extensions can add support for new
     * types and override existing types.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.mime)
     */
    var mime: String

    /**
     * The data of this output item. Must always be an array of unsigned 8-bit integers.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.data)
     */
    var data: Uint8Array<*>

    /**
     * Create a new notebook cell output item.
     *
     * @param data The value of the output item.
     * @param mime The mime type of the output item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.constructor)
     */
    constructor(
        data: Uint8Array<*>,
        mime: String,
    )

    companion object {
        /**
         * Factory function to create a `NotebookCellOutputItem` from a string.
         *
         * *Note* that an UTF-8 encoder is used to create bytes for the string.
         *
         * @param value A string.
         * @param mime Optional MIME type, defaults to `text/plain`.
         * @returns A new output item object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.text)
         */
        fun text(
            value: String,
            mime: String = definedExternally,
        ): NotebookCellOutputItem

        /**
         * Factory function to create a `NotebookCellOutputItem` from
         * a JSON object.
         *
         * *Note* that this function is not expecting "stringified JSON" but
         * an object that can be stringified. This function will throw an error
         * when the passed value cannot be JSON-stringified.
         *
         * @param value A JSON-stringifyable value.
         * @param mime Optional MIME type, defaults to `application/json`
         * @returns A new output item object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.json)
         */
        fun json(
            value: JsAny?,
            mime: String = definedExternally,
        ): NotebookCellOutputItem

        /**
         * Factory function to create a `NotebookCellOutputItem` that uses
         * uses the `application/vnd.code.notebook.stdout` mime type.
         *
         * @param value A string.
         * @returns A new output item object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.stdout)
         */
        fun stdout(value: String): NotebookCellOutputItem

        /**
         * Factory function to create a `NotebookCellOutputItem` that uses
         * uses the `application/vnd.code.notebook.stderr` mime type.
         *
         * @param value A string.
         * @returns A new output item object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.stderr)
         */
        fun stderr(value: String): NotebookCellOutputItem

        /**
         * Factory function to create a `NotebookCellOutputItem` that uses
         * uses the `application/vnd.code.notebook.error` mime type.
         *
         * @param value An error object.
         * @returns A new output item object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutputItem.error)
         */
        fun error(value: JsError): NotebookCellOutputItem
    }
}
