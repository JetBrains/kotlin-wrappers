// Generated by Karakum - do not modify it manually!

@file:JsModule("node:net")

package node.net


/**
 * Aliases to {@link createConnection}.
 *
 * Possible signatures:
 *
 * * {@link connect}
 * * {@link connect} for `IPC` connections.
 * * {@link connect} for TCP connections.
 */
external fun connect(options: NetConnectOpts, connectionListener: () -> Unit = definedExternally): Socket

external fun connect(
    port: Number,
    host: String = definedExternally,
    connectionListener: () -> Unit = definedExternally,
): Socket

external fun connect(path: String, connectionListener: () -> Unit = definedExternally): Socket