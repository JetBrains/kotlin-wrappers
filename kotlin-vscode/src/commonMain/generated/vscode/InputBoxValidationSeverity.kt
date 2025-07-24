// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Impacts the behavior and appearance of the validation message.
 * The severity level for input box validation.
 */
sealed /* enum */
external interface InputBoxValidationSeverity {
    companion object {
        /**
         * Informational severity level.
         */
        val Info: InputBoxValidationSeverity // 1

        /**
         * Warning severity level.
         */
        val Warning: InputBoxValidationSeverity // 2

        /**
         * Error severity level.
         */
        val Error: InputBoxValidationSeverity // 3
    }
}
