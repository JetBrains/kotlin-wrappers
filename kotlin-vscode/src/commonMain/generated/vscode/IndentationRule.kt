// Automatically generated - do not modify!

package vscode

/**
 * Describes indentation rules for a language.
 */
external interface IndentationRule {
    /**
     * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
     */
//  decreaseIndentPattern: RegExp;

    /**
     * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
     */
//  increaseIndentPattern: RegExp;

    /**
     * If a line matches this pattern, then **only the next line** after it should be indented once.
     */
//  indentNextLinePattern?: RegExp;

    /**
     * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
     */
//  unIndentedLinePattern?: RegExp;
}
