// Automatically generated - do not modify!

package web.crypto

import js.array.ReadonlyArray

/**
 * The **`CryptoKey`** interface of the Web Crypto API represents a cryptographic key obtained from one of the SubtleCrypto methods generateKey(), deriveKey(), importKey(), or unwrapKey().
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey)
 */
open external class CryptoKey
private constructor() {
    /**
     * The read-only **`algorithm`** property of the CryptoKey interface returns an object describing the algorithm for which this key can be used, and any associated extra parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/algorithm)
     */
    val algorithm: KeyAlgorithm

    /**
     * The read-only **`extractable`** property of the CryptoKey interface indicates whether or not the key may be extracted using SubtleCrypto.exportKey() or SubtleCrypto.wrapKey().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/extractable)
     */
    val extractable: Boolean

    /**
     * The read-only **`type`** property of the CryptoKey interface indicates which kind of key is represented by the object. It can have the following values:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type)
     */
    val type: KeyType

    /**
     * The read-only **`usages`** property of the CryptoKey interface indicates what can be done with the key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/usages)
     */
    val usages: ReadonlyArray<KeyUsage>
}
