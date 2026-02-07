// Automatically generated - do not modify!

package web.authn

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AuthenticatorAssertionResponseJSON {
    var authenticatorData: Base64URLString
    var clientDataJSON: Base64URLString
    var signature: Base64URLString
    var userHandle: Base64URLString?
}
