// Automatically generated - do not modify!

package web.authn

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/signalCurrentUserDetails_static#options)
 */
@JsPlainObject
external interface CurrentUserDetailsOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/signalCurrentUserDetails_static#displayname)
     */
    var displayName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/signalCurrentUserDetails_static#name)
     */
    var name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/signalCurrentUserDetails_static#rpid)
     */
    var rpId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/signalCurrentUserDetails_static#userid)
     */
    var userId: Base64URLString
}
