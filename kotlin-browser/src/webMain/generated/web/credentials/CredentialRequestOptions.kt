// Automatically generated - do not modify!

package web.credentials

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialRequestOptions

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get#options)
 */
@JsPlainObject
external interface CredentialRequestOptions :
    Abortable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get#mediation)
     */
    var mediation: CredentialMediationRequirement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get#publickey)
     */
    var publicKey: PublicKeyCredentialRequestOptions?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get#signal)
     */
    override var signal: AbortSignal?
}
