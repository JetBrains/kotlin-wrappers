// Automatically generated - do not modify!

package web.crypto

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.JsAny
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`SubtleCrypto`** interface of the Web Crypto API provides a number of low-level cryptographic functions.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto)
 */
external class SubtleCrypto
private constructor() {
    /**
     * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     */
    @JsName("decrypt")
    fun decryptAsync(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("decrypt")
    fun decryptAsync(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("decrypt")
    fun decryptAsync(
        algorithm: RsaOaepParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("decrypt")
    fun decryptAsync(
        algorithm: AesCtrParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("decrypt")
    fun decryptAsync(
        algorithm: AesCbcParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("decrypt")
    fun decryptAsync(
        algorithm: AesGcmParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /**
     * The **`deriveBits()`** method of the key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
     */
    @JsName("deriveBits")
    fun deriveBitsAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        length: Int? = definedExternally,
    ): Promise<ArrayBuffer>

    @JsName("deriveBits")
    fun deriveBitsAsync(
        algorithm: String,
        baseKey: CryptoKey,
        length: Int? = definedExternally,
    ): Promise<ArrayBuffer>

    @JsName("deriveBits")
    fun deriveBitsAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        length: Int? = definedExternally,
    ): Promise<ArrayBuffer>

    @JsName("deriveBits")
    fun deriveBitsAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        length: Int? = definedExternally,
    ): Promise<ArrayBuffer>

    @JsName("deriveBits")
    fun deriveBitsAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        length: Int? = definedExternally,
    ): Promise<ArrayBuffer>

    /**
     * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     */
    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: AesDerivedKeyParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: HkdfParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Algorithm,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: String,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: EcdhKeyDeriveParams,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: HkdfParams,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("deriveKey")
    fun deriveKeyAsync(
        algorithm: Pbkdf2Params,
        baseKey: CryptoKey,
        derivedKeyType: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /**
     * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     */
    @JsName("digest")
    fun digestAsync(
        algorithm: Algorithm,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("digest")
    fun digestAsync(
        algorithm: String,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /**
     * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     */
    @JsName("encrypt")
    fun encryptAsync(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("encrypt")
    fun encryptAsync(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("encrypt")
    fun encryptAsync(
        algorithm: RsaOaepParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("encrypt")
    fun encryptAsync(
        algorithm: AesCtrParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("encrypt")
    fun encryptAsync(
        algorithm: AesCbcParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("encrypt")
    fun encryptAsync(
        algorithm: AesGcmParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /**
     * The **`exportKey()`** method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object and gives you the key in an external, portable format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/exportKey)
     */
    @JsName("exportKey")
    fun exportKeyAsync(
        format: KeyFormat.jwk,
        key: CryptoKey,
    ): Promise<JsonWebKey>

    @JsName("exportKey")
    fun exportKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
    ): Promise<ArrayBuffer>

    /**
     * The **`generateKey()`** method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
     */
    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: Ed25519Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage /* "sign" | "verify" */>,
    ): Promise<CryptoKeyPair>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: RsaHashedKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKeyPair>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: EcKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKeyPair>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: AesKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: HmacKeyGenParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: Pbkdf2Params,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<JsAny /* CryptoKeyPair | CryptoKey */>

    @JsName("generateKey")
    fun generateKeyAsync(
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<JsAny /* CryptoKeyPair | CryptoKey */>

    /**
     * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     */
    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat.jwk,
        keyData: JsonWebKey,
        algorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("importKey")
    fun importKeyAsync(
        format: KeyFormat,
        keyData: BufferSource,
        algorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /**
     * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     */
    @JsName("sign")
    fun signAsync(
        algorithm: Algorithm,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("sign")
    fun signAsync(
        algorithm: String,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("sign")
    fun signAsync(
        algorithm: RsaPssParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    @JsName("sign")
    fun signAsync(
        algorithm: EcdsaParams,
        key: CryptoKey,
        data: BufferSource,
    ): Promise<ArrayBuffer>

    /**
     * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     */
    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: Algorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: String,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: RsaHashedImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: EcKeyImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: HmacImportParams,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: Algorithm,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: String,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: RsaOaepParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCtrParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesCbcParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    @JsName("unwrapKey")
    fun unwrapKeyAsync(
        format: KeyFormat,
        wrappedKey: BufferSource,
        unwrappingKey: CryptoKey,
        unwrapAlgorithm: AesGcmParams,
        unwrappedKeyAlgorithm: AesKeyAlgorithm,
        extractable: Boolean,
        keyUsages: ReadonlyArray<KeyUsage>,
    ): Promise<CryptoKey>

    /**
     * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     */
    @JsName("verify")
    fun verifyAsync(
        algorithm: Algorithm,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<JsBoolean>

    @JsName("verify")
    fun verifyAsync(
        algorithm: String,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<JsBoolean>

    @JsName("verify")
    fun verifyAsync(
        algorithm: RsaPssParams,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<JsBoolean>

    @JsName("verify")
    fun verifyAsync(
        algorithm: EcdsaParams,
        key: CryptoKey,
        signature: BufferSource,
        data: BufferSource,
    ): Promise<JsBoolean>

    /**
     * The **`wrapKey()`** method of the SubtleCrypto interface 'wraps' a key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
     */
    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: Algorithm,
    ): Promise<ArrayBuffer>

    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: String,
    ): Promise<ArrayBuffer>

    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: RsaOaepParams,
    ): Promise<ArrayBuffer>

    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesCtrParams,
    ): Promise<ArrayBuffer>

    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesCbcParams,
    ): Promise<ArrayBuffer>

    @JsName("wrapKey")
    fun wrapKeyAsync(
        format: KeyFormat,
        key: CryptoKey,
        wrappingKey: CryptoKey,
        wrapAlgorithm: AesGcmParams,
    ): Promise<ArrayBuffer>
}

/**
 * The **`decrypt()`** method of the SubtleCrypto interface decrypts some encrypted data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
 */
suspend inline fun SubtleCrypto.decrypt(
    algorithm: Algorithm,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.decrypt(
    algorithm: String,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.decrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.decrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.decrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.decrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        decryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

/**
 * The **`deriveBits()`** method of the key.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
 */
suspend inline fun SubtleCrypto.deriveBits(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    length: Int?,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            length = length
        )
    )
}

/**
 * The **`deriveBits()`** method of the key.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
 */
suspend inline fun SubtleCrypto.deriveBits(
    algorithm: Algorithm,
    baseKey: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: String,
    baseKey: CryptoKey,
    length: Int?,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            length = length
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: String,
    baseKey: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    length: Int?,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            length = length
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    length: Int?,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            length = length
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    length: Int?,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            length = length
        )
    )
}

suspend inline fun SubtleCrypto.deriveBits(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        deriveBitsAsync(
            algorithm = algorithm,
            baseKey = baseKey
        )
    )
}

/**
 * The **`deriveKey()`** method of the SubtleCrypto interface can be used to derive a secret key from a master key.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
 */
suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: String,
    baseKey: CryptoKey,
    derivedKeyType: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: String,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: String,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: String,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: String,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        deriveKeyAsync(
            algorithm = algorithm,
            baseKey = baseKey,
            derivedKeyType = derivedKeyType,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

/**
 * The **`digest()`** method of the SubtleCrypto interface generates a _digest_ of the given data, using the specified hash function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
 */
suspend inline fun SubtleCrypto.digest(
    algorithm: Algorithm,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        digestAsync(
            algorithm = algorithm,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.digest(
    algorithm: String,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        digestAsync(
            algorithm = algorithm,
            data = data
        )
    )
}

/**
 * The **`encrypt()`** method of the SubtleCrypto interface encrypts data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
 */
suspend inline fun SubtleCrypto.encrypt(
    algorithm: Algorithm,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.encrypt(
    algorithm: String,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.encrypt(
    algorithm: RsaOaepParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.encrypt(
    algorithm: AesCtrParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.encrypt(
    algorithm: AesCbcParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.encrypt(
    algorithm: AesGcmParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        encryptAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

/**
 * The **`exportKey()`** method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object and gives you the key in an external, portable format.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/exportKey)
 */
suspend inline fun SubtleCrypto.exportKey(
    format: KeyFormat.jwk,
    key: CryptoKey,
): JsonWebKey {
    return awaitPromiseLike(
        exportKeyAsync(
            format = format,
            key = key
        )
    )
}

suspend inline fun SubtleCrypto.exportKey(
    format: KeyFormat,
    key: CryptoKey,
): ArrayBuffer {
    return awaitPromiseLike(
        exportKeyAsync(
            format = format,
            key = key
        )
    )
}

/**
 * The **`generateKey()`** method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
 */
suspend inline fun SubtleCrypto.generateKey(
    algorithm: Ed25519Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage /* "sign" | "verify" */>,
): CryptoKeyPair {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: RsaHashedKeyGenParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKeyPair {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: EcKeyGenParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKeyPair {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: AesKeyGenParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: HmacKeyGenParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): JsAny /* CryptoKeyPair | CryptoKey */ {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.generateKey(
    algorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): JsAny /* CryptoKeyPair | CryptoKey */ {
    return awaitPromiseLike(
        generateKeyAsync(
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

/**
 * The **`importKey()`** method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
 */
suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat.jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.importKey(
    format: KeyFormat,
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        importKeyAsync(
            format = format,
            keyData = keyData,
            algorithm = algorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

/**
 * The **`sign()`** method of the SubtleCrypto interface generates a digital signature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
 */
suspend inline fun SubtleCrypto.sign(
    algorithm: Algorithm,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        signAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.sign(
    algorithm: String,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        signAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.sign(
    algorithm: RsaPssParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        signAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

suspend inline fun SubtleCrypto.sign(
    algorithm: EcdsaParams,
    key: CryptoKey,
    data: BufferSource,
): ArrayBuffer {
    return awaitPromiseLike(
        signAsync(
            algorithm = algorithm,
            key = key,
            data = data
        )
    )
}

/**
 * The **`unwrapKey()`** method of the SubtleCrypto interface 'unwraps' a key.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
 */
suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: String,
    unwrappedKeyAlgorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: String,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: String,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: String,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: String,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: String,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

suspend inline fun SubtleCrypto.unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: ReadonlyArray<KeyUsage>,
): CryptoKey {
    return awaitPromiseLike(
        unwrapKeyAsync(
            format = format,
            wrappedKey = wrappedKey,
            unwrappingKey = unwrappingKey,
            unwrapAlgorithm = unwrapAlgorithm,
            unwrappedKeyAlgorithm = unwrappedKeyAlgorithm,
            extractable = extractable,
            keyUsages = keyUsages
        )
    )
}

/**
 * The **`verify()`** method of the SubtleCrypto interface verifies a digital signature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
 */
suspend inline fun SubtleCrypto.verify(
    algorithm: Algorithm,
    key: CryptoKey,
    signature: BufferSource,
    data: BufferSource,
): Boolean {
    return awaitPromiseLike(
        verifyAsync(
            algorithm = algorithm,
            key = key,
            signature = signature,
            data = data
        )
    ).toBoolean()
}

suspend inline fun SubtleCrypto.verify(
    algorithm: String,
    key: CryptoKey,
    signature: BufferSource,
    data: BufferSource,
): Boolean {
    return awaitPromiseLike(
        verifyAsync(
            algorithm = algorithm,
            key = key,
            signature = signature,
            data = data
        )
    ).toBoolean()
}

suspend inline fun SubtleCrypto.verify(
    algorithm: RsaPssParams,
    key: CryptoKey,
    signature: BufferSource,
    data: BufferSource,
): Boolean {
    return awaitPromiseLike(
        verifyAsync(
            algorithm = algorithm,
            key = key,
            signature = signature,
            data = data
        )
    ).toBoolean()
}

suspend inline fun SubtleCrypto.verify(
    algorithm: EcdsaParams,
    key: CryptoKey,
    signature: BufferSource,
    data: BufferSource,
): Boolean {
    return awaitPromiseLike(
        verifyAsync(
            algorithm = algorithm,
            key = key,
            signature = signature,
            data = data
        )
    ).toBoolean()
}

/**
 * The **`wrapKey()`** method of the SubtleCrypto interface 'wraps' a key.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
 */
suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: Algorithm,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}

suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: String,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}

suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: RsaOaepParams,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}

suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AesCtrParams,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}

suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AesCbcParams,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}

suspend inline fun SubtleCrypto.wrapKey(
    format: KeyFormat,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AesGcmParams,
): ArrayBuffer {
    return awaitPromiseLike(
        wrapKeyAsync(
            format = format,
            key = key,
            wrappingKey = wrappingKey,
            wrapAlgorithm = wrapAlgorithm
        )
    )
}
