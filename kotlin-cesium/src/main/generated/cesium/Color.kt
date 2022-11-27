// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A color, specified using red, green, blue, and alpha values,
 * which range from `0` (no intensity) to `1.0` (full intensity).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html">Online Documentation</a>
 *
 * @constructor
 * @property [red] The red component.
 *   Default value - `1.0`
 * @property [green] The green component.
 *   Default value - `1.0`
 * @property [blue] The blue component.
 *   Default value - `1.0`
 * @property [alpha] The alpha component.
 *   Default value - `1.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html">Online Documentation</a>
 */
external class Color(
    var red: Double = definedExternally,
    var green: Double = definedExternally,
    var blue: Double = definedExternally,
    var alpha: Double = definedExternally,
) {
    /**
     * Returns a duplicate of a Color instance.
     * @param [result] The object to store the result in, if undefined a new instance will be created.
     * @return The modified result parameter or a new instance if result was undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#clone">Online Documentation</a>
     */
    fun clone(result: Color? = definedExternally): Color

    /**
     * Returns `true` if this Color equals other componentwise within the specified epsilon.
     * @param [other] The Color to compare for equality.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0.0`
     * @return `true` if the Colors are equal within the specified epsilon; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        other: Color,
        epsilon: Double? = definedExternally,
    ): Boolean

    /**
     * Creates a string containing the CSS color value for this color.
     * @return The CSS equivalent of this color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#toCssColorString">Online Documentation</a>
     */
    fun toCssColorString(): String

    /**
     * Creates a string containing CSS hex string color value for this color.
     * @return The CSS hex string equivalent of this color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#toCssHexString">Online Documentation</a>
     */
    fun toCssHexString(): String

    /**
     * Converts this color to an array of red, green, blue, and alpha values
     * that are in the range of 0 to 255.
     * @param [result] The array to store the result in, if undefined a new instance will be created.
     * @return The modified result parameter or a new instance if result was undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#toBytes">Online Documentation</a>
     */
    fun toBytes(result: ReadonlyArray<Double>? = definedExternally): ReadonlyArray<Double>

    /**
     * Converts this color to a single numeric unsigned 32-bit RGBA value, using the endianness
     * of the system.
     * ```
     * const rgba = Color.BLUE.toRgba();
     * ```
     * @return A single numeric unsigned 32-bit RGBA value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#toRgba">Online Documentation</a>
     */
    fun toRgba(): Double

    /**
     * Brightens this color by the provided magnitude.
     * ```
     * const brightBlue = Color.BLUE.brighten(0.5, new Color());
     * ```
     * @param [magnitude] A positive number indicating the amount to brighten.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#brighten">Online Documentation</a>
     */
    fun brighten(
        magnitude: Double,
        result: Color,
    ): Color

    /**
     * Darkens this color by the provided magnitude.
     * ```
     * const darkBlue = Color.BLUE.darken(0.5, new Color());
     * ```
     * @param [magnitude] A positive number indicating the amount to darken.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#darken">Online Documentation</a>
     */
    fun darken(
        magnitude: Double,
        result: Color,
    ): Color

    /**
     * Creates a new Color that has the same red, green, and blue components
     * as this Color, but with the specified alpha value.
     * ```
     * const translucentRed = Color.RED.withAlpha(0.9);
     * ```
     * @param [alpha] The new alpha component.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Color instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#withAlpha">Online Documentation</a>
     */
    fun withAlpha(
        alpha: Double,
        result: Color? = definedExternally,
    ): Color

    companion object : Packable<Color> {
        /**
         * Creates a Color instance from a [Cartesian4]. `x`, `y`, `z`,
         * and `w` map to `red`, `green`, `blue`, and `alpha`, respectively.
         * @param [cartesian] The source cartesian.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Color instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromCartesian4">Online Documentation</a>
         */
        fun fromCartesian4(
            cartesian: Cartesian4,
            result: Color? = definedExternally,
        ): Color

        /**
         * Creates a new Color specified using red, green, blue, and alpha values
         * that are in the range of 0 to 255, converting them internally to a range of 0.0 to 1.0.
         * @param [red] The red component.
         *   Default value - `255`
         * @param [green] The green component.
         *   Default value - `255`
         * @param [blue] The blue component.
         *   Default value - `255`
         * @param [alpha] The alpha component.
         *   Default value - `255`
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Color instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromBytes">Online Documentation</a>
         */
        fun fromBytes(
            red: Double? = definedExternally,
            green: Double? = definedExternally,
            blue: Double? = definedExternally,
            alpha: Double? = definedExternally,
            result: Color? = definedExternally,
        ): Color

        /**
         * Creates a new Color that has the same red, green, and blue components
         * of the specified color, but with the specified alpha value.
         * ```
         * const translucentRed = Color.fromAlpha(Color.RED, 0.9);
         * ```
         * @param [color] The base color
         * @param [alpha] The new alpha component.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter or a new Color instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromAlpha">Online Documentation</a>
         */
        fun fromAlpha(
            color: Color,
            alpha: Double,
            result: Color? = definedExternally,
        ): Color

        /**
         * Creates a new Color from a single numeric unsigned 32-bit RGBA value, using the endianness
         * of the system.
         * ```
         * const color = Color.fromRgba(0x67ADDFFF);
         * ```
         * @param [rgba] A single numeric unsigned 32-bit RGBA value.
         * @param [result] The object to store the result in, if undefined a new instance will be created.
         * @return The color object.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromRgba">Online Documentation</a>
         */
        fun fromRgba(
            rgba: Double,
            result: Color? = definedExternally,
        ): Color

        /**
         * Creates a Color instance from hue, saturation, and lightness.
         * @param [hue] The hue angle 0...1
         *   Default value - `0`
         * @param [saturation] The saturation value 0...1
         *   Default value - `0`
         * @param [lightness] The lightness value 0...1
         *   Default value - `0`
         * @param [alpha] The alpha component 0...1
         *   Default value - `1.0`
         * @param [result] The object to store the result in, if undefined a new instance will be created.
         * @return The color object.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromHsl">Online Documentation</a>
         */
        fun fromHsl(
            hue: Double? = definedExternally,
            saturation: Double? = definedExternally,
            lightness: Double? = definedExternally,
            alpha: Double? = definedExternally,
            result: Color? = definedExternally,
        ): Color

        /**
         * Creates a random color using the provided options. For reproducible random colors, you should
         * call [Math.setRandomNumberSeed] once at the beginning of your application.
         * ```
         * //Create a completely random color
         * const color = Color.fromRandom();
         *
         * //Create a random shade of yellow.
         * const color1 = Color.fromRandom({
         *     red : 1.0,
         *     green : 1.0,
         *     alpha : 1.0
         * });
         *
         * //Create a random bright color.
         * const color2 = Color.fromRandom({
         *     minimumRed : 0.75,
         *     minimumGreen : 0.75,
         *     minimumBlue : 0.75,
         *     alpha : 1.0
         * });
         * ```
         * @param [result] The object to store the result in, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromRandom">Online Documentation</a>
         */
        fun fromRandom(
            options: FromRandomOptions? = definedExternally,
            result: Color? = definedExternally,
        ): Color

        /**
         * @property [red] If specified, the red component to use instead of a randomized value.
         * @property [minimumRed] The maximum red value to generate if none was specified.
         *   Default value - `0.0`
         * @property [maximumRed] The minimum red value to generate if none was specified.
         *   Default value - `1.0`
         * @property [green] If specified, the green component to use instead of a randomized value.
         * @property [minimumGreen] The maximum green value to generate if none was specified.
         *   Default value - `0.0`
         * @property [maximumGreen] The minimum green value to generate if none was specified.
         *   Default value - `1.0`
         * @property [blue] If specified, the blue component to use instead of a randomized value.
         * @property [minimumBlue] The maximum blue value to generate if none was specified.
         *   Default value - `0.0`
         * @property [maximumBlue] The minimum blue value to generate if none was specified.
         *   Default value - `1.0`
         * @property [alpha] If specified, the alpha component to use instead of a randomized value.
         * @property [minimumAlpha] The maximum alpha value to generate if none was specified.
         *   Default value - `0.0`
         * @property [maximumAlpha] The minimum alpha value to generate if none was specified.
         *   Default value - `1.0`
         */
        interface FromRandomOptions {
            var red: Double?
            var minimumRed: Double?
            var maximumRed: Double?
            var green: Double?
            var minimumGreen: Double?
            var maximumGreen: Double?
            var blue: Double?
            var minimumBlue: Double?
            var maximumBlue: Double?
            var alpha: Double?
            var minimumAlpha: Double?
            var maximumAlpha: Double?
        }

        /**
         * Creates a Color instance from a CSS color value.
         * ```
         * const cesiumBlue = Color.fromCssColorString('#67ADDF');
         * const green = Color.fromCssColorString('green');
         * ```
         * @param [color] The CSS color value in #rgb, #rgba, #rrggbb, #rrggbbaa, rgb(), rgba(), hsl(), or hsla() format.
         * @param [result] The object to store the result in, if undefined a new instance will be created.
         * @return The color object, or undefined if the string was not a valid CSS color.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.fromCssColorString">Online Documentation</a>
         */
        fun fromCssColorString(
            color: String,
            result: Color? = definedExternally,
        ): Color

        /**
         * The number of elements used to pack the object into an array.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.packedLength">Online Documentation</a>
         */
        override val packedLength: Int

        /**
         * Stores the provided instance into the provided array.
         * @param [value] The value to pack.
         * @param [array] The array to pack into.
         * @param [startingIndex] The index into the array at which to start packing the elements.
         *   Default value - `0`
         * @return The array that was packed into
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.pack">Online Documentation</a>
         */
        override fun pack(
            value: Color,
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
        ): ReadonlyArray<Double>

        /**
         * Retrieves an instance from a packed array.
         * @param [array] The packed array.
         * @param [startingIndex] The starting index of the element to be unpacked.
         *   Default value - `0`
         * @param [result] The object into which to store the result.
         * @return The modified result parameter or a new Color instance if one was not provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.unpack">Online Documentation</a>
         */
        override fun unpack(
            array: ReadonlyArray<Double>,
            startingIndex: Int?,
            result: Color?,
        ): Color

        /**
         * Converts a 'byte' color component in the range of 0 to 255 into
         * a 'float' color component in the range of 0 to 1.0.
         * @param [number] The number to be converted.
         * @return The converted number.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.byteToFloat">Online Documentation</a>
         */
        fun byteToFloat(number: Double): Double

        /**
         * Converts a 'float' color component in the range of 0 to 1.0 into
         * a 'byte' color component in the range of 0 to 255.
         * @param [number] The number to be converted.
         * @return The converted number.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.floatToByte">Online Documentation</a>
         */
        fun floatToByte(number: Double): Double

        /**
         * Duplicates a Color.
         * @param [color] The Color to duplicate.
         * @param [result] The object to store the result in, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined. (Returns undefined if color is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.clone">Online Documentation</a>
         */
        fun clone(
            color: Color,
            result: Color? = definedExternally,
        ): Color

        /**
         * Returns true if the first Color equals the second color.
         * @param [left] The first Color to compare for equality.
         * @param [right] The second Color to compare for equality.
         * @return `true` if the Colors are equal; otherwise, `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Color,
            right: Color,
        ): Boolean

        /**
         * Computes the componentwise sum of two Colors.
         * @param [left] The first Color.
         * @param [right] The second Color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.add">Online Documentation</a>
         */
        fun add(
            left: Color,
            right: Color,
            result: Color,
        ): Color

        /**
         * Computes the componentwise difference of two Colors.
         * @param [left] The first Color.
         * @param [right] The second Color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.subtract">Online Documentation</a>
         */
        fun subtract(
            left: Color,
            right: Color,
            result: Color,
        ): Color

        /**
         * Computes the componentwise product of two Colors.
         * @param [left] The first Color.
         * @param [right] The second Color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.multiply">Online Documentation</a>
         */
        fun multiply(
            left: Color,
            right: Color,
            result: Color,
        ): Color

        /**
         * Computes the componentwise quotient of two Colors.
         * @param [left] The first Color.
         * @param [right] The second Color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.divide">Online Documentation</a>
         */
        fun divide(
            left: Color,
            right: Color,
            result: Color,
        ): Color

        /**
         * Computes the componentwise modulus of two Colors.
         * @param [left] The first Color.
         * @param [right] The second Color.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.mod">Online Documentation</a>
         */
        fun mod(
            left: Color,
            right: Color,
            result: Color,
        ): Color

        /**
         * Computes the linear interpolation or extrapolation at t between the provided colors.
         * @param [start] The color corresponding to t at 0.0.
         * @param [end] The color corresponding to t at 1.0.
         * @param [t] The point along t at which to interpolate.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.lerp">Online Documentation</a>
         */
        fun lerp(
            start: Color,
            end: Color,
            t: Double,
            result: Color,
        ): Color

        /**
         * Multiplies the provided Color componentwise by the provided scalar.
         * @param [color] The Color to be scaled.
         * @param [scalar] The scalar to multiply with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.multiplyByScalar">Online Documentation</a>
         */
        fun multiplyByScalar(
            color: Color,
            scalar: Double,
            result: Color,
        ): Color

        /**
         * Divides the provided Color componentwise by the provided scalar.
         * @param [color] The Color to be divided.
         * @param [scalar] The scalar to divide with.
         * @param [result] The object onto which to store the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.divideByScalar">Online Documentation</a>
         */
        fun divideByScalar(
            color: Color,
            scalar: Double,
            result: Color,
        ): Color

        /**
         * An immutable Color instance initialized to CSS color #F0F8FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ALICEBLUE">Online Documentation</a>
         */
        val ALICEBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #FAEBD7
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ANTIQUEWHITE">Online Documentation</a>
         */
        val ANTIQUEWHITE: Color

        /**
         * An immutable Color instance initialized to CSS color #00FFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.AQUA">Online Documentation</a>
         */
        val AQUA: Color

        /**
         * An immutable Color instance initialized to CSS color #7FFFD4
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.AQUAMARINE">Online Documentation</a>
         */
        val AQUAMARINE: Color

        /**
         * An immutable Color instance initialized to CSS color #F0FFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.AZURE">Online Documentation</a>
         */
        val AZURE: Color

        /**
         * An immutable Color instance initialized to CSS color #F5F5DC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BEIGE">Online Documentation</a>
         */
        val BEIGE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFE4C4
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BISQUE">Online Documentation</a>
         */
        val BISQUE: Color

        /**
         * An immutable Color instance initialized to CSS color #000000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BLACK">Online Documentation</a>
         */
        val BLACK: Color

        /**
         * An immutable Color instance initialized to CSS color #FFEBCD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BLANCHEDALMOND">Online Documentation</a>
         */
        val BLANCHEDALMOND: Color

        /**
         * An immutable Color instance initialized to CSS color #0000FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BLUE">Online Documentation</a>
         */
        val BLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #8A2BE2
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BLUEVIOLET">Online Documentation</a>
         */
        val BLUEVIOLET: Color

        /**
         * An immutable Color instance initialized to CSS color #A52A2A
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BROWN">Online Documentation</a>
         */
        val BROWN: Color

        /**
         * An immutable Color instance initialized to CSS color #DEB887
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.BURLYWOOD">Online Documentation</a>
         */
        val BURLYWOOD: Color

        /**
         * An immutable Color instance initialized to CSS color #5F9EA0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CADETBLUE">Online Documentation</a>
         */
        val CADETBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #7FFF00
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CHARTREUSE">Online Documentation</a>
         */
        val CHARTREUSE: Color

        /**
         * An immutable Color instance initialized to CSS color #D2691E
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CHOCOLATE">Online Documentation</a>
         */
        val CHOCOLATE: Color

        /**
         * An immutable Color instance initialized to CSS color #FF7F50
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CORAL">Online Documentation</a>
         */
        val CORAL: Color

        /**
         * An immutable Color instance initialized to CSS color #6495ED
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CORNFLOWERBLUE">Online Documentation</a>
         */
        val CORNFLOWERBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFF8DC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CORNSILK">Online Documentation</a>
         */
        val CORNSILK: Color

        /**
         * An immutable Color instance initialized to CSS color #DC143C
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CRIMSON">Online Documentation</a>
         */
        val CRIMSON: Color

        /**
         * An immutable Color instance initialized to CSS color #00FFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.CYAN">Online Documentation</a>
         */
        val CYAN: Color

        /**
         * An immutable Color instance initialized to CSS color #00008B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKBLUE">Online Documentation</a>
         */
        val DARKBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #008B8B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKCYAN">Online Documentation</a>
         */
        val DARKCYAN: Color

        /**
         * An immutable Color instance initialized to CSS color #B8860B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKGOLDENROD">Online Documentation</a>
         */
        val DARKGOLDENROD: Color

        /**
         * An immutable Color instance initialized to CSS color #A9A9A9
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKGRAY">Online Documentation</a>
         */
        val DARKGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #006400
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKGREEN">Online Documentation</a>
         */
        val DARKGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #A9A9A9
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKGREY">Online Documentation</a>
         */
        val DARKGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #BDB76B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKKHAKI">Online Documentation</a>
         */
        val DARKKHAKI: Color

        /**
         * An immutable Color instance initialized to CSS color #8B008B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKMAGENTA">Online Documentation</a>
         */
        val DARKMAGENTA: Color

        /**
         * An immutable Color instance initialized to CSS color #556B2F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKOLIVEGREEN">Online Documentation</a>
         */
        val DARKOLIVEGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FF8C00
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKORANGE">Online Documentation</a>
         */
        val DARKORANGE: Color

        /**
         * An immutable Color instance initialized to CSS color #9932CC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKORCHID">Online Documentation</a>
         */
        val DARKORCHID: Color

        /**
         * An immutable Color instance initialized to CSS color #8B0000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKRED">Online Documentation</a>
         */
        val DARKRED: Color

        /**
         * An immutable Color instance initialized to CSS color #E9967A
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKSALMON">Online Documentation</a>
         */
        val DARKSALMON: Color

        /**
         * An immutable Color instance initialized to CSS color #8FBC8F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKSEAGREEN">Online Documentation</a>
         */
        val DARKSEAGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #483D8B
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKSLATEBLUE">Online Documentation</a>
         */
        val DARKSLATEBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #2F4F4F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKSLATEGRAY">Online Documentation</a>
         */
        val DARKSLATEGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #2F4F4F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKSLATEGREY">Online Documentation</a>
         */
        val DARKSLATEGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #00CED1
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKTURQUOISE">Online Documentation</a>
         */
        val DARKTURQUOISE: Color

        /**
         * An immutable Color instance initialized to CSS color #9400D3
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DARKVIOLET">Online Documentation</a>
         */
        val DARKVIOLET: Color

        /**
         * An immutable Color instance initialized to CSS color #FF1493
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DEEPPINK">Online Documentation</a>
         */
        val DEEPPINK: Color

        /**
         * An immutable Color instance initialized to CSS color #00BFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DEEPSKYBLUE">Online Documentation</a>
         */
        val DEEPSKYBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #696969
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DIMGRAY">Online Documentation</a>
         */
        val DIMGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #696969
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DIMGREY">Online Documentation</a>
         */
        val DIMGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #1E90FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.DODGERBLUE">Online Documentation</a>
         */
        val DODGERBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #B22222
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.FIREBRICK">Online Documentation</a>
         */
        val FIREBRICK: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFAF0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.FLORALWHITE">Online Documentation</a>
         */
        val FLORALWHITE: Color

        /**
         * An immutable Color instance initialized to CSS color #228B22
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.FORESTGREEN">Online Documentation</a>
         */
        val FORESTGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FF00FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.FUCHSIA">Online Documentation</a>
         */
        val FUCHSIA: Color

        /**
         * An immutable Color instance initialized to CSS color #DCDCDC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GAINSBORO">Online Documentation</a>
         */
        val GAINSBORO: Color

        /**
         * An immutable Color instance initialized to CSS color #F8F8FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GHOSTWHITE">Online Documentation</a>
         */
        val GHOSTWHITE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFD700
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GOLD">Online Documentation</a>
         */
        val GOLD: Color

        /**
         * An immutable Color instance initialized to CSS color #DAA520
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GOLDENROD">Online Documentation</a>
         */
        val GOLDENROD: Color

        /**
         * An immutable Color instance initialized to CSS color #808080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GRAY">Online Documentation</a>
         */
        val GRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #008000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GREEN">Online Documentation</a>
         */
        val GREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #ADFF2F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GREENYELLOW">Online Documentation</a>
         */
        val GREENYELLOW: Color

        /**
         * An immutable Color instance initialized to CSS color #808080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.GREY">Online Documentation</a>
         */
        val GREY: Color

        /**
         * An immutable Color instance initialized to CSS color #F0FFF0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.HONEYDEW">Online Documentation</a>
         */
        val HONEYDEW: Color

        /**
         * An immutable Color instance initialized to CSS color #FF69B4
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.HOTPINK">Online Documentation</a>
         */
        val HOTPINK: Color

        /**
         * An immutable Color instance initialized to CSS color #CD5C5C
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.INDIANRED">Online Documentation</a>
         */
        val INDIANRED: Color

        /**
         * An immutable Color instance initialized to CSS color #4B0082
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.INDIGO">Online Documentation</a>
         */
        val INDIGO: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFFF0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.IVORY">Online Documentation</a>
         */
        val IVORY: Color

        /**
         * An immutable Color instance initialized to CSS color #F0E68C
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.KHAKI">Online Documentation</a>
         */
        val KHAKI: Color

        /**
         * An immutable Color instance initialized to CSS color #E6E6FA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LAVENDER">Online Documentation</a>
         */
        val LAVENDER: Color

        /**
         * An immutable Color instance initialized to CSS color #FFF0F5
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LAVENDAR_BLUSH">Online Documentation</a>
         */
        val LAVENDAR_BLUSH: Color

        /**
         * An immutable Color instance initialized to CSS color #7CFC00
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LAWNGREEN">Online Documentation</a>
         */
        val LAWNGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFACD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LEMONCHIFFON">Online Documentation</a>
         */
        val LEMONCHIFFON: Color

        /**
         * An immutable Color instance initialized to CSS color #ADD8E6
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTBLUE">Online Documentation</a>
         */
        val LIGHTBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #F08080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTCORAL">Online Documentation</a>
         */
        val LIGHTCORAL: Color

        /**
         * An immutable Color instance initialized to CSS color #E0FFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTCYAN">Online Documentation</a>
         */
        val LIGHTCYAN: Color

        /**
         * An immutable Color instance initialized to CSS color #FAFAD2
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTGOLDENRODYELLOW">Online Documentation</a>
         */
        val LIGHTGOLDENRODYELLOW: Color

        /**
         * An immutable Color instance initialized to CSS color #D3D3D3
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTGRAY">Online Documentation</a>
         */
        val LIGHTGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #90EE90
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTGREEN">Online Documentation</a>
         */
        val LIGHTGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #D3D3D3
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTGREY">Online Documentation</a>
         */
        val LIGHTGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #FFB6C1
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTPINK">Online Documentation</a>
         */
        val LIGHTPINK: Color

        /**
         * An immutable Color instance initialized to CSS color #20B2AA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTSEAGREEN">Online Documentation</a>
         */
        val LIGHTSEAGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #87CEFA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTSKYBLUE">Online Documentation</a>
         */
        val LIGHTSKYBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #778899
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTSLATEGRAY">Online Documentation</a>
         */
        val LIGHTSLATEGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #778899
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTSLATEGREY">Online Documentation</a>
         */
        val LIGHTSLATEGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #B0C4DE
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTSTEELBLUE">Online Documentation</a>
         */
        val LIGHTSTEELBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFFE0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIGHTYELLOW">Online Documentation</a>
         */
        val LIGHTYELLOW: Color

        /**
         * An immutable Color instance initialized to CSS color #00FF00
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIME">Online Documentation</a>
         */
        val LIME: Color

        /**
         * An immutable Color instance initialized to CSS color #32CD32
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LIMEGREEN">Online Documentation</a>
         */
        val LIMEGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FAF0E6
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.LINEN">Online Documentation</a>
         */
        val LINEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FF00FF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MAGENTA">Online Documentation</a>
         */
        val MAGENTA: Color

        /**
         * An immutable Color instance initialized to CSS color #800000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MAROON">Online Documentation</a>
         */
        val MAROON: Color

        /**
         * An immutable Color instance initialized to CSS color #66CDAA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMAQUAMARINE">Online Documentation</a>
         */
        val MEDIUMAQUAMARINE: Color

        /**
         * An immutable Color instance initialized to CSS color #0000CD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMBLUE">Online Documentation</a>
         */
        val MEDIUMBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #BA55D3
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMORCHID">Online Documentation</a>
         */
        val MEDIUMORCHID: Color

        /**
         * An immutable Color instance initialized to CSS color #9370DB
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMPURPLE">Online Documentation</a>
         */
        val MEDIUMPURPLE: Color

        /**
         * An immutable Color instance initialized to CSS color #3CB371
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMSEAGREEN">Online Documentation</a>
         */
        val MEDIUMSEAGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #7B68EE
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMSLATEBLUE">Online Documentation</a>
         */
        val MEDIUMSLATEBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #00FA9A
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMSPRINGGREEN">Online Documentation</a>
         */
        val MEDIUMSPRINGGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #48D1CC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMTURQUOISE">Online Documentation</a>
         */
        val MEDIUMTURQUOISE: Color

        /**
         * An immutable Color instance initialized to CSS color #C71585
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MEDIUMVIOLETRED">Online Documentation</a>
         */
        val MEDIUMVIOLETRED: Color

        /**
         * An immutable Color instance initialized to CSS color #191970
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MIDNIGHTBLUE">Online Documentation</a>
         */
        val MIDNIGHTBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #F5FFFA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MINTCREAM">Online Documentation</a>
         */
        val MINTCREAM: Color

        /**
         * An immutable Color instance initialized to CSS color #FFE4E1
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MISTYROSE">Online Documentation</a>
         */
        val MISTYROSE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFE4B5
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.MOCCASIN">Online Documentation</a>
         */
        val MOCCASIN: Color

        /**
         * An immutable Color instance initialized to CSS color #FFDEAD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.NAVAJOWHITE">Online Documentation</a>
         */
        val NAVAJOWHITE: Color

        /**
         * An immutable Color instance initialized to CSS color #000080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.NAVY">Online Documentation</a>
         */
        val NAVY: Color

        /**
         * An immutable Color instance initialized to CSS color #FDF5E6
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.OLDLACE">Online Documentation</a>
         */
        val OLDLACE: Color

        /**
         * An immutable Color instance initialized to CSS color #808000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.OLIVE">Online Documentation</a>
         */
        val OLIVE: Color

        /**
         * An immutable Color instance initialized to CSS color #6B8E23
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.OLIVEDRAB">Online Documentation</a>
         */
        val OLIVEDRAB: Color

        /**
         * An immutable Color instance initialized to CSS color #FFA500
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ORANGE">Online Documentation</a>
         */
        val ORANGE: Color

        /**
         * An immutable Color instance initialized to CSS color #FF4500
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ORANGERED">Online Documentation</a>
         */
        val ORANGERED: Color

        /**
         * An immutable Color instance initialized to CSS color #DA70D6
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ORCHID">Online Documentation</a>
         */
        val ORCHID: Color

        /**
         * An immutable Color instance initialized to CSS color #EEE8AA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PALEGOLDENROD">Online Documentation</a>
         */
        val PALEGOLDENROD: Color

        /**
         * An immutable Color instance initialized to CSS color #98FB98
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PALEGREEN">Online Documentation</a>
         */
        val PALEGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #AFEEEE
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PALETURQUOISE">Online Documentation</a>
         */
        val PALETURQUOISE: Color

        /**
         * An immutable Color instance initialized to CSS color #DB7093
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PALEVIOLETRED">Online Documentation</a>
         */
        val PALEVIOLETRED: Color

        /**
         * An immutable Color instance initialized to CSS color #FFEFD5
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PAPAYAWHIP">Online Documentation</a>
         */
        val PAPAYAWHIP: Color

        /**
         * An immutable Color instance initialized to CSS color #FFDAB9
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PEACHPUFF">Online Documentation</a>
         */
        val PEACHPUFF: Color

        /**
         * An immutable Color instance initialized to CSS color #CD853F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PERU">Online Documentation</a>
         */
        val PERU: Color

        /**
         * An immutable Color instance initialized to CSS color #FFC0CB
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PINK">Online Documentation</a>
         */
        val PINK: Color

        /**
         * An immutable Color instance initialized to CSS color #DDA0DD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PLUM">Online Documentation</a>
         */
        val PLUM: Color

        /**
         * An immutable Color instance initialized to CSS color #B0E0E6
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.POWDERBLUE">Online Documentation</a>
         */
        val POWDERBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #800080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.PURPLE">Online Documentation</a>
         */
        val PURPLE: Color

        /**
         * An immutable Color instance initialized to CSS color #FF0000
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.RED">Online Documentation</a>
         */
        val RED: Color

        /**
         * An immutable Color instance initialized to CSS color #BC8F8F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ROSYBROWN">Online Documentation</a>
         */
        val ROSYBROWN: Color

        /**
         * An immutable Color instance initialized to CSS color #4169E1
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.ROYALBLUE">Online Documentation</a>
         */
        val ROYALBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #8B4513
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SADDLEBROWN">Online Documentation</a>
         */
        val SADDLEBROWN: Color

        /**
         * An immutable Color instance initialized to CSS color #FA8072
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SALMON">Online Documentation</a>
         */
        val SALMON: Color

        /**
         * An immutable Color instance initialized to CSS color #F4A460
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SANDYBROWN">Online Documentation</a>
         */
        val SANDYBROWN: Color

        /**
         * An immutable Color instance initialized to CSS color #2E8B57
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SEAGREEN">Online Documentation</a>
         */
        val SEAGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #FFF5EE
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SEASHELL">Online Documentation</a>
         */
        val SEASHELL: Color

        /**
         * An immutable Color instance initialized to CSS color #A0522D
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SIENNA">Online Documentation</a>
         */
        val SIENNA: Color

        /**
         * An immutable Color instance initialized to CSS color #C0C0C0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SILVER">Online Documentation</a>
         */
        val SILVER: Color

        /**
         * An immutable Color instance initialized to CSS color #87CEEB
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SKYBLUE">Online Documentation</a>
         */
        val SKYBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #6A5ACD
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SLATEBLUE">Online Documentation</a>
         */
        val SLATEBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #708090
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SLATEGRAY">Online Documentation</a>
         */
        val SLATEGRAY: Color

        /**
         * An immutable Color instance initialized to CSS color #708090
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SLATEGREY">Online Documentation</a>
         */
        val SLATEGREY: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFAFA
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SNOW">Online Documentation</a>
         */
        val SNOW: Color

        /**
         * An immutable Color instance initialized to CSS color #00FF7F
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.SPRINGGREEN">Online Documentation</a>
         */
        val SPRINGGREEN: Color

        /**
         * An immutable Color instance initialized to CSS color #4682B4
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.STEELBLUE">Online Documentation</a>
         */
        val STEELBLUE: Color

        /**
         * An immutable Color instance initialized to CSS color #D2B48C
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.TAN">Online Documentation</a>
         */
        val TAN: Color

        /**
         * An immutable Color instance initialized to CSS color #008080
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.TEAL">Online Documentation</a>
         */
        val TEAL: Color

        /**
         * An immutable Color instance initialized to CSS color #D8BFD8
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.THISTLE">Online Documentation</a>
         */
        val THISTLE: Color

        /**
         * An immutable Color instance initialized to CSS color #FF6347
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.TOMATO">Online Documentation</a>
         */
        val TOMATO: Color

        /**
         * An immutable Color instance initialized to CSS color #40E0D0
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.TURQUOISE">Online Documentation</a>
         */
        val TURQUOISE: Color

        /**
         * An immutable Color instance initialized to CSS color #EE82EE
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.VIOLET">Online Documentation</a>
         */
        val VIOLET: Color

        /**
         * An immutable Color instance initialized to CSS color #F5DEB3
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.WHEAT">Online Documentation</a>
         */
        val WHEAT: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFFFF
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.WHITE">Online Documentation</a>
         */
        val WHITE: Color

        /**
         * An immutable Color instance initialized to CSS color #F5F5F5
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.WHITESMOKE">Online Documentation</a>
         */
        val WHITESMOKE: Color

        /**
         * An immutable Color instance initialized to CSS color #FFFF00
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.YELLOW">Online Documentation</a>
         */
        val YELLOW: Color

        /**
         * An immutable Color instance initialized to CSS color #9ACD32
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.YELLOWGREEN">Online Documentation</a>
         */
        val YELLOWGREEN: Color

        /**
         * An immutable Color instance initialized to CSS transparent.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Color.html#.TRANSPARENT">Online Documentation</a>
         */
        val TRANSPARENT: Color
    }
}
