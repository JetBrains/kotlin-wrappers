// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Math functions.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html">Online Documentation</a>
 */
external object Math {
    /**
     * 0.1
     */
    val EPSILON1: Double

    /**
     * 0.01
     */
    val EPSILON2: Double

    /**
     * 0.001
     */
    val EPSILON3: Double

    /**
     * 0.0001
     */
    val EPSILON4: Double

    /**
     * 0.00001
     */
    val EPSILON5: Double

    /**
     * 0.000001
     */
    val EPSILON6: Double

    /**
     * 0.0000001
     */
    val EPSILON7: Double

    /**
     * 0.00000001
     */
    val EPSILON8: Double

    /**
     * 0.000000001
     */
    val EPSILON9: Double

    /**
     * 0.0000000001
     */
    val EPSILON10: Double

    /**
     * 0.00000000001
     */
    val EPSILON11: Double

    /**
     * 0.000000000001
     */
    val EPSILON12: Double

    /**
     * 0.0000000000001
     */
    val EPSILON13: Double

    /**
     * 0.00000000000001
     */
    val EPSILON14: Double

    /**
     * 0.000000000000001
     */
    val EPSILON15: Double

    /**
     * 0.0000000000000001
     */
    val EPSILON16: Double

    /**
     * 0.00000000000000001
     */
    val EPSILON17: Double

    /**
     * 0.000000000000000001
     */
    val EPSILON18: Double

    /**
     * 0.0000000000000000001
     */
    val EPSILON19: Double

    /**
     * 0.00000000000000000001
     */
    val EPSILON20: Double

    /**
     * 0.000000000000000000001
     */
    val EPSILON21: Double

    /**
     * The gravitational parameter of the Earth in meters cubed
     * per second squared as defined by the WGS84 model: 3.986004418e14
     */
    val GRAVITATIONALPARAMETER: Double

    /**
     * Radius of the sun in meters: 6.955e8
     */
    val SOLAR_RADIUS: Double

    /**
     * The mean radius of the moon, according to the "Report of the IAU/IAG Working Group on
     * Cartographic Coordinates and Rotational Elements of the Planets and satellites: 2000",
     * Celestial Mechanics 82: 83-110, 2002.
     */
    val LUNAR_RADIUS: Double

    /**
     * 64 * 1024
     */
    val SIXTY_FOUR_KILOBYTES: Double

    /**
     * 4 * 1024 * 1024 * 1024
     */
    val FOUR_GIGABYTES: Double

    /**
     * Returns the sign of the value; 1 if the value is positive, -1 if the value is
     * negative, or 0 if the value is 0.
     * @param [value] The value to return the sign of.
     * @return The sign of value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.sign">Online Documentation</a>
     */
    fun sign(value: Double): Double

    /**
     * Returns 1.0 if the given value is positive or zero, and -1.0 if it is negative.
     * This is similar to [Math.sign] except that returns 1.0 instead of
     * 0.0 when the input value is 0.0.
     * @param [value] The value to return the sign of.
     * @return The sign of value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.signNotZero">Online Documentation</a>
     */
    fun signNotZero(value: Double): Double

    /**
     * Converts a scalar value in the range [-1.0, 1.0] to a SNORM in the range [0, rangeMaximum]
     * @param [value] The scalar value in the range [-1.0, 1.0]
     * @param [rangeMaximum] The maximum value in the mapped range, 255 by default.
     *   Default value - `255`
     * @return A SNORM value, where 0 maps to -1.0 and rangeMaximum maps to 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.toSNorm">Online Documentation</a>
     */
    fun toSNorm(
        value: Double,
        rangeMaximum: Double? = definedExternally,
    ): Double

    /**
     * Converts a SNORM value in the range [0, rangeMaximum] to a scalar in the range [-1.0, 1.0].
     * @param [value] SNORM value in the range [0, rangeMaximum]
     * @param [rangeMaximum] The maximum value in the SNORM range, 255 by default.
     *   Default value - `255`
     * @return Scalar in the range [-1.0, 1.0].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.fromSNorm">Online Documentation</a>
     */
    fun fromSNorm(
        value: Double,
        rangeMaximum: Double? = definedExternally,
    ): Double

    /**
     * Converts a scalar value in the range [rangeMinimum, rangeMaximum] to a scalar in the range [0.0, 1.0]
     * @param [value] The scalar value in the range [rangeMinimum, rangeMaximum]
     * @param [rangeMinimum] The minimum value in the mapped range.
     * @param [rangeMaximum] The maximum value in the mapped range.
     * @return A scalar value, where rangeMinimum maps to 0.0 and rangeMaximum maps to 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.normalize">Online Documentation</a>
     */
    fun normalize(
        value: Double,
        rangeMinimum: Double,
        rangeMaximum: Double,
    ): Double

    /**
     * Returns the hyperbolic sine of a number.
     * The hyperbolic sine of <em>value</em> is defined to be
     * (<em>e<sup>x</sup>&nbsp;-&nbsp;e<sup>-x</sup></em>)/2.0
     * where <i>e</i> is Euler's number, approximately 2.71828183.
     *
     * Special cases:
     * - If the argument is NaN, then the result is NaN.
     * - If the argument is infinite, then the result is an infinity
     *   with the same sign as the argument.
     * - If the argument is zero, then the result is a zero with the
     *   same sign as the argument.
     * @param [value] The number whose hyperbolic sine is to be returned.
     * @return The hyperbolic sine of `value`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.sinh">Online Documentation</a>
     */
    fun sinh(value: Double): Double

    /**
     * Returns the hyperbolic cosine of a number.
     * The hyperbolic cosine of <strong>value</strong> is defined to be
     * (<em>e<sup>x</sup>&nbsp;+&nbsp;e<sup>-x</sup></em>)/2.0
     * where <i>e</i> is Euler's number, approximately 2.71828183.
     *
     * Special cases:
     * - If the argument is NaN, then the result is NaN.
     * - If the argument is infinite, then the result is positive infinity.
     * - If the argument is zero, then the result is 1.0.
     * @param [value] The number whose hyperbolic cosine is to be returned.
     * @return The hyperbolic cosine of `value`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.cosh">Online Documentation</a>
     */
    fun cosh(value: Double): Double

    /**
     * Computes the linear interpolation of two values.
     * ```
     * const n = Math.lerp(0.0, 2.0, 0.5); // returns 1.0
     * ```
     * @param [p] The start value to interpolate.
     * @param [q] The end value to interpolate.
     * @param [time] The time of interpolation generally in the range `[0.0, 1.0]`.
     * @return The linearly interpolated value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.lerp">Online Documentation</a>
     */
    fun lerp(
        p: Double,
        q: Double,
        time: Double,
    ): Double

    /**
     * pi
     */
    val PI: Double

    /**
     * 1/pi
     */
    val ONE_OVER_PI: Double

    /**
     * pi/2
     */
    val PI_OVER_TWO: Double

    /**
     * pi/3
     */
    val PI_OVER_THREE: Double

    /**
     * pi/4
     */
    val PI_OVER_FOUR: Double

    /**
     * pi/6
     */
    val PI_OVER_SIX: Double

    /**
     * 3pi/2
     */
    val THREE_PI_OVER_TWO: Double

    /**
     * 2pi
     */
    val TWO_PI: Double

    /**
     * 1/2pi
     */
    val ONE_OVER_TWO_PI: Double

    /**
     * The number of radians in a degree.
     */
    val RADIANS_PER_DEGREE: Double

    /**
     * The number of degrees in a radian.
     */
    val DEGREES_PER_RADIAN: Double

    /**
     * The number of radians in an arc second.
     */
    val RADIANS_PER_ARCSECOND: Double

    /**
     * Converts degrees to radians.
     * @param [degrees] The angle to convert in degrees.
     * @return The corresponding angle in radians.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.toRadians">Online Documentation</a>
     */
    fun toRadians(degrees: Double): Double

    /**
     * Converts radians to degrees.
     * @param [radians] The angle to convert in radians.
     * @return The corresponding angle in degrees.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.toDegrees">Online Documentation</a>
     */
    fun toDegrees(radians: Double): Double

    /**
     * Converts a longitude value, in radians, to the range [`-Math.PI`, `Math.PI`).
     * ```
     * // Convert 270 degrees to -90 degrees longitude
     * const longitude = Math.convertLongitudeRange(Math.toRadians(270.0));
     * ```
     * @param [angle] The longitude value, in radians, to convert to the range [`-Math.PI`, `Math.PI`).
     * @return The equivalent longitude value in the range [`-Math.PI`, `Math.PI`).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.convertLongitudeRange">Online Documentation</a>
     */
    fun convertLongitudeRange(angle: Double): Double

    /**
     * Convenience function that clamps a latitude value, in radians, to the range [`-Math.PI/2`, `Math.PI/2`).
     * Useful for sanitizing data before use in objects requiring correct range.
     * ```
     * // Clamp 108 degrees latitude to 90 degrees latitude
     * const latitude = Math.clampToLatitudeRange(Math.toRadians(108.0));
     * ```
     * @param [angle] The latitude value, in radians, to clamp to the range [`-Math.PI/2`, `Math.PI/2`).
     * @return The latitude value clamped to the range [`-Math.PI/2`, `Math.PI/2`).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.clampToLatitudeRange">Online Documentation</a>
     */
    fun clampToLatitudeRange(angle: Double): Double

    /**
     * Produces an angle in the range -Pi <= angle <= Pi which is equivalent to the provided angle.
     * @param [angle] in radians
     * @return The angle in the range [`-Math.PI`, `Math.PI`].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.negativePiToPi">Online Documentation</a>
     */
    fun negativePiToPi(angle: Double): Double

    /**
     * Produces an angle in the range 0 <= angle <= 2Pi which is equivalent to the provided angle.
     * @param [angle] in radians
     * @return The angle in the range [0, `Math.TWO_PI`].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.zeroToTwoPi">Online Documentation</a>
     */
    fun zeroToTwoPi(angle: Double): Double

    /**
     * The modulo operation that also works for negative dividends.
     * @param [m] The dividend.
     * @param [n] The divisor.
     * @return The remainder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.mod">Online Documentation</a>
     */
    fun mod(
        m: Int,
        n: Int,
    ): Int

    /**
     * Determines if two values are equal using an absolute or relative tolerance test. This is useful
     * to avoid problems due to roundoff error when comparing floating-point values directly. The values are
     * first compared using an absolute tolerance test. If that fails, a relative tolerance test is performed.
     * Use this test if you are unsure of the magnitudes of left and right.
     * ```
     * const a = Math.equalsEpsilon(0.0, 0.01, Math.EPSILON2); // true
     * const b = Math.equalsEpsilon(0.0, 0.1, Math.EPSILON2);  // false
     * const c = Math.equalsEpsilon(3699175.1634344, 3699175.2, Math.EPSILON7); // true
     * const d = Math.equalsEpsilon(3699175.1634344, 3699175.2, Math.EPSILON9); // false
     * ```
     * @param [left] The first value to compare.
     * @param [right] The other value to compare.
     * @param [relativeEpsilon] The maximum inclusive delta between `left` and `right` for the relative tolerance test.
     *   Default value - `0`
     * @param [absoluteEpsilon] The maximum inclusive delta between `left` and `right` for the absolute tolerance test.
     *   Default value - [relativeEpsilon]
     * @return `true` if the values are equal within the epsilon; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        left: Double,
        right: Double,
        relativeEpsilon: Double? = definedExternally,
        absoluteEpsilon: Double? = definedExternally,
    ): Boolean

    /**
     * Determines if the left value is less than the right value. If the two values are within
     * `absoluteEpsilon` of each other, they are considered equal and this function returns false.
     * @param [left] The first number to compare.
     * @param [right] The second number to compare.
     * @param [absoluteEpsilon] The absolute epsilon to use in comparison.
     * @return `true` if `left` is less than `right` by more than
     *   `absoluteEpsilon<code>. <code>false` if `left` is greater or if the two
     *   values are nearly equal.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.lessThan">Online Documentation</a>
     */
    fun lessThan(
        left: Double,
        right: Double,
        absoluteEpsilon: Double,
    ): Boolean

    /**
     * Determines if the left value is less than or equal to the right value. If the two values are within
     * `absoluteEpsilon` of each other, they are considered equal and this function returns true.
     * @param [left] The first number to compare.
     * @param [right] The second number to compare.
     * @param [absoluteEpsilon] The absolute epsilon to use in comparison.
     * @return `true` if `left` is less than `right` or if the
     *   the values are nearly equal.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.lessThanOrEquals">Online Documentation</a>
     */
    fun lessThanOrEquals(
        left: Double,
        right: Double,
        absoluteEpsilon: Double,
    ): Boolean

    /**
     * Determines if the left value is greater the right value. If the two values are within
     * `absoluteEpsilon` of each other, they are considered equal and this function returns false.
     * @param [left] The first number to compare.
     * @param [right] The second number to compare.
     * @param [absoluteEpsilon] The absolute epsilon to use in comparison.
     * @return `true` if `left` is greater than `right` by more than
     *   `absoluteEpsilon<code>. <code>false` if `left` is less or if the two
     *   values are nearly equal.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.greaterThan">Online Documentation</a>
     */
    fun greaterThan(
        left: Double,
        right: Double,
        absoluteEpsilon: Double,
    ): Boolean

    /**
     * Determines if the left value is greater than or equal to the right value. If the two values are within
     * `absoluteEpsilon` of each other, they are considered equal and this function returns true.
     * @param [left] The first number to compare.
     * @param [right] The second number to compare.
     * @param [absoluteEpsilon] The absolute epsilon to use in comparison.
     * @return `true` if `left` is greater than `right` or if the
     *   the values are nearly equal.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.greaterThanOrEquals">Online Documentation</a>
     */
    fun greaterThanOrEquals(
        left: Double,
        right: Double,
        absoluteEpsilon: Double,
    ): Boolean

    /**
     * Computes the factorial of the provided number.
     * ```
     * //Compute 7!, which is equal to 5040
     * const computedFactorial = Math.factorial(7);
     * ```
     * @param [n] The number whose factorial is to be computed.
     * @return The factorial of the provided number or undefined if the number is less than 0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.factorial">Online Documentation</a>
     */
    fun factorial(n: Int): Int

    /**
     * Increments a number with a wrapping to a minimum value if the number exceeds the maximum value.
     * ```
     * const n = Math.incrementWrap(5, 10, 0); // returns 6
     * const m = Math.incrementWrap(10, 10, 0); // returns 0
     * ```
     * @param [n] The number to be incremented.
     * @param [maximumValue] The maximum incremented value before rolling over to the minimum value.
     * @param [minimumValue] The number reset to after the maximum value has been exceeded.
     *   Default value - `0.0`
     * @return The incremented number.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.incrementWrap">Online Documentation</a>
     */
    fun incrementWrap(
        n: Int? = definedExternally,
        maximumValue: Double? = definedExternally,
        minimumValue: Double? = definedExternally,
    ): Double

    /**
     * Determines if a non-negative integer is a power of two.
     * The maximum allowed input is (2^32)-1 due to 32-bit bitwise operator limitation in Javascript.
     * ```
     * const t = Math.isPowerOfTwo(16); // true
     * const f = Math.isPowerOfTwo(20); // false
     * ```
     * @param [n] The integer to test in the range [0, (2^32)-1].
     * @return `true` if the number if a power of two; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.isPowerOfTwo">Online Documentation</a>
     */
    fun isPowerOfTwo(n: Int): Boolean

    /**
     * Computes the next power-of-two integer greater than or equal to the provided non-negative integer.
     * The maximum allowed input is 2^31 due to 32-bit bitwise operator limitation in Javascript.
     * ```
     * const n = Math.nextPowerOfTwo(29); // 32
     * const m = Math.nextPowerOfTwo(32); // 32
     * ```
     * @param [n] The integer to test in the range [0, 2^31].
     * @return The next power-of-two integer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.nextPowerOfTwo">Online Documentation</a>
     */
    fun nextPowerOfTwo(n: Int): Int

    /**
     * Computes the previous power-of-two integer less than or equal to the provided non-negative integer.
     * The maximum allowed input is (2^32)-1 due to 32-bit bitwise operator limitation in Javascript.
     * ```
     * const n = Math.previousPowerOfTwo(29); // 16
     * const m = Math.previousPowerOfTwo(32); // 32
     * ```
     * @param [n] The integer to test in the range [0, (2^32)-1].
     * @return The previous power-of-two integer.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.previousPowerOfTwo">Online Documentation</a>
     */
    fun previousPowerOfTwo(n: Int): Int

    /**
     * Constraint a value to lie between two values.
     * @param [value] The value to constrain.
     * @param [min] The minimum value.
     * @param [max] The maximum value.
     * @return The value clamped so that min <= value <= max.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.clamp">Online Documentation</a>
     */
    fun clamp(
        value: Double,
        min: Double,
        max: Double,
    ): Double

    /**
     * Sets the seed used by the random number generator
     * in [Math.nextRandomNumber].
     * @param [seed] An integer used as the seed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.setRandomNumberSeed">Online Documentation</a>
     */
    fun setRandomNumberSeed(seed: Double)

    /**
     * Generates a random floating point number in the range of [0.0, 1.0)
     * using a Mersenne twister.
     * @return A random number in the range of [0.0, 1.0).
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.nextRandomNumber">Online Documentation</a>
     */
    fun nextRandomNumber(): Double

    /**
     * Generates a random number between two numbers.
     * @param [min] The minimum value.
     * @param [max] The maximum value.
     * @return A random number between the min and max.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.randomBetween">Online Documentation</a>
     */
    fun randomBetween(
        min: Double,
        max: Double,
    ): Double

    /**
     * Computes `Math.acos(value)`, but first clamps `value` to the range [-1.0, 1.0]
     * so that the function will never return NaN.
     * @param [value] The value for which to compute acos.
     * @return The acos of the value if the value is in the range [-1.0, 1.0], or the acos of -1.0 or 1.0,
     *   whichever is closer, if the value is outside the range.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.acosClamped">Online Documentation</a>
     */
    fun acosClamped(value: Double): Double

    /**
     * Computes `Math.asin(value)`, but first clamps `value` to the range [-1.0, 1.0]
     * so that the function will never return NaN.
     * @param [value] The value for which to compute asin.
     * @return The asin of the value if the value is in the range [-1.0, 1.0], or the asin of -1.0 or 1.0,
     *   whichever is closer, if the value is outside the range.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.asinClamped">Online Documentation</a>
     */
    fun asinClamped(value: Double): Double

    /**
     * Finds the chord length between two points given the circle's radius and the angle between the points.
     * @param [angle] The angle between the two points.
     * @param [radius] The radius of the circle.
     * @return The chord length.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.chordLength">Online Documentation</a>
     */
    fun chordLength(
        angle: Double,
        radius: Double,
    ): Double

    /**
     * Finds the logarithm of a number to a base.
     * @param [number] The number.
     * @param [base] The base.
     * @return The result.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.logBase">Online Documentation</a>
     */
    fun logBase(
        number: Double,
        base: Double,
    ): Double

    /**
     * Finds the cube root of a number.
     * Returns NaN if `number` is not provided.
     * @param [number] The number.
     * @return The result.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.cbrt">Online Documentation</a>
     */
    fun cbrt(number: Double? = definedExternally): Double

    /**
     * Finds the base 2 logarithm of a number.
     * @param [number] The number.
     * @return The result.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.log2">Online Documentation</a>
     */
    fun log2(number: Double): Double

    /**
     * Computes a fast approximation of Atan for input in the range [-1, 1].
     *
     * Based on Michal Drobot's approximation from ShaderFastLibs,
     * which in turn is based on "Efficient approximations for the arctangent function,"
     * Rajan, S. Sichun Wang Inkol, R. Joyal, A., May 2006.
     * Adapted from ShaderFastLibs under MIT License.
     * @param [x] An input number in the range [-1, 1]
     * @return An approximation of atan(x)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.fastApproximateAtan">Online Documentation</a>
     */
    fun fastApproximateAtan(x: Double): Double

    /**
     * Computes a fast approximation of Atan2(x, y) for arbitrary input scalars.
     *
     * Range reduction math based on nvidia's cg reference implementation: http://developer.download.nvidia.com/cg/atan2.html
     * @param [x] An input number that isn't zero if y is zero.
     * @param [y] An input number that isn't zero if x is zero.
     * @return An approximation of atan2(x, y)
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Math.html#.fastApproximateAtan2">Online Documentation</a>
     */
    fun fastApproximateAtan2(
        x: Double,
        y: Double,
    ): Double
}
