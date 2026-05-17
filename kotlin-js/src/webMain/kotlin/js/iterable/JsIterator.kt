package js.iterable

import js.array.ReadonlyArray
import js.disposable.Disposable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator)
 */
@JsName("Iterator")
abstract external class JsIterator<out T : JsAny?> :
    JsIteratorLike<T>,
    JsIterable<T>,
    Disposable {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/return)
     */
    fun `return`(): IteratorResult<T, *>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/drop)
     */
    fun drop(
        n: Int,
    ): JsIterator<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/every)
     */
    fun every(
        predicate: (T) -> Boolean,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/filter)
     */
    fun filter(
        predicate: (T) -> Boolean,
    ): JsIterator<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/find)
     */
    fun find(
        predicate: (T) -> Boolean,
    ): T?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/flatMap)
     */
    fun <R : JsAny?> flatMap(
        transform: (T) -> JsIterable<R>,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/flatMap)
     */
    fun <R : JsAny?> flatMap(
        transform: (T) -> ReadonlyArray<R>,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/forEach)
     */
    fun forEach(
        action: (item: T) -> Unit,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/map)
     */
    fun <R : JsAny?> map(
        transform: (T) -> R,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/reduce)
     */
    fun reduce(
        operation: (previousValue: T, currentValue: T, currentIndex: Int) -> @UnsafeVariance T,
    ): T

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/reduce)
     */
    fun <U : JsAny?> reduce(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
    ): U

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/some)
     */
    fun some(
        predicate: (T) -> Boolean,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/take)
     */
    fun take(
        n: Int,
    ): JsIterator<T>
    // fun toArray(): ReadonlyArray<T>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/concat)
         */
        fun <T : JsAny?> concat(
            vararg values: JsIterable<T>,
        ): JsIterator<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/from)
         */
        fun <T : JsAny?> from(
            source: JsIteratorLike<T>,
        ): JsIterator<T>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/from)
         */
        fun <T : JsAny?> from(
            source: JsIterable<T>,
        ): JsIterator<T>
    }
}
