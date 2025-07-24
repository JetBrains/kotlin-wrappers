// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a debug adapter running as a socket based server.
 */
open external class DebugAdapterServer {
    /**
     * The port.
     */
    val port: Int

    /**
     * The host.
     */
    val host: String?

    /**
     * Create a description for a debug adapter running as a socket based server.
     */
    constructor(
        port: Int,
        host: String = definedExternally,
    )
}
