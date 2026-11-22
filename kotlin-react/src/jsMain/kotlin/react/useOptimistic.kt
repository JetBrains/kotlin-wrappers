@file:JsModule("react")

package react

import js.array.Tuple2
import react.raw.StateInstanceRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
external fun <T> useOptimistic(
    passthrough: T,
): StateInstanceRaw<T>

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
external fun <T, A> useOptimistic(
    passthrough: T,
    reducer: (state: T, action: A) -> T,
): Tuple2<T, (action: A) -> Unit>
