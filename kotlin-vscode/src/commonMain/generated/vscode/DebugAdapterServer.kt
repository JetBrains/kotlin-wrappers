// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a debug adapter running as a socket based server.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterServer)
 */
open external class DebugAdapterServer {
    /**
     * The port.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterServer.port)
     */
    val port: Int

    /**
     * The host.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterServer.host)
     */
    val host: String?

    /**
     * Create a description for a debug adapter running as a socket based server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterServer.constructor)
     */
    constructor(
        port: Int,
        host: String = definedExternally,
    )
}
