// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBufferView

/**
 * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
 * key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPublicKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * The `signature` argument is the previously calculated signature for the `data`.
 *
 * Because public keys can be derived from private keys, a private key or a public
 * key may be passed for `key`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun verify(
    algorithm: String?,
    data: ArrayBufferView,
    key: Any, /* KeyLike | VerifyKeyObjectInput | VerifyPublicKeyInput | VerifyJsonWebKeyInput */
    signature: ArrayBufferView,
): Boolean


/**
 * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
 * key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPublicKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * The `signature` argument is the previously calculated signature for the `data`.
 *
 * Because public keys can be derived from private keys, a private key or a public
 * key may be passed for `key`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun verify(
    algorithm: String?,
    data: ArrayBufferView,
    key: Any, /* KeyLike | VerifyKeyObjectInput | VerifyPublicKeyInput | VerifyJsonWebKeyInput */
    signature: ArrayBufferView,
    callback: (
        error: Error?,
        result: Boolean,
    ) -> Unit,
)
