// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import js.promise.Promise
import web.credentials.Credential

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential)
 */
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
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isConditionalMediationAvailable) */
        fun isConditionalMediationAvailable(): Promise<Boolean>

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable_static) */
        fun isUserVerifyingPlatformAuthenticatorAvailable(): Promise<Boolean>
    }
}
