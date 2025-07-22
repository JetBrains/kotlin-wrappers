// Automatically generated - do not modify!

package vscode

/**
 * An event that is fired when files are going to be renamed.
 *
 * To make modifications to the workspace before the files are renamed,
 * call the {@link FileWillCreateEvent.waitUntil `waitUntil`}-function with a
 * thenable that resolves to a {@link WorkspaceEdit workspace edit}.
 */
external interface FileWillRenameEvent {
    /**
     * A cancellation token.
     */
    val token: CancellationToken

    /**
     * The files that are going to be renamed.
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
     * Allows to pause the event and to apply a {@link WorkspaceEdit workspace edit}.
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
//  waitUntil(thenable: Thenable<WorkspaceEdit>): void

    /**
     * Allows to pause the event until the provided thenable resolves.
     *
     * *Note:* This function can only be called during event dispatch.
     *
     * @param thenable A thenable that delays saving.
     */
//  waitUntil(thenable: Thenable<any>): void
}
