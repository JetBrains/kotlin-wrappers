@file:JsModule("react")

package react

import js.array.JsTuple2

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
external fun <T> useOptimistic(
    passthrough: T,
): StateInstance<T>

/**
 * [Online Documentation](https://react.dev/reference/react/useOptimistic)
 */
external fun <T, A> useOptimistic(
    passthrough: T,
    reducer: (state: T, action: A) -> T,
): JsTuple2<T, (action: A) -> Unit>
