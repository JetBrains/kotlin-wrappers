// Automatically generated - do not modify!

package web.crypto

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

/**
 * The **`Crypto`** interface represents basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto)
 */
open external class Crypto
private constructor() {
    /**
     * The **`Crypto.subtle`** read-only property returns a SubtleCrypto which can then be used to perform low-level cryptographic operations.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
     */
    val subtle: SubtleCrypto

    /**
     * The **`Crypto.getRandomValues()`** method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/getRandomValues)
     */
    fun <T : ArrayBufferView<ArrayBuffer> /* Exclude<BufferSource, ArrayBuffer> */> getRandomValues(array: T): T

    /**
     * The **`randomUUID()`** method of the Crypto interface is used to generate a v4 UUID using a cryptographically secure random number generator.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
     */
    fun randomUUID(): String
}
