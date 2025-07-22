// Automatically generated - do not modify!

package vscode

/**
 * An event describing a transactional {@link TextDocument document} change.
 */
external interface TextDocumentChangeEvent {
    /**
    // ORIGINAL SOURCE


    /**
     * The affected document.
    */
    readonly document: TextDocument;

    /**
     * An array of content changes.
    */
    readonly contentChanges: readonly TextDocumentContentChangeEvent[];

    /**
     * The reason why the document was changed.
     * Is `undefined` if the reason is not known.
    */
    readonly reason: TextDocumentChangeReason | undefined;

    // ORIGINAL SOURCE
     **/
}
