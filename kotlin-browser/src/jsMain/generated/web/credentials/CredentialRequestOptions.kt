// Automatically generated - do not modify!

package web.credentials

import web.abort.AbortSignal

sealed external interface CredentialRequestOptions {
    var mediation: CredentialMediationRequirement?
    var publicKey: Any /* PublicKeyCredentialRequestOptions */?
    var signal: AbortSignal?
}
