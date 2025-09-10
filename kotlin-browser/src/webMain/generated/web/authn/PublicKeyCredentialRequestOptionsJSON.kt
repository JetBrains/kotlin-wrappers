// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface PublicKeyCredentialRequestOptionsJSON {
    var allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?
    var challenge: Base64URLString
    var extensions: AuthenticationExtensionsClientInputsJSON?
    var hints: ReadonlyArray<JsString>?
    var rpId: String?
    var timeout: Int?
    var userVerification: String?
}
