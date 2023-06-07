// Automatically generated - do not modify!

package web.authn

import js.buffer.BufferSource
import js.core.ReadonlyArray

sealed external interface PublicKeyCredentialCreationOptions {
    var attestation: AttestationConveyancePreference?
    var authenticatorSelection: AuthenticatorSelectionCriteria?
    var challenge: BufferSource
    var excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?
    var extensions: AuthenticationExtensionsClientInputs?
    var pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>
    var rp: PublicKeyCredentialRpEntity
    var timeout: Int?
    var user: PublicKeyCredentialUserEntity
}
