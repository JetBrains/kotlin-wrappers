package react

import seskar.js.JsNativeInvoke

sealed external interface StateSetter<T> {
    @JsNativeInvoke
    operator fun invoke(
        value: T,
    )

    @JsNativeInvoke
    operator fun invoke(
        transform: (T) -> T,
    )
}
