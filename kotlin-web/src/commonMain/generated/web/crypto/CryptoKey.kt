// Automatically generated - do not modify!

package web.crypto

import js.array.ReadonlyArray

/**
 * The **`CryptoKey`** interface of the Web Crypto API represents a cryptographic key obtained from one of the SubtleCrypto methods SubtleCrypto.generateKey, SubtleCrypto.deriveKey, SubtleCrypto.importKey, or SubtleCrypto.unwrapKey.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey)
 */
external class CryptoKey
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/algorithm)
     */
    val algorithm: KeyAlgorithm

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/extractable)
     */
    val extractable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type)
     */
    val type: KeyType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/usages)
     */
    val usages: ReadonlyArray<KeyUsage>
}
