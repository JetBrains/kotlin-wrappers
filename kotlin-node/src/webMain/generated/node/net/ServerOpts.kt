// Automatically generated - do not modify!

package node.net

external interface ServerOpts {
    /**
     * Indicates whether half-opened TCP connections are allowed.
     * @default false
     */
    var allowHalfOpen: Boolean?

    /**
     * Indicates whether the socket should be paused on incoming connections.
     * @default false
     */
    var pauseOnConnect: Boolean?

    /**
     * If set to `true`, it disables the use of Nagle's algorithm immediately after a new incoming connection is received.
     * @default false
     * @since v16.5.0
     */
    var noDelay: Boolean?

    /**
     * If set to `true`, it enables keep-alive functionality on the socket immediately after a new incoming connection is received,
     * similarly on what is done in `socket.setKeepAlive([enable][, initialDelay])`.
     * @default false
     * @since v16.5.0
     */
    var keepAlive: Boolean?

    /**
     * If set to a positive number, it sets the initial delay before the first keepalive probe is sent on an idle socket.
     * @default 0
     * @since v16.5.0
     */
    var keepAliveInitialDelay: Double?

    /**
     * Optionally overrides all `net.Socket`s' `readableHighWaterMark` and `writableHighWaterMark`.
     * @default See [stream.getDefaultHighWaterMark()](https://nodejs.org/docs/latest-v24.x/api/stream.html#streamgetdefaulthighwatermarkobjectmode).
     * @since v18.17.0, v20.1.0
     */
    var highWaterMark: Double?

    /**
     * `blockList` can be used for disabling inbound
     * access to specific IP addresses, IP ranges, or IP subnets. This does not
     * work if the server is behind a reverse proxy, NAT, etc. because the address
     * checked against the block list is the address of the proxy, or the one
     * specified by the NAT.
     * @since v22.13.0
     */
    var blockList: BlockList?
}
