// Automatically generated - do not modify!

package web.credentials

import js.objects.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable
import web.authn.PublicKeyCredentialRequestOptions

@JsPlainObject
external interface CredentialRequestOptions :
    Abortable {
    val mediation: CredentialMediationRequirement?
    val publicKey: PublicKeyCredentialRequestOptions?
    override val signal: AbortSignal?
}
