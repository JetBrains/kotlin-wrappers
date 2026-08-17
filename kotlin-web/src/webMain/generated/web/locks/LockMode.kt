// Automatically generated - do not modify!

package web.locks

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface LockMode

inline val LockMode.Companion.exclusive: LockMode
    get() = unsafeCast("exclusive")

inline val LockMode.Companion.shared: LockMode
    get() = unsafeCast("shared")
