package js.collections

import js.array.ArrayLike
import js.internal.InternalApi
import js.numbers.JsInt

external interface ListLike<out T : JsAny?> :
    ArrayLike<T>,
    CollectionLike<JsInt, T> {

    @SubclassOptInRequired(InternalApi::class)
    interface Mixin<out T : JsAny?> :
        ListLike<T>,
        CollectionLike.Mixin<JsInt, T>
}
