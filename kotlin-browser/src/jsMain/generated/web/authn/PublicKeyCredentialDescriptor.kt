// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PublicKeyCredentialDescriptor {
    var id: BufferSource
    var transports: ReadonlyArray<AuthenticatorTransport>?
    var type: PublicKeyCredentialType
}
