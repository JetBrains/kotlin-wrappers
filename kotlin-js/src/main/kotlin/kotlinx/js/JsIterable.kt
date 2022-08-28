package kotlinx.js

external interface JsIterable<out T> :
    HasSymbol.iterator<() -> JsIterator<T>> {

    interface Iterator<out T> :
        JsIterator<T>,
        HasSymbol.iterator<() -> Iterator<T>>
}
