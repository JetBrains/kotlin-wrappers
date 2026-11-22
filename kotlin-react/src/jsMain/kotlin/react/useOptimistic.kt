package react

import react.raw.OptimisticInstanceRaw
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
): OptimisticInstanceRaw<T, A> =
    useOptimisticRaw(passthrough, reducer)
