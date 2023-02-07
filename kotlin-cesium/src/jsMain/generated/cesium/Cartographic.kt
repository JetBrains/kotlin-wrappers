// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A position defined by longitude, latitude, and height.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html">Online Documentation</a>
 *
 * @constructor
 * @property [longitude] The longitude, in radians.
 *   Default value - `0.0`
 * @property [latitude] The latitude, in radians.
 *   Default value - `0.0`
 * @property [height] The height, in meters, above the ellipsoid.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html">Online Documentation</a>
 */
external class Cartographic(
    var longitude: Double = definedExternally,
    var latitude: Double = definedExternally,
    var height: Double = definedExternally,
) {
    /**
     * Duplicates this instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartographic instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#clone">Online Documentation</a>
     */
    fun clone(result: Cartographic? = definedExternally): Cartographic

    /**
     * Compares the provided against this cartographic componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The second cartographic.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if left and right are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Cartographic? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object {
        /**
         * Creates a new Cartographic instance from longitude and latitude
         * specified in radians.
         * @param [longitude] The longitude, in radians.
         * @param [latitude] The latitude, in radians.
         * @param [height] The height, in meters, above the ellipsoid.
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.fromRadians">Online Documentation</a>
         */
        fun fromRadians(
            longitude: Double,
            latitude: Double,
            height: Double? = definedExternally,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Creates a new Cartographic instance from longitude and latitude
         * specified in degrees.  The values in the resulting object will
         * be in radians.
         * @param [longitude] The longitude, in degrees.
         * @param [latitude] The latitude, in degrees.
         * @param [height] The height, in meters, above the ellipsoid.
         *   Default value - `0.0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.fromDegrees">Online Documentation</a>
         */
        fun fromDegrees(
            longitude: Double,
            latitude: Double,
            height: Double? = definedExternally,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Creates a new Cartographic instance from a Cartesian position. The values in the
         * resulting object will be in radians.
         * @param [cartesian] The Cartesian position to convert to cartographic representation.
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter, new Cartographic instance if none was provided, or undefined if the cartesian is at the center of the ellipsoid.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.fromCartesian">Online Documentation</a>
         */
        fun fromCartesian(
            cartesian: Cartesian3,
            ellipsoid: Ellipsoid? = definedExternally,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Creates a new Cartesian3 instance from a Cartographic input. The values in the inputted
         * object should be in radians.
         * @param [cartographic] Input to be converted into a Cartesian3 output.
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result.
         * @return The position
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.toCartesian">Online Documentation</a>
         */
        fun toCartesian(
            cartographic: Cartographic,
            ellipsoid: Ellipsoid? = definedExternally,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Duplicates a Cartographic instance.
         * @param [cartographic] The cartographic to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartographic instance if one was not provided. (Returns undefined if cartographic is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.clone">Online Documentation</a>
         */
        fun clone(
            cartographic: Cartographic,
            result: Cartographic? = definedExternally,
        ): Cartographic

        /**
         * Compares the provided cartographics componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first cartographic.
         * @param [right] The second cartographic.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Cartographic? = definedExternally,
            right: Cartographic? = definedExternally,
        ): Boolean

        /**
         * Compares the provided cartographics componentwise and returns
         * `true` if they are within the provided epsilon,
         * `false` otherwise.
         * @param [left] The first cartographic.
         * @param [right] The second cartographic.
         * @param [epsilon] The epsilon to use for equality testing.
         *   Default value - `0`
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Cartographic? = definedExternally,
            right: Cartographic? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Cartographic instance initialized to (0.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartographic.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Cartographic
    }
}
