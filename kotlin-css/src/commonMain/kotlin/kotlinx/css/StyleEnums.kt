@file:Suppress("EnumEntryName")

package kotlinx.css

import kotlin.math.*

abstract class CssValue(open val value: String) {
    override fun toString() = value
}

enum class Align {
    initial, inherit, unset,

    auto, stretch, center, start, end, selfStart, selfEnd, flexStart, flexEnd, baseline;

    override fun toString() = name.hyphenize()
}

enum class Appearance {
    none,
    auto,
    menulistButton,
    textfield,

    button,
    searchfield,
    textarea,
    pushButton,
    sliderHorizontal,
    checkbox,
    radio,
    squareButton,
    menulist,
    listbox,
    meter,
    progressBar;

    override fun toString() = name.hyphenize()
}

enum class JustifyContent {
    initial, inherit, unset,

    center,
    start,
    end,
    flexStart,
    flexEnd,
    left,
    right,
    baseline,
    firstBaseline,
    lastBaseline,
    spaceBetween,
    spaceAround,
    spaceEvenly,
    stretch,
    safeCenter,
    unsafeCenter;

    override fun toString() = name.hyphenize()
}

enum class JustifyItems {
    initial, inherit, unset,

    auto,
    normal,
    stretch,
    center,
    start,
    end,
    flexStart,
    flexEnd,
    selfStart,
    selfEnd,
    left,
    right,
    baseline;

    override fun toString() = name.hyphenize()
}

enum class BackgroundRepeat {
    initial, inherit, unset,

    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

enum class BackgroundAttachment {
    initial, inherit, unset,

    scroll, fixed, local;

    override fun toString(): String = name
}

enum class BackgroundClip {
    initial, inherit, unset,

    borderBox, paddingBox, contentBox, text;

    override fun toString(): String = name.hyphenize()
}

enum class BackgroundOrigin {
    initial, inherit, unset,

    borderBox, paddingBox, contentBox;

    override fun toString(): String = name.hyphenize()
}

enum class BorderCollapse {
    initial, inherit, unset,

    separate, collapse;

    override fun toString() = name
}

enum class BorderStyle {
    initial, inherit, unset,

    none, dotted, dashed, solid;

    override fun toString(): String = name
}

enum class BoxSizing {
    initial, inherit, unset,

    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

enum class Clear {
    initial, inherit, unset,

    none, left, right, both;

    override fun toString(): String = name
}

/**
 * See [CSS Color Module Level 3](https://www.w3.org/TR/2018/REC-css-color-3-20180619/)
 *
 * This class represents a CSS color value. String parameters to the constructor argument
 * can take one of the following forms:
 *
 *  * HTML color name, e.g. ``Red``, ``DarkSalmon`` (case-insensitive), though in this case the use of the pre-defined constants is recommended.
 *  * ``#rgb`` or ``#rrggbb``
 *  * ``rgb(0..255, 0..255, 0..255)``, ``rgb(0..100%, 0..100%, 0..100%)``, ``rgb(0..100%, 0..100%, 0..100%, 0..1)``, ``rgba(0..255, 0..255, 0..255, 0..1)``
 *  * ``hsl(0..360, 0-100%, 0..100%)`` or ``hsla(0..360, 0-100%, 0..100%, 0..1)``
 *
 * Technically, the Hue parameter to ``hsl`` or ``hsla`` can exceed ``360``, because it represents a *degree* (angle) on
 * the color wheel. But as per the algorithm proposed by the W3C, the value will ultimately be capped to ``360`` through
 * a series of modulus operations; see section *4.2.4. HSL color values* of the above specification.
 */
@Suppress("SpellCheckingInspection")
class Color(override val value: String) : CssValue(value) {
    private var rgb: String? = null

    private constructor(value: String, rgb: String) : this(value) {
        this.rgb = rgb
    }

    companion object {
        val initial = Color("initial")
        val inherit = Color("inherit")
        val unset = Color("unset")

        val transparent = Color("transparent")
        val currentColor = Color("currentColor")

        // W3C predefined HTML colors (147), see the referenced specification above.
        val aliceBlue = Color("aliceblue", "#f0f8ff")
        val antiqueWhite = Color("antiquewhite", "#faebd7")
        val aqua = Color("aqua", "#00ffff")
        val aquamarine = Color("aquamarine", "#7fffd4")
        val azure = Color("azure", "#f0ffff")
        val beige = Color("beige", "#f5f5dc")
        val bisque = Color("bisque", "#ffe4c4")
        val black = Color("black", "#000000")
        val blanchedAlmond = Color("blanchedalmond", "#ffebcd")
        val blue = Color("blue", "#0000ff")
        val blueViolet = Color("blueviolet", "#8a2be2")
        val brown = Color("brown", "#a52a2a")
        val burlyWood = Color("burlywood", "#deb887")
        val cadetBlue = Color("cadetblue", "#5f9ea0")
        val chartreuse = Color("chartreuse", "#7fff00")
        val chocolate = Color("chocolate", "#d2691e")
        val coral = Color("coral", "#ff7f50")
        val cornflowerBlue = Color("cornflowerblue", "#6495ed")
        val cornsilk = Color("cornsilk", "#fff8dc")
        val crimson = Color("crimson", "#dc143c")
        val cyan = Color("cyan", "#00ffff")
        val darkBlue = Color("darkblue", "#00008b")
        val darkCyan = Color("darkcyan", "#008b8b")
        val darkGoldenrod = Color("darkgoldenrod", "#b8860b")
        val darkGray = Color("darkgray", "#a9a9a9")
        val darkGreen = Color("darkgreen", "#006400")
        val darkGrey = Color("darkgrey", "#a9a9a9")
        val darkKhaki = Color("darkkhaki", "#bdb76b")
        val darkMagenta = Color("darkmagenta", "#8b008b")
        val darkOliveGreen = Color("darkolivegreen", "#556b2f")
        val darkOrange = Color("darkorange", "#ff8c00")
        val darkOrchid = Color("darkorchid", "#9932cc")
        val darkRed = Color("darkred", "#8b0000")
        val darkSalmon = Color("darksalmon", "#e9967a")
        val darkSeaGreen = Color("darkseagreen", "#8fbc8f")
        val darkSlateBlue = Color("darkslateblue", "#483d8b")
        val darkSlateGray = Color("darkslategray", "#2f4f4f")
        val darkSlateGrey = Color("darkslategrey", "#2f4f4f")
        val darkTurquoise = Color("darkturquoise", "#00ced1")
        val darkViolet = Color("darkviolet", "#9400d3")
        val deepPink = Color("deeppink", "#ff1493")
        val deepSkyBlue = Color("deepskyblue", "#00bfff")
        val dimGray = Color("dimgray", "#696969")
        val dimGrey = Color("dimgrey", "#696969")
        val dodgerBlue = Color("dodgerblue", "#1e90ff")
        val firebrick = Color("firebrick", "#b22222")
        val floralWhite = Color("floralwhite", "#fffaf0")
        val forestGreen = Color("forestgreen", "#228b22")
        val fuchsia = Color("fuchsia", "#ff00ff")
        val gainsboro = Color("gainsboro", "#dcdcdc")
        val ghostWhite = Color("ghostwhite", "#f8f8ff")
        val gold = Color("gold", "#ffd700")
        val goldenrod = Color("goldenrod", "#daa520")
        val gray = Color("gray", "#808080")
        val green = Color("green", "#008000")
        val greenYellow = Color("greenyellow", "#adff2f")
        val grey = Color("grey", "#808080")
        val honeydew = Color("honeydew", "#f0fff0")
        val hotPink = Color("hotpink", "#ff69b4")
        val indianRed = Color("indianred", "#cd5c5c")
        val indigo = Color("indigo", "#4b0082")
        val ivory = Color("ivory", "#fffff0")
        val khaki = Color("khaki", "#f0e68c")
        val lavender = Color("lavender", "#e6e6fa")
        val lavenderBlush = Color("lavenderblush", "#fff0f5")
        val lawnGreen = Color("lawngreen", "#7cfc00")
        val lemonChiffon = Color("lemonchiffon", "#fffacd")
        val lightBlue = Color("lightblue", "#add8e6")
        val lightCoral = Color("lightcoral", "#f08080")
        val lightCyan = Color("lightcyan", "#e0ffff")
        val lightGoldenrodYellow = Color("lightgoldenrodyellow", "#fafad2")
        val lightGray = Color("lightgray", "#d3d3d3")
        val lightGreen = Color("lightgreen", "#90ee90")
        val lightGrey = Color("lightgrey", "#d3d3d3")
        val lightPink = Color("lightpink", "#ffb6c1")
        val lightSalmon = Color("lightsalmon", "#ffa07a")
        val lightSeaGreen = Color("lightseagreen", "#20b2aa")
        val lightSkyBlue = Color("lightskyblue", "#87cefa")
        val lightSlateGray = Color("lightslategray", "#778899")
        val lightSlateGrey = Color("lightslategrey", "#778899")
        val lightSteelBlue = Color("lightsteelblue", "#b0c4de")
        val lightYellow = Color("lightyellow", "#ffffe0")
        val lime = Color("lime", "#00ff00")
        val limeGreen = Color("limegreen", "#32cd32")
        val linen = Color("linen", "#faf0e6")
        val magenta = Color("magenta", "#ff00ff")
        val maroon = Color("maroon", "#800000")
        val mediumAquamarine = Color("mediumaquamarine", "#66cdaa")
        val mediumBlue = Color("mediumblue", "#0000cd")
        val mediumOrchid = Color("mediumorchid", "#ba55d3")
        val mediumPurple = Color("mediumpurple", "#9370d8")
        val mediumSeaGreen = Color("mediumseagreen", "#3cb371")
        val mediumSlateBlue = Color("mediumslateblue", "#7b68ee")
        val mediumSpringGreen = Color("mediumspringgreen", "#00fa9a")
        val mediumTurquoise = Color("mediumturquoise", "#48d1cc")
        val mediumVioletRed = Color("mediumvioletred", "#c71585")
        val midnightBlue = Color("midnightblue", "#191970")
        val mintCream = Color("mintcream", "#f5fffa")
        val mistyRose = Color("mistyrose", "#ffe4e1")
        val moccasin = Color("moccasin", "#ffe4b5")
        val navajoWhite = Color("navajowhite", "#ffdead")
        val navy = Color("navy", "#000080")
        val oldLace = Color("oldlace", "#fdf5e6")
        val olive = Color("olive", "#808000")
        val oliveDrab = Color("olivedrab", "#6b8e23")
        val orange = Color("orange", "#ffa500")
        val orangeRed = Color("orangered", "#ff4500")
        val orchid = Color("orchid", "#da70d6")
        val paleGoldenrod = Color("palegoldenrod", "#eee8aa")
        val paleGreen = Color("palegreen", "#98fb98")
        val paleTurquoise = Color("paleturquoise", "#afeeee")
        val paleVioletRed = Color("palevioletred", "#db7093")
        val papayaWhip = Color("papayawhip", "#ffefd5")
        val peachPuff = Color("peachpuff", "#ffdab9")
        val peru = Color("peru", "#cd853f")
        val pink = Color("pink", "#ffc0cb")
        val plum = Color("plum", "#dda0dd")
        val powderBlue = Color("powderblue", "#b0e0e6")
        val purple = Color("purple", "#800080")
        val red = Color("red", "#ff0000")
        val rosyBrown = Color("rosybrown", "#bc8f8f")
        val royalBlue = Color("royalblue", "#4169e1")
        val saddleBrown = Color("saddlebrown", "#8b4513")
        val salmon = Color("salmon", "#fa8072")
        val sandyBrown = Color("sandybrown", "#f4a460")
        val seaGreen = Color("seagreen", "#2e8b57")
        val seaShell = Color("seashell", "#fff5ee")
        val sienna = Color("sienna", "#a0522d")
        val silver = Color("silver", "#c0c0c0")
        val skyBlue = Color("skyblue", "#87ceeb")
        val slateBlue = Color("slateblue", "#6a5acd")
        val slateGray = Color("slategray", "#708090")
        val slateGrey = Color("slategrey", "#708090")
        val snow = Color("snow", "#fffafa")
        val springGreen = Color("springgreen", "#00ff7f")
        val steelBlue = Color("steelblue", "#4682b4")
        val tan = Color("tan", "#d2b48c")
        val teal = Color("teal", "#008080")
        val thistle = Color("thistle", "#d8bfd8")
        val tomato = Color("tomato", "#ff6347")
        val turquoise = Color("turquoise", "#40e0d0")
        val violet = Color("violet", "#ee82ee")
        val wheat = Color("wheat", "#f5deb3")
        val white = Color("white", "#ffffff")
        val whiteSmoke = Color("whitesmoke", "#f5f5f5")
        val yellow = Color("yellow", "#ffff00")
        val yellowGreen = Color("yellowgreen", "#9acd32")

        fun normalizeFractionalPercent(value: Double): Double =
            value.coerceIn(minimumValue = 0.0, maximumValue = 1.0)

        fun normalizePercent(value: Int): Int =
            value.coerceIn(minimumValue = 0, maximumValue = 100)

        fun normalizeRGB(value: Int): Int =
            value.coerceIn(minimumValue = 0, maximumValue = 255)

        // algorithm for capping from W3C
        fun normalizeHue(value: Double): Int =
            (((value % 360) + 360) % 360).roundToInt()

        fun normalizeAlpha(value: Double): Double =
            normalizeFractionalPercent(value)

        // Match for hsl(int, int%, int%) | hsla(int, int%, int%, 0.5) | etc.
        private val HSLA_REGEX by lazy {
            Regex(
                "^hsla?\\((-?[0-9]+\\.?[0-9]*(?:deg|grad|rad|turn)?)\\s*[, ]?\\s*(\\d{1,3})%\\s*[, ]\\s*(\\d{1,3})%\\s*[, ]?\\s*(\\d|(?:\\d?\\.\\d+))?\\)\$",
                RegexOption.IGNORE_CASE
            )
        }

        // Match for rgb(255, 255, 255) | rgba(255, 255, 255, 0.5) | rgb(100% 100% 100%) | etc.
        private val RGBA_REGEX by lazy {
            Regex(
                "^rgba?\\((\\d{1,3}%?)\\s*[, ]\\s*(\\d{1,3}%?)\\s*[, ]\\s*(\\d{1,3}%?)[, ]?\\s*(\\d|(?:\\d?\\.\\d+))?\\)\$",
                RegexOption.IGNORE_CASE
            )
        }
    }

    /**
     * withAlpha preserves existing alpha value: rgba(0, 0, 0, 0.5).withAlpha(0.1) = rgba(0, 0, 0, 0.05)
     */
    fun withAlpha(alpha: Double) =
        when {
            value.startsWith("hsl", true) -> with(fromHSLANotation()) { hsla(hue, saturation, lightness, normalizeAlpha(alpha) * this.alpha) }
            else -> with(toRGBA()) { rgba(red, green, blue, normalizeAlpha(alpha) * this.alpha) }
        }

    /**
     * changeAlpha rewrites existing alpha value: rgba(0, 0, 0, 0.5).withAlpha(0.1) = rgba(0, 0, 0, 0.1)
     */
    fun changeAlpha(alpha: Double) =
        when {
            value.startsWith("hsl", true) -> with(fromHSLANotation()) { hsla(hue, saturation, lightness, normalizeAlpha(alpha)) }
            else -> with(toRGBA()) { rgba(red, green, blue, normalizeAlpha(alpha)) }
        }

    // https://stackoverflow.com/questions/2049230/convert-rgba-color-to-rgb
    fun blend(backgroundColor: Color): Color {
        val source = this.toRGBA()
        val background = backgroundColor.toRGBA()

        val targetR = ((1 - source.alpha) * background.red) + (source.alpha * source.red)
        val targetG = ((1 - source.alpha) * background.green) + (source.alpha * source.green)
        val targetB = ((1 - source.alpha) * background.blue) + (source.alpha * source.blue)

        return rgb(targetR.roundToInt(), targetG.roundToInt(), targetB.roundToInt())
    }

    /**
     * Lighten the color by the specified percent (between 0-100), returning a new instance of Color.
     *
     * @param percent the percent to lighten the Color
     * @return a new lightened version of this color
     */
    fun lighten(percent: Int): Color {
        val isHSLA = value.startsWith("hsl", ignoreCase = true)
        val hsla = if (isHSLA) fromHSLANotation() else toRGBA().asHSLA()

        val lightness = hsla.lightness + (hsla.lightness * (normalizePercent(percent) / 100.0)).roundToInt()
        val newHSLa = hsla.copy(lightness = normalizePercent(lightness))
        return if (isHSLA) {
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        } else {
            with(newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
        }
    }

    /**
     * Darken the color by the specified percent (between 0-100), returning a new instance of Color.
     *
     * @param percent the percent to darken the Color
     * @return a new darkened version of this color
     */
    fun darken(percent: Int): Color {
        val isHSLA = value.startsWith("hsl", ignoreCase = true)
        val hsla = if (isHSLA) fromHSLANotation() else toRGBA().asHSLA()

        val darkness = hsla.lightness - (hsla.lightness * (normalizePercent(percent) / 100.0)).roundToInt()
        val newHSLa = hsla.copy(lightness = normalizePercent(darkness))
        return if (isHSLA) {
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        } else {
            with(newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
        }
    }

    /**
     * Saturate the color by the specified percent (between 0-100), returning a new instance of Color.
     *
     * @param percent the percent to saturate the Color
     * @return a new saturated version of this color
     */
    fun saturate(percent: Int): Color {
        val isHSLA = value.startsWith("hsl", ignoreCase = true)
        val hsla = if (isHSLA) fromHSLANotation() else toRGBA().asHSLA()

        val saturation = hsla.saturation + (hsla.saturation * (normalizePercent(percent) / 100.0)).roundToInt()
        val newHSLa = hsla.copy(saturation = normalizePercent(saturation))
        return if (isHSLA) {
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        } else {
            with(newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
        }
    }

    /**
     * Desaturate the color by the specified percent (between 0-100), returning a new instance of Color.
     *
     * @param percent the percent to desaturate the Color
     * @return a new desaturated version of this color
     */
    fun desaturate(percent: Int): Color {
        val isHSLA = value.startsWith("hsl", ignoreCase = true)
        val hsla = if (isHSLA) fromHSLANotation() else toRGBA().asHSLA()

        val desaturation = hsla.saturation - (hsla.saturation * (normalizePercent(percent) / 100.0)).roundToInt()
        val newHSLa = hsla.copy(saturation = normalizePercent(desaturation))
        return if (isHSLA) {
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        } else {
            with(newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
        }
    }

    internal data class RGBA(
        val red: Int,
        val green: Int,
        val blue: Int,
        val alpha: Double = 1.0
    ) {

        // Algorithm adapted from http://www.niwa.nu/2013/05/math-behind-colorspace-conversions-rgb-hsl/
        fun asHSLA(): HSLA {
            // scale R, G, B values into 0..1 fractions
            val r = red / 255.0
            val g = green / 255.0
            val b = blue / 255.0

            val cMax = maxOf(r, g, b)
            val cMin = minOf(r, g, b)
            val chroma = cMax - cMin

            val lg = normalizeFractionalPercent((cMax + cMin) / 2)
            val s = if (chroma != 0.0) normalizeFractionalPercent(chroma / (1.0 - abs((2.0 * lg) - 1.0))) else 0.0
            val h = when (cMax) {
                cMin -> 0.0
                r -> 60 * (((g - b) / chroma) % 6.0)
                g -> 60 * (((b - r) / chroma) + 2)
                b -> 60 * (((r - g) / chroma) + 4)
                else -> error("Unexpected value for max") // theoretically unreachable bc maxOf(r, g, b) above
            }

            return HSLA(normalizeHue(h), (s * 100).roundToInt(), (lg * 100).roundToInt(), alpha)
        }
    }

    internal data class HSLA(
        val hue: Int,
        val saturation: Int,
        val lightness: Int,
        val alpha: Double = 1.0
    ) {

        // Algorithm from W3C link referenced in class comment (section 4.2.4. HSL color values)
        fun asRGBA(): RGBA {
            fun hueToRGB(m1: Double, m2: Double, h: Double): Double {
                val hu = if (h < 0) h + 1 else if (h > 1) h - 1 else h
                return when {
                    (hu < 1.0 / 6) -> m1 + (m2 - m1) * 6 * hu
                    (hu < 1.0 / 2) -> m2
                    (hu < 2.0 / 3) -> m1 + ((m2 - m1) * 6 * (2.0 / 3 - hu))
                    else -> m1
                }
            }

            if (saturation == 0) return RGBA(lightness, lightness, lightness)

            // scale H, S, V values into 0..1 fractions
            val h = (hue % 360.0) / 360.0
            val s = saturation / 100.0
            val lg = lightness / 100.0

            val m2 = if (lg < 0.5) lg * (1 + s) else (lg + s - lg * s)
            val m1 = 2 * lg - m2
            val r = normalizeFractionalPercent(hueToRGB(m1, m2, h + (1.0 / 3)))
            val g = normalizeFractionalPercent(hueToRGB(m1, m2, h))
            val b = normalizeFractionalPercent(hueToRGB(m1, m2, h - (1.0 / 3)))
            return RGBA((r * 255).roundToInt(), (g * 255).roundToInt(), (b * 255).roundToInt(), alpha)
        }
    }

    internal fun fromHSLANotation(): HSLA {
        val match = HSLA_REGEX.find(value)

        fun getHSLParameter(index: Int) =
            match?.groups?.get(index)?.value
                ?: throw IllegalArgumentException("Expected hsl or hsla notation, got $value")

        val hueShape = getHSLParameter(1)
        val hue = normalizeHue(
            when {
                hueShape.endsWith("grad", true) -> hueShape.substringBefore("grad").toDouble() * (9.0 / 10)
                hueShape.endsWith("rad", true) -> (hueShape.substringBefore("rad").toDouble() * 180) / PI
                hueShape.endsWith("turn", true) -> hueShape.substringBefore("turn").toDouble() * 360.0
                hueShape.endsWith("deg", true) -> hueShape.substringBefore("deg").toDouble()
                else -> hueShape.toDouble()
            }
        )
        val saturation = normalizePercent(getHSLParameter(2).toInt())
        val lightness = normalizePercent(getHSLParameter(3).toInt())
        val alpha = normalizeAlpha(match?.groups?.get(4)?.value?.toDouble() ?: 1.0)

        return HSLA(hue, saturation, lightness, alpha)
    }

    internal fun fromRGBANotation(): RGBA {
        val match = RGBA_REGEX.find(value)

        fun getRGBParameter(index: Int): Int {
            val group = match?.groups?.get(index)?.value
                ?: throw IllegalArgumentException("Expected rgb or rgba notation, got $value")

            return when {
                (group.endsWith('%')) -> (normalizeFractionalPercent(group.substringBefore('%').toDouble() / 100.0) * 255.0).toInt()
                else -> normalizeRGB(group.toInt())
            }
        }

        val red = getRGBParameter(1)
        val green = getRGBParameter(2)
        val blue = getRGBParameter(3)
        val alpha = normalizeAlpha(match?.groups?.get(4)?.value?.toDouble() ?: 1.0)

        return RGBA(red, green, blue, alpha)
    }

    internal fun toRGBA(): RGBA {
        val v = rgb ?: value
        return when {
            v.startsWith("rgb") -> fromRGBANotation()

            // Matches #rgb
            v.startsWith("#") && v.length == 4 -> RGBA(
                (v[1].toString() * 2).toInt(16),
                (v[2].toString() * 2).toInt(16),
                (v[3].toString() * 2).toInt(16)
            )

            // Matches both #rrggbb and #rrggbbaa
            v.startsWith("#") && (v.length == 7 || v.length == 9) -> RGBA(
                (v.substring(1..2)).toInt(16),
                (v.substring(3..4)).toInt(16),
                (v.substring(5..6)).toInt(16)
            )
            else -> throw IllegalArgumentException("Only hexadecimal, rgb, and rgba notations are accepted, got $v")
        }
    }
}

private fun String.withZeros() = this + "0".repeat(max(0, 3 - this.length))
fun hex(value: Int) = Color("#${value.toString(16).withZeros()}")
fun rgb(red: Int, green: Int, blue: Int) = Color("rgb($red, $green, $blue)")
fun rgba(red: Int, green: Int, blue: Int, alpha: Double) = Color("rgba($red, $green, $blue, ${formatAlpha(alpha)})")
fun hsl(hue: Int, saturation: Int, lightness: Int) = Color("hsl($hue, $saturation%, $lightness%)")
fun hsla(hue: Int, saturation: Int, lightness: Int, alpha: Double) = Color("hsla($hue, $saturation%, $lightness%, ${formatAlpha(alpha)})")
fun blackAlpha(alpha: Double) = Color.black.withAlpha(alpha)
fun whiteAlpha(alpha: Double) = Color.white.withAlpha(alpha)

private fun formatAlpha(alpha: Double): String =
    alpha.toString().let {
        if ("." in it) it else "$it.0"
    }

enum class Contain {
    initial, inherit, unset,

    none, strict, content, size, layout, style, paint;

    override fun toString(): String = name
}

enum class Cursor {
    initial, inherit, unset,

    auto, default, none, // General
    contextMenu, help, pointer, progress, wait, // Links & status
    cell, crosshair, text, verticalText, // Selection
    alias, copy, move, noDrop, notAllowed, grab, grabbing, // Drag and drop
    colResize, rowResize, allScroll, // Resize & scrolling
    eResize, nResize, neResize, nwResize, sResize, seResize, swResize, wResize, // Directed resize
    ewResize, nsResize, neswResize, nwseResize, // Bidirectional resize
    zoomIn, zoomOut; // Zoom

    override fun toString() = name.hyphenize()
}

// Enquotes the value
class QuotedString(override val value: String) : CssValue(value) {
    override fun toString(): String = "'$value'"
}

val String.quoted get() = QuotedString(this)

enum class Direction {
    initial, inherit, unset,

    ltr, rtl;

    override fun toString(): String = name
}

enum class Display {
    initial, inherit, unset,

    block, `inline`, runIn,

    flow, flowRoot, table, flex, grid, subgrid,

    listItem,

    tableRowGroup, tableHeaderGroup, tableFooterGroup, tableRow, tableCell, tableColumnGroup, tableColumn, tableCaption,

    contents, none,

    inlineBlock, inlineListItem, inlineTable, inlineFlex, inlineGrid;

    override fun toString(): String = name.hyphenize()
}

class FlexBasis(override val value: String) : CssValue(value) {
    companion object {
        val initial = FlexBasis("initial")
        val inherit = FlexBasis("inherit")
        val unset = FlexBasis("unset")

        val auto = FlexBasis("auto")
        val content = FlexBasis("content")
        val minContent = FlexBasis("min-content")
        val maxContent = FlexBasis("max-content")
        val fitContent = FlexBasis("fit-content")
        val fill = FlexBasis("fill")
        val zero = FlexBasis("0")
    }
}

val LinearDimension.basis get() = FlexBasis(toString())

enum class FlexWrap {
    initial, inherit, unset,

    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

enum class Float {
    initial, inherit, unset,

    left, right, none;

    override fun toString(): String = name.hyphenize()
}

class FontWeight(override val value: String) : CssValue(value) {
    companion object {
        val initial = FontWeight("initial")
        val inherit = FontWeight("inherit")
        val unset = FontWeight("unset")

        val normal = FontWeight("normal")
        val bold = FontWeight("bold")
        val bolder = FontWeight("bolder")
        val lighter = FontWeight("lighter")
        val w900 = FontWeight("900")
        val w800 = FontWeight("800")
        val w700 = FontWeight("700") // same as "bold"
        val w600 = FontWeight("600")
        val w500 = FontWeight("500")
        val w400 = FontWeight("400") // same as "normal"
        val w300 = FontWeight("300")
        val w200 = FontWeight("200")
        val w100 = FontWeight("100")
    }
}

class FontStyle(override val value: String) : CssValue(value) {
    companion object {
        val initial = FontStyle("initial")
        val inherit = FontStyle("inherit")
        val unset = FontStyle("unset")

        val normal = FontStyle("normal")
        val italic = FontStyle("italic")
    }
}

enum class FlexDirection {
    initial, inherit, unset,

    column, columnReverse, row, rowReverse;

    override fun toString() = name.hyphenize()
}

class GridAutoColumns(override val value: String) : CssValue(value) {
    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoColumns) : this(values.joinToString(" "))

    companion object {
        val auto = GridAutoColumns("auto")
        val maxContent = GridAutoColumns("max-content")
        val minContent = GridAutoColumns("min-content")

        fun fitContent(argument: GridAutoColumns) = GridAutoColumns("minmax(auto, max(auto, $argument))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridAutoColumns("minmax($min, $max)")
        fun minMax(min: GridAutoColumns, max: GridAutoColumns) = GridAutoColumns("minmax($min, $max)")
    }
}

class GridAutoFlow private constructor(override val value: String) : CssValue(value) {
    companion object {
        val initial = GridAutoFlow("initial")
        val inherit = GridAutoFlow("inherit")
        val unset = GridAutoFlow("unset")

        val column = GridAutoFlow("column")
        val columnDense = GridAutoFlow("column dense")
        val dense = GridAutoFlow("dense")
        val row = GridAutoFlow("row")
        val rowDense = GridAutoFlow("row dense")
    }
}

class GridAutoRows(override val value: String) : CssValue(value) {
    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val auto = GridAutoRows("auto")
        val maxContent = GridAutoRows("max-content")
        val minContent = GridAutoRows("min-content")

        fun fitContent(argument: GridAutoRows) = GridAutoRows("minmax(auto, max(auto, $argument))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridAutoRows("minmax($min, $max)")
        fun minMax(min: GridAutoRows, max: GridAutoRows) = GridAutoRows("minmax($min, $max)")
    }
}

class GridColumn(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridColumn("auto")
    }
}

class GridColumnEnd(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridColumnEnd("auto")
    }
}

class GridColumnStart(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridColumnStart("auto")
    }
}

class GridRow(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridRow("auto")
    }
}

class GridRowEnd(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridRowEnd("auto")
    }
}

class GridRowStart(override val value: String) : CssValue(value) {
    companion object {
        val auto = GridRowStart("auto")
    }
}

class GridTemplate(override val value: String) : CssValue(value) {
    companion object {
        val none = GridTemplate("none")
    }
}

class GridTemplateAreas(override val value: String) : CssValue(value) {
    companion object {
        val none = GridTemplateAreas("none")
    }
}

class GridTemplateColumns(override val value: String) : CssValue(value) {
    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val auto = GridTemplateColumns("auto")
        val maxContent = GridTemplateColumns("max-content")
        val minContent = GridTemplateColumns("min-content")
        val none = GridTemplateColumns("none")

        fun fitContent(dim: LinearDimension) = GridTemplateColumns("min(max-content, max(auto, $dim))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridTemplateColumns("minmax($min, $max)")
        fun minMax(min: GridTemplateColumns, max: GridTemplateColumns) = GridTemplateColumns("minmax($min, $max)")
        fun repeat(argument: String) = GridTemplateColumns("repeat($argument)")
    }
}

class GridTemplateRows(override val value: String) : CssValue(value) {
    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val auto = GridTemplateRows("auto")
        val maxContent = GridTemplateRows("max-content")
        val minContent = GridTemplateRows("min-content")
        val none = GridTemplateRows("none")

        fun fitContent(dim: LinearDimension) = GridTemplateRows("min(max-content, max(auto, $dim))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridTemplateRows("minmax($min, $max)")
        fun minMax(min: GridTemplateRows, max: GridTemplateRows) = GridTemplateRows("minmax($min, $max)")
        fun repeat(argument: String) = GridTemplateRows("repeat($argument)")
    }
}

enum class Grow {
    NONE, GROW, SHRINK, GROW_SHRINK
}

enum class Hyphens {
    initial, inherit, unset,

    none, manual, auto;

    override fun toString() = name
}

enum class ListStyleType {
    initial, inherit, unset,

    none, disc, circle, square, decimal;

    override fun toString(): String = name.hyphenize()
}

enum class ObjectFit {
    initial, inherit, unset,

    contain, cover, fill, none, scaleDown;

    override fun toString(): String = name.hyphenize()
}

enum class Outline {
    initial, inherit, unset,

    none;

    override fun toString(): String = name
}

enum class Overflow {
    initial, inherit, unset,

    visible, hidden, scroll, auto;

    override fun toString(): String = name
}

enum class OverflowWrap {
    initial, inherit, unset,

    normal, anywhere, breakWord;

    override fun toString(): String = name.hyphenize()
}

enum class OverscrollBehavior {
    initial, inherit, unset,

    auto, contain, none;

    override fun toString(): String = name
}

enum class PointerEvents {
    initial, inherit, unset,

    auto, none;

    override fun toString(): String = name
}

enum class Position {
    initial, inherit, unset,

    static, relative, absolute, fixed, sticky;

    override fun toString() = name
}

enum class ScrollBehavior {
    initial, inherit, unset,

    auto, smooth;

    override fun toString() = name
}

enum class TextAlign {
    initial, inherit, unset,

    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

enum class TableLayout {
    initial, inherit, unset,

    auto, fixed;

    override fun toString() = name
}

enum class TextOverflow {
    initial, inherit, unset,

    clip, ellipsis;

    override fun toString() = name
}

enum class TextTransform {
    initial, inherit, unset,

    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

enum class UserSelect {
    initial, inherit, unset,

    none, auto, text, contain, all;

    override fun toString() = name
}

class VerticalAlign(override val value: String) : CssValue(value) {
    companion object {
        val initial = VerticalAlign("initial")
        val inherit = VerticalAlign("inherit")
        val unset = VerticalAlign("unset")

        val baseline = VerticalAlign("baseline")
        val sub = VerticalAlign("sub")
        val `super` = VerticalAlign("super")
        val textTop = VerticalAlign("text-top")
        val textBottom = VerticalAlign("text-bottom")
        val middle = VerticalAlign("middle")
        val top = VerticalAlign("top")
        val bottom = VerticalAlign("bottom")
    }
}

val LinearDimension.up get() = VerticalAlign(toString())
val LinearDimension.down get() = VerticalAlign((-this).toString())

enum class Visibility {
    initial, inherit, unset,

    visible, hidden, collapse;

    override fun toString() = name
}

enum class WhiteSpace {
    initial, inherit, unset,

    normal, nowrap, pre, preWrap, preLine;

    override fun toString() = name.hyphenize()
}

enum class WordBreak {
    initial, inherit, unset,

    normal, breakAll, breakWord, keepAll;

    override fun toString() = name.hyphenize()
}

enum class WordWrap {
    initial, inherit, unset,

    normal, breakWord;

    override fun toString() = name.hyphenize()
}

enum class Resize {
    none, both,

    horizontal, vertical,

    block, inline,

    inherit, initial, unset;

    override fun toString() = name
}

class Image(override val value: String) : CssValue(value) {
    companion object {
        val none = Image("none")
    }
}
