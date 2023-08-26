@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve a start of authority record (`SOA` record) for
 * the `hostname`. The `address` argument passed to the `callback` function will
 * be an object with the following properties:
 *
 * * `nsname`
 * * `hostmaster`
 * * `serial`
 * * `refresh`
 * * `retry`
 * * `expire`
 * * `minttl`
 *
 * ```js
 * {
 *   nsname: 'ns.example.com',
 *   hostmaster: 'root.example.com',
 *   serial: 2013101809,
 *   refresh: 10000,
 *   retry: 2400,
 *   expire: 604800,
 *   minttl: 3600
 * }
 * ```
 * @since v0.11.10
 */
external fun resolveSoa(hostname: String, callback: (err: node.ErrnoException?, address: SoaRecord) -> Unit): Unit
