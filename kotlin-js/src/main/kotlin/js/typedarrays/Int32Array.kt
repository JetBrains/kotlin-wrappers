package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Int32Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int32Array)
    constructor(array: Array<Int>)
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
        array: Int32Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Int>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Int32Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
