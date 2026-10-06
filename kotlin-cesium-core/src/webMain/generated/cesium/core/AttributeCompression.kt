// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.typedarrays.Float32Array
import js.typedarrays.Uint16Array

/**
 * Attribute compression and decompression functions.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html">Online Documentation</a>
 */
external object AttributeCompression {
    /**
     * Encodes a normalized vector into 2 SNORM values in the range of [0-rangeMax] following the 'oct' encoding.
     *
     * Oct encoding is a compact representation of unit length vectors.
     * The 'oct' encoding is described in "A Survey of Efficient Representations of Independent Unit Vectors",
     * Cigolle et al 2014: [http://jcgt.org/published/0003/02/01/]
     * @param [vector] The normalized vector to be compressed into 2 component 'oct' encoding.
     * @param [result] The 2 component oct-encoded unit length vector.
     * @param [rangeMax] The maximum value of the SNORM range. The encoded vector is stored in log2(rangeMax+1) bits.
     * @return The 2 component oct-encoded unit length vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octEncodeInRange">Online Documentation</a>
     */
    fun octEncodeInRange(
        vector: Cartesian3,
        result: Cartesian2,
        rangeMax: Double,
    ): Cartesian2

    /**
     * Encodes a normalized vector into 2 SNORM values in the range of [0-255] following the 'oct' encoding.
     * @param [vector] The normalized vector to be compressed into 2 byte 'oct' encoding.
     * @param [result] The 2 byte oct-encoded unit length vector.
     * @return The 2 byte oct-encoded unit length vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octEncode">Online Documentation</a>
     */
    fun octEncode(
        vector: Cartesian3,
        result: Cartesian2,
    ): Cartesian2

    /**
     * @param [vector] The normalized vector to be compressed into 4 byte 'oct' encoding.
     * @param [result] The 4 byte oct-encoded unit length vector.
     * @return The 4 byte oct-encoded unit length vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octEncodeToCartesian4">Online Documentation</a>
     */
    fun octEncodeToCartesian4(
        vector: Cartesian3,
        result: Cartesian4,
    ): Cartesian4

    /**
     * Decodes a unit-length vector in 'oct' encoding to a normalized 3-component vector.
     * @param [x] The x component of the oct-encoded unit length vector.
     * @param [y] The y component of the oct-encoded unit length vector.
     * @param [rangeMax] The maximum value of the SNORM range. The encoded vector is stored in log2(rangeMax+1) bits.
     * @param [result] The decoded and normalized vector
     * @return The decoded and normalized vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octDecodeInRange">Online Documentation</a>
     */
    fun octDecodeInRange(
        x: Double,
        y: Double,
        rangeMax: Double,
        result: Cartesian3,
    ): Cartesian3

    /**
     * Decodes a unit-length vector in 2 byte 'oct' encoding to a normalized 3-component vector.
     * @param [x] The x component of the oct-encoded unit length vector.
     * @param [y] The y component of the oct-encoded unit length vector.
     * @param [result] The decoded and normalized vector.
     * @return The decoded and normalized vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octDecode">Online Documentation</a>
     */
    fun octDecode(
        x: Double,
        y: Double,
        result: Cartesian3,
    ): Cartesian3

    /**
     * Decodes a unit-length vector in 4 byte 'oct' encoding to a normalized 3-component vector.
     * @param [encoded] The oct-encoded unit length vector.
     * @param [result] The decoded and normalized vector.
     * @return The decoded and normalized vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octDecodeFromCartesian4">Online Documentation</a>
     */
    fun octDecodeFromCartesian4(
        encoded: Cartesian4,
        result: Cartesian3,
    ): Cartesian3

    /**
     * Packs an oct encoded vector into a single floating-point number.
     * @param [encoded] The oct encoded vector.
     * @return The oct encoded vector packed into a single float.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octPackFloat">Online Documentation</a>
     */
    fun octPackFloat(encoded: Cartesian2): Double

    /**
     * Encodes a normalized vector into 2 SNORM values in the range of [0-255] following the 'oct' encoding and
     * stores those values in a single float-point number.
     * @param [vector] The normalized vector to be compressed into 2 byte 'oct' encoding.
     * @return The 2 byte oct-encoded unit length vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octEncodeFloat">Online Documentation</a>
     */
    fun octEncodeFloat(vector: Cartesian3): Double

    /**
     * Decodes a unit-length vector in 'oct' encoding packed in a floating-point number to a normalized 3-component vector.
     * @param [value] The oct-encoded unit length vector stored as a single floating-point number.
     * @param [result] The decoded and normalized vector
     * @return The decoded and normalized vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octDecodeFloat">Online Documentation</a>
     */
    fun octDecodeFloat(
        value: Double,
        result: Cartesian3,
    ): Cartesian3

    /**
     * Encodes three normalized vectors into 6 SNORM values in the range of [0-255] following the 'oct' encoding and
     * packs those into two floating-point numbers.
     * @param [v1] A normalized vector to be compressed.
     * @param [v2] A normalized vector to be compressed.
     * @param [v3] A normalized vector to be compressed.
     * @param [result] The 'oct' encoded vectors packed into two floating-point numbers.
     * @return The 'oct' encoded vectors packed into two floating-point numbers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octPack">Online Documentation</a>
     */
    fun octPack(
        v1: Cartesian3,
        v2: Cartesian3,
        v3: Cartesian3,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Decodes three unit-length vectors in 'oct' encoding packed into a floating-point number to a normalized 3-component vector.
     * @param [packed] The three oct-encoded unit length vectors stored as two floating-point number.
     * @param [v1] One decoded and normalized vector.
     * @param [v2] One decoded and normalized vector.
     * @param [v3] One decoded and normalized vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.octUnpack">Online Documentation</a>
     */
    fun octUnpack(
        packed: Cartesian2,
        v1: Cartesian3,
        v2: Cartesian3,
        v3: Cartesian3,
    )

    /**
     * Pack texture coordinates into a single float. The texture coordinates will only preserve 12 bits of precision.
     * @param [textureCoordinates] The texture coordinates to compress.  Both coordinates must be in the range 0.0-1.0.
     * @return The packed texture coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.compressTextureCoordinates">Online Documentation</a>
     */
    fun compressTextureCoordinates(textureCoordinates: Cartesian2): Double

    /**
     * Decompresses texture coordinates that were packed into a single float.
     * @param [compressed] The compressed texture coordinates.
     * @param [result] The decompressed texture coordinates.
     * @return The modified result parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.decompressTextureCoordinates">Online Documentation</a>
     */
    fun decompressTextureCoordinates(
        compressed: Double,
        result: Cartesian2,
    ): Cartesian2

    /**
     * Decodes delta and ZigZag encoded vertices. This modifies the buffers in place.
     * @param [uBuffer] The buffer view of u values.
     * @param [vBuffer] The buffer view of v values.
     * @param [heightBuffer] The buffer view of height values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.zigZagDeltaDecode">Online Documentation</a>
     */
    fun zigZagDeltaDecode(
        uBuffer: Uint16Array<*>,
        vBuffer: Uint16Array<*>,
        heightBuffer: Uint16Array<*>? = definedExternally,
    )

    /**
     * Dequantizes a quantized typed array into a floating point typed array.
     * @param [typedArray] The typed array for the quantized data.
     * @param [componentDatatype] The component datatype of the quantized data.
     * @param [type] The attribute type of the quantized data.
     * @param [count] The number of attributes referenced in the dequantized array.
     * @return The dequantized array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.dequantize">Online Documentation</a>
     */
    fun dequantize(
        typedArray: JsAny, /* Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array */
        componentDatatype: ComponentDatatype,
        type: AttributeType,
        count: Double,
    ): Float32Array<*>

    /**
     * Encodes RGB values at 8-bit precision into a single float, equivalent
     * to 0xFFFFFF representation in JavaScript. Perceptually near-lossless
     * in the "srgb" color space; "srgb-linear" and wide-gamut color spaces
     * benefit from 10+ bit precision.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.encodeRGB8">Online Documentation</a>
     */
    fun encodeRGB8(color: Color): Double

    /**
     * Decodes RGB values at 8-bit precision from a signle float, equivalent
     * to 0xFFFFFF representation in JavaScript. Perceptually near-lossless
     * in the "srgb" color space; "srgb-linear" and wide-gamut color spaces
     * benefit from 10+ bit precision.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.decodeRGB8">Online Documentation</a>
     */
    fun decodeRGB8(
        encoded: Double,
        result: Color,
    ): Color

    /**
     * Decode RGB565-encoded colors into a floating point typed array containing
     * normalized RGB values.
     * @param [typedArray] Array of RGB565 values
     * @param [result] Array to store the normalized VEC3 result
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/AttributeCompression.html#.decodeRGB565">Online Documentation</a>
     */
    fun decodeRGB565(
        typedArray: Uint16Array<*>,
        result: Float32Array<*>? = definedExternally,
    )
}
