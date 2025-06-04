// Automatically generated - do not modify!

package web.crypto

import js.buffer.ArrayBufferView

/**
 * The **`Crypto`** interface represents basic cryptography features available in the current context.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto)
 */
external class Crypto
private constructor() {
    /**
     * The **`Crypto.subtle`** read-only property returns a cryptographic operations.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
     */
    val subtle: SubtleCrypto

    /**
     * The **`Crypto.getRandomValues()`** method lets you get cryptographically strong random values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/getRandomValues)
     */
    fun <T : ArrayBufferView<*>> getRandomValues(array: T): T

    /**
     * The **`randomUUID()`** method of the Crypto interface is used to generate a v4 UUID using a cryptographically secure random number generator.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
     */
    fun randomUUID(): String
}
