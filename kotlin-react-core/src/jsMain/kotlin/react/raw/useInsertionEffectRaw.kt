@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Cleanup

// Insertion Effect Hook (18.0+)
@JsName("useInsertionEffect")
external fun useInsertionEffectRaw(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)
