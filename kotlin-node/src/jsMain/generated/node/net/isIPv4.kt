// Automatically generated - do not modify!

@file:JsModule("node:net")

package node.net

/**
 * Returns `true` if `input` is an IPv4 address in [dot-decimal notation](https://en.wikipedia.org/wiki/Dot-decimal_notation) with no
 * leading zeroes. Otherwise, returns `false`.
 *
 * ```js
 * net.isIPv4('127.0.0.1'); // returns true
 * net.isIPv4('127.000.000.001'); // returns false
 * net.isIPv4('127.0.0.1/24'); // returns false
 * net.isIPv4('fhqwhgads'); // returns false
 * ```
 * @since v0.3.0
 */
external fun isIPv4(
    input: String,
): Boolean
