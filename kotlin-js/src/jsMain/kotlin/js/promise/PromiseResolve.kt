package js.promise

import seskar.js.JsNative

sealed external interface PromiseResolve<T> {
    @JsNative
    operator fun invoke(
        value: T,
    )

    @JsNative
    operator fun invoke(
        value: PromiseResult<T>,
    )
}
