// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Notebook cell output represents a result of executing a cell. It is a container type for multiple
 * {@link NotebookCellOutputItem output items} where contained items represent the same result but
 * use different MIME types.
 */
open external class NotebookCellOutput {
    /**
     * The output items of this output. Each item must represent the same result. _Note_ that repeated
     * MIME types per output is invalid and that the editor will just pick one of them.
     *
     * ```ts
     * new vscode.NotebookCellOutput([
     * 	vscode.NotebookCellOutputItem.text('Hello', 'text/plain'),
     * 	vscode.NotebookCellOutputItem.text('<i>Hello</i>', 'text/html'),
     * 	vscode.NotebookCellOutputItem.text('_Hello_', 'text/markdown'),
     * 	vscode.NotebookCellOutputItem.text('Hey', 'text/plain'), // INVALID: repeated type, editor will pick just one
     * ])
     * ```
     */
    var items: ReadonlyArray<NotebookCellOutputItem>

    /**
     * Arbitrary metadata for this cell output. Can be anything but must be JSON-stringifyable.
     */
    var metadata: Record<JsString, *>?

    /**
     * Create new notebook output.
     *
     * @param items Notebook output items.
     * @param metadata Optional metadata.
     */
    constructor(
        items: ReadonlyArray<NotebookCellOutputItem>,
        metadata: Record<JsString, *> = definedExternally,
    )
}
