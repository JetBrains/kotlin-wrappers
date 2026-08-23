// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit/priority)
 */
@JsUnion
sealed /* union */
external interface RequestPriority

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit/priority#auto)
 */
inline val RequestPriority.Companion.auto: RequestPriority
    get() = unsafeCast("auto")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit/priority#high)
 */
inline val RequestPriority.Companion.high: RequestPriority
    get() = unsafeCast("high")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit/priority#low)
 */
inline val RequestPriority.Companion.low: RequestPriority
    get() = unsafeCast("low")
