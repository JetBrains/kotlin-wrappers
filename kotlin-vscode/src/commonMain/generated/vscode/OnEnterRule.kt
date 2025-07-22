// Automatically generated - do not modify!

package vscode

/**
 * Describes a rule to be evaluated when pressing Enter.
 */
external interface OnEnterRule {
    /**
    // ORIGINAL SOURCE

    /**
     * This rule will only execute if the text before the cursor matches this regular expression.
    */
    beforeText: RegExp;
    /**
     * This rule will only execute if the text after the cursor matches this regular expression.
    */
    afterText?: RegExp;
    /**
     * This rule will only execute if the text above the current line matches this regular expression.
    */
    previousLineText?: RegExp;
    /**
     * The action to execute.
    */
    action: EnterAction;

    // ORIGINAL SOURCE
     **/
}
