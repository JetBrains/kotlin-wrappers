package js.core

/** ES6 Iterator type. */
sealed external interface JsIterator<out T> {
    fun next(): IteratorResult<T, *>
}
