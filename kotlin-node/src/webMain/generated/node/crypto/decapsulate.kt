// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBuffer
import node.buffer.NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: KeyLike,
    ciphertext: ArrayBuffer,
): NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: KeyLike,
    ciphertext: js.buffer.ArrayBufferView<*>,
): NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: PrivateKeyInput,
    ciphertext: ArrayBuffer,
): NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: PrivateKeyInput,
    ciphertext: js.buffer.ArrayBufferView<*>,
): NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: JsonWebKeyInput,
    ciphertext: ArrayBuffer,
): NonSharedBuffer

/**
 * Key decapsulation using a KEM algorithm with a private key.
 *
 * Supported key types and their KEM algorithms are:
 *
 * * `'rsa'` RSA Secret Value Encapsulation
 * * `'ec'` DHKEM(P-256, HKDF-SHA256), DHKEM(P-384, HKDF-SHA256), DHKEM(P-521, HKDF-SHA256)
 * * `'x25519'` DHKEM(X25519, HKDF-SHA256)
 * * `'x448'` DHKEM(X448, HKDF-SHA512)
 * * `'ml-kem-512'` ML-KEM
 * * `'ml-kem-768'` ML-KEM
 * * `'ml-kem-1024'` ML-KEM
 *
 * If `key` is not a {@link KeyObject}, this function behaves as if `key` had been
 * passed to `crypto.createPrivateKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun decapsulate(
    key: JsonWebKeyInput,
    ciphertext: js.buffer.ArrayBufferView<*>,
): NonSharedBuffer

external fun decapsulate(
    key: KeyLike,
    ciphertext: ArrayBuffer,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)

external fun decapsulate(
    key: KeyLike,
    ciphertext: js.buffer.ArrayBufferView<*>,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)

external fun decapsulate(
    key: PrivateKeyInput,
    ciphertext: ArrayBuffer,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)

external fun decapsulate(
    key: PrivateKeyInput,
    ciphertext: js.buffer.ArrayBufferView<*>,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)

external fun decapsulate(
    key: JsonWebKeyInput,
    ciphertext: ArrayBuffer,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)

external fun decapsulate(
    key: JsonWebKeyInput,
    ciphertext: js.buffer.ArrayBufferView<*>,
    callback: (err: js.errors.JsError, sharedKey: NonSharedBuffer) -> Unit,
)
