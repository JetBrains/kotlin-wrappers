// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialRequestOptions {
    val allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?
    val challenge: BufferSource
    val extensions: AuthenticationExtensionsClientInputs?
    val rpId: String?
    val timeout: Int?
    val userVerification: UserVerificationRequirement?
}
