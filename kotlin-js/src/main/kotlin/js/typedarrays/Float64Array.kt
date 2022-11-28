package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Float64Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Float64Array)
    constructor(array: Array<Double>)
    constructor(
        buffer: ArrayBuffer,
        byteOffset: Int = definedExternally,
        length: Int = definedExternally,
    )

    val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    fun set(
        array: Float64Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Double>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Float64Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
