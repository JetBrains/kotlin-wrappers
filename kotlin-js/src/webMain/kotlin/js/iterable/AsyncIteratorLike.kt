package js.iterable

import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_async_iterator_and_async_iterable_protocols)
 */
external interface AsyncIteratorLike<out T : JsAny?> {
    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#next_2)
     */
    fun next(): Promise<IteratorResult<T, *>>
}
