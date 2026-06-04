package js.typedarrays

import js.array.ArrayLike
import js.buffer.ArrayBuffer

@JsQualifier("Uint8Array.__proto__")
@JsName("constructor")
sealed external class TypedArrayCompanion<S : TypedArray<S, S, ArrayBuffer, T>, T : JsAny> {
    val BYTES_PER_ELEMENT: Int

    abstract fun of(
        vararg items: T,
    ): S

    fun from(
        source: ArrayLike<T>,
    ): S

    fun <U : JsAny> from(
        source: ArrayLike<U>,
        transform: (item: U, index: Int) -> T,
    ): S
}
