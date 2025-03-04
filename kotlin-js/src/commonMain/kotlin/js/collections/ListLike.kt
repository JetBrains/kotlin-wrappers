package js.collections

import js.array.ArrayLike
import js.core.JsAny
import js.core.JsInt

external interface ListLike<out T : JsAny?> :
    ArrayLike<T>,
    CollectionLike<JsInt, T>
