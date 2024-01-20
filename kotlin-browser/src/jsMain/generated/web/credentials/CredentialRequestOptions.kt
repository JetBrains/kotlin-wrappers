// Automatically generated - do not modify!

package web.credentials

import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialRequestOptions

sealed external interface CredentialRequestOptions :
    Abortable {
    var mediation: CredentialMediationRequirement?
    var publicKey: PublicKeyCredentialRequestOptions?
    override var signal: AbortSignal?
}
