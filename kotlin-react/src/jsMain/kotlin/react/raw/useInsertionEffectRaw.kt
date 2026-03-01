@file:JsModule("react")

package react.raw

import react.Cleanup
import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
@JsName("useInsertionEffect")
external fun useInsertionEffectRaw(
    effect: () -> Cleanup?,
    dependencies: DependencyList = definedExternally,
)
