// Automatically generated - do not modify!

@file:JsModule("node:dns/promises")

package node.dns

/**
 * Uses the DNS protocol to resolve pointer records (`PTR` records) for the `hostname`. On success, the `Promise` is resolved with an array of strings
 * containing the reply records.
 * @since v10.6.0
 */
@JsName("resolvePtr")
external fun resolvePtrAsync(hostname: String): js.promise.Promise<js.array.ReadonlyArray<String>>
