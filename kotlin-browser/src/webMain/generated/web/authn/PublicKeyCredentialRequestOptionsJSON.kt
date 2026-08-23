// Automatically generated - do not modify!

package web.authn

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#options)
 */
@JsPlainObject
external interface PublicKeyCredentialRequestOptionsJSON {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#allowcredentials)
     */
    var allowCredentials: ReadonlyArray<PublicKeyCredentialDescriptorJSON>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#challenge)
     */
    var challenge: Base64URLString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#extensions)
     */
    var extensions: AuthenticationExtensionsClientInputsJSON?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#hints)
     */
    var hints: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#rpid)
     */
    var rpId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#timeout)
     */
    var timeout: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/parseRequestOptionsFromJSON_static#userverification)
     */
    var userVerification: String?
}
