package js.iterable

external interface JsIteratorLike<out T> {
    fun next(): IteratorResult<T, *>
}
