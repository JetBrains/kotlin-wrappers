// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Severity levels for input box validation messages.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InputBoxValidationSeverity)
 */
/* enum */
external class InputBoxValidationSeverity
private constructor() {
    /**
     * Indicates an informational message that does not prevent input acceptance.
     */
    val Info: InputBoxValidationSeverity // 1

    /**
     * Indicates a warning message that does not prevent input acceptance.
     */
    val Warning: InputBoxValidationSeverity // 2

    /**
     * Indicates an error message that prevents the user from accepting the input.
     */
    val Error: InputBoxValidationSeverity // 3
}
