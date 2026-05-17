package js.buffer

import js.numbers.Float16
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView)
 */
open external class DataView<B : ArrayBufferLike>(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/buffer)
     */
    override val buffer: B,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/byteOffset)
     */
    override val byteOffset: Int = definedExternally,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/byteLength)
     */
    override val byteLength: Int = definedExternally,
) : ArrayBufferView<B>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt8)
     */
    fun getInt8(
        byteOffset: Int,
    ): Byte

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint8)
     */
    fun getUint8(
        byteOffset: Int,
    ): Byte

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt16)
     */
    fun getInt16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint16)
     */
    fun getUint16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt32)
     */
    fun getInt32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint32)
     */
    fun getUint32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat16)
     */
    fun getFloat16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float16

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat32)
     */
    fun getFloat32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat64)
     */
    fun getFloat64(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt8)
     */
    fun setInt8(
        byteOffset: Int,
        value: Byte,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint8)
     */
    fun setUint8(
        byteOffset: Int,
        value: Byte,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt16)
     */
    fun setInt16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint16)
     */
    fun setUint16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt32)
     */
    fun setInt32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint32)
     */
    fun setUint32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat16)
     */
    fun setFloat16(
        byteOffset: Int,
        value: Float16,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat32)
     */
    fun setFloat32(
        byteOffset: Int,
        value: Float,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat64)
     */
    fun setFloat64(
        byteOffset: Int,
        value: Double,
        littleEndian: Boolean = definedExternally,
    )
}
