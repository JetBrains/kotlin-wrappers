package react

external interface RefCallback<out T : Any> : Ref<T>

inline fun <T : Any> RefCallback(
    callback: (T?) -> Unit,
): RefCallback<T> =
    callback.unsafeCast<RefCallback<T>>()