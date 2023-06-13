// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray

sealed external class AuthenticatorAttestationResponse :
    AuthenticatorResponse {
    val attestationObject: ArrayBuffer
    fun getAuthenticatorData(): ArrayBuffer
    fun getPublicKey(): ArrayBuffer?
    fun getPublicKeyAlgorithm(): COSEAlgorithmIdentifier
    fun getTransports(): ReadonlyArray<String>
}
