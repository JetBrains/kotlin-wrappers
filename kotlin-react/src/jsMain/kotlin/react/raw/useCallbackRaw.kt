@file:JsModule("react")

package react.raw

import react.DependencyList
import react.RefCallback

/**
 * [Online Documentation](https://react.dev/reference/react/useCallback)
 */
@JsName("useCallback")
external fun <T : Function<*>> useCallbackRaw(
    callback: T,
    dependencies: DependencyList,
): T

/**
 * [Online Documentation](https://react.dev/reference/react/useCallback)
 */
// TODO: use common marker interface for JS functions?
@JsName("useCallback")
external fun <T : RefCallback<*>> useCallbackRaw(
    callback: T,
    dependencies: DependencyList,
): T
