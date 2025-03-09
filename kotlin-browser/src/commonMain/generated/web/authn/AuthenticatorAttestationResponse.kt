// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse)
 */
external class AuthenticatorAttestationResponse
private constructor() :
    AuthenticatorResponse {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/attestationObject)
     */
    val attestationObject: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getAuthenticatorData)
     */
    fun getAuthenticatorData(): ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getPublicKey)
     */
    fun getPublicKey(): ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getPublicKeyAlgorithm)
     */
    fun getPublicKeyAlgorithm(): COSEAlgorithmIdentifier

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getTransports)
     */
    fun getTransports(): ReadonlyArray<String>
}
