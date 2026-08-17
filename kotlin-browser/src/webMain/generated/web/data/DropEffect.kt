// Automatically generated - do not modify!

package web.data

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DropEffect

inline val DropEffect.Companion.none: DropEffect
    get() = unsafeCast("none")

inline val DropEffect.Companion.copy: DropEffect
    get() = unsafeCast("copy")

inline val DropEffect.Companion.link: DropEffect
    get() = unsafeCast("link")

inline val DropEffect.Companion.move: DropEffect
    get() = unsafeCast("move")
