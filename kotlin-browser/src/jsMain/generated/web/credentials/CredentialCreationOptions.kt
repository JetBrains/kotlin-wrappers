// Automatically generated - do not modify!

package web.credentials

import js.objects.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialCreationOptions

@JsPlainObject
sealed external interface CredentialCreationOptions :
    Abortable {
    var publicKey: PublicKeyCredentialCreationOptions?
    override var signal: AbortSignal?
}
