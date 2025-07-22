// Automatically generated - do not modify!

package vscode

import js.regexp.RegExp

/**
 * Describes a rule to be evaluated when pressing Enter.
 */
external interface OnEnterRule {
    /**
     * This rule will only execute if the text before the cursor matches this regular expression.
     */
    var beforeText: RegExp

    /**
     * This rule will only execute if the text after the cursor matches this regular expression.
     */
    var afterText: RegExp?

    /**
     * This rule will only execute if the text above the current line matches this regular expression.
     */
    var previousLineText: RegExp?

    /**
     * The action to execute.
     */
    var action: EnterAction
}
