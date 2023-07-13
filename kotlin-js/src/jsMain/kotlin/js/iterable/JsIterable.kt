package js.iterable

external interface JsIterable<out T> :
    IteratorSymbolHolder<() -> JsIterator<T>>
