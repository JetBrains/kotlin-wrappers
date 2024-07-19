@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray

// Memo Hook (16.8+)
@JsName("useMemo")
external fun <T> useMemoRaw(
    callback: () -> T,
    dependencies: ReadonlyArray<Any?>,
): T
