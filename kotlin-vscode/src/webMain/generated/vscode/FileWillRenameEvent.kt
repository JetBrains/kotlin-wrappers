// Automatically generated - do not modify!

package vscode

import js.promise.PromiseLike
import kotlin.js.JsAny

/**
 * An event that is fired when files are going to be renamed.
 *
 * To make modifications to the workspace before the files are renamed,
 * call the [`waitUntil`][FileWillCreateEvent.waitUntil]-function with a
 * thenable that resolves to a [workspace edit][WorkspaceEdit].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillRenameEvent)
 */
external interface FileWillRenameEvent {
    /**
     * A cancellation token.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillRenameEvent.token)
     */
    val token: CancellationToken

    /**
     * The files that are going to be renamed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillRenameEvent.files)
     */
    /*
    readonly files: ReadonlyArray<{
        /**
         * The old uri of a file.
         */
        readonly oldUri: Uri;
        /**
         * The new uri of a file.
         */
        readonly newUri: Uri;
    }>
    */

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
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillRenameEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<WorkspaceEdit>)

    /**
     * Allows to pause the event until the provided thenable resolves.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileWillRenameEvent.waitUntil)
     */
    fun waitUntil(thenable: PromiseLike<JsAny?>)
}
