// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A quadratic surface defined in Cartesian coordinates by the equation
 * `(x / a)^2 + (y / b)^2 + (z / c)^2 = 1`.  Primarily used
 * by Cesium to represent the shape of planetary bodies.
 *
 * Rather than constructing this object directly, one of the provided
 * constants is normally used.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html">Online Documentation</a>
 *
 * @constructor
 * @param [x] The radius in the x direction.
 *   Default value - `0`
 * @param [y] The radius in the y direction.
 *   Default value - `0`
 * @param [z] The radius in the z direction.
 *   Default value - `0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html">Online Documentation</a>
 */
external class Ellipsoid(
    x: Double? = definedExternally,
    y: Double? = definedExternally,
    z: Double? = definedExternally,
) {
    /**
     * Gets the radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#radii">Online Documentation</a>
     */
    val radii: Cartesian3

    /**
     * Gets the squared radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#radiiSquared">Online Documentation</a>
     */
    val radiiSquared: Cartesian3

    /**
     * Gets the radii of the ellipsoid raise to the fourth power.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#radiiToTheFourth">Online Documentation</a>
     */
    val radiiToTheFourth: Cartesian3

    /**
     * Gets one over the radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#oneOverRadii">Online Documentation</a>
     */
    val oneOverRadii: Cartesian3

    /**
     * Gets one over the squared radii of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#oneOverRadiiSquared">Online Documentation</a>
     */
    val oneOverRadiiSquared: Cartesian3

    /**
     * Gets the minimum radius of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#minimumRadius">Online Documentation</a>
     */
    val minimumRadius: Double

    /**
     * Gets the maximum radius of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#maximumRadius">Online Documentation</a>
     */
    val maximumRadius: Double

    /**
     * Duplicates an Ellipsoid instance.
     * @param [result] The object onto which to store the result, or undefined if a new
     *   instance should be created.
     * @return The cloned Ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#clone">Online Documentation</a>
     */
    fun clone(result: Ellipsoid? = definedExternally): Ellipsoid

    /**
     * Computes the unit vector directed from the center of this ellipsoid toward the provided Cartesian position.
     * @param [cartesian] The Cartesian for which to to determine the geocentric normal.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#geocentricSurfaceNormal">Online Documentation</a>
     */
    fun geocentricSurfaceNormal(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the normal of the plane tangent to the surface of the ellipsoid at the provided position.
     * @param [cartographic] The cartographic position for which to to determine the geodetic normal.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#geodeticSurfaceNormalCartographic">Online Documentation</a>
     */
    fun geodeticSurfaceNormalCartographic(
        cartographic: Cartographic,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes the normal of the plane tangent to the surface of the ellipsoid at the provided position.
     * @param [cartesian] The Cartesian position for which to to determine the surface normal.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided, or undefined if a normal cannot be found.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#geodeticSurfaceNormal">Online Documentation</a>
     */
    fun geodeticSurfaceNormal(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Converts the provided cartographic to Cartesian representation.
     * ```
     * //Create a Cartographic and determine it's Cartesian representation on a WGS84 ellipsoid.
     * const position = new Cartographic(Math.toRadians(21), Math.toRadians(78), 5000);
     * const cartesianPosition = Ellipsoid.WGS84.cartographicToCartesian(position);
     * ```
     * @param [cartographic] The cartographic position.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#cartographicToCartesian">Online Documentation</a>
     */
    fun cartographicToCartesian(
        cartographic: Cartographic,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Converts the provided array of cartographics to an array of Cartesians.
     * ```
     * //Convert an array of Cartographics and determine their Cartesian representation on a WGS84 ellipsoid.
     * const positions = [new Cartographic(Math.toRadians(21), Math.toRadians(78), 0),
     *                  new Cartographic(Math.toRadians(21.321), Math.toRadians(78.123), 100),
     *                  new Cartographic(Math.toRadians(21.645), Math.toRadians(78.456), 250)];
     * const cartesianPositions = Ellipsoid.WGS84.cartographicArrayToCartesianArray(positions);
     * ```
     * @param [cartographics] An array of cartographic positions.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Array instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#cartographicArrayToCartesianArray">Online Documentation</a>
     */
    fun cartographicArrayToCartesianArray(
        cartographics: ReadonlyArray<Cartographic>,
        result: ReadonlyArray<Cartesian3>? = definedExternally,
    ): ReadonlyArray<Cartesian3>

    /**
     * Converts the provided cartesian to cartographic representation.
     * The cartesian is undefined at the center of the ellipsoid.
     * ```
     * //Create a Cartesian and determine it's Cartographic representation on a WGS84 ellipsoid.
     * const position = new Cartesian3(17832.12, 83234.52, 952313.73);
     * const cartographicPosition = Ellipsoid.WGS84.cartesianToCartographic(position);
     * ```
     * @param [cartesian] The Cartesian position to convert to cartographic representation.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter, new Cartographic instance if none was provided, or undefined if the cartesian is at the center of the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#cartesianToCartographic">Online Documentation</a>
     */
    fun cartesianToCartographic(
        cartesian: Cartesian3,
        result: Cartographic? = definedExternally,
    ): Cartographic

    /**
     * Converts the provided array of cartesians to an array of cartographics.
     * ```
     * //Create an array of Cartesians and determine their Cartographic representation on a WGS84 ellipsoid.
     * const positions = [new Cartesian3(17832.12, 83234.52, 952313.73),
     *                  new Cartesian3(17832.13, 83234.53, 952313.73),
     *                  new Cartesian3(17832.14, 83234.54, 952313.73)]
     * const cartographicPositions = Ellipsoid.WGS84.cartesianArrayToCartographicArray(positions);
     * ```
     * @param [cartesians] An array of Cartesian positions.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Array instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#cartesianArrayToCartographicArray">Online Documentation</a>
     */
    fun cartesianArrayToCartographicArray(
        cartesians: ReadonlyArray<Cartesian3>,
        result: ReadonlyArray<Cartographic>? = definedExternally,
    ): ReadonlyArray<Cartographic>

    /**
     * Scales the provided Cartesian position along the geodetic surface normal
     * so that it is on the surface of this ellipsoid.  If the position is
     * at the center of the ellipsoid, this function returns undefined.
     * @param [cartesian] The Cartesian position to scale.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter, a new Cartesian3 instance if none was provided, or undefined if the position is at the center.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#scaleToGeodeticSurface">Online Documentation</a>
     */
    fun scaleToGeodeticSurface(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Scales the provided Cartesian position along the geocentric surface normal
     * so that it is on the surface of this ellipsoid.
     * @param [cartesian] The Cartesian position to scale.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#scaleToGeocentricSurface">Online Documentation</a>
     */
    fun scaleToGeocentricSurface(
        cartesian: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Transforms a Cartesian X, Y, Z position to the ellipsoid-scaled space by multiplying
     * its components by the result of [Ellipsoid.oneOverRadii].
     * @param [position] The position to transform.
     * @param [result] The position to which to copy the result, or undefined to create and
     *   return a new instance.
     * @return The position expressed in the scaled space.  The returned instance is the
     *   one passed as the result parameter if it is not undefined, or a new instance of it is.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#transformPositionToScaledSpace">Online Documentation</a>
     */
    fun transformPositionToScaledSpace(
        position: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Transforms a Cartesian X, Y, Z position from the ellipsoid-scaled space by multiplying
     * its components by the result of [Ellipsoid.radii].
     * @param [position] The position to transform.
     * @param [result] The position to which to copy the result, or undefined to create and
     *   return a new instance.
     * @return The position expressed in the unscaled space.  The returned instance is the
     *   one passed as the result parameter if it is not undefined, or a new instance of it is.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#transformPositionFromScaledSpace">Online Documentation</a>
     */
    fun transformPositionFromScaledSpace(
        position: Cartesian3,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Computes a point which is the intersection of the surface normal with the z-axis.
     * @param [position] the position. must be on the surface of the ellipsoid.
     * @param [buffer] A buffer to subtract from the ellipsoid size when checking if the point is inside the ellipsoid.
     *   In earth case, with common earth datums, there is no need for this buffer since the intersection point is always (relatively) very close to the center.
     *   In WGS84 datum, intersection point is at max z = +-42841.31151331382 (0.673% of z-axis).
     *   Intersection point could be outside the ellipsoid if the ratio of MajorAxis / AxisOfRotation is bigger than the square root of 2
     *   Default value - `0.0`
     * @param [result] The cartesian to which to copy the result, or undefined to create and
     *   return a new instance.
     * @return the intersection point if it's inside the ellipsoid, undefined otherwise
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#getSurfaceNormalIntersectionWithZAxis">Online Documentation</a>
     */
    fun getSurfaceNormalIntersectionWithZAxis(
        position: Cartesian3,
        buffer: Double? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Computes an approximation of the surface area of a rectangle on the surface of an ellipsoid using
     * Gauss-Legendre 10th order quadrature.
     * @param [rectangle] The rectangle used for computing the surface area.
     * @return The approximate area of the rectangle on the surface of this ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#surfaceArea">Online Documentation</a>
     */
    fun surfaceArea(rectangle: Rectangle): Double

    companion object : Packable<Ellipsoid> {
        /**
         * Duplicates an Ellipsoid instance.
         * @param [ellipsoid] The ellipsoid to duplicate.
         * @param [result] The object onto which to store the result, or undefined if a new
         *   instance should be created.
         * @return The cloned Ellipsoid. (Returns undefined if ellipsoid is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.clone">Online Documentation</a>
         */
        fun clone(
            ellipsoid: Ellipsoid,
            result: Ellipsoid? = definedExternally,
        ): Ellipsoid

        /**
         * Computes an Ellipsoid from a Cartesian specifying the radii in x, y, and z directions.
         * @param [cartesian] The ellipsoid's radius in the x, y, and z directions.
         *   Default value - [Cartesian3.ZERO]
         * @param [result] The object onto which to store the result, or undefined if a new
         *   instance should be created.
         * @return A new Ellipsoid instance.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.fromCartesian3">Online Documentation</a>
         */
        fun fromCartesian3(
            cartesian: Cartesian3? = definedExternally,
            result: Ellipsoid? = definedExternally,
        ): Ellipsoid

        /**
         * An Ellipsoid instance initialized to the WGS84 standard.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.WGS84">Online Documentation</a>
         */
        val WGS84: Ellipsoid

        /**
         * An Ellipsoid instance initialized to radii of (1.0, 1.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.UNIT_SPHERE">Online Documentation</a>
         */
        val UNIT_SPHERE: Ellipsoid

        /**
         * An Ellipsoid instance initialized to a sphere with the lunar radius.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.MOON">Online Documentation</a>
         */
        val MOON: Ellipsoid

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Ellipsoid,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Ellipsoid instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Ellipsoid.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Ellipsoid?,
        ): Ellipsoid
    }
}
