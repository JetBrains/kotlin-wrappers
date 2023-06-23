// Automatically generated - do not modify!

package web.authn

import js.buffer.ArrayBuffer

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse)
 */
sealed external class AuthenticatorAssertionResponse :
    AuthenticatorResponse {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/authenticatorData) */
    val authenticatorData: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/signature) */
    val signature: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/userHandle) */
    val userHandle: ArrayBuffer?
}
