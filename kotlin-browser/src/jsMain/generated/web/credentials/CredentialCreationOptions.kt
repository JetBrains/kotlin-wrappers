// Automatically generated - do not modify!

package web.credentials

import web.abort.AbortSignal
import web.authn.PublicKeyCredentialCreationOptions

sealed external interface CredentialCreationOptions {
    var publicKey: PublicKeyCredentialCreationOptions?
    var signal: AbortSignal?
}
