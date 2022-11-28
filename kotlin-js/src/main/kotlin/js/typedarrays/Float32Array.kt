package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Float32Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Float32Array)
    constructor(array: Array<Float>)
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
        array: Float32Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Float>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Float32Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
