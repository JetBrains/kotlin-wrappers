package react

import js.reflect.unsafeCast
import react.raw.useCallbackRaw

/* sealed */
external interface RefCallback<in T : Any> :
    Ref<T>

fun <T : Any> RefCallback(
    callback: (T?) -> Unit,
): RefCallback<T> =
    unsafeCast(callback)

fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    callback: (T?) -> Unit,
): RefCallback<T> =
    RefCallback(useCallbackRaw(callback, dependencies))
