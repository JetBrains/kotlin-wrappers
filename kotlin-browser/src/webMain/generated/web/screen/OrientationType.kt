// Automatically generated - do not modify!

package web.screen

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface OrientationType

inline val OrientationType.Companion.landscapePrimary: OrientationType
    get() = unsafeCast("landscape-primary")

inline val OrientationType.Companion.landscapeSecondary: OrientationType
    get() = unsafeCast("landscape-secondary")

inline val OrientationType.Companion.portraitPrimary: OrientationType
    get() = unsafeCast("portrait-primary")

inline val OrientationType.Companion.portraitSecondary: OrientationType
    get() = unsafeCast("portrait-secondary")
