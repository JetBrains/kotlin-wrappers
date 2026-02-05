// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.promise.PromiseLike

/**
 * Event triggered by extensions to signal to the editor that an edit has occurred on an [CustomDocument].
 *
 * @see [CustomEditorProvider.onDidChangeCustomDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentEditEvent)
 */
external interface CustomDocumentEditEvent<T : CustomDocument> {
    /**
     * The document that the edit is for.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentEditEvent.document)
     */
    val document: T

    /**
     * Undo the edit operation.
     *
     * This is invoked by the editor when the user undoes this edit. To implement `undo`, your
     * extension should restore the document and editor to the state they were in just before this
     * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentEditEvent.undo)
     */
    fun undo(): PromiseLike<Void>?

    /**
     * Redo the edit operation.
     *
     * This is invoked by the editor when the user redoes this edit. To implement `redo`, your
     * extension should restore the document and editor to the state they were in just after this
     * edit was added to the editor's internal edit stack by `onDidChangeCustomDocument`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentEditEvent.redo)
     */
    fun redo(): PromiseLike<Void>?

    /**
     * Display name describing the edit.
     *
     * This will be shown to users in the UI for undo/redo operations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentEditEvent.label)
     */
    val label: String?
}
