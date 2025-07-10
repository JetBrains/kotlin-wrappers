// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.await
import web.credentials.Credential
import kotlin.js.JsName

/**
 * The **`PublicKeyCredential`** interface provides information about a public key / private key pair, which is a credential for logging in to a service using an un-phishable and data-breach resistant asymmetric key pair instead of a password.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential)
 */
external class PublicKeyCredential
private constructor() :
    Credential {
    /**
     * The **`authenticatorAttachment`** read-only property of the PublicKeyCredential interface is a string that indicates the general category of authenticator used during the associated CredentialsContainer.create() or CredentialsContainer.get() call.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/authenticatorAttachment)
     */
    val authenticatorAttachment: String?

    /**
     * The **`rawId`** read-only property of the containing the identifier of the credentials.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/rawId)
     */
    val rawId: ArrayBuffer

    /**
     * The **`response`** read-only property of the object which is sent from the authenticator to the user agent for the creation/fetching of credentials.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/response)
     */
    val response: AuthenticatorResponse

    /**
     * The **`getClientExtensionResults()`** method of the PublicKeyCredential interface returns a map between the identifiers of extensions requested during credential creation or authentication, and their results after processing by the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults)
     */
    fun getClientExtensionResults(): AuthenticationExtensionsClientOutputs

    /**
     * The **`toJSON()`** method of the PublicKeyCredential interface returns a JSON type representation of a PublicKeyCredential.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/toJSON)
     */
    fun toJSON(): PublicKeyCredentialJSON

    companion object {
        /**
         * The **`getClientCapabilities()`** static method of the PublicKeyCredential interface returns a Promise that resolves with an object that can be used to check whether or not particular WebAuthn client capabilities and extensions are supported.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientCapabilities_static)
         */
        @JsName("getClientCapabilities")
        fun getClientCapabilitiesAsync(): Promise<PublicKeyCredentialClientCapabilities>

        /**
         * The **`isConditionalMediationAvailable()`** static method of the PublicKeyCredential interface returns a Promise which resolves to `true` if conditional mediation is available.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isConditionalMediationAvailable_static)
         */
        @JsName("isConditionalMediationAvailable")
        fun isConditionalMediationAvailableAsync(): Promise<JsBoolean>

        /**
         * The **`isUserVerifyingPlatformAuthenticatorAvailable()`** static method of the PublicKeyCredential interface returns a Promise which resolves to `true` if a user-verifying platform authenticator is present.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable_static)
         */
        @JsName("isUserVerifyingPlatformAuthenticatorAvailable")
        fun isUserVerifyingPlatformAuthenticatorAvailableAsync(): Promise<JsBoolean>

        /**
         * The **`parseCreationOptionsFromJSON()`** static method of the PublicKeyCredential interface creates a PublicKeyCredentialCreationOptions object from a JSON representation of its properties.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static)
         */
        fun parseCreationOptionsFromJSON(options: PublicKeyCredentialCreationOptionsJSON): PublicKeyCredentialCreationOptions

        /**
         * The **`parseRequestOptionsFromJSON()`** static method of the PublicKeyCredential interface converts a JSON type representation into a PublicKeyCredentialRequestOptions instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static)
         */
        fun parseRequestOptionsFromJSON(options: PublicKeyCredentialRequestOptionsJSON): PublicKeyCredentialRequestOptions
    }
}

/**
 * The **`getClientCapabilities()`** static method of the PublicKeyCredential interface returns a Promise that resolves with an object that can be used to check whether or not particular WebAuthn client capabilities and extensions are supported.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientCapabilities_static)
 */
suspend inline fun PublicKeyCredential.Companion.getClientCapabilities(): PublicKeyCredentialClientCapabilities {
    return getClientCapabilitiesAsync().await()
}

/**
 * The **`isConditionalMediationAvailable()`** static method of the PublicKeyCredential interface returns a Promise which resolves to `true` if conditional mediation is available.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isConditionalMediationAvailable_static)
 */
suspend inline fun PublicKeyCredential.Companion.isConditionalMediationAvailable(): Boolean {
    return isConditionalMediationAvailableAsync().await().toBoolean()
}

/**
 * The **`isUserVerifyingPlatformAuthenticatorAvailable()`** static method of the PublicKeyCredential interface returns a Promise which resolves to `true` if a user-verifying platform authenticator is present.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable_static)
 */
suspend inline fun PublicKeyCredential.Companion.isUserVerifyingPlatformAuthenticatorAvailable(): Boolean {
    return isUserVerifyingPlatformAuthenticatorAvailableAsync().await().toBoolean()
}
