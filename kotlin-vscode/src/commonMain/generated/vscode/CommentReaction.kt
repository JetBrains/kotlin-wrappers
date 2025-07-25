// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Reactions of a [Comment]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReaction)
 */
external interface CommentReaction {
    /**
     * The human-readable label for the reaction
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReaction.label)
     */
    val label: String

    /**
     * Icon for the reaction shown in UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReaction.iconPath)
     */
    val iconPath: JsAny /* string | Uri */

    /**
     * The number of users who have reacted to this reaction
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReaction.count)
     */
    val count: Int

    /**
     * Whether the [author][CommentAuthorInformation] of the comment has reacted to this reaction
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentReaction.authorHasReacted)
     */
    val authorHasReacted: Boolean
}
