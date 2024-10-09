// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialRequestOptionsJSON {
    val allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?
    val challenge: Base64URLString
    val extensions: AuthenticationExtensionsClientInputsJSON?
    val hints: ReadonlyArray<String>?
    val rpId: String?
    val timeout: Int?
    val userVerification: String?
}
