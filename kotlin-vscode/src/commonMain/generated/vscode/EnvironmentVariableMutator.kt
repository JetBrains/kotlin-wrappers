// Automatically generated - do not modify!

package vscode

/**
 * A type of mutation and its value to be applied to an environment variable.
 */
external interface EnvironmentVariableMutator {
    /**
     * The type of mutation that will occur to the variable.
     */
    val type: EnvironmentVariableMutatorType

    /**
     * The value to use for the variable.
     */
    val value: String

    /**
     * Options applied to the mutator.
     */
    val options: EnvironmentVariableMutatorOptions
}
