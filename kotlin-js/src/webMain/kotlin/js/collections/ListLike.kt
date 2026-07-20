package js.collections

import js.array.ArrayLike
import js.numbers.JsInt

external interface ListLike<out T : JsAny?> :
    ArrayLike<T>,
    CollectionLike<JsInt, T> {

    interface Mixin<out T : JsAny?> :
        ListLike<T>,
        CollectionLike.Mixin<JsInt, T>
}
