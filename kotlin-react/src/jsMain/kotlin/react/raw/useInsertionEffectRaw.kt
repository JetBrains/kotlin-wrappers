@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
@JsName("useInsertionEffect")
external fun useInsertionEffectRaw(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
