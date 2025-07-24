// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.promise.PromiseLike

/**
 * An event that is fired when files are going to be deleted.
 *
 * To make modifications to the workspace before the files are deleted,
 * call the [`waitUntil`][FileWillCreateEvent.waitUntil]-function with a
 * thenable that resolves to a [workspace edit][WorkspaceEdit].
 */
external interface FileWillDeleteEvent {
    /**
     * A cancellation token.
     */
    val token: CancellationToken

    /**
     * The files that are going to be deleted.
     */
    val files: ReadonlyArray<Uri>

    /**
     * Allows to pause the event and to apply a [workspace edit][WorkspaceEdit].
     *
     * *Note:* This function can only be called during event dispatch and not
     * in an asynchronous manner:
     *
     * ```ts
     * workspace.onWillCreateFiles(event => {
     * 	// async, will *throw* an error
     * 	setTimeout(() => event.waitUntil(promise));
     *
     * 	// sync, OK
     * 	event.waitUntil(promise);
     * })
     * ```
     *
     * @param thenable A thenable that delays saving.
     */
    fun waitUntil(thenable: PromiseLike<WorkspaceEdit>)

    /**
     * Allows to pause the event until the provided thenable resolves.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
