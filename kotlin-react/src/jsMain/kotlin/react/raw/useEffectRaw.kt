@file:JsModule("react")

package react.raw

import react.Cleanup
import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
@JsName("useEffect")
external fun useEffectRaw(
    effect: () -> Cleanup?,
    dependencies: DependencyList = definedExternally,
)
