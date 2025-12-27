// Automatically generated - do not modify!

@file:JsModule("node:net")

package node.net

/**
 * @since v15.14.0, v14.18.0
 */
external class SocketAddress {
    constructor (options: SocketAddressInitOptions)

    /**
     * Either \`'ipv4'\` or \`'ipv6'\`.
     * @since v15.14.0, v14.18.0
     */
    val address: String

    /**
     * Either \`'ipv4'\` or \`'ipv6'\`.
     * @since v15.14.0, v14.18.0
     */
    val family: IPVersion

    /**
     * @since v15.14.0, v14.18.0
     */
    val port: Double

    /**
     * @since v15.14.0, v14.18.0
     */
    val flowlabel: Double

    companion object {
        /**
         * @since v22.13.0
         * @param input An input string containing an IP address and optional port,
         * e.g. `123.1.2.3:1234` or `[1::1]:1234`.
         * @returns Returns a `SocketAddress` if parsing was successful.
         * Otherwise returns `undefined`.
         */
        fun parse(input: String): SocketAddress?
    }
}
