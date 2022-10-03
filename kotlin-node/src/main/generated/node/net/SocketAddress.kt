// Automatically generated - do not modify!

@file:JsModule("node:net")
@file:JsNonModule

package node.net

external class SocketAddress {
    constructor(options: SocketAddressInitOptions)

    /**
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
    val port: Number

    /**
     * @since v15.14.0, v14.18.0
     */
    val flowlabel: Number
}
