// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer

/**
 * The **`AuthenticatorResponse`** interface of the Web Authentication API is the base interface for interfaces that provide a cryptographic root of trust for a key pair. The child interfaces include information from the browser such as the challenge origin and either may be returned from PublicKeyCredential.response.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorResponse)
 */
open external class AuthenticatorResponse
private constructor() {
    /**
     * The **`clientDataJSON`** property of the AuthenticatorResponse interface stores a JSON string in an ArrayBuffer, representing the client data that was passed to navigator.credentials.create() or navigator.credentials.get(). This property is only accessed on one of the child objects of AuthenticatorResponse, specifically AuthenticatorAttestationResponse or AuthenticatorAssertionResponse.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorResponse/clientDataJSON)
     */
    val clientDataJSON: ArrayBuffer
}
