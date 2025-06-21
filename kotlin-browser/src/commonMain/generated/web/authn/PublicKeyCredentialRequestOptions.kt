// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.objects.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialRequestOptions {
    var allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptor>?
    var challenge: BufferSource
    var extensions: AuthenticationExtensionsClientInputs?
    var rpId: String?
    var timeout: Int?
    var userVerification: UserVerificationRequirement?
}
