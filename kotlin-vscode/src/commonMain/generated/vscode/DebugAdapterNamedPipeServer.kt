// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a debug adapter running as a Named Pipe (on Windows)/UNIX Domain Socket (on non-Windows) based server.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterNamedPipeServer)
 */
open external class DebugAdapterNamedPipeServer {
    /**
     * The path to the NamedPipe/UNIX Domain Socket.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterNamedPipeServer.path)
     */
    val path: String

    /**
     * Create a description for a debug adapter running as a Named Pipe (on Windows)/UNIX Domain Socket (on non-Windows) based server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterNamedPipeServer.constructor)
     */
    constructor(path: String)
}
