// Automatically generated - do not modify!

package node.http

import node.net.TcpSocketConnectOpts

external interface AgentOptions : TcpSocketConnectOpts {
    /**
     * Keep sockets around in a pool to be used by other requests in the future. Default = false
     */
    override var keepAlive: Boolean?

    /**
     * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
     * Only relevant if keepAlive is set to true.
     */
    var keepAliveMsecs: Double?

    /**
     * Milliseconds to subtract from
     * the server-provided `keep-alive: timeout=...` hint when determining socket
     * expiration time. This buffer helps ensure the agent closes the socket
     * slightly before the server does, reducing the chance of sending a request
     * on a socket that’s about to be closed by the server.
     * @since v24.7.0
     * @default 1000
     */
    var agentKeepAliveTimeoutBuffer: Double?

    /**
     * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
     */
    var maxSockets: Double?

    /**
     * Maximum number of sockets allowed for all hosts in total. Each request will use a new socket until the maximum is reached. Default: Infinity.
     */
    var maxTotalSockets: Double?

    /**
     * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
     */
    var maxFreeSockets: Double?

    /**
     * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
     */
    var timeout: Double?

    /**
     * Scheduling strategy to apply when picking the next free socket to use.
     * @default `lifo`
     */
    var scheduling: AgentOptionsScheduling?

    /**
     * Environment variables for proxy configuration. See
     * [Built-in Proxy Support](https://nodejs.org/docs/latest-v24.x/api/http.html#built-in-proxy-support) for details.
     * @since v24.5.0
     */
    var proxyEnv: ProxyEnv?

    /**
     * Default port to use when the port is not specified in requests.
     * @since v24.5.0
     */
    var defaultPort: Double?

    /**
     * The protocol to use for the agent.
     * @since v24.5.0
     */
    var protocol: String?
}
