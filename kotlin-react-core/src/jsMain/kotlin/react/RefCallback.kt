package react

import js.reflect.legacyUnsafeCast
import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useCallbackRaw
import seskar.js.JsNativeInvoke

@JsName("Function")
external class RefCallback<T : Any> :
    Ref<T> {
    @JsNativeInvoke
    operator fun invoke(value: T): Cleanup?
}

fun <T : Any> RefCallback(
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    legacyUnsafeCast(createCleanupCallback(block))

fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    block: suspend CoroutineScope.(T) -> Unit,
): RefCallback<T> =
    useCallbackRaw(RefCallback(block), dependencies)
