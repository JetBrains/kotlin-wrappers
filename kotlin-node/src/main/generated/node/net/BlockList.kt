// Automatically generated - do not modify!

@file:JsModule("node:net")
@file:JsNonModule

package node.net

external class BlockList {
    /**
     * Adds a rule to block the given IP address.
     * @since v15.0.0, v14.18.0
     * @param address An IPv4 or IPv6 address.
     * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
     */
    fun addAddress(
        address: String,
        type: IPVersion = definedExternally,
    )

    fun addAddress(address: SocketAddress)

    /**
     * Adds a rule to block a range of IP addresses from `start` (inclusive) to`end` (inclusive).
     * @since v15.0.0, v14.18.0
     * @param start The starting IPv4 or IPv6 address in the range.
     * @param end The ending IPv4 or IPv6 address in the range.
     * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
     */
    fun addRange(
        start: String,
        end: String,
        type: IPVersion = definedExternally,
    )

    fun addRange(
        start: SocketAddress,
        end: SocketAddress,
    )

    /**
     * Adds a rule to block a range of IP addresses specified as a subnet mask.
     * @since v15.0.0, v14.18.0
     * @param net The network IPv4 or IPv6 address.
     * @param prefix The number of CIDR prefix bits. For IPv4, this must be a value between `0` and `32`. For IPv6, this must be between `0` and `128`.
     * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
     */
    fun addSubnet(
        net: SocketAddress,
        prefix: Number,
    )

    fun addSubnet(
        net: String,
        prefix: Number,
        type: IPVersion = definedExternally,
    )

    /**
     * Returns `true` if the given IP address matches any of the rules added to the`BlockList`.
     *
     * ```js
     * const blockList = new net.BlockList();
     * blockList.addAddress('123.123.123.123');
     * blockList.addRange('10.0.0.1', '10.0.0.10');
     * blockList.addSubnet('8592:757c:efae:4e45::', 64, 'ipv6');
     *
     * console.log(blockList.check('123.123.123.123'));  // Prints: true
     * console.log(blockList.check('10.0.0.3'));  // Prints: true
     * console.log(blockList.check('222.111.111.222'));  // Prints: false
     *
     * // IPv6 notation for IPv4 addresses works:
     * console.log(blockList.check('::ffff:7b7b:7b7b', 'ipv6')); // Prints: true
     * console.log(blockList.check('::ffff:123.123.123.123', 'ipv6')); // Prints: true
     * ```
     * @since v15.0.0, v14.18.0
     * @param address The IP address to check
     * @param [type='ipv4'] Either `'ipv4'` or `'ipv6'`.
     */
    fun check(address: SocketAddress): Boolean
    fun check(
        address: String,
        type: IPVersion = definedExternally,
    ): Boolean
}
