// Automatically generated - do not modify!

package vscode

import js.regexp.RegExp
import kotlinx.js.JsPlainObject

/**
 * Describes indentation rules for a language.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#IndentationRule)
 */
@JsPlainObject
external interface IndentationRule {
    /**
     * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#IndentationRule.decreaseIndentPattern)
     */
    var decreaseIndentPattern: RegExp

    /**
     * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#IndentationRule.increaseIndentPattern)
     */
    var increaseIndentPattern: RegExp

    /**
     * If a line matches this pattern, then **only the next line** after it should be indented once.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#IndentationRule.indentNextLinePattern)
     */
    var indentNextLinePattern: RegExp?

    /**
     * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#IndentationRule.unIndentedLinePattern)
     */
    var unIndentedLinePattern: RegExp?
}
