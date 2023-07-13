package js.iterable

sealed external interface IterableIterator<out T> :
    JsIterator<T>,
    HasSymbol.iterator<() -> IterableIterator<T>>
