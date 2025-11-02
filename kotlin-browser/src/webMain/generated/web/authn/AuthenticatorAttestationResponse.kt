// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import kotlin.js.JsString

/**
 * The **`AuthenticatorAttestationResponse`** interface of the Web Authentication API is the result of a WebAuthn credential registration. It contains information about the credential that the server needs to perform WebAuthn assertions, such as its credential ID and public key.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse)
 */
open external class AuthenticatorAttestationResponse
private constructor() :
    AuthenticatorResponse {
    /**
     * The **`attestationObject`** property of the AuthenticatorAttestationResponse interface returns an ArrayBuffer containing the new public key, as well as signature over the entire attestationObject with a private key that is stored in the authenticator when it is manufactured.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/attestationObject)
     */
    val attestationObject: ArrayBuffer

    /**
     * The **`getAuthenticatorData()`** method of the AuthenticatorAttestationResponse interface returns an ArrayBuffer containing the authenticator data contained within the AuthenticatorAttestationResponse.attestationObject property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getAuthenticatorData)
     */
    fun getAuthenticatorData(): ArrayBuffer

    /**
     * The **`getPublicKey()`** method of the AuthenticatorAttestationResponse interface returns an ArrayBuffer containing the DER SubjectPublicKeyInfo of the new credential (see Subject Public Key Info), or null if this is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getPublicKey)
     */
    fun getPublicKey(): ArrayBuffer?

    /**
     * The **`getPublicKeyAlgorithm()`** method of the AuthenticatorAttestationResponse interface returns a number that is equal to a COSE Algorithm Identifier, representing the cryptographic algorithm used for the new credential.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getPublicKeyAlgorithm)
     */
    fun getPublicKeyAlgorithm(): COSEAlgorithmIdentifier

    /**
     * The **`getTransports()`** method of the AuthenticatorAttestationResponse interface returns an array of strings describing the different transports which may be used by the authenticator.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getTransports)
     */
    fun getTransports(): ReadonlyArray<JsString>
}
