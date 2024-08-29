// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialRequestOptionsJSON {
    var allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?
    var challenge: Base64URLString
    var extensions: AuthenticationExtensionsClientInputsJSON?
    var hints: ReadonlyArray<String>?
    var rpId: String?
    var timeout: Int?
    var userVerification: String?
}
