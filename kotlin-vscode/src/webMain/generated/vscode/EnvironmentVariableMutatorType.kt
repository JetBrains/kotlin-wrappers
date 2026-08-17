// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A type of mutation that can be applied to an environment variable.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutatorType)
 */
/* enum */
external class EnvironmentVariableMutatorType
private constructor() {
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
