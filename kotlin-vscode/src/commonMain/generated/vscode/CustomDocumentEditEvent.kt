// Automatically generated - do not modify!

package vscode

/**
 * Event triggered by extensions to signal to the editor that an edit has occurred on an {@linkcode CustomDocument}.
 *
 * @see {@linkcode CustomEditorProvider.onDidChangeCustomDocument}.
 */
external interface CustomDocumentEditEvent<T : CustomDocument> {
    /**
     * The document that the edit is for.
     */
    val document: T

    /**
     * Undo the edit operation.
     *
     * This is invoked by the editor when the user undoes this edit. To implement `undo`, your
     * extension should restore the document and editor to the state they were in just before this
     * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
     */
//  undo(): Thenable<void> | void

    /**
     * Redo the edit operation.
     *
     * This is invoked by the editor when the user redoes this edit. To implement `redo`, your
     * extension should restore the document and editor to the state they were in just after this
     * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
     */
//  redo(): Thenable<void> | void

    /**
     * Display name describing the edit.
     *
     * This will be shown to users in the UI for undo/redo operations.
     */
    val label: String?
}
