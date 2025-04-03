package react

import js.reflect.unsafeCast
import react.raw.useCallbackRaw

fun <T : Any> LegacyRefCallback(
    callback: (T?) -> Unit,
): RefCallback<T> =
    unsafeCast<RefCallback<T>> { value: T? ->
        callback(value)
        undefined
    }

fun <T : Any> useLegacyRefCallback(
    vararg dependencies: Any?,
    callback: (T?) -> Unit,
): RefCallback<T> =
    useCallbackRaw(LegacyRefCallback(callback), dependencies)
