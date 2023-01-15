// Automatically generated - do not modify!

@file:JsModule("node:net")

package node.net

/**
 * Returns `6` if `input` is an IPv6 address. Returns `4` if `input` is an IPv4
 * address in [dot-decimal notation](https://en.wikipedia.org/wiki/Dot-decimal_notation) with no leading zeroes. Otherwise, returns`0`.
 *
 * ```js
 * net.isIP('::1'); // returns 6
 * net.isIP('127.0.0.1'); // returns 4
 * net.isIP('127.000.000.001'); // returns 0
 * net.isIP('127.0.0.1/24'); // returns 0
 * net.isIP('fhqwhgads'); // returns 0
 * ```
 * @since v0.3.0
 */
external fun isIP(
    input: String,
): Number
