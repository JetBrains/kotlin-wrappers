package js.iterable

external interface JsIteratorLike<out T : JsAny?> {

    fun next(): IteratorResult<T, *>
}
