// Automatically generated - do not modify!

package web.authn

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RegistrationResponseJSON {
    var authenticatorAttachment: String?
    var clientExtensionResults: AuthenticationExtensionsClientOutputsJSON
    var id: String
    var rawId: Base64URLString
    var response: AuthenticatorAttestationResponseJSON
    var type: String
}
