// Automatically generated - do not modify!

package web.crypto

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.ReadonlyArray
import js.promise.Promise

/**
 * This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto)
 */
sealed external class SubtleCrypto {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt) */
    fun decrypt(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun decrypt(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun decrypt(
        algorithm: RsaOaepParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun decrypt(
        algorithm: AesCtrParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun decrypt(
        algorithm: AesCbcParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun decrypt(
        algorithm: AesGcmParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits) */
    fun deriveBits(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        length: Number,
    ): Promise<ArrayBuffer>

    fun deriveBits(
        algorithm: String,
        baseKey: CryptoKey,
        length: Number,
    ): Promise<ArrayBuffer>

    fun deriveBits(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        length: Number,
    ): Promise<ArrayBuffer>

    fun deriveBits(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        length: Number,
    ): Promise<ArrayBuffer>

    fun deriveBits(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        length: Number,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey) */
    fun deriveKey(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun deriveKey(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest) */
    fun digest(
        algorithm: Algorithm,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun digest(
        algorithm: String,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt) */
    fun encrypt(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun encrypt(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun encrypt(
        algorithm: RsaOaepParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun encrypt(
        algorithm: AesCtrParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun encrypt(
        algorithm: AesCbcParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun encrypt(
        algorithm: AesGcmParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/exportKey) */
    fun exportKey(
        format: KeyFormat.jwk,
        key: CryptoKey,
    ): Promise<JsonWebKey>

    fun exportKey(
        format: KeyFormat,
        key: CryptoKey,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey) */
    fun generateKey(
        algorithm: Ed25519,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage /* "sign" | "verify" */>,
    ): Promise<CryptoKeyPair>

    fun generateKey(
        algorithm: RsaHashedKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKeyPair>

    fun generateKey(
        algorithm: EcKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKeyPair>

    fun generateKey(
        algorithm: AesKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun generateKey(
        algorithm: HmacKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun generateKey(
        algorithm: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun generateKey(
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<Any /* CryptoKeyPair | CryptoKey */>

    fun generateKey(
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<Any /* CryptoKeyPair | CryptoKey */>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey) */
    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun importKey(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign) */
    fun sign(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun sign(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun sign(
        algorithm: RsaPssParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    fun sign(
        algorithm: EcdsaParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey) */
    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    fun unwrapKey(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify) */
    fun verify(
        algorithm: Algorithm,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<Boolean>

    fun verify(
        algorithm: String,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<Boolean>

    fun verify(
        algorithm: RsaPssParams,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<Boolean>

    fun verify(
        algorithm: EcdsaParams,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey) */
    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: Algorithm,
    ): Promise<ArrayBuffer>

    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: String,
    ): Promise<ArrayBuffer>

    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: RsaOaepParams,
    ): Promise<ArrayBuffer>

    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesCtrParams,
    ): Promise<ArrayBuffer>

    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesCbcParams,
    ): Promise<ArrayBuffer>

    fun wrapKey(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesGcmParams,
    ): Promise<ArrayBuffer>
}
