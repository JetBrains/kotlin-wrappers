// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.objects.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialDescriptor {
    val id: BufferSource
    val transports: ReadonlyArray<AuthenticatorTransport>?
    val type: PublicKeyCredentialType
}
