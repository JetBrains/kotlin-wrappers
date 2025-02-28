package js.promise

import js.core.JsNativeInvoke

sealed external interface PromiseResolve<T> {
    @JsNativeInvoke
    operator fun invoke(
        value: T,
    )

    @JsNativeInvoke
    operator fun invoke(
        value: PromiseResult<T>,
    )
}
