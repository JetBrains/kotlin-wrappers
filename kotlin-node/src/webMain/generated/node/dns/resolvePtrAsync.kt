// Generated by Karakum - do not modify it manually!

@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve pointer records (`PTR` records) for the `hostname`. On success, the `Promise` is resolved with an array of strings
 * containing the reply records.
 * @since v10.6.0
 */
@JsName("resolvePtr")
external fun resolvePtrAsync(hostname: String): Promise<js.array.ReadonlyArray<String>>
