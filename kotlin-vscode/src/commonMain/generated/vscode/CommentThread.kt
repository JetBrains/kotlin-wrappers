// Automatically generated - do not modify!

package vscode

/**
 * A collection of {@link Comment comments} representing a conversation at a particular range in a document.
 */
external interface CommentThread {
    /**
    // ORIGINAL SOURCE

    /**
     * The uri of the document the thread has been created on.
    */
    readonly uri: Uri;

    /**
     * The range the comment thread is located within the document. The thread icon will be shown
     * at the last line of the range. When set to undefined, the comment will be associated with the
     * file, and not a specific range.
    */
    range: Range | undefined;

    /**
     * The ordered comments of the thread.
    */
    comments: readonly Comment[];

    /**
     * Whether the thread should be collapsed or expanded when opening the document.
     * Defaults to Collapsed.
    */
    collapsibleState: CommentThreadCollapsibleState;

    /**
     * Whether the thread supports reply.
     * Defaults to true.
    */
    canReply: boolean | CommentAuthorInformation;

    /**
     * Context value of the comment thread. This can be used to contribute thread specific actions.
     * For example, a comment thread is given a context value as `editable`. When contributing actions to `comments/commentThread/title`
     * using `menus` extension point, you can specify context value for key `commentThread` in `when` expression like `commentThread == editable`.
     * ```json
     * "contributes": {
     *   "menus": {
     *     "comments/commentThread/title": [
     *       {
     *         "command": "extension.deleteCommentThread",
     *         "when": "commentThread == editable"
     *       }
     *     ]
     *   }
     * }
     * ```
     * This will show action `extension.deleteCommentThread` only for comment threads with `contextValue` is `editable`.
    */
    contextValue?: string;

    /**
     * The optional human-readable label describing the {@link CommentThread Comment Thread}
    */
    label?: string;

    /**
     * The optional state of a comment thread, which may affect how the comment is displayed.
    */
    state?: CommentThreadState;

    /**
     * Dispose this comment thread.
     *
     * Once disposed, this comment thread will be removed from visible editors and Comment Panel when appropriate.
    */
    dispose(): void;

    // ORIGINAL SOURCE
     **/
}
