// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FetchPriority

inline val FetchPriority.Companion.auto: FetchPriority
    get() = unsafeCast("auto")

inline val FetchPriority.Companion.high: FetchPriority
    get() = unsafeCast("high")

inline val FetchPriority.Companion.low: FetchPriority
    get() = unsafeCast("low")
