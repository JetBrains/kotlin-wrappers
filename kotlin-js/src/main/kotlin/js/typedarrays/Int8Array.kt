package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Int8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int8Array)
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
        array: Int8Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Byte>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Int8Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
