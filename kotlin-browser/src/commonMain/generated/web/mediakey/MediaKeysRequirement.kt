// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import js.reflect.unsafeCast

sealed external interface MediaKeysRequirement {
    companion object
}

inline val MediaKeysRequirement.Companion.notAllowed: MediaKeysRequirement
    get() = unsafeCast("notAllowed")

inline val MediaKeysRequirement.Companion.optional: MediaKeysRequirement
    get() = unsafeCast("optional")

inline val MediaKeysRequirement.Companion.required: MediaKeysRequirement
    get() = unsafeCast("required")
