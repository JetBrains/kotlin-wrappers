// Automatically generated - do not modify!

package vscode

/**
 * A debug configuration provider allows to add debug configurations to the debug service
 * and to resolve launch configurations before they are used to start a debug session.
 * A debug configuration provider is registered via {@link debug.registerDebugConfigurationProvider}.
 */
external interface DebugConfigurationProvider {
    /**
     * Provides {@link DebugConfiguration debug configuration} to the debug service. If more than one debug configuration provider is
     * registered for the same type, debug configurations are concatenated in arbitrary order.
     *
     * @param folder The workspace folder for which the configurations are used or `undefined` for a folderless setup.
     * @param token A cancellation token.
     * @returns An array of {@link DebugConfiguration debug configurations}.
     */
//  provideDebugConfigurations?(folder: WorkspaceFolder | undefined, token?: CancellationToken): ProviderResult<DebugConfiguration[]>;

    /**
     * Resolves a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
     * If more than one debug configuration provider is registered for the same type, the resolveDebugConfiguration calls are chained
     * in arbitrary order and the initial debug configuration is piped through the chain.
     * Returning the value 'undefined' prevents the debug session from starting.
     * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
     *
     * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
     * @param debugConfiguration The {@link DebugConfiguration debug configuration} to resolve.
     * @param token A cancellation token.
     * @returns The resolved debug configuration or undefined or null.
     */
//  resolveDebugConfiguration?(folder: WorkspaceFolder | undefined, debugConfiguration: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration>;

    /**
     * This hook is directly called after 'resolveDebugConfiguration' but with all variables substituted.
     * It can be used to resolve or verify a {@link DebugConfiguration debug configuration} by filling in missing values or by adding/changing/removing attributes.
     * If more than one debug configuration provider is registered for the same type, the 'resolveDebugConfigurationWithSubstitutedVariables' calls are chained
     * in arbitrary order and the initial debug configuration is piped through the chain.
     * Returning the value 'undefined' prevents the debug session from starting.
     * Returning the value 'null' prevents the debug session from starting and opens the underlying debug configuration instead.
     *
     * @param folder The workspace folder from which the configuration originates from or `undefined` for a folderless setup.
     * @param debugConfiguration The {@link DebugConfiguration debug configuration} to resolve.
     * @param token A cancellation token.
     * @returns The resolved debug configuration or undefined or null.
     */
//  resolveDebugConfigurationWithSubstitutedVariables?(folder: WorkspaceFolder | undefined, debugConfiguration: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration>;
}
