@file:Suppress("NOTHING_TO_INLINE")

package react

sealed external interface RefCallback<in T : Any> : Ref<T>

inline fun <T : Any> RefCallback(
    noinline callback: (T?) -> Unit,
): RefCallback<T> =
    callback.unsafeCast<RefCallback<T>>()

inline fun <T : Any> useRefCallback(
    vararg dependencies: dynamic,
    noinline callback: (T?) -> Unit,
): RefCallback<T> =
    RefCallback(rawUseCallback(callback, dependencies))
