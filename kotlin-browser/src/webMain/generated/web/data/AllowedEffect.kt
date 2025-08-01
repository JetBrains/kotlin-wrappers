// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.data

import js.reflect.unsafeCast

sealed external interface AllowedEffect {
    companion object
}

inline val AllowedEffect.Companion.none: AllowedEffect
    get() = unsafeCast("none")

inline val AllowedEffect.Companion.copy: AllowedEffect
    get() = unsafeCast("copy")

inline val AllowedEffect.Companion.copyLink: AllowedEffect
    get() = unsafeCast("copyLink")

inline val AllowedEffect.Companion.copyMove: AllowedEffect
    get() = unsafeCast("copyMove")

inline val AllowedEffect.Companion.link: AllowedEffect
    get() = unsafeCast("link")

inline val AllowedEffect.Companion.linkMove: AllowedEffect
    get() = unsafeCast("linkMove")

inline val AllowedEffect.Companion.move: AllowedEffect
    get() = unsafeCast("move")

inline val AllowedEffect.Companion.all: AllowedEffect
    get() = unsafeCast("all")

inline val AllowedEffect.Companion.uninitialized: AllowedEffect
    get() = unsafeCast("uninitialized")
