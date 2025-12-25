// Automatically generated - do not modify!

package web.authn

import js.objects.JsPlainObject

@JsPlainObject
external interface AuthenticationResponseJSON {
    var authenticatorAttachment: String?
    var clientExtensionResults: AuthenticationExtensionsClientOutputsJSON
    var id: String
    var rawId: Base64URLString
    var response: AuthenticatorAssertionResponseJSON
    var type: String
}
