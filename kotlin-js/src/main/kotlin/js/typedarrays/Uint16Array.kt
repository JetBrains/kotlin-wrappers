package js.typedarrays

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView

open external class Uint16Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint16Array)
    constructor(array: Array<Short>)
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
        array: Uint16Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Short>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Uint16Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
