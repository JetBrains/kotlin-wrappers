// Automatically generated - do not modify!

package vscode

/**
 * Event triggered by extensions to signal to the editor that the content of a {@linkcode CustomDocument}
 * has changed.
 *
 * @see {@linkcode CustomEditorProvider.onDidChangeCustomDocument}.
 */
external interface CustomDocumentContentChangeEvent<T : CustomDocument> {
    /**
     * The document that the change is for.
     */
    val document: T
}
