// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * McpHttpServerDefinition represents an MCP server available using the
 * Streamable HTTP transport.
 */
open external class McpHttpServerDefinition {
    /**
     * The human-readable name of the server.
     */
    val label: String

    /**
     * The URI of the server. The editor will make a POST request to this URI
     * to begin each session.
     */
//  uri: Uri;

    /**
     * Optional additional heads included with each request to the server.
     */
//  headers: Record<string, string>;

    /**
     * Optional version identification for the server. If this changes, the
     * editor will indicate that tools have changed and prompt to refresh them.
     */
//  version?: string;

    /**
     * @param label The human-readable name of the server.
     * @param uri The URI of the server.
     * @param headers Optional additional heads included with each request to the server.
     */
//  constructor(label: string, uri: Uri, headers?: Record<string, string>, version?: string);
}
