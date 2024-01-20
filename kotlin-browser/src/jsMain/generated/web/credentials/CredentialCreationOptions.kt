// Automatically generated - do not modify!

package web.credentials

import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialCreationOptions

sealed external interface CredentialCreationOptions :
    Abortable {
    var publicKey: PublicKeyCredentialCreationOptions?
    override var signal: AbortSignal?
}
