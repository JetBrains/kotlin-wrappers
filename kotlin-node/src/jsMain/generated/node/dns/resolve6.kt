@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve a IPv6 addresses (`AAAA` records) for the`hostname`. The `addresses` argument passed to the `callback` function
 * will contain an array of IPv6 addresses.
 * @since v0.1.16
 * @param hostname Host name to resolve.
 */
external fun resolve6(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<String>) -> Unit,
): Unit

external fun resolve6(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<RecordWithTtl>) -> Unit,
): Unit

external fun resolve6(
    hostname: String,
    options: ResolveOptions,
    callback: (err: node.ErrnoException?, addresses: Any /* string[] | RecordWithTtl[] */) -> Unit,
): Unit
