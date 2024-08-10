@file:JsModule("react")

package react

import js.array.JsTuple2

external fun <T> useOptimistic(
    passthrough: T,
): StateInstance<T>

external fun <T, A> useOptimistic(
    passthrough: T,
    reducer: (state: T, action: A) -> T,
): JsTuple2<T, (action: A) -> Unit>
