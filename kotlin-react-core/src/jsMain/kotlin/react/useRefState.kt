@file:JsModule("react")

package react

import js.array.JsTuple2

/**
 * [Example](https://popper.js.org/react-popper/v2/#example)
 *
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
@JsName("useState")
external fun <T : Any> useRefState(): JsTuple2<T?, RefCallback<T>>
