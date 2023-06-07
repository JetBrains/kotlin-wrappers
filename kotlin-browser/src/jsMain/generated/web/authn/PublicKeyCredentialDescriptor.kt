// Automatically generated - do not modify!

package web.authn

import js.buffer.BufferSource
import js.core.ReadonlyArray

sealed external interface PublicKeyCredentialDescriptor {
    var id: BufferSource
    var transports: ReadonlyArray<AuthenticatorTransport>?
    var type: PublicKeyCredentialType
}
