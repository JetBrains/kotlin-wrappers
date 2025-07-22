// Automatically generated - do not modify!

package vscode

/**
 * An event that is fired when a {@link NotebookDocument notebook document} will be saved.
 *
 * To make modifications to the document before it is being saved, call the
 * {@linkcode NotebookDocumentWillSaveEvent.waitUntil waitUntil}-function with a thenable
 * that resolves to a {@link WorkspaceEdit workspace edit}.
 */
external interface NotebookDocumentWillSaveEvent {
    /**
     * A cancellation token.
     */
    val token: CancellationToken

    /**
     * The {@link NotebookDocument notebook document} that will be saved.
     */
    val notebook: NotebookDocument

    /**
     * The reason why save was triggered.
     */
    val reason: TextDocumentSaveReason

    /**
     * Allows to pause the event loop and to apply {@link WorkspaceEdit workspace edit}.
     * Edits of subsequent calls to this function will be applied in order. The
     * edits will be *ignored* if concurrent modifications of the notebook document happened.
     *
     * *Note:* This function can only be called during event dispatch and not
     * in an asynchronous manner:
     *
     * ```ts
     * workspace.onWillSaveNotebookDocument(event => {
     * 	// async, will *throw* an error
     * 	setTimeout(() => event.waitUntil(promise));
     *
     * 	// sync, OK
     * 	event.waitUntil(promise);
     * })
     * ```
     *
     * @param thenable A thenable that resolves to {@link WorkspaceEdit workspace edit}.
     */
//  waitUntil(thenable: Thenable<WorkspaceEdit>): void

    /**
     * Allows to pause the event loop until the provided thenable resolved.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     */
//  waitUntil(thenable: Thenable<any>): void
}
