// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

sealed external class AuthenticatorAttestationResponse :
    AuthenticatorResponse {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/attestationObject) */
    val attestationObject: ArrayBuffer
    fun getAuthenticatorData(): ArrayBuffer
    fun getPublicKey(): ArrayBuffer?
    fun getPublicKeyAlgorithm(): COSEAlgorithmIdentifier

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAttestationResponse/getTransports) */
    fun getTransports(): ReadonlyArray<String>
}
