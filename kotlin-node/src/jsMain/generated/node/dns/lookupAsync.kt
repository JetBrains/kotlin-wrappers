@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Resolves a host name (e.g. `'nodejs.org'`) into the first found A (IPv4) or
 * AAAA (IPv6) record. All `option` properties are optional. If `options` is an
 * integer, then it must be `4` or `6` – if `options` is not provided, then IPv4
 * and IPv6 addresses are both returned if found.
 *
 * With the `all` option set to `true`, the `Promise` is resolved with `addresses`being an array of objects with the properties `address` and `family`.
 *
 * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
 * Keep in mind that `err.code` will be set to `'ENOTFOUND'` not only when
 * the host name does not exist but also when the lookup fails in other ways
 * such as no available file descriptors.
 *
 * `dnsPromises.lookup()` does not necessarily have anything to do with the DNS
 * protocol. The implementation uses an operating system facility that can
 * associate names with addresses, and vice versa. This implementation can have
 * subtle but important consequences on the behavior of any Node.js program. Please
 * take some time to consult the `Implementation considerations section` before
 * using `dnsPromises.lookup()`.
 *
 * Example usage:
 *
 * ```js
 * const dns = require('dns');
 * const dnsPromises = dns.promises;
 * const options = {
 *   family: 6,
 *   hints: dns.ADDRCONFIG | dns.V4MAPPED,
 * };
 *
 * dnsPromises.lookup('example.com', options).then((result) => {
 *   console.log('address: %j family: IPv%s', result.address, result.family);
 *   // address: "2606:2800:220:1:248:1893:25c8:1946" family: IPv6
 * });
 *
 * // When options.all is true, the result will be an Array.
 * options.all = true;
 * dnsPromises.lookup('example.com', options).then((result) => {
 *   console.log('addresses: %j', result);
 *   // addresses: [{"address":"2606:2800:220:1:248:1893:25c8:1946","family":6}]
 * });
 * ```
 * @since v10.6.0
 */

@JsName("lookup")
external fun lookupAsync(hostname: String, family: Double): Promise<LookupAddress>


@JsName("lookup")
external fun lookupAsync(hostname: String, options: LookupOneOptions): Promise<LookupAddress>


@JsName("lookup")
external fun lookupAsync(hostname: String, options: LookupAllOptions): Promise<js.core.ReadonlyArray<LookupAddress>>


@JsName("lookup")
external fun lookupAsync(hostname: String, options: LookupOptions): Promise<Any /* LookupAddress | LookupAddress[] */>


@JsName("lookup")
external fun lookupAsync(hostname: String): Promise<LookupAddress>
