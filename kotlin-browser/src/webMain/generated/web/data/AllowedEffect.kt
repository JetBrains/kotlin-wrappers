// Automatically generated - do not modify!

package web.data

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AllowedEffect

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
