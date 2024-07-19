@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

// Insertion Effect Hook (18.0+)
@JsName("useInsertionEffect")
external fun rawUseInsertionEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
