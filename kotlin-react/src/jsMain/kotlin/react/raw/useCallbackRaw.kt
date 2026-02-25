@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.RefCallback

/**
 * [Online Documentation](https://react.dev/reference/react/useCallback)
 */
@JsName("useCallback")
external fun <T : Function<*>> useCallbackRaw(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T

/**
 * [Online Documentation](https://react.dev/reference/react/useCallback)
 */
// TODO: use common marker interface for JS functions?
@JsName("useCallback")
external fun <T : RefCallback<*>> useCallbackRaw(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T
