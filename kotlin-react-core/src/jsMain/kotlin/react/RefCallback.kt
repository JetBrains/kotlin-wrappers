package react

import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import react.internal.buildCleanupCallback
import react.internal.createCleanupCallback
import react.raw.useCallbackRaw

@JsName("Function")
external class RefCallback<T : Any> :
    Ref<T> {
    operator fun invoke(value: T): Cleanup?
}

fun <T : Any> RefCallback(
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    unsafeCast(createCleanupCallback(block))

fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    useCallbackRaw(RefCallback(block), dependencies)

fun <T : Any> useRefCallbackWithCleanup(
    vararg dependencies: Any?,
    block: CleanupBuilder.(T) -> Unit,
): RefCallback<T> {
    val callback = { value: T ->
        val cleanupCallback = buildCleanupCallback { block(value) }
        cleanupCallback()
    }.unsafeCast<RefCallback<T>>()

    return useCallbackRaw(callback, dependencies)
}
