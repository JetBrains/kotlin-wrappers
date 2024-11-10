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
external class PublicKeyCredential
private constructor() :
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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/toJSON)
     */
    fun toJSON(): PublicKeyCredentialJSON

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

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static)
         */
        fun parseCreationOptionsFromJSON(options: PublicKeyCredentialCreationOptionsJSON): PublicKeyCredentialCreationOptions

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static)
         */
        fun parseRequestOptionsFromJSON(options: PublicKeyCredentialRequestOptionsJSON): PublicKeyCredentialRequestOptions
    }
}
