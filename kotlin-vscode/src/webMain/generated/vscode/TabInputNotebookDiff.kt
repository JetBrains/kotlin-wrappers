// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * The tabs represents two notebooks in a diff configuration.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebookDiff)
 */
open external class TabInputNotebookDiff {
    /**
     * The uri of the original notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebookDiff.original)
     */
    val original: Uri

    /**
     * The uri of the modified notebook.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebookDiff.modified)
     */
    val modified: Uri

    /**
     * The type of notebook. Maps to [NotebookDocuments's notebookType][NotebookDocument.notebookType]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebookDiff.notebookType)
     */
    val notebookType: String

    /**
     * Constructs a notebook diff tab input.
     * @param original The uri of the original unmodified notebook.
     * @param modified The uri of the modified notebook.
     * @param notebookType The type of notebook. Maps to [NotebookDocuments's notebookType][NotebookDocument.notebookType]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebookDiff.constructor)
     */
    constructor(
        original: Uri,
        modified: Uri,
        notebookType: String,
    )
}
