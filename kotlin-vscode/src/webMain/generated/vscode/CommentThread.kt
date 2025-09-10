// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny

/**
 * A collection of [comments][Comment] representing a conversation at a particular range in a document.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread)
 */
external interface CommentThread :
    DisposableLike {
    /**
     * The uri of the document the thread has been created on.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.uri)
     */
    val uri: Uri

    /**
     * The range the comment thread is located within the document. The thread icon will be shown
     * at the last line of the range. When set to undefined, the comment will be associated with the
     * file, and not a specific range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.range)
     */
    var range: Range?

    /**
     * The ordered comments of the thread.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.comments)
     */
    var comments: ReadonlyArray<Comment>

    /**
     * Whether the thread should be collapsed or expanded when opening the document.
     * Defaults to Collapsed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.collapsibleState)
     */
    var collapsibleState: CommentThreadCollapsibleState

    /**
     * Whether the thread supports reply.
     * Defaults to true.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.canReply)
     */
    var canReply: JsAny /* boolean | CommentAuthorInformation */

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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.contextValue)
     */
    var contextValue: String?

    /**
     * The optional human-readable label describing the [Comment Thread][CommentThread]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.label)
     */
    var label: String?

    /**
     * The optional state of a comment thread, which may affect how the comment is displayed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.state)
     */
    var state: CommentThreadState?

    /**
     * Dispose this comment thread.
     *
     * Once disposed, this comment thread will be removed from visible editors and Comment Panel when appropriate.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentThread.dispose)
     */
    override fun dispose()
}
