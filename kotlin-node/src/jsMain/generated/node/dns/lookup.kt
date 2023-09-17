@file:JsModule("node:dns")

package node.dns


/**
 * Resolves a host name (e.g. `'nodejs.org'`) into the first found A (IPv4) or
 * AAAA (IPv6) record. All `option` properties are optional. If `options` is an
 * integer, then it must be `4` or `6` – if `options` is not provided, then IPv4
 * and IPv6 addresses are both returned if found.
 *
 * With the `all` option set to `true`, the arguments for `callback` change to`(err, addresses)`, with `addresses` being an array of objects with the
 * properties `address` and `family`.
 *
 * On error, `err` is an `Error` object, where `err.code` is the error code.
 * Keep in mind that `err.code` will be set to `'ENOTFOUND'` not only when
 * the host name does not exist but also when the lookup fails in other ways
 * such as no available file descriptors.
 *
 * `dns.lookup()` does not necessarily have anything to do with the DNS protocol.
 * The implementation uses an operating system facility that can associate names
 * with addresses, and vice versa. This implementation can have subtle but
 * important consequences on the behavior of any Node.js program. Please take some
 * time to consult the `Implementation considerations section` before using`dns.lookup()`.
 *
 * Example usage:
 *
 * ```js
 * const dns = require('dns');
 * const options = {
 *   family: 6,
 *   hints: dns.ADDRCONFIG | dns.V4MAPPED,
 * };
 * dns.lookup('example.com', options, (err, address, family) =>
 *   console.log('address: %j family: IPv%s', address, family));
 * // address: "2606:2800:220:1:248:1893:25c8:1946" family: IPv6
 *
 * // When options.all is true, the result will be an Array.
 * options.all = true;
 * dns.lookup('example.com', options, (err, addresses) =>
 *   console.log('addresses: %j', addresses));
 * // addresses: [{"address":"2606:2800:220:1:248:1893:25c8:1946","family":6}]
 * ```
 *
 * If this method is invoked as its `util.promisify()` ed version, and `all`is not set to `true`, it returns a `Promise` for an `Object` with `address` and`family` properties.
 * @since v0.1.90
 */
external fun lookup(
    hostname: String,
    family: Double,
    callback: (err: node.ErrnoException?, address: String, family: Double) -> Unit,
): Unit

external fun lookup(
    hostname: String,
    options: LookupOneOptions,
    callback: (err: node.ErrnoException?, address: String, family: Double) -> Unit,
): Unit

external fun lookup(
    hostname: String,
    options: LookupAllOptions,
    callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<LookupAddress>) -> Unit,
): Unit

external fun lookup(
    hostname: String,
    options: LookupOptions,
    callback: (err: node.ErrnoException?, address: Any /* string | LookupAddress[] */, family: Double) -> Unit,
): Unit

external fun lookup(
    hostname: String,
    callback: (err: node.ErrnoException?, address: String, family: Double) -> Unit,
): Unit
