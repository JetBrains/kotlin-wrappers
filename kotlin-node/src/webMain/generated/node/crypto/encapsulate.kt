// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Key encapsulation using a KEM algorithm with a public key.
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
 * passed to `crypto.createPublicKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun encapsulate(key: KeyLike): EncapsulateResult

/**
 * Key encapsulation using a KEM algorithm with a public key.
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
 * passed to `crypto.createPublicKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun encapsulate(key: PublicKeyInput): EncapsulateResult

/**
 * Key encapsulation using a KEM algorithm with a public key.
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
 * passed to `crypto.createPublicKey()`.
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v24.7.0
 */
external fun encapsulate(key: JsonWebKeyInput): EncapsulateResult

external fun encapsulate(
    key: KeyLike,
    callback: (err: js.errors.JsError, result: EncapsulateCallbackResult) -> Unit,
)

external fun encapsulate(
    key: PublicKeyInput,
    callback: (err: js.errors.JsError, result: EncapsulateCallbackResult) -> Unit,
)

external fun encapsulate(
    key: JsonWebKeyInput,
    callback: (err: js.errors.JsError, result: EncapsulateCallbackResult) -> Unit,
)
