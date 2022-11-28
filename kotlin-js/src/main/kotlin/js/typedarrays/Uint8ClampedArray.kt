package js.typedarrays

import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.ArrayBufferView
import org.khronos.webgl.Uint8ClampedArray

open external class Uint8ClampedArray : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint8ClampedArray)
    constructor(array: Array<Byte>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally
    )

    val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    fun set(
        array: Uint8ClampedArray,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Byte>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Uint8ClampedArray

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
