package js.array

import js.collections.ListLike
import js.iterable.JsIterator
import js.numbers.JsInt

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array)
 */
@JsName("Array")
actual external class JsArray<T : JsAny?> :
    MutableArrayLike<T>,
    ListLike<T> {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length)
     */
    @JsName("length")
    actual val size: Int

    actual override operator fun get(index: Int): T
    actual override operator fun set(index: Int, value: T)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
     */
    override fun forEach(action: (item: T) -> Unit)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/entries)
     */
    override fun entries(): JsIterator<Tuple2<JsInt, T>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/keys)
     */
    override fun keys(): JsIterator<JsInt>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/values)
     */
    override fun values(): JsIterator<T>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/of)
         */
        operator fun <T : JsAny?> of(
            vararg values: T,
        ): JsArray<T>
    }
}
