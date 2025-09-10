package js.promise

import js.core.Void
import js.function.unsafeInvoke
import kotlin.js.JsAny

sealed external interface PromiseResolve<T : JsAny?>

inline operator fun <T : JsAny?> PromiseResolve<T>.invoke(
    value: T,
) {
    unsafeInvoke<Void>(this, value)
}

inline operator fun <T : JsAny?> PromiseResolve<T>.invoke(
    value: PromiseResult<T>,
) {
    unsafeInvoke<Void>(this, value)
}
