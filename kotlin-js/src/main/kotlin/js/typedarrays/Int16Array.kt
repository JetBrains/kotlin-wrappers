package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Int16Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int16Array)
    constructor(array: Array<Short>)
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
        array: Int16Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Short>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Int16Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
