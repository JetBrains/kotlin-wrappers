// Automatically generated - do not modify!

package web.credentials

import js.objects.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialCreationOptions

@JsPlainObject
external interface CredentialCreationOptions :
    Abortable {
    val publicKey: PublicKeyCredentialCreationOptions?
    override val signal: AbortSignal?
}
