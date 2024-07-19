@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Ref

// Imperative Handle Hook (16.8+)
@JsName("useImperativeHandle")
external fun <T : Any> useImperativeHandleRaw(
    ref: Ref<T>?,
    init: () -> T?,
    dependencies: ReadonlyArray<Any?>,
)
