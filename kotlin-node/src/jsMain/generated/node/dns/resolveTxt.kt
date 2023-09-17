@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve text queries (`TXT` records) for the`hostname`. The `records` argument passed to the `callback` function is a
 * two-dimensional array of the text records available for `hostname` (e.g.`[ ['v=spf1 ip4:0.0.0.0 ', '~all' ] ]`). Each sub-array contains TXT chunks of
 * one record. Depending on the use case, these could be either joined together or
 * treated separately.
 * @since v0.1.27
 */
external fun resolveTxt(
    hostname: String,
    callback: (err: node.ErrnoException?, addresses: js.core.ReadonlyArray<js.core.ReadonlyArray<String>>) -> Unit,
): Unit
