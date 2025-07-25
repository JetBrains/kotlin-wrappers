// Automatically generated - do not modify!

package vscode

/**
 * A type of mutation and its value to be applied to an environment variable.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutator)
 */
external interface EnvironmentVariableMutator {
    /**
     * The type of mutation that will occur to the variable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutator.type)
     */
    val type: EnvironmentVariableMutatorType

    /**
     * The value to use for the variable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutator.value)
     */
    val value: String

    /**
     * Options applied to the mutator.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutator.options)
     */
    val options: EnvironmentVariableMutatorOptions
}
