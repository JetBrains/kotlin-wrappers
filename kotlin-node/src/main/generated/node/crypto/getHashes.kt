// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import js.core.ReadonlyArray

/**
 * ```js
 * const {
 *   getHashes
 * } = await import('crypto');
 *
 * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
 * ```
 * @since v0.9.3
 * @return An array of the names of the supported hash algorithms, such as `'RSA-SHA256'`. Hash algorithms are also called "digest" algorithms.
 */
external fun getHashes(): ReadonlyArray<String>
