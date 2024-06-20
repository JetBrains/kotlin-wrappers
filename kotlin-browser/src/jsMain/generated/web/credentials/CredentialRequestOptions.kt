// Automatically generated - do not modify!

package web.credentials

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialRequestOptions

@JsPlainObject
external interface CredentialRequestOptions :
    Abortable {
    var mediation: CredentialMediationRequirement?
    var publicKey: PublicKeyCredentialRequestOptions?
    override var signal: AbortSignal?
}
