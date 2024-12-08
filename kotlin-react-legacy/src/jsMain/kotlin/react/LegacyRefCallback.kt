package react

import js.reflect.unsafeCast
import react.raw.useCallbackRaw

external interface LegacyRefCallback<in T : Any> :
    RefCallback<T>

fun <T : Any> LegacyRefCallback(
    callback: (T?) -> Unit,
): LegacyRefCallback<T> =
    unsafeCast { value: T? ->
        callback(value)
        undefined
    }

fun <T : Any> useLegacyRefCallback(
    vararg dependencies: Any?,
    callback: (T?) -> Unit,
): LegacyRefCallback<T> =
    useCallbackRaw(LegacyRefCallback(callback), dependencies)
