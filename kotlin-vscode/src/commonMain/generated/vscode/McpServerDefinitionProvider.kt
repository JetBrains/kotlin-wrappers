// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A type that can provide Model Context Protocol server definitions. This
 * should be registered using {@link lm.registerMcpServerDefinitionProvider}
 * during extension activation.
 */
external interface McpServerDefinitionProvider<T : McpServerDefinition> {
    /**
     * Optional event fired to signal that the set of available servers has changed.
     */
    val onDidChangeMcpServerDefinitions: Event<Void>?

    /**
     * Provides available MCP servers. The editor will call this method eagerly
     * to ensure the availability of servers for the language model, and so
     * extensions should not take actions which would require user
     * interaction, such as authentication.
     *
     * @param token A cancellation token.
     * @returns An array of MCP available MCP servers
     */
//  provideMcpServerDefinitions(token: CancellationToken): ProviderResult<T[]>

    /**
     * This function will be called when the editor needs to start a MCP server.
     * At this point, the extension may take any actions which may require user
     * interaction, such as authentication. Any non-`readonly` property of the
     * server may be modified, and the extension should return the resolved server.
     *
     * The extension may return undefined to indicate that the server
     * should not be started, or throw an error. If there is a pending tool
     * call, the editor will cancel it and return an error message to the
     * language model.
     *
     * @param server The MCP server to resolve
     * @param token A cancellation token.
     * @returns The resolved server or thenable that resolves to such. This may
     * be the given `server` definition with non-readonly properties filled in.
     */
//  resolveMcpServerDefinition?(server: T, token: CancellationToken): ProviderResult<T>
}
