// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.screen

import js.reflect.unsafeCast

sealed external interface OrientationType {
    companion object
}

inline val OrientationType.Companion.landscapePrimary: OrientationType
    get() = unsafeCast("landscape-primary")

inline val OrientationType.Companion.landscapeSecondary: OrientationType
    get() = unsafeCast("landscape-secondary")

inline val OrientationType.Companion.portraitPrimary: OrientationType
    get() = unsafeCast("portrait-primary")

inline val OrientationType.Companion.portraitSecondary: OrientationType
    get() = unsafeCast("portrait-secondary")
