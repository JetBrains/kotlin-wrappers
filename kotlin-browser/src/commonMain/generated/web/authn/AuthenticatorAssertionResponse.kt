// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer

/**
 * The **`AuthenticatorAssertionResponse`** interface of the Web Authentication API contains a digital signature from the private key of a particular WebAuthn credential.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse)
 */
external class AuthenticatorAssertionResponse
private constructor() :
    AuthenticatorResponse {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/authenticatorData)
     */
    val authenticatorData: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/signature)
     */
    val signature: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/userHandle)
     */
    val userHandle: ArrayBuffer?
}
