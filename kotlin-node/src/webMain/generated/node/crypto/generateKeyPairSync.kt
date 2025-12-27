// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.buffer.NonSharedBuffer

/**
 * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
 * Ed25519, Ed448, X25519, X448, DH, and ML-DSA are currently supported.
 *
 * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
 * behaves as if `keyObject.export()` had been called on its result. Otherwise,
 * the respective part of the key is returned as a `KeyObject`.
 *
 * When encoding public keys, it is recommended to use `'spki'`. When encoding
 * private keys, it is recommended to use `'pkcs8'` with a strong passphrase,
 * and to keep the passphrase confidential.
 *
 * ```js
 * const {
 *   generateKeyPairSync,
 * } = await import('node:crypto');
 *
 * const {
 *   publicKey,
 *   privateKey,
 * } = generateKeyPairSync('rsa', {
 *   modulusLength: 4096,
 *   publicKeyEncoding: {
 *     type: 'spki',
 *     format: 'pem',
 *   },
 *   privateKeyEncoding: {
 *     type: 'pkcs8',
 *     format: 'pem',
 *     cipher: 'aes-256-cbc',
 *     passphrase: 'top secret',
 *   },
 * });
 * ```
 *
 * The return value `{ publicKey, privateKey }` represents the generated key pair.
 * When PEM encoding was selected, the respective key will be a string, otherwise
 * it will be a buffer containing the data encoded as DER.
 * @since v10.12.0
 * @param type The asymmetric key type to generate. See the
 * supported [asymmetric key types](https://nodejs.org/docs/latest-v24.x/api/crypto.html#asymmetric-key-types).
 */
external fun generateKeyPairSync(
    type: KeyType.rsa,
    options: RSAKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.rsa,
    options: RSAKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.rsa,
    options: RSAKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.rsa,
    options: RSAKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.rsa,
    options: RSAKeyPairKeyObjectOptions,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairKeyObjectOptions,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.dsa,
    options: DSAKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.dsa,
    options: DSAKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.dsa,
    options: DSAKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.dsa,
    options: DSAKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.dsa,
    options: DSAKeyPairKeyObjectOptions,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.ec,
    options: ECKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.ec,
    options: ECKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ec,
    options: ECKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.ec,
    options: ECKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ec,
    options: ECKeyPairKeyObjectOptions,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.ed25519,
    options: ED25519KeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.ed25519,
    options: ED25519KeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ed25519,
    options: ED25519KeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.ed25519,
    options: ED25519KeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ed25519,
    options: ED25519KeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.ed448,
    options: ED448KeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.ed448,
    options: ED448KeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ed448,
    options: ED448KeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.ed448,
    options: ED448KeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.ed448,
    options: ED448KeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.x25519,
    options: X25519KeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.x25519,
    options: X25519KeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.x25519,
    options: X25519KeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.x25519,
    options: X25519KeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.x25519,
    options: X25519KeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.x448,
    options: X448KeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.x448,
    options: X448KeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.x448,
    options: X448KeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.x448,
    options: X448KeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.x448,
    options: X448KeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.mlDsa,
    options: MLDSAKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.mlDsa,
    options: MLDSAKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.mlDsa,
    options: MLDSAKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.mlDsa,
    options: MLDSAKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.mlDsa,
    options: MLDSAKeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.mlKem,
    options: MLKEMKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.mlKem,
    options: MLKEMKeyPairPemDerOptions,
): KeyPairSyncResult<String, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.mlKem,
    options: MLKEMKeyPairDerPemOptions,
): KeyPairSyncResult<NonSharedBuffer, String>

external fun generateKeyPairSync(
    type: KeyType.mlKem,
    options: MLKEMKeyPairDerDerOptions,
): KeyPairSyncResult<NonSharedBuffer, NonSharedBuffer>

external fun generateKeyPairSync(
    type: KeyType.mlKem,
    options: MLKEMKeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult

external fun generateKeyPairSync(
    type: KeyType.slhDsa,
    options: SLHDSAKeyPairPemPemOptions,
): KeyPairSyncResult<String, String>

external fun generateKeyPairSync(
    type: KeyType.slhDsa,
    options: SLHDSAKeyPairPemDerOptions,
): KeyPairSyncResult<String, node.buffer.Buffer<*>>

external fun generateKeyPairSync(
    type: KeyType.slhDsa,
    options: SLHDSAKeyPairDerPemOptions,
): KeyPairSyncResult<node.buffer.Buffer<*>, String>

external fun generateKeyPairSync(
    type: KeyType.slhDsa,
    options: SLHDSAKeyPairDerDerOptions,
): KeyPairSyncResult<node.buffer.Buffer<*>, node.buffer.Buffer<*>>

external fun generateKeyPairSync(
    type: KeyType.slhDsa,
    options: SLHDSAKeyPairKeyObjectOptions = definedExternally,
): KeyPairKeyObjectResult
