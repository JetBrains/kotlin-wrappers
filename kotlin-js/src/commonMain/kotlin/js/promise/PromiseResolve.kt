@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.promise

import seskar.js.JsNativeInvoke

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
