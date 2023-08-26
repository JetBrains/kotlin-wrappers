@file:JsModule("node:dns")

package node.dns


/**
 * The `dns` module enables name resolution. For example, use it to look up IP
 * addresses of host names.
 *
 * Although named for the [Domain Name System (DNS)](https://en.wikipedia.org/wiki/Domain_Name_System), it does not always use the
 * DNS protocol for lookups. {@link lookup} uses the operating system
 * facilities to perform name resolution. It may not need to perform any network
 * communication. To perform name resolution the way other applications on the same
 * system do, use {@link lookup}.
 *
 * ```js
 * const dns = require('dns');
 *
 * dns.lookup('example.org', (err, address, family) => {
 *   console.log('address: %j family: IPv%s', address, family);
 * });
 * // address: "93.184.216.34" family: IPv4
 * ```
 *
 * All other functions in the `dns` module connect to an actual DNS server to
 * perform name resolution. They will always use the network to perform DNS
 * queries. These functions do not use the same set of configuration files used by {@link lookup} (e.g. `/etc/hosts`). Use these functions to always perform
 * DNS queries, bypassing other name-resolution facilities.
 *
 * ```js
 * const dns = require('dns');
 *
 * dns.resolve4('archive.org', (err, addresses) => {
 *   if (err) throw err;
 *
 *   console.log(`addresses: ${JSON.stringify(addresses)}`);
 *
 *   addresses.forEach((a) => {
 *     dns.reverse(a, (err, hostnames) => {
 *       if (err) {
 *         throw err;
 *       }
 *       console.log(`reverse for ${a}: ${JSON.stringify(hostnames)}`);
 *     });
 *   });
 * });
 * ```
 *
 * See the `Implementation considerations section` for more information.
 * @see [source](https://github.com/nodejs/node/blob/v18.0.0/lib/dns.js)
 */
