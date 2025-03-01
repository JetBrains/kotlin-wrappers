package js.buffer

import js.core.Float16
import kotlin.js.definedExternally

external class DataView<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val byteLength: Int = definedExternally,
) : ArrayBufferView<B> {
    fun getInt8(byteOffset: Int): Byte
    fun getUint8(byteOffset: Int): Byte
    fun getInt16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    fun getUint16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    fun getInt32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    fun getUint32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    fun getFloat16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float16

    fun getFloat32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float

    fun getFloat64(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Double

    fun setInt8(
        byteOffset: Int,
        value: Byte,
    )

    fun setUint8(
        byteOffset: Int,
        value: Byte,
    )

    fun setInt16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    fun setUint16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    fun setInt32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    fun setUint32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    fun setFloat16(
        byteOffset: Int,
        value: Float16,
        littleEndian: Boolean = definedExternally,
    )

    fun setFloat32(
        byteOffset: Int,
        value: Float,
        littleEndian: Boolean = definedExternally,
    )

    fun setFloat64(
        byteOffset: Int,
        value: Double,
        littleEndian: Boolean = definedExternally,
    )
}
