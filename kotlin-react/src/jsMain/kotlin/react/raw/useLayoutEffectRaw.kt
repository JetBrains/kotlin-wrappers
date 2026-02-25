@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
@JsName("useLayoutEffect")
external fun useLayoutEffectRaw(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
