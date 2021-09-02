@file:JsModule("react")
@file:JsNonModule

package react

import kotlinext.js.Tuple

// [Example](https://popper.js.org/react-popper/v2/#example)

@JsName("useState")
external fun <T : Any> useRefState(): Tuple<T?, RefCallback<T>>
