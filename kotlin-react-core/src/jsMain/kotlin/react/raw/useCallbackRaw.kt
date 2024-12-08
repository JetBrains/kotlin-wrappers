@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.RefCallback

// Callback Hook (16.8+)
@JsName("useCallback")
external fun <T : Function<*>> useCallbackRaw(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T

// TODO: use common marker interface for JS functions?
@JsName("useCallback")
external fun <T : RefCallback<*>> useCallbackRaw(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T
