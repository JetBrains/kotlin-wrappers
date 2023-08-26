@file:JsModule("node:dns")

package node.dns


/**
 * Uses the DNS protocol to resolve `CAA` records for the `hostname`. The`addresses` argument passed to the `callback` function
 * will contain an array of certification authority authorization records
 * available for the `hostname` (e.g. `[{critical: 0, iodef: 'mailto:pki@example.com'}, {critical: 128, issue: 'pki.example.com'}]`).
 * @since v15.0.0, v14.17.0
 */
external fun resolveCaa(hostname: String, callback: (err: node.ErrnoException?, records: js.core.ReadonlyArray<CaaRecord>) -> Unit): Unit
