// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Represents options to configure the behavior of showing a [notebook document} in an {@link NotebookEditor notebook editor][NotebookDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentShowOptions)
 */
@JsPlainObject
external interface NotebookDocumentShowOptions {
    /**
     * An optional view column in which the [notebook editor][NotebookEditor] should be shown.
     * The default is the [active][ViewColumn.Active]. Columns that do not exist
     * will be created as needed up to the maximum of [ViewColumn.Nine].
     * Use [ViewColumn.Beside] to open the editor to the side of the currently
     * active one.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentShowOptions.viewColumn)
     */
    val viewColumn: ViewColumn?

    /**
     * An optional flag that when `true` will stop the [notebook editor][NotebookEditor] from taking focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentShowOptions.preserveFocus)
     */
    val preserveFocus: Boolean?

    /**
     * An optional flag that controls if an [notebook editor][NotebookEditor]-tab shows as preview. Preview tabs will
     * be replaced and reused until set to stay - either explicitly or through editing. The default behaviour depends
     * on the `workbench.editor.enablePreview`-setting.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentShowOptions.preview)
     */
    val preview: Boolean?

    /**
     * An optional selection to apply for the document in the [notebook editor][NotebookEditor].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentShowOptions.selections)
     */
    val selections: ReadonlyArray<NotebookRange>?
}
