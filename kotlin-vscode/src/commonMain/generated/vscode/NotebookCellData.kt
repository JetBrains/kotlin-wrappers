// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record
import kotlin.js.JsModule

/**
 * NotebookCellData is the raw representation of notebook cells. Its is part of {@linkcode NotebookData}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData)
 */
open external class NotebookCellData {
    /**
     * The [kind][NotebookCellKind] of this cell data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.kind)
     */
    var kind: NotebookCellKind

    /**
     * The source value of this cell data - either source code or formatted text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.value)
     */
    var value: String

    /**
     * The language identifier of the source value of this cell data. Any value from
     * {@linkcode languages.getLanguages getLanguages} is possible.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.languageId)
     */
    var languageId: String

    /**
     * The outputs of this cell data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.outputs)
     */
    var outputs: ReadonlyArray<NotebookCellOutput>?

    /**
     * Arbitrary metadata of this cell data. Can be anything but must be JSON-stringifyable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.metadata)
     */
    var metadata: Record<JsString, *>?

    /**
     * The execution summary of this cell data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.executionSummary)
     */
    var executionSummary: NotebookCellExecutionSummary?

    /**
     * Create new cell data. Minimal cell data specifies its kind, its source value, and the
     * language identifier of its source.
     *
     * @param kind The kind.
     * @param value The source value.
     * @param languageId The language identifier of the source value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellData.constructor)
     */
    constructor(
        kind: NotebookCellKind,
        value: String,
        languageId: String,
    )
}
