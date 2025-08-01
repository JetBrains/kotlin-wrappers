// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * A type of mutation that can be applied to an environment variable.
 */
sealed /* enum */
external interface EnvironmentVariableMutatorType {
    companion object {
        /**
         * Replace the variable's existing value.
         */
        val Replace: EnvironmentVariableMutatorType // 1

        /**
         * Append to the end of the variable's existing value.
         */
        val Append: EnvironmentVariableMutatorType // 2

        /**
         * Prepend to the start of the variable's existing value.
         */
        val Prepend: EnvironmentVariableMutatorType // 3
    }
}
