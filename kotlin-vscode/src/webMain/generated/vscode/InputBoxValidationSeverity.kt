// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Severity levels for input box validation messages.
 */
sealed /* enum */
external interface InputBoxValidationSeverity {
    companion object {
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
}
