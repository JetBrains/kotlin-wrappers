@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.promise

import js.reflect.unsafeCast
import kotlin.js.JsName

@JsName("globalThis")
sealed external interface PromiseSettledStatus {
    companion object
}

inline val PromiseSettledStatus.Companion.fulfilled: PromiseSettledStatus
    get() = unsafeCast("fulfilled")

inline val PromiseSettledStatus.Companion.rejected: PromiseSettledStatus
    get() = unsafeCast("rejected")
