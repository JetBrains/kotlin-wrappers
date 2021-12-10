@file:JsModule("react")
@file:JsNonModule

package react

import kotlinext.js.JsPair

// [Example](https://popper.js.org/react-popper/v2/#example)

@JsName("useState")
external fun <T : Any> useRefState(): JsPair<T?, RefCallback<T>>
