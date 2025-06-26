// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import js.reflect.unsafeCast

sealed external interface ResidentKeyRequirement {
    companion object
}

inline val ResidentKeyRequirement.Companion.discouraged: ResidentKeyRequirement
    get() = unsafeCast("discouraged")

inline val ResidentKeyRequirement.Companion.preferred: ResidentKeyRequirement
    get() = unsafeCast("preferred")

inline val ResidentKeyRequirement.Companion.required: ResidentKeyRequirement
    get() = unsafeCast("required")
