@file:JsModule("node:dns")

package node.dns


/**
 * Returns an array of IP address strings, formatted according to [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6),
 * that are currently configured for DNS resolution. A string will include a port
 * section if a custom port is used.
 *
 * ```js
 * [
 *   '4.4.4.4',
 *   '2001:4860:4860::8888',
 *   '4.4.4.4:1053',
 *   '[2001:4860:4860::8888]:1053',
 * ]
 * ```
 * @since v0.11.3
 */
external fun getServers(): js.core.ReadonlyArray<String>
