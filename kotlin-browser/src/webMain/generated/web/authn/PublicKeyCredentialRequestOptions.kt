// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions)
 */
@JsPlainObject
external interface PublicKeyCredentialRequestOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#allowcredentials)
     */
    var allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#challenge)
     */
    var challenge: BufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#extensions)
     */
    var extensions: AuthenticationExtensionsClientInputs?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#rpid)
     */
    var rpId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#timeout)
     */
    var timeout: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions#userverification)
     */
    var userVerification: UserVerificationRequirement?
}
