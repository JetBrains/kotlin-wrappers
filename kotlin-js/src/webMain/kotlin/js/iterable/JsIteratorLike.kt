package js.iterable

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterator_protocol)
 */
external interface JsIteratorLike<out T : JsAny?> {
    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#next)
     */
    fun next(): IteratorResult<T, *>
}
