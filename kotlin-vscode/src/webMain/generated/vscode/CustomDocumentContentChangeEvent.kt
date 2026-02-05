// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Event triggered by extensions to signal to the editor that the content of a [CustomDocument]
 * has changed.
 *
 * @see [CustomEditorProvider.onDidChangeCustomDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentContentChangeEvent)
 */
@JsPlainObject
external interface CustomDocumentContentChangeEvent<T : CustomDocument> {
    /**
     * The document that the change is for.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CustomDocumentContentChangeEvent.document)
     */
    val document: T
}
