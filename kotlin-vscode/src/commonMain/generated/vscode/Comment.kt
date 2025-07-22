// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.date.Date

/**
 * A comment is displayed within the editor or the Comments Panel, depending on how it is provided.
 */
external interface Comment {
    /**
     * The human-readable comment body
     */
    var body: Any /* string | MarkdownString */

    /**
     * {@link CommentMode Comment mode} of the comment
     */
    var mode: CommentMode

    /**
     * The {@link CommentAuthorInformation author information} of the comment
     */
    var author: CommentAuthorInformation

    /**
     * Context value of the comment. This can be used to contribute comment specific actions.
     * For example, a comment is given a context value as `editable`. When contributing actions to `comments/comment/title`
     * using `menus` extension point, you can specify context value for key `comment` in `when` expression like `comment == editable`.
     * ```json
     *	"contributes": {
     *		"menus": {
     *			"comments/comment/title": [
     *				{
     *					"command": "extension.deleteComment",
     *					"when": "comment == editable"
     *				}
     *			]
     *		}
     *	}
     * ```
     * This will show action `extension.deleteComment` only for comments with `contextValue` is `editable`.
     */
    var contextValue: String?

    /**
     * Optional reactions of the {@link Comment}
     */
    var reactions: ReadonlyArray<CommentReaction>?

    /**
     * Optional label describing the {@link Comment}
     * Label will be rendered next to authorName if exists.
     */
    var label: String?

    /**
     * Optional timestamp that will be displayed in comments.
     * The date will be formatted according to the user's locale and settings.
     */
    var timestamp: Date?
}
