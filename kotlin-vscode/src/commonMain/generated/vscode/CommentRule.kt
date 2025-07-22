// Automatically generated - do not modify!

package vscode

/**
 * Describes how comments for a language work.
 */
external interface CommentRule {
    /**
     * The line comment token, like `// this is a comment`
     */
    var lineComment: String?

    /**
     * The block comment character pair, like `/​* block comment *&#47;`
     */
    var blockComment: CharacterPair?
}
