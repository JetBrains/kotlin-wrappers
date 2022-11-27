// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import js.buffer.ArrayBufferView
import node.buffer.Buffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPrivateKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun sign(
    algorithm: String?,
    data: ArrayBufferView,
    key: Any, /* KeyLike | SignKeyObjectInput | SignPrivateKeyInput */
): Buffer


/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPrivateKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun sign(
    algorithm: String?,
    data: ArrayBufferView,
    key: Any, /* KeyLike | SignKeyObjectInput | SignPrivateKeyInput */
    callback: (
        error: Error?,
        data: Buffer,
    ) -> Unit,
)
