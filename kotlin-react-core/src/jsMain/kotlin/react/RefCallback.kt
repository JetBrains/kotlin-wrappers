@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import react.raw.useCallbackRaw

sealed external interface RefCallback<in T : Any> : Ref<T>

inline fun <T : Any> RefCallback(
    noinline callback: (T?) -> Unit,
): RefCallback<T> =
    callback.unsafeCast<RefCallback<T>>()

inline fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    noinline callback: (T?) -> Unit,
): RefCallback<T> =
    RefCallback(useCallbackRaw(callback, dependencies))
