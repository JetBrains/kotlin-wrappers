// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import web.credentials.Credential
import kotlin.js.Promise

sealed external class PublicKeyCredential :
    Credential {
    val authenticatorAttachment: String?
    val rawId: ArrayBuffer
    val response: AuthenticatorResponse
    fun getClientExtensionResults(): AuthenticationExtensionsClientOutputs

    companion object {
        fun isConditionalMediationAvailable(): Promise<Boolean>
        fun isUserVerifyingPlatformAuthenticatorAvailable(): Promise<Boolean>
    }
}
