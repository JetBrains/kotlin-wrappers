// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * One representation of a {@link NotebookCellOutput notebook output}, defined by MIME type and data.
 */
open external class NotebookCellOutputItem {
    /**
     * Factory function to create a `NotebookCellOutputItem` from a string.
     *
     * *Note* that an UTF-8 encoder is used to create bytes for the string.
     *
     * @param value A string.
     * @param mime Optional MIME type, defaults to `text/plain`.
     * @returns A new output item object.
     */
//  static text(value: string, mime?: string): NotebookCellOutputItem

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
     */
//  static json(value: any, mime?: string): NotebookCellOutputItem

    /**
     * Factory function to create a `NotebookCellOutputItem` that uses
     * uses the `application/vnd.code.notebook.stdout` mime type.
     *
     * @param value A string.
     * @returns A new output item object.
     */
//  static stdout(value: string): NotebookCellOutputItem

    /**
     * Factory function to create a `NotebookCellOutputItem` that uses
     * uses the `application/vnd.code.notebook.stderr` mime type.
     *
     * @param value A string.
     * @returns A new output item object.
     */
//  static stderr(value: string): NotebookCellOutputItem

    /**
     * Factory function to create a `NotebookCellOutputItem` that uses
     * uses the `application/vnd.code.notebook.error` mime type.
     *
     * @param value An error object.
     * @returns A new output item object.
     */
//  static error(value: Error): NotebookCellOutputItem

    /**
     * The mime type which determines how the {@linkcode NotebookCellOutputItem.data data}-property
     * is interpreted.
     *
     * Notebooks have built-in support for certain mime-types, extensions can add support for new
     * types and override existing types.
     */
//  mime: string

    /**
     * The data of this output item. Must always be an array of unsigned 8-bit integers.
     */
//  data: Uint8Array

    /**
     * Create a new notebook cell output item.
     *
     * @param data The value of the output item.
     * @param mime The mime type of the output item.
     */
//  constructor(data: Uint8Array, mime: string)
}
