// Automatically generated - do not modify!

package node.http

sealed external interface AgentOptions : node.net.TcpSocketConnectOpts /* Partial */ {
    /**
     * Keep sockets around in a pool to be used by other requests in the future. Default = false
     */
    override var keepAlive: Boolean?

    /**
     * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
     * Only relevant if keepAlive is set to true.
     */
    var keepAliveMsecs: Number?

    /**
     * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
     */
    var maxSockets: Number?

    /**
     * Maximum number of sockets allowed for all hosts in total. Each request will use a new socket until the maximum is reached. Default: Infinity.
     */
    var maxTotalSockets: Number?

    /**
     * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
     */
    var maxFreeSockets: Number?

    /**
     * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
     */
    var timeout: Number?

    /**
     * Scheduling strategy to apply when picking the next free socket to use.
     * @default `lifo`
     */
    var scheduling: Any? /* 'fifo' | 'lifo' */
}
