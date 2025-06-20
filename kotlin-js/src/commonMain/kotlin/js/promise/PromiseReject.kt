package js.promise

import js.core.Void
import js.errors.JsError
import js.errors.JsErrorLike
import js.function.unsafeInvoke

sealed external interface PromiseReject

inline operator fun PromiseReject.invoke() {
    unsafeInvoke<Void>(this)
}

inline operator fun PromiseReject.invoke(
    reason: JsErrorLike,
) {
    unsafeInvoke<Void>(this, reason)
}


inline operator fun PromiseReject.invoke(
    reason: JsError,
) {
    unsafeInvoke<Void>(this, reason)
}
