// Automatically generated - do not modify!

@file:JsModule("node:dns/promises")

package node.dns

/**
 * Uses the DNS protocol to resolve service records (`SRV` records) for the `hostname`. On success, the `Promise` is resolved with an array of objects with
 * the following properties:
 *
 * * `priority`
 * * `weight`
 * * `port`
 * * `name`
 *
 * ```js
 * {
 *   priority: 10,
 *   weight: 5,
 *   port: 21223,
 *   name: 'service.example.com'
 * }
 * ```
 * @since v10.6.0
 */
@JsName("resolveSrv")
external fun resolveSrvAsync(hostname: String): js.promise.Promise<js.array.ReadonlyArray<SrvRecord>>
