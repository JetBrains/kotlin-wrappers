// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#options)
 */
@JsPlainObject
external interface PublicKeyCredentialCreationOptionsJSON {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#attestation)
     */
    var attestation: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#authenticatorSelection)
     */
    var authenticatorSelection: AuthenticatorSelectionCriteria?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#challenge)
     */
    var challenge: Base64URLString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#excludeCredentials)
     */
    var excludeCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#extensions)
     */
    var extensions: AuthenticationExtensionsClientInputsJSON?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#hints)
     */
    var hints: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#pubKeyCredParams)
     */
    var pubKeyCredParams: ReadonlyArray<PublicKeyCredentialParameters>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#rp)
     */
    var rp: PublicKeyCredentialRpEntity

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#timeout)
     */
    var timeout: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseCreationOptionsFromJSON_static#user)
     */
    var user: PublicKeyCredentialUserEntityJSON
}
