// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * A convenient alias for `crypto.webcrypto.getRandomValues()`.
 * This implementation is not compliant with the Web Crypto spec,
 * to write web-compatible code use `crypto.webcrypto.getRandomValues()` instead.
 * @since v17.4.0
 * @returns Returns `typedArray`.
 */
external fun <T : Any /* ArrayBufferView | ArrayBuffer */> getRandomValues(
    typedArray: T,
): T
