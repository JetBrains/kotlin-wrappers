// Automatically generated - do not modify!

package web.window

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WindowTarget

inline val WindowTarget.Companion._self: WindowTarget
    get() = unsafeCast("_self")

inline val WindowTarget.Companion._blank: WindowTarget
    get() = unsafeCast("_blank")

inline val WindowTarget.Companion._parent: WindowTarget
    get() = unsafeCast("_parent")

inline val WindowTarget.Companion._top: WindowTarget
    get() = unsafeCast("_top")
