// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A 3D Cartesian point.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html">Online Documentation</a>
 *
 * @constructor
 * @property [x] The X component.
 *   Default value - `0.0`
 * @property [y] The Y component.
 *   Default value - `0.0`
 * @property [z] The Z component.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html">Online Documentation</a>
 */
external class Cartesian3(
    var x: Double = definedExternally,
    var y: Double = definedExternally,
    var z: Double = definedExternally,
) {
    /**
     * Duplicates this Cartesian3 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#clone">Online Documentation</a>
     */
    fun clone(result: Cartesian3? = definedExternally): Cartesian3

    /**
     * Compares this Cartesian against the provided Cartesian componentwise and returns
     * `true` if they pass an absolute or relative tolerance test,
     * `false` otherwise.
     * @param [right] The right hand side Cartesian.
     * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
     *   Default value - `0`
     * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
     *   Default value - [relativeEpsilon]
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Cartesian3? = definedExternally,
        relativeEpsilon: Double? = definedExternally,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Cartesian3> {
        /**
         * Converts the provided Spherical into Cartesian3 coordinates.
         * @param [spherical] The Spherical to be converted to Cartesian3.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromSpherical">Online Documentation</a>
         */
        fun fromSpherical(
            spherical: Spherical,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Creates a Cartesian3 instance from x, y and z coordinates.
         * @param [x] The x coordinate.
         * @param [y] The y coordinate.
         * @param [z] The z coordinate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromElements">Online Documentation</a>
         */
        fun fromElements(
            x: Double,
            y: Double,
            z: Double,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Duplicates a Cartesian3 instance.
         * @param [cartesian] The Cartesian to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided. (Returns undefined if cartesian is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.clone">Online Documentation</a>
         */
        fun clone(
            cartesian: Cartesian3,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Creates a Cartesian3 instance from an existing Cartesian4.  This simply takes the
         * x, y, and z properties of the Cartesian4 and drops w.
         * @param [cartesian] The Cartesian4 instance to create a Cartesian3 instance from.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromCartesian4">Online Documentation</a>
         */
        fun fromCartesian4(
            cartesian: Cartesian4,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Cartesian3,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Cartesian3?,
        ): Cartesian3

        /**
         * Flattens an array of Cartesian3s into an array of components.
         * @param [array] The array of cartesians to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 3 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 3) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: ReadonlyArray<Cartesian3>,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Unpacks an array of cartesian components into an array of Cartesian3s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: ReadonlyArray<Double>,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * Creates a Cartesian3 from three consecutive elements in an array.
         * ```
         * // Create a Cartesian3 with (1.0, 2.0, 3.0)
         * const v = [1.0, 2.0, 3.0];
         * const p = Cartesian3.fromArray(v);
         *
         * // Create a Cartesian3 with (1.0, 2.0, 3.0) using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 2.0, 3.0];
         * const p2 = Cartesian3.fromArray(v2, 2);
         * ```
         * @param [array] The array whose three consecutive elements correspond to the x, y, and z components, respectively.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to the x component.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian3 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Computes the value of the maximum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the maximum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.maximumComponent">Online Documentation</a>
         */
        fun maximumComponent(cartesian: Cartesian3): Double

        /**
         * Computes the value of the minimum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the minimum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.minimumComponent">Online Documentation</a>
         */
        fun minimumComponent(cartesian: Cartesian3): Double

        /**
         * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the minimum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.minimumByComponent">Online Documentation</a>
         */
        fun minimumByComponent(
            first: Cartesian3,
            second: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the maximum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.maximumByComponent">Online Documentation</a>
         */
        fun maximumByComponent(
            first: Cartesian3,
            second: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Constrain a value to lie between two values.
         * @param [cartesian] The value to clamp.
         * @param [min] The minimum bound.
         * @param [max] The maximum bound.
         * @param [result] The object into which to store the result.
         * @return The clamped value such that min <= value <= max.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.clamp">Online Documentation</a>
         */
        fun clamp(
            cartesian: Cartesian3,
            min: Cartesian3,
            max: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the provided Cartesian's squared magnitude.
         * @param [cartesian] The Cartesian instance whose squared magnitude is to be computed.
         * @return The squared magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.magnitudeSquared">Online Documentation</a>
         */
        fun magnitudeSquared(cartesian: Cartesian3): Double

        /**
         * Computes the Cartesian's magnitude (length).
         * @param [cartesian] The Cartesian instance whose magnitude is to be computed.
         * @return The magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.magnitude">Online Documentation</a>
         */
        fun magnitude(cartesian: Cartesian3): Double

        /**
         * Computes the distance between two points.
         * ```
         * // Returns 1.0
         * const d = Cartesian3.distance(new Cartesian3(1.0, 0.0, 0.0), new Cartesian3(2.0, 0.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.distance">Online Documentation</a>
         */
        fun distance(
            left: Cartesian3,
            right: Cartesian3,
        ): Double

        /**
         * Computes the squared distance between two points.  Comparing squared distances
         * using this function is more efficient than comparing distances using [Cartesian3.distance].
         * ```
         * // Returns 4.0, not 2.0
         * const d = Cartesian3.distanceSquared(new Cartesian3(1.0, 0.0, 0.0), new Cartesian3(3.0, 0.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.distanceSquared">Online Documentation</a>
         */
        fun distanceSquared(
            left: Cartesian3,
            right: Cartesian3,
        ): Double

        /**
         * Computes the normalized form of the supplied Cartesian.
         * @param [cartesian] The Cartesian to be normalized.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.normalize">Online Documentation</a>
         */
        fun normalize(
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the dot (scalar) product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The dot product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.dot">Online Documentation</a>
         */
        fun dot(
            left: Cartesian3,
            right: Cartesian3,
        ): Double

        /**
         * Computes the componentwise product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.multiplyComponents">Online Documentation</a>
         */
        fun multiplyComponents(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the componentwise quotient of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.divideComponents">Online Documentation</a>
         */
        fun divideComponents(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the componentwise sum of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.add">Online Documentation</a>
         */
        fun add(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the componentwise difference of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Multiplies the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be scaled.
         * @param [scalar] The scalar to multiply with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            cartesian: Cartesian3,
            scalar: Double,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Divides the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be divided.
         * @param [scalar] The scalar to divide by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.divideByScalar">Online Documentation</a>
         */
        fun divideByScalar(
            cartesian: Cartesian3,
            scalar: Double,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Negates the provided Cartesian.
         * @param [cartesian] The Cartesian to be negated.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.negate">Online Documentation</a>
         */
        fun negate(
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the absolute value of the provided Cartesian.
         * @param [cartesian] The Cartesian whose absolute value is to be computed.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.abs">Online Documentation</a>
         */
        fun abs(
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the linear interpolation or extrapolation at t using the provided cartesians.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.lerp">Online Documentation</a>
         */
        fun lerp(
            start: Cartesian3,
            end: Cartesian3,
            t: Double,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Returns the angle, in radians, between the provided Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The angle between the Cartesians.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.angleBetween">Online Documentation</a>
         */
        fun angleBetween(
            left: Cartesian3,
            right: Cartesian3,
        ): Double

        /**
         * Returns the axis that is most orthogonal to the provided Cartesian.
         * @param [cartesian] The Cartesian on which to find the most orthogonal axis.
         * @param [result] The object onto which to store the result.
         * @return The most orthogonal axis.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.mostOrthogonalAxis">Online Documentation</a>
         */
        fun mostOrthogonalAxis(
            cartesian: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Projects vector a onto vector b
         * @param [a] The vector that needs projecting
         * @param [b] The vector to project onto
         * @param [result] The result cartesian
         * @return The modified result parameter
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.projectVector">Online Documentation</a>
         */
        fun projectVector(
            a: Cartesian3,
            b: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Compares the provided Cartesians componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Cartesian3? = definedExternally,
            right: Cartesian3? = definedExternally,
        ): Boolean

        /**
         * Compares the provided Cartesians componentwise and returns
         * `true` if they pass an absolute or relative tolerance test,
         * `false` otherwise.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [relativeEpsilon] The relative epsilon tolerance to use for equality testing.
         *   Default value - `0`
         * @param [absoluteEpsilon] The absolute epsilon tolerance to use for equality testing.
         *   Default value - [relativeEpsilon]
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Cartesian3? = definedExternally,
            right: Cartesian3? = definedExternally,
            relativeEpsilon: Double? = definedExternally,
            absoluteEpsilon: Double? = definedExternally,
        ): Boolean

        /**
         * Computes the cross (outer) product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The cross product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.cross">Online Documentation</a>
         */
        fun cross(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the midpoint between the right and left Cartesian.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The midpoint.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.midpoint">Online Documentation</a>
         */
        fun midpoint(
            left: Cartesian3,
            right: Cartesian3,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Returns a Cartesian3 position from longitude and latitude values given in degrees.
         * ```
         * const position = Cartesian3.fromDegrees(-115.0, 37.0);
         * ```
         * @param [longitude] The longitude, in degrees
         * @param [latitude] The latitude, in degrees
         * @param [height] The height, in meters, above the ellipsoid.
         *   Default value - `0.0`
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result.
         * @return The position
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromDegrees">Online Documentation</a>
         */
        fun fromDegrees(
            longitude: Double,
            latitude: Double,
            height: Double? = definedExternally,
            ellipsoid: Ellipsoid? = definedExternally,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Returns a Cartesian3 position from longitude and latitude values given in radians.
         * ```
         * const position = Cartesian3.fromRadians(-2.007, 0.645);
         * ```
         * @param [longitude] The longitude, in radians
         * @param [latitude] The latitude, in radians
         * @param [height] The height, in meters, above the ellipsoid.
         *   Default value - `0.0`
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] The object onto which to store the result.
         * @return The position
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromRadians">Online Documentation</a>
         */
        fun fromRadians(
            longitude: Double,
            latitude: Double,
            height: Double? = definedExternally,
            ellipsoid: Ellipsoid? = definedExternally,
            result: Cartesian3? = definedExternally,
        ): Cartesian3

        /**
         * Returns an array of Cartesian3 positions given an array of longitude and latitude values given in degrees.
         * ```
         * const positions = Cartesian3.fromDegreesArray([-115.0, 37.0, -107.0, 33.0]);
         * ```
         * @param [coordinates] A list of longitude and latitude values. Values alternate [longitude, latitude, longitude, latitude...].
         * @param [ellipsoid] The ellipsoid on which the coordinates lie.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] An array of Cartesian3 objects to store the result.
         * @return The array of positions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromDegreesArray">Online Documentation</a>
         */
        fun fromDegreesArray(
            coordinates: ReadonlyArray<Double>,
            ellipsoid: Ellipsoid? = definedExternally,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * Returns an array of Cartesian3 positions given an array of longitude and latitude values given in radians.
         * ```
         * const positions = Cartesian3.fromRadiansArray([-2.007, 0.645, -1.867, .575]);
         * ```
         * @param [coordinates] A list of longitude and latitude values. Values alternate [longitude, latitude, longitude, latitude...].
         * @param [ellipsoid] The ellipsoid on which the coordinates lie.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] An array of Cartesian3 objects to store the result.
         * @return The array of positions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromRadiansArray">Online Documentation</a>
         */
        fun fromRadiansArray(
            coordinates: ReadonlyArray<Double>,
            ellipsoid: Ellipsoid? = definedExternally,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * Returns an array of Cartesian3 positions given an array of longitude, latitude and height values where longitude and latitude are given in degrees.
         * ```
         * const positions = Cartesian3.fromDegreesArrayHeights([-115.0, 37.0, 100000.0, -107.0, 33.0, 150000.0]);
         * ```
         * @param [coordinates] A list of longitude, latitude and height values. Values alternate [longitude, latitude, height, longitude, latitude, height...].
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] An array of Cartesian3 objects to store the result.
         * @return The array of positions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromDegreesArrayHeights">Online Documentation</a>
         */
        fun fromDegreesArrayHeights(
            coordinates: ReadonlyArray<Double>,
            ellipsoid: Ellipsoid? = definedExternally,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * Returns an array of Cartesian3 positions given an array of longitude, latitude and height values where longitude and latitude are given in radians.
         * ```
         * const positions = Cartesian3.fromRadiansArrayHeights([-2.007, 0.645, 100000.0, -1.867, .575, 150000.0]);
         * ```
         * @param [coordinates] A list of longitude, latitude and height values. Values alternate [longitude, latitude, height, longitude, latitude, height...].
         * @param [ellipsoid] The ellipsoid on which the position lies.
         *   Default value - [Ellipsoid.WGS84]
         * @param [result] An array of Cartesian3 objects to store the result.
         * @return The array of positions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.fromRadiansArrayHeights">Online Documentation</a>
         */
        fun fromRadiansArrayHeights(
            coordinates: ReadonlyArray<Double>,
            ellipsoid: Ellipsoid? = definedExternally,
            result: ReadonlyArray<Cartesian3>? = definedExternally,
        ): ReadonlyArray<Cartesian3>

        /**
         * An immutable Cartesian3 instance initialized to (0.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Cartesian3

        /**
         * An immutable Cartesian3 instance initialized to (1.0, 1.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.ONE">Online Documentation</a>
         */
        val ONE: Cartesian3

        /**
         * An immutable Cartesian3 instance initialized to (1.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.UNIT_X">Online Documentation</a>
         */
        val UNIT_X: Cartesian3

        /**
         * An immutable Cartesian3 instance initialized to (0.0, 1.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.UNIT_Y">Online Documentation</a>
         */
        val UNIT_Y: Cartesian3

        /**
         * An immutable Cartesian3 instance initialized to (0.0, 0.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian3.html#.UNIT_Z">Online Documentation</a>
         */
        val UNIT_Z: Cartesian3
    }
}
