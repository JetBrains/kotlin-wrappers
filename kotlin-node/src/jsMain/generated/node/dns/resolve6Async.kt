@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve IPv6 addresses (`AAAA` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv6
 * addresses.
 * @since v10.6.0
 * @param hostname Host name to resolve.
 */

@JsName("resolve6")
external fun resolve6Async(hostname: String): Promise<js.core.ReadonlyArray<String>>


@JsName("resolve6")
external fun resolve6Async(
    hostname: String,
    options: ResolveWithTtlOptions,
): Promise<js.core.ReadonlyArray<RecordWithTtl>>


@JsName("resolve6")
external fun resolve6Async(hostname: String, options: ResolveOptions): Promise<Any /* string[] | RecordWithTtl[] */>
