// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.objects.Record
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * Notebook cell output represents a result of executing a cell. It is a container type for multiple
 * [output items][NotebookCellOutputItem] where contained items represent the same result but
 * use different MIME types.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutput)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutput.items)
     */
    var items: ReadonlyArray<NotebookCellOutputItem>

    /**
     * Arbitrary metadata for this cell output. Can be anything but must be JSON-stringifyable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutput.metadata)
     */
    var metadata: Record<JsString, *>?

    /**
     * Create new notebook output.
     *
     * @param items Notebook output items.
     * @param metadata Optional metadata.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellOutput.constructor)
     */
    constructor(
        items: ReadonlyArray<NotebookCellOutputItem>,
        metadata: Record<JsString, *> = definedExternally,
    )
}
