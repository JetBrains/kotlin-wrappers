// Automatically generated - do not modify!

package node.net

sealed external interface SocketAddressInitOptions {
    /**
     * The network address as either an IPv4 or IPv6 string.
     * @default 127.0.0.1
     */
    var address: String?

    /**
     * @default `'ipv4'`
     */
    var family: IPVersion?

    /**
     * An IPv6 flow-label used only if `family` is `'ipv6'`.
     * @default 0
     */
    var flowlabel: Number?

    /**
     * An IP port.
     * @default 0
     */
    var port: Number?
}
