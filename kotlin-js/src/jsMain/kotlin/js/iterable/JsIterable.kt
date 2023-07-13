package js.iterable

external interface JsIterable<out T> :
    HasSymbol.iterator<() -> JsIterator<T>>
