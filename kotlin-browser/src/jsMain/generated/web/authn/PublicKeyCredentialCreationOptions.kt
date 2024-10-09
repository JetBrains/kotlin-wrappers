// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialCreationOptions {
    val attestation: AttestationConveyancePreference?
    val authenticatorSelection: AuthenticatorSelectionCriteria?
    val challenge: BufferSource
    val excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?
    val extensions: AuthenticationExtensionsClientInputs?
    val pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>
    val rp: PublicKeyCredentialRpEntity
    val timeout: Int?
    val user: PublicKeyCredentialUserEntity
}
