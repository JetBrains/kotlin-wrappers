@file:JsModule("react")

package react

import js.array.Tuple2

/**
 * [Example](https://popper.js.org/react-popper/v2/#example)
 *
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
@JsName("useState")
external fun <T : Any> useRefState(): Tuple2<T?, RefCallback<T>>
