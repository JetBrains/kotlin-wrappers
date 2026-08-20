// Automatically generated - do not modify!

package web.wakelock

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/type)
 */
@JsUnion
sealed /* union */
external interface WakeLockType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/type#screen)
 */
inline val WakeLockType.Companion.screen: WakeLockType
    get() = unsafeCast("screen")
