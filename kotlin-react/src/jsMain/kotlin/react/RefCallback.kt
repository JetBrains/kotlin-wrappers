package react

import js.reflect.unsafeCast
import react.internal.createCleanupCallback
import react.raw.useCallbackRaw

@JsName("Function")
external class RefCallback<T : Any> :
    Ref<T> {
    operator fun invoke(value: T): Cleanup?
}

fun <T : Any> RefCallback(
    block: suspend CleanupScope.(T) -> Unit,
): RefCallback<T> =
    unsafeCast(createCleanupCallback(block))

fun <T : Any> useRefCallback(
    vararg dependencies: Any?,
    block: suspend CleanupScope.(T) -> Unit,
): RefCallback<T> =
    useCallbackRaw(RefCallback(block), dependencies)
