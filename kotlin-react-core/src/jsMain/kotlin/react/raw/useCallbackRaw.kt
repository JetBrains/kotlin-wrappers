@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray

// Callback Hook (16.8+)
@JsName("useCallback")
external fun <T : Function<*>> rawUseCallback(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T
