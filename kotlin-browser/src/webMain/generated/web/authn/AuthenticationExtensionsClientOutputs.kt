// Automatically generated - do not modify!

package web.authn

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#return_value)
 */
@JsPlainObject
external interface AuthenticationExtensionsClientOutputs {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#appid)
     */
    var appid: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#credprops)
     */
    var credProps: CredentialPropertiesOutput?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#hmaccreatesecret)
     */
    var hmacCreateSecret: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#largeblob)
     */
    var largeBlob: AuthenticationExtensionsLargeBlobOutputs?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults#prf)
     */
    var prf: AuthenticationExtensionsPRFOutputs?
}
