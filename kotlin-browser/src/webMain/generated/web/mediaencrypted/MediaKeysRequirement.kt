// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaKeysRequirement

inline val MediaKeysRequirement.Companion.notAllowed: MediaKeysRequirement
    get() = unsafeCast("not-allowed")

inline val MediaKeysRequirement.Companion.optional: MediaKeysRequirement
    get() = unsafeCast("optional")

inline val MediaKeysRequirement.Companion.required: MediaKeysRequirement
    get() = unsafeCast("required")
