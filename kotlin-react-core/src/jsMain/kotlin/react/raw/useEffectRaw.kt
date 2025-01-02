@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
@JsName("useEffect")
external fun useEffectRaw(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
