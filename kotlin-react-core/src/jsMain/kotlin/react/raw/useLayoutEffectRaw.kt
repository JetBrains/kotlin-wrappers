@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
