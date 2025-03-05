package js.buffer

import js.core.Float16
import kotlin.js.definedExternally as definedExternally_

external class DataView<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val byteLength: Int = definedExternally_,
) : ArrayBufferView<B> {
    fun getInt8(byteOffset: Int): Byte
    fun getUint8(byteOffset: Int): Byte
    fun getInt16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Short

    fun getUint16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Short

    fun getInt32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Int

    fun getUint32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Int

    fun getFloat16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Float16

    fun getFloat32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
    ): Float

    fun getFloat64(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally_,
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
        littleEndian: Boolean = definedExternally_,
    )

    fun setUint16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally_,
    )

    fun setInt32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally_,
    )

    fun setUint32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally_,
    )

    fun setFloat16(
        byteOffset: Int,
        value: Float16,
        littleEndian: Boolean = definedExternally_,
    )

    fun setFloat32(
        byteOffset: Int,
        value: Float,
        littleEndian: Boolean = definedExternally_,
    )

    fun setFloat64(
        byteOffset: Int,
        value: Double,
        littleEndian: Boolean = definedExternally_,
    )
}
