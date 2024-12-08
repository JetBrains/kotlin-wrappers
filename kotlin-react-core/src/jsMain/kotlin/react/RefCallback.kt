package react

import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useCallbackRaw

/* sealed */
external interface RefCallback<in T : Any> :
    Ref<T>

fun <T : Any> RefCallback(
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    unsafeCast(createCleanupCallback(block))

fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    useCallbackRaw(RefCallback(block), dependencies)
