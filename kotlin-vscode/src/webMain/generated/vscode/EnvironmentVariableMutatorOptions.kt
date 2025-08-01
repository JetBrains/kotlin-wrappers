// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Options applied to the mutator.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutatorOptions)
 */
@JsPlainObject
external interface EnvironmentVariableMutatorOptions {
    /**
     * Apply to the environment just before the process is created. Defaults to false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutatorOptions.applyAtProcessCreation)
     */
    var applyAtProcessCreation: Boolean?

    /**
     * Apply to the environment in the shell integration script. Note that this _will not_ apply
     * the mutator if shell integration is disabled or not working for some reason. Defaults to
     * false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#EnvironmentVariableMutatorOptions.applyAtShellIntegration)
     */
    var applyAtShellIntegration: Boolean?
}
