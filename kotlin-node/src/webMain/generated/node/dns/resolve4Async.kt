// Automatically generated - do not modify!

@file:JsModule("node:dns/promises")

package node.dns

/**
 * Uses the DNS protocol to resolve IPv4 addresses (`A` records) for the `hostname`. On success, the `Promise` is resolved with an array of IPv4
 * addresses (e.g. `['74.125.79.104', '74.125.79.105', '74.125.79.106']`).
 * @since v10.6.0
 * @param hostname Host name to resolve.
 */
@JsName("resolve4")
external fun resolve4Async(hostname: String): js.promise.Promise<js.array.ReadonlyArray<String>>

@JsName("resolve4")
external fun resolve4Async(
    hostname: String,
    options: ResolveWithTtlOptions,
): js.promise.Promise<js.array.ReadonlyArray<RecordWithTtl>>

@JsName("resolve4")
external fun resolve4Async(
    hostname: String,
    options: ResolveOptions,
): js.promise.Promise<Any /* string[] | RecordWithTtl[] */>
