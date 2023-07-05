package js.core

sealed external interface IterableIterator<out T> :
    JsIterator<T>,
    HasSymbol.iterator<() -> IterableIterator<T>>
