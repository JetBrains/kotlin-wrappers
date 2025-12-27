// Automatically generated - do not modify!

@file:JsModule("node:dns")

package node.dns

/**
 * Uses the DNS protocol to resolve certificate associations (`TLSA` records) for
 * the `hostname`. The `records` argument passed to the `callback` function is an
 * array of objects with these properties:
 *
 * * `certUsage`
 * * `selector`
 * * `match`
 * * `data`
 *
 * ```js
 * {
 *   certUsage: 3,
 *   selector: 1,
 *   match: 1,
 *   data: [ArrayBuffer]
 * }
 * ```
 * @since v23.9.0, v22.15.0
 */
external fun resolveTlsa(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.array.ReadonlyArray<TlsaRecord>) -> Unit,
)
