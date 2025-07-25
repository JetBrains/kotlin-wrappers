// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlin.js.definedExternally

/**
 * Represents a notebook editor that is attached to a [notebook][NotebookDocument].
 * Additional properties of the NotebookEditor are available in the proposed
 * API, which will be finalized later.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor)
 */
external interface NotebookEditor {
    /**
     * The [notebook document][NotebookDocument] associated with this notebook editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.notebook)
     */
    val notebook: NotebookDocument

    /**
     * The primary selection in this notebook editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.selection)
     */
    var selection: NotebookRange

    /**
     * All selections in this notebook editor.
     *
     * The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.selections)
     */
    var selections: ReadonlyArray<NotebookRange>

    /**
     * The current visible ranges in the editor (vertically).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.visibleRanges)
     */
    val visibleRanges: ReadonlyArray<NotebookRange>

    /**
     * The column in which this editor shows.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.viewColumn)
     */
    val viewColumn: ViewColumn?

    /**
     * Scroll as indicated by `revealType` in order to reveal the given range.
     *
     * @param range A range.
     * @param revealType The scrolling strategy for revealing `range`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookEditor.revealRange)
     */
    fun revealRange(
        range: NotebookRange,
        revealType: NotebookEditorRevealType = definedExternally,
    )
}
