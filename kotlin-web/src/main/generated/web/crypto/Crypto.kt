// Automatically generated - do not modify!

package web.crypto

import js.buffer.ArrayBufferView

sealed external class Crypto {
    /** Available only in secure contexts. */
    val subtle: SubtleCrypto
    fun <T : ArrayBufferView?> getRandomValues(array: T): T

    /** Available only in secure contexts. */
    fun randomUUID(): String
}
