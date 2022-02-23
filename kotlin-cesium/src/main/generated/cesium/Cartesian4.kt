// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A 4D Cartesian point.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html">Online Documentation</a>
 *
 * @constructor
 * @property [x] The X component.
 *   Default value - `0.0`
 * @property [y] The Y component.
 *   Default value - `0.0`
 * @property [z] The Z component.
 *   Default value - `0.0`
 * @property [w] The W component.
 *   Default value - `0.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html">Online Documentation</a>
 */
external class Cartesian4(
    var x: Double = definedExternally,
    var y: Double = definedExternally,
    var z: Double = definedExternally,
    var w: Double = definedExternally,
) {
    /**
     * Duplicates this Cartesian4 instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Cartesian4 instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#clone">Online Documentation</a>
     */
    fun clone(result: Cartesian4? = definedExternally): Cartesian4

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
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Cartesian4? = definedExternally,
        relativeEpsilon: Double? = definedExternally,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Cartesian4> {
        /**
         * Creates a Cartesian4 instance from x, y, z and w coordinates.
         * @param [x] The x coordinate.
         * @param [y] The y coordinate.
         * @param [z] The z coordinate.
         * @param [w] The w coordinate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.fromElements">Online Documentation</a>
         */
        fun fromElements(
            x: Double,
            y: Double,
            z: Double,
            w: Double,
            result: Cartesian4? = definedExternally,
        ): Cartesian4

        /**
         * Creates a Cartesian4 instance from a [Color]. `red`, `green`, `blue`,
         * and `alpha` map to `x`, `y`, `z`, and `w`, respectively.
         * @param [color] The source color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.fromColor">Online Documentation</a>
         */
        fun fromColor(
            color: Color,
            result: Cartesian4? = definedExternally,
        ): Cartesian4

        /**
         * Duplicates a Cartesian4 instance.
         * @param [cartesian] The Cartesian to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian4 instance if one was not provided. (Returns undefined if cartesian is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.clone">Online Documentation</a>
         */
        fun clone(
            cartesian: Cartesian4,
            result: Cartesian4? = definedExternally,
        ): Cartesian4

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Cartesian4,
            array: Array<out Double>,
            startingIndex: Int?,
        ): Array<out Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Cartesian4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: Array<out Double>,
            startingIndex: Int?,
            result: Cartesian4?,
        ): Cartesian4

        /**
         * Flattens an array of Cartesian4s into and array of components.
         * @param [array] The array of cartesians to pack.
         * @param [result] The array onto which to store the result. If this is a typed array, it must have array.length * 4 components, else a [DeveloperError] will be thrown. If it is a regular array, it will be resized to have (array.length * 4) elements.
         * @return The packed array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.packArray">Online Documentation</a>
         */
        fun packArray(
            array: Array<out Cartesian4>,
            result: Array<out Double>? = definedExternally,
        ): Array<out Double>

        /**
         * Unpacks an array of cartesian components into and array of Cartesian4s.
         * @param [array] The array of components to unpack.
         * @param [result] The array onto which to store the result.
         * @return The unpacked array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.unpackArray">Online Documentation</a>
         */
        fun unpackArray(
            array: Array<out Double>,
            result: Array<out Cartesian4>? = definedExternally,
        ): Array<out Cartesian4>

        /**
         * Creates a Cartesian4 from four consecutive elements in an array.
         * ```
         * // Create a Cartesian4 with (1.0, 2.0, 3.0, 4.0)
         * const v = [1.0, 2.0, 3.0, 4.0];
         * const p = Cartesian4.fromArray(v);
         *
         * // Create a Cartesian4 with (1.0, 2.0, 3.0, 4.0) using an offset into an array
         * const v2 = [0.0, 0.0, 1.0, 2.0, 3.0, 4.0];
         * const p2 = Cartesian4.fromArray(v2, 2);
         * ```
         * @param [array] The array whose four consecutive elements correspond to the x, y, z, and w components, respectively.
         * @param [startingIndex] The offset into the array of the first element, which corresponds to the x component.
         *   Default value - `0`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Cartesian4 instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.fromArray">Online Documentation</a>
         */
        fun fromArray(
            array: Array<out Double>,
            startingIndex: Int? = definedExternally,
            result: Cartesian4? = definedExternally,
        ): Cartesian4

        /**
         * Computes the value of the maximum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the maximum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.maximumComponent">Online Documentation</a>
         */
        fun maximumComponent(cartesian: Cartesian4): Double

        /**
         * Computes the value of the minimum component for the supplied Cartesian.
         * @param [cartesian] The cartesian to use.
         * @return The value of the minimum component.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.minimumComponent">Online Documentation</a>
         */
        fun minimumComponent(cartesian: Cartesian4): Double

        /**
         * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the minimum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.minimumByComponent">Online Documentation</a>
         */
        fun minimumByComponent(
            first: Cartesian4,
            second: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
         * @param [first] A cartesian to compare.
         * @param [second] A cartesian to compare.
         * @param [result] The object into which to store the result.
         * @return A cartesian with the maximum components.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.maximumByComponent">Online Documentation</a>
         */
        fun maximumByComponent(
            first: Cartesian4,
            second: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the provided Cartesian's squared magnitude.
         * @param [cartesian] The Cartesian instance whose squared magnitude is to be computed.
         * @return The squared magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.magnitudeSquared">Online Documentation</a>
         */
        fun magnitudeSquared(cartesian: Cartesian4): Double

        /**
         * Computes the Cartesian's magnitude (length).
         * @param [cartesian] The Cartesian instance whose magnitude is to be computed.
         * @return The magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.magnitude">Online Documentation</a>
         */
        fun magnitude(cartesian: Cartesian4): Double

        /**
         * Computes the 4-space distance between two points.
         * ```
         * // Returns 1.0
         * const d = Cartesian4.distance(
         *   new Cartesian4(1.0, 0.0, 0.0, 0.0),
         *   new Cartesian4(2.0, 0.0, 0.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.distance">Online Documentation</a>
         */
        fun distance(
            left: Cartesian4,
            right: Cartesian4,
        ): Double

        /**
         * Computes the squared distance between two points.  Comparing squared distances
         * using this function is more efficient than comparing distances using [Cartesian4.distance].
         * ```
         * // Returns 4.0, not 2.0
         * const d = Cartesian4.distance(
         *   new Cartesian4(1.0, 0.0, 0.0, 0.0),
         *   new Cartesian4(3.0, 0.0, 0.0, 0.0));
         * ```
         * @param [left] The first point to compute the distance from.
         * @param [right] The second point to compute the distance to.
         * @return The distance between two points.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.distanceSquared">Online Documentation</a>
         */
        fun distanceSquared(
            left: Cartesian4,
            right: Cartesian4,
        ): Double

        /**
         * Computes the normalized form of the supplied Cartesian.
         * @param [cartesian] The Cartesian to be normalized.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.normalize">Online Documentation</a>
         */
        fun normalize(
            cartesian: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the dot (scalar) product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return The dot product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.dot">Online Documentation</a>
         */
        fun dot(
            left: Cartesian4,
            right: Cartesian4,
        ): Double

        /**
         * Computes the componentwise product of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.multiplyComponents">Online Documentation</a>
         */
        fun multiplyComponents(
            left: Cartesian4,
            right: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the componentwise quotient of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.divideComponents">Online Documentation</a>
         */
        fun divideComponents(
            left: Cartesian4,
            right: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the componentwise sum of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.add">Online Documentation</a>
         */
        fun add(
            left: Cartesian4,
            right: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the componentwise difference of two Cartesians.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Cartesian4,
            right: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Multiplies the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be scaled.
         * @param [scalar] The scalar to multiply with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            cartesian: Cartesian4,
            scalar: Double,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Divides the provided Cartesian componentwise by the provided scalar.
         * @param [cartesian] The Cartesian to be divided.
         * @param [scalar] The scalar to divide by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.divideByScalar">Online Documentation</a>
         */
        fun divideByScalar(
            cartesian: Cartesian4,
            scalar: Double,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Negates the provided Cartesian.
         * @param [cartesian] The Cartesian to be negated.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.negate">Online Documentation</a>
         */
        fun negate(
            cartesian: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the absolute value of the provided Cartesian.
         * @param [cartesian] The Cartesian whose absolute value is to be computed.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.abs">Online Documentation</a>
         */
        fun abs(
            cartesian: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Computes the linear interpolation or extrapolation at t using the provided cartesians.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.lerp">Online Documentation</a>
         */
        fun lerp(
            start: Cartesian4,
            end: Cartesian4,
            t: Double,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Returns the axis that is most orthogonal to the provided Cartesian.
         * @param [cartesian] The Cartesian on which to find the most orthogonal axis.
         * @param [result] The object onto which to store the result.
         * @return The most orthogonal axis.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.mostOrthogonalAxis">Online Documentation</a>
         */
        fun mostOrthogonalAxis(
            cartesian: Cartesian4,
            result: Cartesian4,
        ): Cartesian4

        /**
         * Compares the provided Cartesians componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first Cartesian.
         * @param [right] The second Cartesian.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Cartesian4? = definedExternally,
            right: Cartesian4? = definedExternally,
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
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Cartesian4? = definedExternally,
            right: Cartesian4? = definedExternally,
            relativeEpsilon: Double? = definedExternally,
            absoluteEpsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Cartesian4 instance initialized to (0.0, 0.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Cartesian4

        /**
         * An immutable Cartesian4 instance initialized to (1.0, 1.0, 1.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.ONE">Online Documentation</a>
         */
        val ONE: Cartesian4

        /**
         * An immutable Cartesian4 instance initialized to (1.0, 0.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.UNIT_X">Online Documentation</a>
         */
        val UNIT_X: Cartesian4

        /**
         * An immutable Cartesian4 instance initialized to (0.0, 1.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.UNIT_Y">Online Documentation</a>
         */
        val UNIT_Y: Cartesian4

        /**
         * An immutable Cartesian4 instance initialized to (0.0, 0.0, 1.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.UNIT_Z">Online Documentation</a>
         */
        val UNIT_Z: Cartesian4

        /**
         * An immutable Cartesian4 instance initialized to (0.0, 0.0, 0.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.UNIT_W">Online Documentation</a>
         */
        val UNIT_W: Cartesian4

        /**
         * Packs an arbitrary floating point value to 4 values representable using uint8.
         * @param [value] A floating point number.
         * @param [result] The Cartesian4 that will contain the packed float.
         * @return A Cartesian4 representing the float packed to values in x, y, z, and w.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cartesian4.html#.packFloat">Online Documentation</a>
         */
        fun packFloat(
            value: Double,
            result: Cartesian4? = definedExternally,
        ): Cartesian4
    }
}
