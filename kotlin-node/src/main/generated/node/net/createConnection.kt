// Automatically generated - do not modify!

@file:JsModule("node:net")
@file:JsNonModule

package node.net

/**
 * A factory function, which creates a new {@link Socket},
 * immediately initiates connection with `socket.connect()`,
 * then returns the `net.Socket` that starts the connection.
 *
 * When the connection is established, a `'connect'` event will be emitted
 * on the returned socket. The last parameter `connectListener`, if supplied,
 * will be added as a listener for the `'connect'` event **once**.
 *
 * Possible signatures:
 *
 * * {@link createConnection}
 * * {@link createConnection} for `IPC` connections.
 * * {@link createConnection} for TCP connections.
 *
 * The {@link connect} function is an alias to this function.
 */
external fun createConnection(
    options: NetConnectOpts,
    connectionListener: () -> Unit = definedExternally,
): Socket


/**
 * A factory function, which creates a new {@link Socket},
 * immediately initiates connection with `socket.connect()`,
 * then returns the `net.Socket` that starts the connection.
 *
 * When the connection is established, a `'connect'` event will be emitted
 * on the returned socket. The last parameter `connectListener`, if supplied,
 * will be added as a listener for the `'connect'` event **once**.
 *
 * Possible signatures:
 *
 * * {@link createConnection}
 * * {@link createConnection} for `IPC` connections.
 * * {@link createConnection} for TCP connections.
 *
 * The {@link connect} function is an alias to this function.
 */
external fun createConnection(
    port: Number,
    host: String = definedExternally,
    connectionListener: () -> Unit = definedExternally,
): Socket


/**
 * A factory function, which creates a new {@link Socket},
 * immediately initiates connection with `socket.connect()`,
 * then returns the `net.Socket` that starts the connection.
 *
 * When the connection is established, a `'connect'` event will be emitted
 * on the returned socket. The last parameter `connectListener`, if supplied,
 * will be added as a listener for the `'connect'` event **once**.
 *
 * Possible signatures:
 *
 * * {@link createConnection}
 * * {@link createConnection} for `IPC` connections.
 * * {@link createConnection} for TCP connections.
 *
 * The {@link connect} function is an alias to this function.
 */
external fun createConnection(
    path: String,
    connectionListener: () -> Unit = definedExternally,
): Socket
