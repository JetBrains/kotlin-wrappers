// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer

/**
 * The **`AuthenticatorResponse`** interface of the Web Authentication API is the base interface for interfaces that provide a cryptographic root of trust for a key pair.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorResponse)
 */
open external class AuthenticatorResponse
private constructor() {
    /**
     * The **`clientDataJSON`** property of the AuthenticatorResponse interface stores a JSON string in an An ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorResponse/clientDataJSON)
     */
    val clientDataJSON: ArrayBuffer
}
