package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.core.ReadonlyArray

@JsName("Object")
sealed external class TypedArray<S : TypedArray<S, T>, T : Number> :
    ArrayBufferView {

    val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int

    fun set(
        array: S,
        offset: Int = definedExternally
    )

    fun set(
        array: ReadonlyArray<T>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): S

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
