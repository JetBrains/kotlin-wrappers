package js.typedarrays

import js.array.ArrayLike
import js.buffer.ArrayBuffer

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray)
 */
@JsQualifier("Uint8Array.__proto__")
@JsName("constructor")
sealed external class TypedArrayCompanion<S : TypedArray<S, S, ArrayBuffer, T>, T : JsAny> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/BYTES_PER_ELEMENT)
     */
    val BYTES_PER_ELEMENT: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
     */
    abstract fun of(
        vararg items: T,
    ): S

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/from)
     */
    fun from(
        source: ArrayLike<T>,
    ): S

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/from)
     */
    fun <U : JsAny> from(
        source: ArrayLike<U>,
        transform: (item: U, index: Int) -> T,
    ): S
}
