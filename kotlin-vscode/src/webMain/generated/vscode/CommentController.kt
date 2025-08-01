// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike

/**
 * A comment controller is able to provide [comments][CommentThread] support to the editor and
 * provide users various ways to interact with comments.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController)
 */
external interface CommentController :
    DisposableLike {
    /**
     * The id of this comment controller.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.id)
     */
    val id: String

    /**
     * The human-readable label of this comment controller.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.label)
     */
    val label: String

    /**
     * Comment controller options
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.options)
     */
    var options: CommentOptions?

    /**
     * Optional commenting range provider. Provide a list [ranges][Range] which support commenting to any given resource uri.
     *
     * If not provided, users cannot leave any comments.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.commentingRangeProvider)
     */
    var commentingRangeProvider: CommentingRangeProvider?

    /**
     * Create a [comment thread][CommentThread]. The comment thread will be displayed in visible text editors (if the resource matches)
     * and Comments Panel once created.
     *
     * @param uri The uri of the document the thread has been created on.
     * @param range The range the comment thread is located within the document.
     * @param comments The ordered comments of the thread.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.createCommentThread)
     */
    fun createCommentThread(
        uri: Uri,
        range: Range,
        comments: ReadonlyArray<Comment>,
    ): CommentThread

    /**
     * Optional reaction handler for creating and deleting reactions on a [Comment].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.reactionHandler)
     */
    var reactionHandler: (
        comment: Comment,
        reaction: CommentReaction,
    ) -> PromiseLike<Void>?

    /**
     * Dispose this comment controller.
     *
     * Once disposed, all [comment threads][CommentThread] created by this comment controller will also be removed from the editor
     * and Comments Panel.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentController.dispose)
     */
    override fun dispose()
}
