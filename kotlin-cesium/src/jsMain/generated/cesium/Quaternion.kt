// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A set of 4-dimensional coordinates used to represent rotation in 3-dimensional space.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html">Online Documentation</a>
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
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html">Online Documentation</a>
 */
external class Quaternion(
    var x: Double = definedExternally,
    var y: Double = definedExternally,
    var z: Double = definedExternally,
    var w: Double = definedExternally,
) {
    /**
     * Duplicates this Quaternion instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Quaternion instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#clone">Online Documentation</a>
     */
    fun clone(result: Quaternion? = definedExternally): Quaternion

    /**
     * Compares this and the provided quaternion componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The right hand side quaternion.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @return `true` if left and right are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: Quaternion? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object : Packable<Quaternion> {
        /**
         * Computes a quaternion representing a rotation around an axis.
         * @param [axis] The axis of rotation.
         * @param [angle] The angle in radians to rotate around the axis.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Quaternion instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.fromAxisAngle">Online Documentation</a>
         */
        fun fromAxisAngle(
            axis: Cartesian3,
            angle: Double,
            result: Quaternion? = definedExternally,
        ): Quaternion

        /**
         * Computes a Quaternion from the provided Matrix3 instance.
         * @param [matrix] The rotation matrix.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Quaternion instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.fromRotationMatrix">Online Documentation</a>
         */
        fun fromRotationMatrix(
            matrix: Matrix3,
            result: Quaternion? = definedExternally,
        ): Quaternion

        /**
         * Computes a rotation from the given heading, pitch and roll angles. Heading is the rotation about the
         * negative z axis. Pitch is the rotation about the negative y axis. Roll is the rotation about
         * the positive x axis.
         * @param [headingPitchRoll] The rotation expressed as a heading, pitch and roll.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Quaternion instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.fromHeadingPitchRoll">Online Documentation</a>
         */
        fun fromHeadingPitchRoll(
            headingPitchRoll: HeadingPitchRoll,
            result: Quaternion? = definedExternally,
        ): Quaternion

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Quaternion,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Quaternion instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Quaternion?,
        ): Quaternion

        /**
         * The number of elements used to store the object into an array in its interpolatable form.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.packedInterpolationLength">Online Documentation</a>
         */
        var packedInterpolationLength: Int

        /**
         * Converts a packed array into a form suitable for interpolation.
         * @param [packedArray] The packed array.
         * @param [startingIndex] The index of the first element to be converted.
         *   Default value - `0`
         * @param [lastIndex] The index of the last element to be converted.
         *   Default value - [packedArray.size]
         * @param [result] The object into which to store the result.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.convertPackedArrayForInterpolation">Online Documentation</a>
         */
        fun convertPackedArrayForInterpolation(
            packedArray: ReadonlyArray<Double>,
            startingIndex: Int? = definedExternally,
            lastIndex: Int? = definedExternally,
            result: ReadonlyArray<Double>? = definedExternally,
        )

        /**
         * Retrieves an instance from a packed array converted with [convertPackedArrayForInterpolation].
         * @param [array] The array previously packed for interpolation.
         * @param [sourceArray] The original packed array.
         * @param [firstIndex] The firstIndex used to convert the array.
         *   Default value - `0`
         * @param [lastIndex] The lastIndex used to convert the array.
         *   Default value - [packedArray.size]
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Quaternion instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.unpackInterpolationResult">Online Documentation</a>
         */
        fun unpackInterpolationResult(
            array: ReadonlyArray<Double>,
            sourceArray: ReadonlyArray<Double>,
            firstIndex: Int? = definedExternally,
            lastIndex: Int? = definedExternally,
            result: Quaternion? = definedExternally,
        ): Quaternion

        /**
         * Duplicates a Quaternion instance.
         * @param [quaternion] The quaternion to duplicate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Quaternion instance if one was not provided. (Returns undefined if quaternion is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.clone">Online Documentation</a>
         */
        fun clone(
            quaternion: Quaternion,
            result: Quaternion? = definedExternally,
        ): Quaternion

        /**
         * Computes the conjugate of the provided quaternion.
         * @param [quaternion] The quaternion to conjugate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.conjugate">Online Documentation</a>
         */
        fun conjugate(
            quaternion: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes magnitude squared for the provided quaternion.
         * @param [quaternion] The quaternion to conjugate.
         * @return The magnitude squared.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.magnitudeSquared">Online Documentation</a>
         */
        fun magnitudeSquared(quaternion: Quaternion): Double

        /**
         * Computes magnitude for the provided quaternion.
         * @param [quaternion] The quaternion to conjugate.
         * @return The magnitude.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.magnitude">Online Documentation</a>
         */
        fun magnitude(quaternion: Quaternion): Double

        /**
         * Computes the normalized form of the provided quaternion.
         * @param [quaternion] The quaternion to normalize.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.normalize">Online Documentation</a>
         */
        fun normalize(
            quaternion: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the inverse of the provided quaternion.
         * @param [quaternion] The quaternion to normalize.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.inverse">Online Documentation</a>
         */
        fun inverse(
            quaternion: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the componentwise sum of two quaternions.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.add">Online Documentation</a>
         */
        fun add(
            left: Quaternion,
            right: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the componentwise difference of two quaternions.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Quaternion,
            right: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Negates the provided quaternion.
         * @param [quaternion] The quaternion to be negated.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.negate">Online Documentation</a>
         */
        fun negate(
            quaternion: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the dot (scalar) product of two quaternions.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @return The dot product.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.dot">Online Documentation</a>
         */
        fun dot(
            left: Quaternion,
            right: Quaternion,
        ): Double

        /**
         * Computes the product of two quaternions.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.multiply">Online Documentation</a>
         */
        fun multiply(
            left: Quaternion,
            right: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Multiplies the provided quaternion componentwise by the provided scalar.
         * @param [quaternion] The quaternion to be scaled.
         * @param [scalar] The scalar to multiply with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            quaternion: Quaternion,
            scalar: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Divides the provided quaternion componentwise by the provided scalar.
         * @param [quaternion] The quaternion to be divided.
         * @param [scalar] The scalar to divide by.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.divideByScalar">Online Documentation</a>
         */
        fun divideByScalar(
            quaternion: Quaternion,
            scalar: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the axis of rotation of the provided quaternion.
         * @param [quaternion] The quaternion to use.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.computeAxis">Online Documentation</a>
         */
        fun computeAxis(
            quaternion: Quaternion,
            result: Cartesian3,
        ): Cartesian3

        /**
         * Computes the angle of rotation of the provided quaternion.
         * @param [quaternion] The quaternion to use.
         * @return The angle of rotation.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.computeAngle">Online Documentation</a>
         */
        fun computeAngle(quaternion: Quaternion): Double

        /**
         * Computes the linear interpolation or extrapolation at t using the provided quaternions.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.lerp">Online Documentation</a>
         */
        fun lerp(
            start: Quaternion,
            end: Quaternion,
            t: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the spherical linear interpolation or extrapolation at t using the provided quaternions.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.slerp">Online Documentation</a>
         */
        fun slerp(
            start: Quaternion,
            end: Quaternion,
            t: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * The logarithmic quaternion function.
         * @param [quaternion] The unit quaternion.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.log">Online Documentation</a>
         */
        fun log(
            quaternion: Quaternion,
            result: Cartesian3,
        ): Cartesian3

        /**
         * The exponential quaternion function.
         * @param [cartesian] The cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.exp">Online Documentation</a>
         */
        fun exp(
            cartesian: Cartesian3,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes an inner quadrangle point.
         * This will compute quaternions that ensure a squad curve is C<sup>1</sup>.
         * @param [q0] The first quaternion.
         * @param [q1] The second quaternion.
         * @param [q2] The third quaternion.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.computeInnerQuadrangle">Online Documentation</a>
         */
        fun computeInnerQuadrangle(
            q0: Quaternion,
            q1: Quaternion,
            q2: Quaternion,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the spherical quadrangle interpolation between quaternions.
         * ```
         * // 1. compute the squad interpolation between two quaternions on a curve
         * const s0 = Quaternion.computeInnerQuadrangle(quaternions[i - 1], quaternions[i], quaternions[i + 1], new Quaternion());
         * const s1 = Quaternion.computeInnerQuadrangle(quaternions[i], quaternions[i + 1], quaternions[i + 2], new Quaternion());
         * const q = Quaternion.squad(quaternions[i], quaternions[i + 1], s0, s1, t, new Quaternion());
         *
         * // 2. compute the squad interpolation as above but where the first quaternion is a end point.
         * const s1 = Quaternion.computeInnerQuadrangle(quaternions[0], quaternions[1], quaternions[2], new Quaternion());
         * const q = Quaternion.squad(quaternions[0], quaternions[1], quaternions[0], s1, t, new Quaternion());
         * ```
         * @param [q0] The first quaternion.
         * @param [q1] The second quaternion.
         * @param [s0] The first inner quadrangle.
         * @param [s1] The second inner quadrangle.
         * @param [t] The time in [0,1] used to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.squad">Online Documentation</a>
         */
        fun squad(
            q0: Quaternion,
            q1: Quaternion,
            s0: Quaternion,
            s1: Quaternion,
            t: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the spherical linear interpolation or extrapolation at t using the provided quaternions.
         * This implementation is faster than [Quaternion.slerp], but is only accurate up to 10<sup>-6</sup>.
         * @param [start] The value corresponding to t at 0.0.
         * @param [end] The value corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.fastSlerp">Online Documentation</a>
         */
        fun fastSlerp(
            start: Quaternion,
            end: Quaternion,
            t: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Computes the spherical quadrangle interpolation between quaternions.
         * An implementation that is faster than [Quaternion.squad], but less accurate.
         * @param [q0] The first quaternion.
         * @param [q1] The second quaternion.
         * @param [s0] The first inner quadrangle.
         * @param [s1] The second inner quadrangle.
         * @param [t] The time in [0,1] used to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.fastSquad">Online Documentation</a>
         */
        fun fastSquad(
            q0: Quaternion,
            q1: Quaternion,
            s0: Quaternion,
            s1: Quaternion,
            t: Double,
            result: Quaternion,
        ): Quaternion

        /**
         * Compares the provided quaternions componentwise and returns
         * `true` if they are equal, `false` otherwise.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Quaternion? = definedExternally,
            right: Quaternion? = definedExternally,
        ): Boolean

        /**
         * Compares the provided quaternions componentwise and returns
         * `true` if they are within the provided epsilon,
         * `false` otherwise.
         * @param [left] The first quaternion.
         * @param [right] The second quaternion.
         * @param [epsilon] The epsilon to use for equality testing.
         *   Default value - `0`
         * @return `true` if left and right are within the provided epsilon, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: Quaternion? = definedExternally,
            right: Quaternion? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * An immutable Quaternion instance initialized to (0.0, 0.0, 0.0, 0.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.ZERO">Online Documentation</a>
         */
        val ZERO: Quaternion

        /**
         * An immutable Quaternion instance initialized to (0.0, 0.0, 0.0, 1.0).
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Quaternion.html#.IDENTITY">Online Documentation</a>
         */
        val IDENTITY: Quaternion
    }
}
