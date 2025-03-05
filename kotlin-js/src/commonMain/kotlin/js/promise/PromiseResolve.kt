package js.promise

import js.core.JsAny
import seskar.js.JsNativeInvoke

sealed external interface PromiseResolve<T : JsAny?> {
    @JsNativeInvoke
    operator fun invoke(
        value: T,
    )

    @JsNativeInvoke
    operator fun invoke(
        value: PromiseResult<T>,
    )
}
