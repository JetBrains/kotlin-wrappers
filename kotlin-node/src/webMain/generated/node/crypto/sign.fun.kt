// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.buffer.NonSharedBuffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type.
 *
 * `algorithm` is required to be `null` or `undefined` for Ed25519, Ed448, and
 * ML-DSA.
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
    data: js.buffer.ArrayBufferView<*>,
    key: KeyLike,
): NonSharedBuffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type.
 *
 * `algorithm` is required to be `null` or `undefined` for Ed25519, Ed448, and
 * ML-DSA.
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
    data: js.buffer.ArrayBufferView<*>,
    key: SignKeyObjectInput,
): NonSharedBuffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type.
 *
 * `algorithm` is required to be `null` or `undefined` for Ed25519, Ed448, and
 * ML-DSA.
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
    data: js.buffer.ArrayBufferView<*>,
    key: SignPrivateKeyInput,
): NonSharedBuffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type.
 *
 * `algorithm` is required to be `null` or `undefined` for Ed25519, Ed448, and
 * ML-DSA.
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
    data: js.buffer.ArrayBufferView<*>,
    key: SignJsonWebKeyInput,
): NonSharedBuffer

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView<*>,
    key: KeyLike,
    callback: (error: js.errors.JsError?, data: NonSharedBuffer) -> Unit,
)

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView<*>,
    key: SignKeyObjectInput,
    callback: (error: js.errors.JsError?, data: NonSharedBuffer) -> Unit,
)

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView<*>,
    key: SignPrivateKeyInput,
    callback: (error: js.errors.JsError?, data: NonSharedBuffer) -> Unit,
)

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView<*>,
    key: SignJsonWebKeyInput,
    callback: (error: js.errors.JsError?, data: NonSharedBuffer) -> Unit,
)
