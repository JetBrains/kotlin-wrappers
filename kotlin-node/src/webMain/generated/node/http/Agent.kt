// Automatically generated - do not modify!

@file:JsModule("node:http")

package node.http

import node.events.EventEmitter
import node.net.Socket

/**
 * An `Agent` is responsible for managing connection persistence
 * and reuse for HTTP clients. It maintains a queue of pending requests
 * for a given host and port, reusing a single socket connection for each
 * until the queue is empty, at which time the socket is either destroyed
 * or put into a pool where it is kept to be used again for requests to the
 * same host and port. Whether it is destroyed or pooled depends on the `keepAlive` `option`.
 *
 * Pooled connections have TCP Keep-Alive enabled for them, but servers may
 * still close idle connections, in which case they will be removed from the
 * pool and a new connection will be made when a new HTTP request is made for
 * that host and port. Servers may also refuse to allow multiple requests
 * over the same connection, in which case the connection will have to be
 * remade for every request and cannot be pooled. The `Agent` will still make
 * the requests to that server, but each one will occur over a new connection.
 *
 * When a connection is closed by the client or the server, it is removed
 * from the pool. Any unused sockets in the pool will be unrefed so as not
 * to keep the Node.js process running when there are no outstanding requests.
 * (see `socket.unref()`).
 *
 * It is good practice, to `destroy()` an `Agent` instance when it is no
 * longer in use, because unused sockets consume OS resources.
 *
 * Sockets are removed from an agent when the socket emits either
 * a `'close'` event or an `'agentRemove'` event. When intending to keep one
 * HTTP request open for a long time without keeping it in the agent, something
 * like the following may be done:
 *
 * ```js
 * http.get(options, (res) => {
 *   // Do stuff
 * }).on('socket', (socket) => {
 *   socket.emit('agentRemove');
 * });
 * ```
 *
 * An agent may also be used for an individual request. By providing `{agent: false}` as an option to the `http.get()` or `http.request()` functions, a one-time use `Agent` with default options
 * will be used
 * for the client connection.
 *
 * `agent:false`:
 *
 * ```js
 * http.get({
 *   hostname: 'localhost',
 *   port: 80,
 *   path: '/',
 *   agent: false,  // Create a new agent just for this one request
 * }, (res) => {
 *   // Do stuff with response
 * });
 * ```
 *
 * `options` in [`socket.connect()`](https://nodejs.org/docs/latest-v24.x/api/net.html#socketconnectoptions-connectlistener) are also supported.
 *
 * To configure any of them, a custom {@link Agent} instance must be created.
 *
 * ```js
 * import http from 'node:http';
 * const keepAliveAgent = new http.Agent({ keepAlive: true });
 * options.agent = keepAliveAgent;
 * http.request(options, onResponseCallback)
 * ```
 * @since v0.3.4
 */
open external class Agent : EventEmitter {
    constructor (opts: AgentOptions = definedExternally)

    /**
     * By default set to 256. For agents with `keepAlive` enabled, this
     * sets the maximum number of sockets that will be left open in the free
     * state.
     * @since v0.11.7
     */
    var maxFreeSockets: Double

    /**
     * By default set to `Infinity`. Determines how many concurrent sockets the agent
     * can have open per origin. Origin is the returned value of `agent.getName()`.
     * @since v0.3.6
     */
    var maxSockets: Double

    /**
     * By default set to `Infinity`. Determines how many concurrent sockets the agent
     * can have open. Unlike `maxSockets`, this parameter applies across all origins.
     * @since v14.5.0, v12.19.0
     */
    var maxTotalSockets: Double

    /**
     * An object which contains arrays of sockets currently awaiting use by
     * the agent when `keepAlive` is enabled. Do not modify.
     *
     * Sockets in the `freeSockets` list will be automatically destroyed and
     * removed from the array on `'timeout'`.
     * @since v0.11.4
     */
    val freeSockets: node.ReadOnlyDict<js.array.ReadonlyArray<Socket>>

    /**
     * An object which contains arrays of sockets currently in use by the
     * agent. Do not modify.
     * @since v0.3.6
     */
    val sockets: node.ReadOnlyDict<js.array.ReadonlyArray<Socket>>

    /**
     * An object which contains queues of requests that have not yet been assigned to
     * sockets. Do not modify.
     * @since v0.5.9
     */
    val requests: node.ReadOnlyDict<js.array.ReadonlyArray<IncomingMessage>>

    /**
     * Destroy any sockets that are currently in use by the agent.
     *
     * It is usually not necessary to do this. However, if using an
     * agent with `keepAlive` enabled, then it is best to explicitly shut down
     * the agent when it is no longer needed. Otherwise,
     * sockets might stay open for quite a long time before the server
     * terminates them.
     * @since v0.11.4
     */
    fun destroy()

    /**
     * Produces a socket/stream to be used for HTTP requests.
     *
     * By default, this function is the same as `net.createConnection()`. However,
     * custom agents may override this method in case greater flexibility is desired.
     *
     * A socket/stream can be supplied in one of two ways: by returning the
     * socket/stream from this function, or by passing the socket/stream to `callback`.
     *
     * This method is guaranteed to return an instance of the `net.Socket` class,
     * a subclass of `stream.Duplex`, unless the user specifies a socket
     * type other than `net.Socket`.
     *
     * `callback` has a signature of `(err, stream)`.
     * @since v0.11.4
     * @param options Options containing connection details. Check `createConnection` for the format of the options
     * @param callback Callback function that receives the created socket
     */
    fun createConnection(
        options: ClientRequestArgs,
        callback: (err: js.errors.JsError?, stream: node.stream.Duplex) -> Unit = definedExternally,
    ): node.stream.Duplex?

    /**
     * Called when `socket` is detached from a request and could be persisted by the`Agent`. Default behavior is to:
     *
     * ```js
     * socket.setKeepAlive(true, this.keepAliveMsecs);
     * socket.unref();
     * return true;
     * ```
     *
     * This method can be overridden by a particular `Agent` subclass. If this
     * method returns a falsy value, the socket will be destroyed instead of persisting
     * it for use with the next request.
     *
     * The `socket` argument can be an instance of `net.Socket`, a subclass of `stream.Duplex`.
     * @since v8.1.0
     */
    fun keepSocketAlive(socket: node.stream.Duplex)

    /**
     * Called when `socket` is attached to `request` after being persisted because of
     * the keep-alive options. Default behavior is to:
     *
     * ```js
     * socket.ref();
     * ```
     *
     * This method can be overridden by a particular `Agent` subclass.
     *
     * The `socket` argument can be an instance of `net.Socket`, a subclass of `stream.Duplex`.
     * @since v8.1.0
     */
    fun reuseSocket(
        socket: node.stream.Duplex,
        request: ClientRequest,
    )

    /**
     * Get a unique name for a set of request options, to determine whether a
     * connection can be reused. For an HTTP agent, this returns`host:port:localAddress` or `host:port:localAddress:family`. For an HTTPS agent,
     * the name includes the CA, cert, ciphers, and other HTTPS/TLS-specific options
     * that determine socket reusability.
     * @since v0.11.4
     * @param options A set of options providing information for name generation
     */
    fun getName(options: ClientRequestArgs = definedExternally): String
}
