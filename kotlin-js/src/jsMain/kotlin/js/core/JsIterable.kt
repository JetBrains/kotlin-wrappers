package js.core

external interface JsIterable<out T> :
    HasSymbol.iterator<() -> JsIterator<T>>
