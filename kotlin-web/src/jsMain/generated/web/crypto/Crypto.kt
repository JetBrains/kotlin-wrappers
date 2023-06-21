// Automatically generated - do not modify!

package web.crypto

import js.buffer.ArrayBufferView

sealed external class Crypto {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
     */
    val subtle: SubtleCrypto
    fun <T : ArrayBufferView?> getRandomValues(array: T): T

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
     */
    fun randomUUID(): String
}
