// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * An event that is fired when files are going to be created.
 *
 * To make modifications to the workspace before the files are created,
 * call the {@linkcode FileWillCreateEvent.waitUntil waitUntil}-function with a
 * thenable that resolves to a [workspace edit][WorkspaceEdit].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillCreateEvent)
 */
external interface FileWillCreateEvent {
    /**
     * A cancellation token.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillCreateEvent.token)
     */
    val token: CancellationToken

    /**
     * The files that are going to be created.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillCreateEvent.files)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillCreateEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<WorkspaceEdit>)

    /**
     * Allows to pause the event until the provided thenable resolves.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillCreateEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
