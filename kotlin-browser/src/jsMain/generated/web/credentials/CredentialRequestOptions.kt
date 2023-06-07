// Automatically generated - do not modify!

package web.credentials

import web.abort.AbortSignal
import web.authn.PublicKeyCredentialRequestOptions

sealed external interface CredentialRequestOptions {
    var mediation: CredentialMediationRequirement?
    var publicKey: PublicKeyCredentialRequestOptions?
    var signal: AbortSignal?
}
