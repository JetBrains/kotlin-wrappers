package js.array

import js.collections.ListLike

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array)
 */
@JsName("Array")
actual external class JsArray<T : JsAny?> :
    MutableArrayLike<T>,
    ListLike.Mixin<T> {

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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/push)
     */
    fun push(
        value: T,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/push)
     */
    fun push(
        vararg values: T,
    )

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/of)
         */
        operator fun <T : JsAny?> of(
            vararg values: T,
        ): JsArray<T>
    }
}
