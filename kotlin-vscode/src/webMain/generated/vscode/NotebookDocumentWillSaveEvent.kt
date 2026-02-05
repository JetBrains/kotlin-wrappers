// Automatically generated - do not modify!

package vscode

import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * An event that is fired when a [notebook document][NotebookDocument] will be saved.
 *
 * To make modifications to the document before it is being saved, call the
 * [waitUntil][NotebookDocumentWillSaveEvent.waitUntil]-function with a thenable
 * that resolves to a [workspace edit][WorkspaceEdit].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent)
 */
external interface NotebookDocumentWillSaveEvent {
    /**
     * A cancellation token.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent.token)
     */
    val token: CancellationToken

    /**
     * The [notebook document][NotebookDocument] that will be saved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent.notebook)
     */
    val notebook: NotebookDocument

    /**
     * The reason why save was triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent.reason)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<WorkspaceEdit>)

    /**
     * Allows to pause the event loop until the provided thenable resolved.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentWillSaveEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
