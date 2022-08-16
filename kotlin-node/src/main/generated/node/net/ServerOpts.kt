// Automatically generated - do not modify!

package node.net

sealed external interface ServerOpts {
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
}
