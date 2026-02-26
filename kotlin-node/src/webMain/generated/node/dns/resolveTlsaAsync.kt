// Automatically generated - do not modify!

@file:JsModule("node:dns/promises")

package node.dns

/**
 * Uses the DNS protocol to resolve certificate associations (`TLSA` records) for
 * the `hostname`. On success, the `Promise` is resolved with an array of objectsAdd commentMore actions
 * with these properties:
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
@JsName("resolveTlsa")
external fun resolveTlsaAsync(hostname: String): js.promise.Promise<js.array.ReadonlyArray<TlsaRecord>>
