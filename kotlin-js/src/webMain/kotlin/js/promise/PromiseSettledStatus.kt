package js.promise

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PromiseSettledStatus

inline val PromiseSettledStatus.Companion.fulfilled: PromiseSettledStatus
    get() = unsafeCast("fulfilled")

inline val PromiseSettledStatus.Companion.rejected: PromiseSettledStatus
    get() = unsafeCast("rejected")
