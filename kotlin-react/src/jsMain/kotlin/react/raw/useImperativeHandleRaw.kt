@file:JsModule("react")

package react.raw

import js.array.ReadonlyArray
import react.Ref

/**
 * [Online Documentation](https://react.dev/reference/react/useImperativeHandle)
 */
@JsName("useImperativeHandle")
external fun <T : Any> useImperativeHandleRaw(
    ref: Ref<T>?,
    init: () -> T?,
    dependencies: ReadonlyArray<Any?>,
)
