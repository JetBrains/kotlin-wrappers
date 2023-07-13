package js.iterable

sealed external interface IterableIterator<out T> :
    JsIterator<T>,
    IteratorSymbolHolder<() -> IterableIterator<T>>
