// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Configuration for line comments.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LineCommentRule)
 */
@JsPlainObject
external interface LineCommentRule {
    /**
     * The line comment token, like `//`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LineCommentRule.comment)
     */
    var comment: String

    /**
     * Whether the comment token should not be indented and placed at the first column.
     * Defaults to false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LineCommentRule.noIndent)
     */
    var noIndent: Boolean?
}
