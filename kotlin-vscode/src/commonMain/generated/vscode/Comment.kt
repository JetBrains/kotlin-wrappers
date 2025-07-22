// Automatically generated - do not modify!

package vscode

/**
 * A comment is displayed within the editor or the Comments Panel, depending on how it is provided.
 */
external interface Comment {
    /**
    // ORIGINAL SOURCE

    /**
     * The human-readable comment body
    */
    body: string | MarkdownString;

    /**
     * {@link CommentMode Comment mode} of the comment
    */
    mode: CommentMode;

    /**
     * The {@link CommentAuthorInformation author information} of the comment
    */
    author: CommentAuthorInformation;

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
    contextValue?: string;

    /**
     * Optional reactions of the {@link Comment}
    */
    reactions?: CommentReaction[];

    /**
     * Optional label describing the {@link Comment}
     * Label will be rendered next to authorName if exists.
    */
    label?: string;

    /**
     * Optional timestamp that will be displayed in comments.
     * The date will be formatted according to the user's locale and settings.
    */
    timestamp?: Date;

    // ORIGINAL SOURCE
     **/
}
