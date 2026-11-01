// Automatically generated - do not modify!

package node.net

@kotlinx.js.JsPlainObject
external interface TcpSocketConnectOpts {
    var port: Double
    var host: String?
    var localAddress: String?
    var localPort: Double?
    var hints: Double?
    var family: Double?
    var lookup: LookupFunction?

    /**
     * @since v18.13.0
     */
    var autoSelectFamily: Boolean?

    /**
     * @since v18.13.0
     */
    var autoSelectFamilyAttemptTimeout: Double?
}
