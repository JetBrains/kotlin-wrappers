package js.iterable

import js.array.ReadonlyArray
import js.disposable.Disposable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator)
 */
@JsName("Iterator")
abstract external class JsIterator<out T : JsAny?> :
    JsIteratorLike<T>,
    JsIterable.Mixin<T>,
    Disposable.Mixin {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/return)
     */
    open fun `return`(): IteratorResult<T, *>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/chunks)
     */
    open fun chunks(
        chunkSize: Int,
    ): JsIterator<ReadonlyArray<T>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/drop)
     */
    open fun drop(
        n: Int,
    ): JsIterator<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/every)
     */
    open fun every(
        predicate: (T) -> Boolean,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/filter)
     */
    open fun filter(
        predicate: (T) -> Boolean,
    ): JsIterator<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/find)
     */
    open fun find(
        predicate: (T) -> Boolean,
    ): T?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/flatMap)
     */
    open fun <R : JsAny?> flatMap(
        transform: (T) -> JsIterable<R>,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/flatMap)
     */
    open fun <R : JsAny?> flatMap(
        transform: (T) -> ReadonlyArray<R>,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/forEach)
     */
    open fun forEach(
        action: (item: T) -> Unit,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/includes)
     */
    open fun includes(
        searchElement: @UnsafeVariance T,
        fromIndex: Int = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/join)
     */
    open fun join(
        separator: String,
    ): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/map)
     */
    open fun <R : JsAny?> map(
        transform: (T) -> R,
    ): JsIterator<R>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/reduce)
     */
    open fun reduce(
        operation: (previousValue: T, currentValue: T, currentIndex: Int) -> @UnsafeVariance T,
    ): T

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/reduce)
     */
    open fun <U : JsAny?> reduce(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
    ): U

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/some)
     */
    open fun some(
        predicate: (T) -> Boolean,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/take)
     */
    open fun take(
        n: Int,
    ): JsIterator<T>
    // fun toArray(): ReadonlyArray<T>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Iterator/windows)
     */
    open fun windows(
        windowSize: Int,
        underSized: UnderSized = definedExternally,
    ): JsIterator<T>

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
