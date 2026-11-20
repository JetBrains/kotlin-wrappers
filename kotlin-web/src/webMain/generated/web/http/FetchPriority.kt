// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority#value)
 */
@JsUnion
sealed /* union */
external interface FetchPriority

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority#:~:text=high)
 */
inline val FetchPriority.Companion.high: FetchPriority
    get() = unsafeCast("high")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority#:~:text=low)
 */
inline val FetchPriority.Companion.low: FetchPriority
    get() = unsafeCast("low")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority#:~:text=auto)
 */
inline val FetchPriority.Companion.auto: FetchPriority
    get() = unsafeCast("auto")
