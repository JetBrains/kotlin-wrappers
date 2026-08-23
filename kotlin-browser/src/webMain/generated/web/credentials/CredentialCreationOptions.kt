// Automatically generated - do not modify!

package web.credentials

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialCreationOptions

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create#options)
 */
@JsPlainObject
external interface CredentialCreationOptions :
    Abortable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create#publickey)
     */
    var publicKey: PublicKeyCredentialCreationOptions?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create#signal)
     */
    override var signal: AbortSignal?
}
