// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A 2D Cartesian point.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html">Online Documentation</a>
 *
 * @constructor
 * @property [x] The X component.
 *   Default value - `0.0`
 * @property [y] The Y component.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html">Online Documentation</a>
 */
external class Cartesian2(
    var x: Double = definedExternally,
    var y: Double = definedExternally,
) {
    /**
     * Duplicates this Cartesian2 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#clone">Online Documentation</a>
     */
    fun clone(result: Cartesian2? = definedExternally): Cartesian2

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Cartesian2? = definedExternally,
        relativeEpsilon: Double? = definedExternally,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Cartesian2> {
        /**
         * Creates a Cartesian2 instance from x and y coordinates.
         * @param [x] The x coordinate.
         * @param [y] The y coordinate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.fromElements">Online Documentation</a>
         */
        fun fromElements(
            x: Double,
            y: Double,
            result: Cartesian2? = definedExternally,
        ): Cartesian2

        /**
         * Duplicates a Cartesian2 instance.
         * @param [cartesian] The Cartesian to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided. (Returns undefined if cartesian is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.clone">Online Documentation</a>
         */
        fun clone(
            cartesian: Cartesian2,
            result: Cartesian2? = definedExternally,
        ): Cartesian2

        /**
         * Creates a Cartesian2 instance from an existing Cartesian3.  This simply takes the
         * x and y properties of the Cartesian3 and drops z.
         * @param [cartesian] The Cartesian3 instance to create a Cartesian2 instance from.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.fromCartesian3">Online Documentation</a>
         */
        fun fromCartesian3(
            cartesian: Cartesian3,
            result: Cartesian2? = definedExternally,
        ): Cartesian2

        /**
         * Creates a Cartesian2 instance from an existing Cartesian4.  This simply takes the
         * x and y properties of the Cartesian4 and drops z and w.
         * @param [cartesian] The Cartesian4 instance to create a Cartesian2 instance from.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.fromCartesian4">Online Documentation</a>
         */
        fun fromCartesian4(
            cartesian: Cartesian4,
            result: Cartesian2? = definedExternally,
        ): Cartesian2

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Cartesian2,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Cartesian2?,
        ): Cartesian2

        /**
         * Flattens an array of Cartesian2s into an array of components.
         * @param [array] The array of cartesians to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 2 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 2) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: ReadonlyArray<Cartesian2>,
            result: ReadonlyArray<Double>? = definedExternally,
        ): ReadonlyArray<Double>

        /**
         * Unpacks an array of cartesian components into an array of Cartesian2s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: ReadonlyArray<Double>,
            result: ReadonlyArray<Cartesian2>? = definedExternally,
        ): ReadonlyArray<Cartesian2>

        /**
         * Creates a Cartesian2 from two consecutive elements in an array.
         * ```
         * // Create a Cartesian2 with (1.0, 2.0)
         * const v = [1.0, 2.0];
         * const p = Cartesian2.fromArray(v);
         *
         * // Create a Cartesian2 with (1.0, 2.0) using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 2.0];
         * const p2 = Cartesian2.fromArray(v2, 2);
         * ```
         * @param [array] The array whose two consecutive elements correspond to the x and y components, respectively.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to the x component.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian2 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            result: Cartesian2? = definedExternally,
        ): Cartesian2

        /**
         * Computes the value of the maximum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the maximum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.maximumComponent">Online Documentation</a>
         */
        fun maximumComponent(cartesian: Cartesian2): Double

        /**
         * Computes the value of the minimum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the minimum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.minimumComponent">Online Documentation</a>
         */
        fun minimumComponent(cartesian: Cartesian2): Double

        /**
         * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the minimum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.minimumByComponent">Online Documentation</a>
         */
        fun minimumByComponent(
            first: Cartesian2,
            second: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the maximum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.maximumByComponent">Online Documentation</a>
         */
        fun maximumByComponent(
            first: Cartesian2,
            second: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Constrain a value to lie between two values.
         * @param [value] The value to clamp.
         * @param [min] The minimum bound.
         * @param [max] The maximum bound.
         * @param [result] The object into which to store the result.
         * @return The clamped value such that min <= result <= max.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.clamp">Online Documentation</a>
         */
        fun clamp(
            value: Cartesian2,
            min: Cartesian2,
            max: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the provided Cartesian's squared magnitude.
         * @param [cartesian] The Cartesian instance whose squared magnitude is to be computed.
         * @return The squared magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.magnitudeSquared">Online Documentation</a>
         */
        fun magnitudeSquared(cartesian: Cartesian2): Double

        /**
         * Computes the Cartesian's magnitude (length).
         * @param [cartesian] The Cartesian instance whose magnitude is to be computed.
         * @return The magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.magnitude">Online Documentation</a>
         */
        fun magnitude(cartesian: Cartesian2): Double

        /**
         * Computes the distance between two points.
         * ```
         * // Returns 1.0
         * const d = Cartesian2.distance(new Cartesian2(1.0, 0.0), new Cartesian2(2.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.distance">Online Documentation</a>
         */
        fun distance(
            left: Cartesian2,
            right: Cartesian2,
        ): Double

        /**
         * Computes the squared distance between two points.  Comparing squared distances
         * using this function is more efficient than comparing distances using [Cartesian2.distance].
         * ```
         * // Returns 4.0, not 2.0
         * const d = Cartesian2.distance(new Cartesian2(1.0, 0.0), new Cartesian2(3.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.distanceSquared">Online Documentation</a>
         */
        fun distanceSquared(
            left: Cartesian2,
            right: Cartesian2,
        ): Double

        /**
         * Computes the normalized form of the supplied Cartesian.
         * @param [cartesian] The Cartesian to be normalized.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.normalize">Online Documentation</a>
         */
        fun normalize(
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the dot (scalar) product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The dot product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.dot">Online Documentation</a>
         */
        fun dot(
            left: Cartesian2,
            right: Cartesian2,
        ): Double

        /**
         * Computes the magnitude of the cross product that would result from implicitly setting the Z coordinate of the input vectors to 0
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The cross product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.cross">Online Documentation</a>
         */
        fun cross(
            left: Cartesian2,
            right: Cartesian2,
        ): Double

        /**
         * Computes the componentwise product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.multiplyComponents">Online Documentation</a>
         */
        fun multiplyComponents(
            left: Cartesian2,
            right: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the componentwise quotient of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.divideComponents">Online Documentation</a>
         */
        fun divideComponents(
            left: Cartesian2,
            right: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the componentwise sum of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.add">Online Documentation</a>
         */
        fun add(
            left: Cartesian2,
            right: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the componentwise difference of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Cartesian2,
            right: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Multiplies the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be scaled.
         * @param [scalar] The scalar to multiply with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            cartesian: Cartesian2,
            scalar: Double,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Divides the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be divided.
         * @param [scalar] The scalar to divide by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.divideByScalar">Online Documentation</a>
         */
        fun divideByScalar(
            cartesian: Cartesian2,
            scalar: Double,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Negates the provided Cartesian.
         * @param [cartesian] The Cartesian to be negated.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.negate">Online Documentation</a>
         */
        fun negate(
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the absolute value of the provided Cartesian.
         * @param [cartesian] The Cartesian whose absolute value is to be computed.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.abs">Online Documentation</a>
         */
        fun abs(
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Computes the linear interpolation or extrapolation at t using the provided cartesians.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.lerp">Online Documentation</a>
         */
        fun lerp(
            start: Cartesian2,
            end: Cartesian2,
            t: Double,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Returns the angle, in radians, between the provided Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The angle between the Cartesians.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.angleBetween">Online Documentation</a>
         */
        fun angleBetween(
            left: Cartesian2,
            right: Cartesian2,
        ): Double

        /**
         * Returns the axis that is most orthogonal to the provided Cartesian.
         * @param [cartesian] The Cartesian on which to find the most orthogonal axis.
         * @param [result] The object onto which to store the result.
         * @return The most orthogonal axis.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.mostOrthogonalAxis">Online Documentation</a>
         */
        fun mostOrthogonalAxis(
            cartesian: Cartesian2,
            result: Cartesian2,
        ): Cartesian2

        /**
         * Compares the provided Cartesians componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Cartesian2? = definedExternally,
            right: Cartesian2? = definedExternally,
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Cartesian2? = definedExternally,
            right: Cartesian2? = definedExternally,
            relativeEpsilon: Double? = definedExternally,
            absoluteEpsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Cartesian2 instance initialized to (0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Cartesian2

        /**
         * An immutable Cartesian2 instance initialized to (1.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.ONE">Online Documentation</a>
         */
        val ONE: Cartesian2

        /**
         * An immutable Cartesian2 instance initialized to (1.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.UNIT_X">Online Documentation</a>
         */
        val UNIT_X: Cartesian2

        /**
         * An immutable Cartesian2 instance initialized to (0.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian2.html#.UNIT_Y">Online Documentation</a>
         */
        val UNIT_Y: Cartesian2
    }
}
