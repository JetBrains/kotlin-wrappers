// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.data

import js.reflect.unsafeCast

sealed external interface DropEffect {
    companion object
}

inline val DropEffect.Companion.none: DropEffect
    get() = unsafeCast("none")

inline val DropEffect.Companion.copy: DropEffect
    get() = unsafeCast("copy")

inline val DropEffect.Companion.link: DropEffect
    get() = unsafeCast("link")

inline val DropEffect.Companion.move: DropEffect
    get() = unsafeCast("move")
