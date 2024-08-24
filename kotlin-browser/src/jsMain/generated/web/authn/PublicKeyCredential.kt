// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import js.promise.Promise
import seskar.js.JsAsync
import web.credentials.Credential

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential)
 */
sealed external class PublicKeyCredential :
    Credential {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/authenticatorAttachment)
     */
    val authenticatorAttachment: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/rawId)
     */
    val rawId: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/response)
     */
    val response: AuthenticatorResponse

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults)
     */
    fun getClientExtensionResults(): AuthenticationExtensionsClientOutputs

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isConditionalMediationAvailable_static)
         */
        @JsAsync
        suspend fun isConditionalMediationAvailable(): Boolean

        @JsName("isConditionalMediationAvailable")
        fun isConditionalMediationAvailableAsync(): Promise<Boolean>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable_static)
         */
        @JsAsync
        suspend fun isUserVerifyingPlatformAuthenticatorAvailable(): Boolean

        @JsName("isUserVerifyingPlatformAuthenticatorAvailable")
        fun isUserVerifyingPlatformAuthenticatorAvailableAsync(): Promise<Boolean>
    }
}
