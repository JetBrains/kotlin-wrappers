// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * Determines visibility based on the distance to the camera.
 * ```
 * // Make a billboard that is only visible when the distance to the camera is between 10 and 20 meters.
 * billboard.distanceDisplayCondition = new DistanceDisplayCondition(10.0, 20.0);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html">Online Documentation</a>
 *
 * @constructor
 * @property [near] The smallest distance in the interval where the object is visible.
 *   Default value - `0.0`
 * @property [far] The largest distance in the interval where the object is visible.
 *   Default value - [Number.MAX_VALUE]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html">Online Documentation</a>
 */
external class DistanceDisplayCondition(
    var near: Double = definedExternally,
    var far: Double = definedExternally,
) {
    /**
     * Duplicates this instance.
     * @param [result] The result onto which to store the result.
     * @return The duplicated instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#clone">Online Documentation</a>
     */
    fun clone(result: DistanceDisplayCondition? = definedExternally): DistanceDisplayCondition

    companion object : Packable<DistanceDisplayCondition> {
        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: DistanceDisplayCondition,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new DistanceDisplayCondition instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: DistanceDisplayCondition?,
        ): DistanceDisplayCondition

        /**
         * Determines if two distance display conditions are equal.
         * @param [left] A distance display condition.
         * @param [right] Another distance display condition.
         * @return Whether the two distance display conditions are equal.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: DistanceDisplayCondition,
            right: DistanceDisplayCondition,
        ): Boolean

        /**
         * Duplicates a distance display condition instance.
         * @param [value] The distance display condition to duplicate.
         * @param [result] The result onto which to store the result.
         * @return The duplicated instance.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayCondition.html#.clone">Online Documentation</a>
         */
        fun clone(
            value: DistanceDisplayCondition? = definedExternally,
            result: DistanceDisplayCondition? = definedExternally,
        ): DistanceDisplayCondition
    }
}
