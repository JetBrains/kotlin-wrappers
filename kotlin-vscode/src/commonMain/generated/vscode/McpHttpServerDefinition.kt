// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsString
import js.objects.Record
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * McpHttpServerDefinition represents an MCP server available using the
 * Streamable HTTP transport.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition)
 */
open external class McpHttpServerDefinition {
    /**
     * The human-readable name of the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition.label)
     */
    val label: String

    /**
     * The URI of the server. The editor will make a POST request to this URI
     * to begin each session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition.uri)
     */
    var uri: Uri

    /**
     * Optional additional heads included with each request to the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition.headers)
     */
    var headers: Record<JsString, JsString>

    /**
     * Optional version identification for the server. If this changes, the
     * editor will indicate that tools have changed and prompt to refresh them.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition.version)
     */
    var version: String?

    /**
     * @param label The human-readable name of the server.
     * @param uri The URI of the server.
     * @param headers Optional additional heads included with each request to the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpHttpServerDefinition.constructor)
     */
    constructor(
        label: String,
        uri: Uri,
        headers: Record<JsString, JsString> = definedExternally,
        version: String = definedExternally,
    )
}
