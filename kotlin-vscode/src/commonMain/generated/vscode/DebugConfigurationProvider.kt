// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * A debug configuration provider allows to add debug configurations to the debug service
 * and to resolve launch configurations before they are used to start a debug session.
 * A debug configuration provider is registered via [debug.registerDebugConfigurationProvider].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfigurationProvider)
 */
external interface DebugConfigurationProvider {
    /**
     * Provides [debug configuration][DebugConfiguration] to the debug service. If more than one debug configuration provider is
     * registered for the same type, debug configurations are concatenated in arbitrary order.
     *
     * @param folder The workspace folder for which the configurations are used or `undefined` for a folderless setup.
     * @param token A cancellation token.
     * @returns An array of [debug configurations][DebugConfiguration].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfigurationProvider.provideDebugConfigurations)
     */
    var provideDebugConfigurations: ((
        folder: WorkspaceFolder?,
        token: CancellationToken?,
    ) -> ProviderResult<ReadonlyArray<DebugConfiguration>>)?

    /**
     * Resolves a [debug configuration][DebugConfiguration] by filling in missing values or by adding/changing/removing attributes.
     * If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
     * in arbitrary order and the initial debug configuration is piped through the chain.
     * Returning the value 'undefined' prevents the debug session from starting.
     * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
     *
     * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
     * @param debugConfiguration The [debug configuration][DebugConfiguration] to resolve.
     * @param token A cancellation token.
     * @returns The resolved debug configuration or undefined or null.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfigurationProvider.resolveDebugConfiguration)
     */
    var resolveDebugConfiguration: ((
        folder: WorkspaceFolder?,
        debugConfiguration: DebugConfiguration,
        token: CancellationToken?,
    ) -> ProviderResult<DebugConfiguration>)?

    /**
     * This hook is directly called after 'resolveDebugConfiguration' but with all variables substituted.
     * It can be used to resolve or verify a [debug configuration][DebugConfiguration] by filling in missing values or by adding/changing/removing attributes.
     * If more than one debug configuration provider is registered for the same type, the 'resolveDebugConfigurationWithSubstitutedVariables' calls are chained
     * in arbitrary order and the initial debug configuration is piped through the chain.
     * Returning the value 'undefined' prevents the debug session from starting.
     * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
     *
     * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
     * @param debugConfiguration The [debug configuration][DebugConfiguration] to resolve.
     * @param token A cancellation token.
     * @returns The resolved debug configuration or undefined or null.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfigurationProvider.resolveDebugConfigurationWithSubstitutedVariables)
     */
    var resolveDebugConfigurationWithSubstitutedVariables: ((
        folder: WorkspaceFolder?,
        debugConfiguration: DebugConfiguration,
        token: CancellationToken?,
    ) -> ProviderResult<DebugConfiguration>)?
}
