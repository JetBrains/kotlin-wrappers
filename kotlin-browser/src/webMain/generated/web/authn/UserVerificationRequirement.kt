// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification)
 */
@JsUnion
sealed /* union */
external interface UserVerificationRequirement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification#discouraged)
 */
inline val UserVerificationRequirement.Companion.discouraged: UserVerificationRequirement
    get() = unsafeCast("discouraged")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification#preferred)
 */
inline val UserVerificationRequirement.Companion.preferred: UserVerificationRequirement
    get() = unsafeCast("preferred")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialRequestOptions/userVerification#required)
 */
inline val UserVerificationRequirement.Companion.required: UserVerificationRequirement
    get() = unsafeCast("required")
