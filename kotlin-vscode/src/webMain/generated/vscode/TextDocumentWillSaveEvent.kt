// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * An event that is fired when a [document][TextDocument] will be saved.
 *
 * To make modifications to the document before it is being saved, call the
 * [waitUntil][TextDocumentWillSaveEvent.waitUntil]-function with a thenable
 * that resolves to an array of [text edits][TextEdit].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentWillSaveEvent)
 */
external interface TextDocumentWillSaveEvent {
    /**
     * The document that will be saved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentWillSaveEvent.document)
     */
    val document: TextDocument

    /**
     * The reason why save was triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentWillSaveEvent.reason)
     */
    val reason: TextDocumentSaveReason

    /**
     * Allows to pause the event loop and to apply [pre-save-edits][TextEdit].
     * Edits of subsequent calls to this function will be applied in order. The
     * edits will be *ignored* if concurrent modifications of the document happened.
     *
     * *Note:* This function can only be called during event dispatch and not
     * in an asynchronous manner:
     *
     * ```ts
     * workspace.onWillSaveTextDocument(event => {
     * 	// async, will *throw* an error
     * 	setTimeout(() => event.waitUntil(promise));
     *
     * 	// sync, OK
     * 	event.waitUntil(promise);
     * })
     * ```
     *
     * @param thenable A thenable that resolves to [pre-save-edits][TextEdit].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentWillSaveEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<ReadonlyArray<TextEdit>>)

    /**
     * Allows to pause the event loop until the provided thenable resolved.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentWillSaveEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
