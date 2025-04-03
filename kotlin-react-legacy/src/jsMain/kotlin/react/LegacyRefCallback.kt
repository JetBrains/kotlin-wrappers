package react

import react.raw.useCallbackRaw

fun <T : Any> LegacyRefCallback(
    callback: (T?) -> Unit,
): RefCallback<T> =
    { value: T? ->
        callback(value)
        undefined
    }.unsafeCast<RefCallback<T>>()

fun <T : Any> useLegacyRefCallback(
    vararg dependencies: Any?,
    callback: (T?) -> Unit,
): RefCallback<T> =
    useCallbackRaw(LegacyRefCallback(callback), dependencies)
