// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PublicKeyCredentialCreationOptionsJSON {
    val attestation: String?
    val authenticatorSelection: AuthenticatorSelectionCriteria?
    val challenge: Base64URLString
    val excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?
    val extensions: AuthenticationExtensionsClientInputsJSON?
    val hints: ReadonlyArray<String>?
    val pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>
    val rp: PublicKeyCredentialRpEntity
    val timeout: Int?
    val user: PublicKeyCredentialUserEntityJSON
}
