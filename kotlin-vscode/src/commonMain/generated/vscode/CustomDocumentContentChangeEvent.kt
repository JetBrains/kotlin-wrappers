// Automatically generated - do not modify!

package vscode

/**
 * Event triggered by extensions to signal to the editor that the content of a {@linkcode CustomDocument}
 * has changed.
 *
 * @see {@linkcode CustomEditorProvider.onDidChangeCustomDocument}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentContentChangeEvent)
 */
external interface CustomDocumentContentChangeEvent<T : CustomDocument> {
    /**
     * The document that the change is for.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentContentChangeEvent.document)
     */
    val document: T
}
