// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface AuthenticatorAttestationResponseJSON {
    var attestationObject: Base64URLString
    var authenticatorData: Base64URLString
    var clientDataJSON: Base64URLString
    var publicKey: Base64URLString?
    var publicKeyAlgorithm: COSEAlgorithmIdentifier
    var transports: ReadonlyArray<JsString>
}
