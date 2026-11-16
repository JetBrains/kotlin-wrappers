package js.buffer

import js.numbers.Float16
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView)
 */
open external class DataView<out B : ArrayBufferLike>(
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
    open fun getInt8(
        byteOffset: Int,
    ): Byte

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint8)
     */
    open fun getUint8(
        byteOffset: Int,
    ): Byte

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt16)
     */
    open fun getInt16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint16)
     */
    open fun getUint16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt32)
     */
    open fun getInt32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint32)
     */
    open fun getUint32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat16)
     */
    open fun getFloat16(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float16

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat32)
     */
    open fun getFloat32(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat64)
     */
    open fun getFloat64(
        byteOffset: Int,
        littleEndian: Boolean = definedExternally,
    ): Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt8)
     */
    open fun setInt8(
        byteOffset: Int,
        value: Byte,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint8)
     */
    open fun setUint8(
        byteOffset: Int,
        value: Byte,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt16)
     */
    open fun setInt16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint16)
     */
    open fun setUint16(
        byteOffset: Int,
        value: Short,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt32)
     */
    open fun setInt32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint32)
     */
    open fun setUint32(
        byteOffset: Int,
        value: Int,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat16)
     */
    open fun setFloat16(
        byteOffset: Int,
        value: Float16,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat32)
     */
    open fun setFloat32(
        byteOffset: Int,
        value: Float,
        littleEndian: Boolean = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat64)
     */
    open fun setFloat64(
        byteOffset: Int,
        value: Double,
        littleEndian: Boolean = definedExternally,
    )
}
