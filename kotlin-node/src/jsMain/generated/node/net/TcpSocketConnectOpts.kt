// Automatically generated - do not modify!

package node.net

external interface TcpSocketConnectOpts : ConnectOpts {
    var port: Number
    var host: String?
    var localAddress: String?
    var localPort: Number?
    var hints: Number?
    var family: Number?
    var lookup: LookupFunction?
    var noDelay: Boolean?
    var keepAlive: Boolean?
    var keepAliveInitialDelay: Number?

    /**
     * @since v18.13.0
     */
    var autoSelectFamily: Boolean?

    /**
     * @since v18.13.0
     */
    var autoSelectFamilyAttemptTimeout: Number?
}
