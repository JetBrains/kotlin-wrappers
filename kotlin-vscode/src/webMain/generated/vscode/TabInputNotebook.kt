// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * The tab represents a notebook.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebook)
 */
open external class TabInputNotebook {
    /**
     * The uri that the tab is representing.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebook.uri)
     */
    val uri: Uri

    /**
     * The type of notebook. Maps to [NotebookDocuments's notebookType][NotebookDocument.notebookType]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebook.notebookType)
     */
    val notebookType: String

    /**
     * Constructs a new tab input for a notebook.
     * @param uri The uri of the notebook.
     * @param notebookType The type of notebook. Maps to [NotebookDocuments's notebookType][NotebookDocument.notebookType]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TabInputNotebook.constructor)
     */
    constructor(
        uri: Uri,
        notebookType: String,
    )
}
