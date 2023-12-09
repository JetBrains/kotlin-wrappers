package react

import seskar.js.JsNative

sealed external interface StateSetter<T> {
    @JsNative
    operator fun invoke(
        value: T,
    )

    @JsNative
    operator fun invoke(
        transform: (T) -> T,
    )
}
