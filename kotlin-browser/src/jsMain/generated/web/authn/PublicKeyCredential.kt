// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import web.credentials.Credential
import kotlin.js.Promise

sealed external class PublicKeyCredential :
    Credential {
    val authenticatorAttachment: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/rawId) */
    val rawId: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/response) */
    val response: AuthenticatorResponse

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults) */
    fun getClientExtensionResults(): AuthenticationExtensionsClientOutputs

    companion object {
        fun isConditionalMediationAvailable(): Promise<Boolean>

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable_static) */
        fun isUserVerifyingPlatformAuthenticatorAvailable(): Promise<Boolean>
    }
}
