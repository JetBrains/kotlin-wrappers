// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Describes how comments for a language work.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentRule)
 */
@JsPlainObject
external interface CommentRule {
    /**
     * The line comment token, like `// this is a comment`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentRule.lineComment)
     */
    var lineComment: String?

    /**
     * The block comment character pair, like `/​* block comment *&#47;`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentRule.blockComment)
     */
    var blockComment: CharacterPair?
}
