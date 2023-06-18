package js.core

external interface JsIterable<out T> :
    HasSymbol.iterator<() -> JsIterator<T, *, *>> {

    interface Iterator<out T> :
        JsIterator<T, Void, Void>,
        HasSymbol.iterator<() -> Iterator<T>>
}
