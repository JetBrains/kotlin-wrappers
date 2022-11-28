package js.typedarrays

import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.ArrayBufferView
import org.khronos.webgl.Uint8Array

open external class Uint8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint8Array)
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
        array: Uint8Array,
        offset: Int = definedExternally
    )

    fun set(
        array: Array<Byte>,
        offset: Int = definedExternally
    )

    fun subarray(
        start: Int,
        end: Int
    ): Uint8Array

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
