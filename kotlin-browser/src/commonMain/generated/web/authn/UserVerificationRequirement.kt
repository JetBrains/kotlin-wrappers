// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import js.reflect.unsafeCast

sealed external interface UserVerificationRequirement {
    companion object
}

inline val UserVerificationRequirement.Companion.discouraged: UserVerificationRequirement
    get() = unsafeCast("discouraged")

inline val UserVerificationRequirement.Companion.preferred: UserVerificationRequirement
    get() = unsafeCast("preferred")

inline val UserVerificationRequirement.Companion.required: UserVerificationRequirement
    get() = unsafeCast("required")
