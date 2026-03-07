@file:JsModule("react")

package react.raw

import react.DependencyList
import react.Ref

/**
 * [Online Documentation](https://react.dev/reference/react/useImperativeHandle)
 */
@PublishedApi
@JsName("useImperativeHandle")
internal /* raw */
external fun <T : Any> useImperativeHandleRaw(
    ref: Ref<T>?,
    init: () -> T?,
    dependencies: DependencyList,
)
