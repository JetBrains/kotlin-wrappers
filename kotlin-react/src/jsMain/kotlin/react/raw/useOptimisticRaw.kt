@file:JsModule("react")

package react.raw

import js.array.Tuple2

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
    reducer: (state: T, action: A) -> T,
): Tuple2<T, (action: A) -> Unit>
