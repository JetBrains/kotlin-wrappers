package react

import react.raw.useOptimisticRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
inline fun <T> useOptimistic(
    passthrough: T,
): StateInstance<T> =
    StateInstance(useOptimisticRaw(passthrough))

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
inline fun <T, A> useOptimistic(
    passthrough: T,
    noinline reducer: Reducer<T, A>,
): OptimisticInstance<T, A> =
    OptimisticInstance(useOptimisticRaw(passthrough, reducer))
