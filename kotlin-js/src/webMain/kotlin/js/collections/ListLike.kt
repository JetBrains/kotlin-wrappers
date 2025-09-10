package js.collections

import js.array.ArrayLike
import js.core.JsInt
import kotlin.js.JsAny

external interface ListLike<out T : JsAny?> :
    ArrayLike<T>,
    CollectionLike<JsInt, T>
