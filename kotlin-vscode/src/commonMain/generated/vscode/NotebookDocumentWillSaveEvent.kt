// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.promise.PromiseLike

/**
 * An event that is fired when a [notebook document][NotebookDocument] will be saved.
 *
 * To make modifications to the document before it is being saved, call the
 * {@linkcode NotebookDocumentWillSaveEvent.waitUntil waitUntil}-function with a thenable
 * that resolves to a [workspace edit][WorkspaceEdit].
 */
external interface NotebookDocumentWillSaveEvent {
    /**
     * A cancellation token.
     */
    val token: CancellationToken

    /**
     * The [notebook document][NotebookDocument] that will be saved.
     */
    val notebook: NotebookDocument

    /**
     * The reason why save was triggered.
     */
    val reason: TextDocumentSaveReason

    /**
     * Allows to pause the event loop and to apply [workspace edit][WorkspaceEdit].
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
     * @param thenable A thenable that resolves to [workspace edit][WorkspaceEdit].
     */
    fun waitUntil(thenable: PromiseLike<WorkspaceEdit>)

    /**
     * Allows to pause the event loop until the provided thenable resolved.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
