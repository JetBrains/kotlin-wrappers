package kotlinx.js

external interface JsIterable<T> :
    HasSymbol.iterator<() -> JsIterator<T>> {

    interface Iterator<T> :
        JsIterator<T>,
        HasSymbol.iterator<() -> Iterator<T>>
}
