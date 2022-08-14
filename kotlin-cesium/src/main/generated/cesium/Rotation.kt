// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Represents a [Packable] number that always interpolates values
 * towards the shortest angle of rotation. This object is never used directly
 * but is instead passed to the constructor of [SampledProperty]
 * in order to represent a two-dimensional angle of rotation.
 * ```
 * const time1 = JulianDate.fromIso8601('2010-05-07T00:00:00');
 * const time2 = JulianDate.fromIso8601('2010-05-07T00:01:00');
 * const time3 = JulianDate.fromIso8601('2010-05-07T00:02:00');
 *
 * const property = new SampledProperty(Rotation);
 * property.addSample(time1, 0);
 * property.addSample(time3, Math.toRadians(350));
 *
 * //Getting the value at time2 will equal 355 degrees instead
 * //of 175 degrees (which is what you get if you construct
 * //a SampledProperty(Number) instead.  Note, the actual
 * //return value is in radians, not degrees.
 * property.getValue(time2);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html">Online Documentation</a>
 */
external interface Rotation {


    companion object : Packable<Rotation> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Rotation,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Rotation instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Rotation?,
        ): Rotation

        /**
         * Converts a packed array into a form suitable for interpolation.
         * @param [packedArray] The packed array.
         * @param [startingIndex] The index of the first element to be converted.
         *   Default value - `0`
         * @param [lastIndex] The index of the last element to be converted.
         *   Default value - [packedArray.size]
         * @param [result] The object into which to store the result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html#.convertPackedArrayForInterpolation">Online Documentation</a>
         */
        fun convertPackedArrayForInterpolation(
            packedArray: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            lastIndex: Int? = definedExternally,
            result: ReadonlyArray<Double>? = definedExternally,
        )

        /**
         * Retrieves an instance from a packed array converted with [Rotation.convertPackedArrayForInterpolation].
         * @param [array] The array previously packed for interpolation.
         * @param [sourceArray] The original packed array.
         * @param [firstIndex] The firstIndex used to convert the array.
         *   Default value - `0`
         * @param [lastIndex] The lastIndex used to convert the array.
         *   Default value - [packedArray.size]
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Rotation instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Rotation.html#.unpackInterpolationResult">Online Documentation</a>
         */
        fun unpackInterpolationResult(
            array: ReadonlyArray<Double>,
            sourceArray: ReadonlyArray<Double>,
            firstIndex: Int? = definedExternally,
            lastIndex: Int? = definedExternally,
            result: Rotation? = definedExternally,
        ): Rotation
    }
}
