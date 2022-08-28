@file:JsModule("react")
@file:JsNonModule

package react

import kotlinx.js.JsTuple2

// [Example](https://popper.js.org/react-popper/v2/#example)

@JsName("useState")
external fun <T : Any> useRefState(): JsTuple2<T?, RefCallback<T>>
