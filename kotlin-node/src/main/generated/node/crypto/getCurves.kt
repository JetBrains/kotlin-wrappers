// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import js.core.ReadonlyArray

/**
 * ```js
 * const {
 *   getCurves
 * } = await import('crypto');
 *
 * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
 * ```
 * @since v2.3.0
 * @return An array with the names of the supported elliptic curves.
 */
external fun getCurves(): ReadonlyArray<String>
