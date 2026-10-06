// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

import js.array.ReadonlyArray
import js.numbers.JsDouble

/**
 * A fixed-point encoding of a [Cartesian3] with 64-bit floating-point components, as two [Cartesian3]
 * values that, when converted to 32-bit floating-point and added, approximate the original input.
 *
 * This is used to encode positions in vertex buffers for rendering without jittering artifacts
 * as described in [Precisions, Precisions](http://help.agi.com/AGIComponents/html/BlogPrecisionsPrecisions.htm).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html">Online Documentation</a>
 */
open external class EncodedCartesian3 {
    /**
     * The high bits for each component.  Bits 0 to 22 store the whole value.  Bits 23 to 31 are not used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html#high">Online Documentation</a>
     */
    var high: Cartesian3

    /**
     * The low bits for each component.  Bits 7 to 22 store the whole value, and bits 0 to 6 store the fraction.  Bits 23 to 31 are not used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html#low">Online Documentation</a>
     */
    var low: Cartesian3

    companion object {
        /**
         * Encodes a 64-bit floating-point value as two floating-point values that, when converted to
         * 32-bit floating-point and added, approximate the original input.  The returned object
         * has `high` and `low` properties for the high and low bits, respectively.
         *
         * The fixed-point encoding follows [Precisions, Precisions](http://help.agi.com/AGIComponents/html/BlogPrecisionsPrecisions.htm).
         * ```
         * const value = 1234567.1234567;
         * const splitValue = EncodedCartesian3.encode(value);
         * ```
         * @param [value] The floating-point value to encode.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html#.encode">Online Documentation</a>
         */
        fun encode(
            value: Double,
            result: JsAny? = definedExternally,
        ): JsAny

        /**
         * Encodes a [Cartesian3] with 64-bit floating-point components as two [Cartesian3]
         * values that, when converted to 32-bit floating-point and added, approximate the original input.
         *
         * The fixed-point encoding follows [Precisions, Precisions](https://help.agi.com/AGIComponents/html/BlogPrecisionsPrecisions.htm).
         * ```
         * const cart = new Cartesian3(-10000000.0, 0.0, 10000000.0);
         * const encoded = EncodedCartesian3.fromCartesian(cart);
         * ```
         * @param [cartesian] The cartesian to encode.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new EncodedCartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html#.fromCartesian">Online Documentation</a>
         */
        fun fromCartesian(
            cartesian: Cartesian3,
            result: EncodedCartesian3? = definedExternally,
        ): EncodedCartesian3

        /**
         * Encodes the provided `cartesian`, and writes it to an array with `high`
         * components followed by `low` components, i.e. `[high.x, high.y, high.z, low.x, low.y, low.z]`.
         *
         * This is used to create interleaved high-precision position vertex attributes.
         * ```
         * const positions = [
         *    new Cartesian3(),
         *    // ...
         * ];
         * const encodedPositions = new Float32Array(2 * 3 * positions.length);
         * let j = 0;
         * for (let i = 0; i < positions.length; ++i) {
         *   EncodedCartesian3.writeElement(positions[i], encodedPositions, j);
         *   j += 6;
         * }
         * ```
         * @param [cartesian] The cartesian to encode.
         * @param [cartesianArray] The array to write to.
         * @param [index] The index into the array to start writing.  Six elements will be written.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EncodedCartesian3.html#.writeElements">Online Documentation</a>
         */
        fun writeElements(
            cartesian: Cartesian3,
            cartesianArray: ReadonlyArray<JsDouble>,
            index: Int,
        )
    }
}
