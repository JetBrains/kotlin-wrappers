@file:JsModule("react")

package react.raw

import react.Reducer

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
@PublishedApi
@JsName("useOptimistic")
internal /* raw */
external fun <T> useOptimisticRaw(
    passthrough: T,
): StateInstanceRaw<T>

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
@PublishedApi
@JsName("useOptimistic")
internal /* raw */
external fun <T, A> useOptimisticRaw(
    passthrough: T,
    reducer: Reducer<T, A>,
): OptimisticInstanceRaw<T, A>
