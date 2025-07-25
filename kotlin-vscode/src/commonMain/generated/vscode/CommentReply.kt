// Automatically generated - do not modify!

package vscode

/**
 * Command argument for actions registered in `comments/commentThread/context`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReply)
 */
external interface CommentReply {
    /**
     * The active [comment thread][CommentThread]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReply.thread)
     */
    var thread: CommentThread

    /**
     * The value in the comment editor
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReply.text)
     */
    var text: String
}
