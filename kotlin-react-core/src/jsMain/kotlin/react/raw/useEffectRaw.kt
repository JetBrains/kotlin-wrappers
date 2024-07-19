@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

// Effect Hook (16.8+)
@JsName("useEffect")
external fun rawUseEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
