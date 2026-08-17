// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface UserVerificationRequirement

inline val UserVerificationRequirement.Companion.discouraged: UserVerificationRequirement
    get() = unsafeCast("discouraged")

inline val UserVerificationRequirement.Companion.preferred: UserVerificationRequirement
    get() = unsafeCast("preferred")

inline val UserVerificationRequirement.Companion.required: UserVerificationRequirement
    get() = unsafeCast("required")
