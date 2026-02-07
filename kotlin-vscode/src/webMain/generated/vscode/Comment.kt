// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.date.Date
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * A comment is displayed within the editor or the Comments Panel, depending on how it is provided.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment)
 */
@JsPlainObject
external interface Comment {
    /**
     * The human-readable comment body
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.body)
     */
    var body: JsAny /* string | MarkdownString */

    /**
     * [Comment mode][CommentMode] of the comment
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.mode)
     */
    var mode: CommentMode

    /**
     * The [author information][CommentAuthorInformation] of the comment
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.author)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.contextValue)
     */
    var contextValue: String?

    /**
     * Optional reactions of the [Comment]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.reactions)
     */
    var reactions: ReadonlyArray<CommentReaction>?

    /**
     * Optional label describing the [Comment]
     * Label will be rendered next to authorName if exists.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.label)
     */
    var label: String?

    /**
     * Optional timestamp that will be displayed in comments.
     * The date will be formatted according to the user's locale and settings.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Comment.timestamp)
     */
    var timestamp: Date?
}
