@file:JsModule("react")

package react.raw

import react.Cleanup
import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
@JsName("useLayoutEffect")
external fun useLayoutEffectRaw(
    effect: () -> Cleanup?,
    dependencies: DependencyList = definedExternally,
)
