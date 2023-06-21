// Automatically generated - do not modify!

package web.crypto

import js.core.ReadonlyArray

sealed external class CryptoKey {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/algorithm) */
    val algorithm: KeyAlgorithm

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/extractable) */
    val extractable: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type) */
    val type: KeyType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/usages) */
    val usages: ReadonlyArray<KeyUsage>
}
