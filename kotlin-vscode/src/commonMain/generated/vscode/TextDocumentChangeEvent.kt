// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing a transactional [document][TextDocument] change.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentChangeEvent)
 */
external interface TextDocumentChangeEvent {
    /**
     * The affected document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentChangeEvent.document)
     */
    val document: TextDocument

    /**
     * An array of content changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentChangeEvent.contentChanges)
     */
    val contentChanges: ReadonlyArray<TextDocumentContentChangeEvent>

    /**
     * The reason why the document was changed.
     * Is `undefined` if the reason is not known.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentChangeEvent.reason)
     */
    val reason: TextDocumentChangeReason?
}
