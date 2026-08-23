// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions)
 */
@JsPlainObject
external interface PublicKeyCredentialCreationOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#attestation)
     */
    var attestation: AttestationConveyancePreference?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#authenticatorSelection)
     */
    var authenticatorSelection: AuthenticatorSelectionCriteria?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#challenge)
     */
    var challenge: BufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#excludeCredentials)
     */
    var excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#extensions)
     */
    var extensions: AuthenticationExtensionsClientInputs?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#pubKeyCredParams)
     */
    var pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#rp)
     */
    var rp: PublicKeyCredentialRpEntity

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#timeout)
     */
    var timeout: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions#user)
     */
    var user: PublicKeyCredentialUserEntity
}
