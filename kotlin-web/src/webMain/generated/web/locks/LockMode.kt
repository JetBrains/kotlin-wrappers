// Automatically generated - do not modify!

package web.locks

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode)
 */
@JsUnion
sealed /* union */
external interface LockMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode#exclusive)
 */
inline val LockMode.Companion.exclusive: LockMode
    get() = unsafeCast("exclusive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Lock/mode#shared)
 */
inline val LockMode.Companion.shared: LockMode
    get() = unsafeCast("shared")
