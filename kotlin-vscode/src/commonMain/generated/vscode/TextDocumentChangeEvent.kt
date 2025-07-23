// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing a transactional {@link TextDocument document} change.
 */
external interface TextDocumentChangeEvent {
    /**
     * The affected document.
     */
    val document: TextDocument

    /**
     * An array of content changes.
     */
    val contentChanges: ReadonlyArray<TextDocumentContentChangeEvent>

    /**
     * The reason why the document was changed.
     * Is `undefined` if the reason is not known.
     */
    val reason: TextDocumentChangeReason?
}
