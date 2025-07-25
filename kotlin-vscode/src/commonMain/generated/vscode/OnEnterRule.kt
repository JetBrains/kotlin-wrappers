// Automatically generated - do not modify!

package vscode

import js.regexp.RegExp

/**
 * Describes a rule to be evaluated when pressing Enter.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnEnterRule)
 */
external interface OnEnterRule {
    /**
     * This rule will only execute if the text before the cursor matches this regular expression.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnEnterRule.beforeText)
     */
    var beforeText: RegExp

    /**
     * This rule will only execute if the text after the cursor matches this regular expression.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnEnterRule.afterText)
     */
    var afterText: RegExp?

    /**
     * This rule will only execute if the text above the current line matches this regular expression.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnEnterRule.previousLineText)
     */
    var previousLineText: RegExp?

    /**
     * The action to execute.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnEnterRule.action)
     */
    var action: EnterAction
}
