package js.collections

import js.array.ArrayLike
import js.core.JsAny

external interface ListLike<out T : JsAny?> :
    ArrayLike<T>,
    CollectionLike<Int, T>
