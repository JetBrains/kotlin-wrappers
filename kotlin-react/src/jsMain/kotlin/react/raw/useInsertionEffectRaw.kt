@file:JsModule("react")

package react.raw

import react.Cleanup
import react.DependencyList

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
@PublishedApi
@JsName("useInsertionEffect")
internal /* raw */
external fun useInsertionEffectRaw(
    effect: () -> Cleanup?,
    dependencies: DependencyList = definedExternally,
)
