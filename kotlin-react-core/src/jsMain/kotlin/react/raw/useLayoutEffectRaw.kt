@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun useLayoutEffectRaw(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
