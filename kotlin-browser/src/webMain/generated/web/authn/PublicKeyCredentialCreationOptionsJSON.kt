// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface PublicKeyCredentialCreationOptionsJSON {
    var attestation: String?
    var authenticatorSelection: AuthenticatorSelectionCriteria?
    var challenge: Base64URLString
    var excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?
    var extensions: AuthenticationExtensionsClientInputsJSON?
    var hints: ReadonlyArray<JsString>?
    var pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>
    var rp: PublicKeyCredentialRpEntity
    var timeout: Int?
    var user: PublicKeyCredentialUserEntityJSON
}
