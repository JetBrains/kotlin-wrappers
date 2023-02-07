// Automatically generated - do not modify!

package web.crypto

import js.core.ReadonlyArray

sealed external class CryptoKey {
    val algorithm: KeyAlgorithm
    val extractable: Boolean
    val type: KeyType
    val usages: ReadonlyArray<KeyUsage>
}
