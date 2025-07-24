// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Reactions of a {@link Comment}
 */
external interface CommentReaction {
    /**
     * The human-readable label for the reaction
     */
    val label: String

    /**
     * Icon for the reaction shown in UI.
     */
    val iconPath: JsAny /* string | Uri */

    /**
     * The number of users who have reacted to this reaction
     */
    val count: Int

    /**
     * Whether the {@link CommentAuthorInformation author} of the comment has reacted to this reaction
     */
    val authorHasReacted: Boolean
}
