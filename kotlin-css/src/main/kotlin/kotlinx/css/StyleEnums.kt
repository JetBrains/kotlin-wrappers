@file:Suppress("unused")

package kotlinx.css

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

@Suppress("EnumEntryName")
enum class Align {
    initial, inherit, unset,

    auto, stretch, center, flexStart, flexEnd, baseline;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
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

@Suppress("EnumEntryName")
enum class BackgroundRepeat {
    initial, inherit, unset,

    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class BackgroundAttachment {
    initial, inherit, unset,

    scroll, fixed, local;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BorderCollapse {
    initial, inherit, unset,

    separate, collapse;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class BorderStyle {
    initial, inherit, unset,

    none, dotted, dashed, solid;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BoxSizing {
    initial, inherit, unset,

    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Clear {
    initial, inherit, unset,

    none, left, right, both;

    override fun toString(): String = name
}

/**
 * See [CSS Color Module Level 3](https://www.w3.org/TR/2018/REC-css-color-3-20180619/)
 *
 * This class represents a CSS color value.  String parameters to the constructor argument
 * can take one of the following forms:
 *
 *  * HTML color name, e.g. ``Red``, ``DarkSalmon`` (case-insensitive), though in this case the use of the pre-defined constants is recommended.
 *  * ``#rgb`` or ``#rrggbb``
 *  * ``rgb(0..255, 0..255, 0..255)``, ``rgb(0..100%, 0..100%, 0..100%)``, ``rgb(0..100%, 0..100%, 0..100%, 0..1)``, ``rgba(0..255, 0..255, 0..255, 0..1)``
 *  * ``hsl(0..360, 0-100%, 0..100%)`` or ``hsla(0..360, 0-100%, 0..100%, 0..1)``
 *
 * Technically, the Hue parameter to ``hsl`` or ``hsla`` can exceed ``360``, because it represents a *degree* (angle) on
 * the color wheel.  But as per the algorithm proposed by the W3C, the value will ultimately be capped to ``360`` through
 * a series of modulus operations; see section *4.2.4. HSL color values* of the above specification.
 */
@Suppress("SpellCheckingInspection")
class Color(val value: String) {

    private var rgb: String? = null

    private constructor(value: String, rgb: String): this(value) {
        this.rgb = rgb
    }

    companion object {
        val initial = Color("initial")
        val inherit = Color("inherit")
        val unset = Color("unset")
        val transparent = Color("transparent")
        val currentColor = Color("currentColor")

        // W3C predefined HTML colors (140), see the referenced specification above.
        //
        val aliceBlue = Color("AliceBlue", "#f0f8ff")
        val antiqueWhite = Color("AntiqueWhite", "#faebd7")
        val aqua = Color("Aqua", "#00ffff")
        val aquaMarine = Color("AquaMarine", "#7fffd4")
        val azure = Color("Azure", "#f0ffff")
        val beige = Color("Beige", "#f5f5dc")
        val bisque = Color("Bisque", "#ffe4c4")
        val black = Color("Black", "#000000")
        val blanchedAlmond = Color("BlanchedAlmond", "#ffebcd")
        val blue = Color("Blue", "#0000ff")
        val blueViolet = Color("BlueViolet", "#8a2be2")
        val brown = Color("Brown", "#a52a2a")
        val burlyWood = Color("BurlyWood", "#deb887")
        val cadetBlue = Color("CadetBlue", "#5f9ea0")
        val chartreuse = Color("Chartreuse", "#7fff00")
        val chocolate = Color("Chocolate", "#d2691e")
        val coral = Color("Coral", "#ff7f50")
        val cornFlowerBlue = Color("CornFlowerBlue", "#6495ed")
        val cornsilk = Color("Cornsilk", "#fff8dc")
        val crimson = Color("Crimson", "#dc143c")
        val cyan = Color("Cyan", "#00ffff")
        val darkBlue = Color("DarkBlue", "#00008b")
        val darkCyan = Color("DarkCyan", "#008b8b")
        val darkGoldenRod = Color("DarkGoldenRod", "#b8860b")
        val darkGray = Color("DarkGray", "#a9a9a9")
        val darkGreen = Color("DarkGreen", "#006400")
        val darkKhaki = Color("DarkKhaki", "#bdb76b")
        val darkMagenta = Color("DarkMagenta", "#8b008b")
        val darkOliveGreen = Color("DarkOliveGreen", "#556b2f")
        val darkOrange = Color("DarkOrange", "#ff8c00")
        val darkOrchid = Color("DarkOrchid", "#9932cc")
        val darkRed = Color("DarkRed", "#8b0000")
        val darkSalmon = Color("DarkSalmon", "#e9967a")
        val darkSeaGreen = Color("DarkSeaGreen", "#8fbc8f")
        val darkSlateBlue = Color("DarkSlateBlue", "#483d8b")
        val darkSlateGray = Color("DarkSlateGray", "#2f4f4f")
        val darkTurquoise = Color("DarkTurquoise", "#00ced1")
        val darkViolet = Color("DarkViolet", "#9400d3")
        val deepPink = Color("DeepPink", "#ff1493")
        val deepSkyBlue = Color("DeepSkyBlue", "#00bfff")
        val dimGray = Color("DimGray", "#696969")
        val dodgerBlue = Color("DodgerBlue", "#1e90ff")
        val fireBrick = Color("FireBrick", "#b22222")
        val floralWhite = Color("FloralWhite", "#fffaf0")
        val forestGreen = Color("ForestGreen", "#228b22")
        val fuchsia = Color("Fuchsia", "#ff00ff")
        val gainsboro = Color("Gainsboro", "#dcdcdc")
        val ghostWhite = Color("GhostWhite", "#f8f8ff")
        val gold = Color("Gold", "#ffd700")
        val goldenRod = Color("GoldenRod", "#daa520")
        val gray = Color("Gray", "#808080")
        val green = Color("Green", "#008000")
        val greenYellow = Color("GreenYellow", "#adff2f")
        val honeyDew = Color("HoneyDew", "#f0fff0")
        val hotPink = Color("HotPink", "#ff69b4")
        val indianRed = Color("IndianRed", "#cd5c5c")
        val indigo = Color("Indigo", "#4b0082")
        val ivory = Color("Ivory", "#fffff0")
        val khaki = Color("Khaki", "#f0e68c")
        val lavender = Color("Lavender", "#e6e6fa")
        val lavenderBlush = Color("LavenderBlush", "#fff0f5")
        val lawnGreen = Color("LawnGreen", "#7cfc00")
        val lemonChiffon = Color("LemonChiffon", "#fffacd")
        val lightBlue = Color("LightBlue", "#add8e6")
        val lightCoral = Color("LightCoral", "#f08080")
        val lightCyan = Color("LightCyan", "#e0ffff")
        val lightGoldenrodYellow = Color("LightGoldenrodYellow", "#fafad2")
        val lightGray = Color("LightGray", "#d3d3d3")
        val lightGreen = Color("LightGreen", "#90ee90")
        val lightPink = Color("LightPink", "#ffb6c1")
        val lightSalmon = Color("LightSalmon", "#ffa07a")
        val lightSeaGreen = Color("LightSeaGreen", "#20b2aa")
        val lightSkyBlue = Color("LightSkyBlue", "#87cefa")
        val lightSlateGray = Color("LightSlateGray", "#778899")
        val lightSteelBlue = Color("LightSteelBlue", "#b0c4de")
        val lightYellow = Color("LightYellow", "#ffffe0")
        val lime = Color("Lime", "#00ff00")
        val limeGreen = Color("LimeGreen", "#32cd32")
        val linen = Color("Linen", "#faf0e6")
        val magenta = Color("Magenta", "#ff00ff")
        val maroon = Color("Maroon", "#800000")
        val mediumAquaMarine = Color("MediumAquaMarine", "#66cdaa")
        val mediumBlue = Color("MediumBlue", "#0000cd")
        val mediumOrchid = Color("MediumOrchid", "#ba55d3")
        val mediumPurple = Color("MediumPurple", "#9370d8")
        val mediumSeaGreen = Color("MediumSeaGreen", "#3cb371")
        val mediumSlateBlue = Color("MediumSlateBlue", "#7b68ee")
        val mediumSpringGreen = Color("MediumSpringGreen", "#00fa9a")
        val mediumTurquoise = Color("MediumTurquoise", "#48d1cc")
        val mediumVioletRed = Color("MediumVioletRed", "#c71585")
        val midnightBlue = Color("MidnightBlue", "#191970")
        val mintCream = Color("MintCream", "#f5fffa")
        val mistyRose = Color("MistyRose", "#ffe4e1")
        val moccasin = Color("Moccasin", "#ffe4b5")
        val navajoWhite = Color("NavajoWhite", "#ffdead")
        val navy = Color("Navy", "#000080")
        val oldLace = Color("OldLace", "#fdf5e6")
        val olive = Color("Olive", "#808000")
        val oliveDrab = Color("OliveDrab", "#6b8e23")
        val orange = Color("Orange", "#ffa500")
        val orangeRed = Color("OrangeRed", "#ff4500")
        val orchid = Color("Orchid", "#da70d6")
        val paleGoldenRod = Color("PaleGoldenRod", "#eee8aa")
        val paleGreen = Color("PaleGreen", "#98fb98")
        val paleTurquoise = Color("PaleTurquoise", "#afeeee")
        val paleVioletRed = Color("PaleVioletRed", "#db7093")
        val papayaWhip = Color("PapayaWhip", "#ffefd5")
        val peachPuff = Color("PeachPuff", "#ffdab9")
        val peru = Color("Peru", "#cd853f")
        val pink = Color("Pink", "#ffc0cb")
        val plum = Color("Plum", "#dda0dd")
        val powderBlue = Color("PowderBlue", "#b0e0e6")
        val purple = Color("Purple", "#800080")
        val red = Color("Red", "#ff0000")
        val rosyBrown = Color("RosyBrown", "#bc8f8f")
        val royalBlue = Color("RoyalBlue", "#4169e1")
        val saddleBrown = Color("SaddleBrown", "#8b4513")
        val salmon = Color("Salmon", "#fa8072")
        val sandyBrown = Color("SandyBrown", "#f4a460")
        val seaGreen = Color("SeaGreen", "#2e8b57")
        val seaShell = Color("SeaShell", "#fff5ee")
        val sienna = Color("Sienna", "#a0522d")
        val silver = Color("Silver", "#c0c0c0")
        val skyBlue = Color("SkyBlue", "#87ceeb")
        val slateBlue = Color("SlateBlue", "#6a5acd")
        val slateGray = Color("SlateGray", "#708090")
        val snow = Color("Snow", "#fffafa")
        val springGreen = Color("SpringGreen", "#00ff7f")
        val steelBlue = Color("SteelBlue", "#4682b4")
        val tan = Color("Tan", "#d2b48c")
        val teal = Color("Teal", "#008080")
        val thistle = Color("Thistle", "#d8bfd8")
        val tomato = Color("Tomato", "#ff6347")
        val turquoise = Color("Turquoise", "#40e0d0")
        val violet = Color("Violet", "#ee82ee")
        val wheat = Color("Wheat", "#f5deb3")
        val white = Color("White", "#ffffff")
        val whiteSmoke = Color("WhiteSmoke", "#f5f5f5")
        val yellow = Color("Yellow", "#ffff00")
        val yellowGreen = Color("YellowGreen", "#9acd3")

        val normalizeFractionalPercent = { v: Double -> normalize<Double>(min = 0.0, max = 1.0, value = v) }
        val normalizePercent = { v: Int -> normalize<Int>(min = 0, max = 100, value = v) }
        val normalizeRGB = { v: Int -> normalize<Int>(min = 0, max = 255, value = v) }
        val normalizeAlpha = normalizeFractionalPercent
        val normalizeHue: (Double) -> Int = { v: Double -> (((v % 360) + 360) % 360).roundToInt() }   // algorithm for capping from W3C
    }

    override fun toString() = value

    fun withAlpha(alpha: Double) =
        when {
            value.startsWith("hsl", true) -> with(fromHSLANotation()) { hsla(hue, saturation, lightness, normalizeAlpha(alpha) * this.alpha) }
            else                          -> with(toRGBA()) { rgba(red, green, blue, normalizeAlpha(alpha) * this.alpha) }
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
        return if (isHSLA)
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        else {
            with (newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
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
        return if (isHSLA)
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        else {
            with (newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
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
        return if (isHSLA)
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        else {
            with (newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
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
        return if (isHSLA)
            hsla(newHSLa.hue, newHSLa.saturation, newHSLa.lightness, newHSLa.alpha)
        else {
            with (newHSLa.asRGBA()) { rgba(red, green, blue, alpha) }
        }
    }

    internal data class RGBA(
        val red: Int,
        val green: Int,
        val blue: Int,
        val alpha: Double = 1.0) {

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
                r    -> 60 * (((g - b) / chroma) % 6.0)
                g    -> 60 * (((b - r) / chroma) + 2)
                b    -> 60 * (((r - g) / chroma) + 4)
                else -> error("Unexpected value for max") // theoretically unreachable bc maxOf(r, g, b) above
            }

            return HSLA(normalizeHue(h), (s * 100).roundToInt(), (lg * 100).roundToInt(), alpha)
        }
    }

    internal data class HSLA(
        val hue: Int,
        val saturation: Int,
        val lightness: Int,
        val alpha: Double = 1.0) {

        // Algorithm from W3C link referenced in class comment (section 4.2.4. HSL color values)
        fun asRGBA(): RGBA {
            fun hueToRGB(m1: Double, m2: Double, h: Double): Double {
                val hu = if (h < 0) h + 1 else if (h > 1) h - 1 else h
                return when {
                    (hu < 1.0 / 6) -> m1 + (m2 - m1) * 6 * hu
                    (hu < 1.0 / 2) -> m2
                    (hu < 2.0 / 3) -> m1 + ((m2 - m1) * 6 * (2.0 / 3 - hu))
                    else           -> m1
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
        // Match for hsl(int, int%, int%) | hsla(int, int%, int%, 0.5) | etc.
        val pattern = "^hsla?\\((-?[0-9]+\\.?[0-9]*(?:deg|grad|rad|turn)?)\\s*[, ]?\\s*(\\d{1,3})%\\s*[, ]\\s*(\\d{1,3})%\\s*[, ]?\\s*(\\d|(?:\\d?\\.\\d+))?\\)\$"
        val match = Regex(pattern, RegexOption.IGNORE_CASE).find(value)

        fun getHSLParameter(index: Int) =
            match?.groups?.get(index)?.value ?: throw IllegalArgumentException("Expected hsl or hsla notation, got $value")

        val hueShape = getHSLParameter(1)
        val hue = normalizeHue(when {
            hueShape.endsWith("grad", true) -> hueShape.substringBefore("grad").toDouble() * (9.0 / 10)
            hueShape.endsWith("rad", true)  -> (hueShape.substringBefore("rad").toDouble() * 180) / PI
            hueShape.endsWith("turn", true) -> hueShape.substringBefore("turn").toDouble() * 360.0
            hueShape.endsWith("deg", true)  -> hueShape.substringBefore("deg").toDouble()
            else                            -> hueShape.toDouble()
        })
        val saturation = normalizePercent(getHSLParameter(2).toInt())
        val lightness = normalizePercent(getHSLParameter(3).toInt())
        val alpha = normalizeAlpha(match?.groups?.get(4)?.value?.toDouble() ?: 1.0)

        return HSLA(hue, saturation, lightness, alpha)
    }

    internal fun fromRGBANotation(): RGBA {
        // Match for rgb(255, 255, 255) | rgba(255, 255, 255, 0.5) | rgb(100% 100% 100%) | etc.
        val pattern = "^rgba?\\((\\d{1,3}%?)\\s*[, ]\\s*(\\d{1,3}%?)\\s*[, ]\\s*(\\d{1,3}%?)[, ]?\\s*(\\d|(?:\\d?\\.\\d+))?\\)\$"
        val match = Regex(pattern, RegexOption.IGNORE_CASE).find(value)

        fun getRGBParameter(index: Int): Int {
            val group = match?.groups?.get(index)?.value ?: throw IllegalArgumentException("Expected rgb or rgba notation, got $value")

            return when {
                (group.endsWith('%')) -> (normalizeFractionalPercent(group.substringBefore('%').toDouble() / 100.0) * 255.0).toInt()
                else                  -> normalizeRGB(group.toInt())
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

fun rgb(red: Int, green: Int, blue: Int) = Color("rgb($red, $green, $blue)")
fun rgba(red: Int, green: Int, blue: Int, alpha: Double) = Color("rgba($red, $green, $blue, $alpha)")
fun hsl(hue: Int, saturation: Int, lightness: Int) = Color("hsl($hue, $saturation%, $lightness%)")
fun hsla(hue: Int, saturation: Int, lightness: Int, alpha: Double) = Color("hsla($hue, $saturation%, $lightness%, $alpha)")
fun blackAlpha(alpha: Double) = Color.black.withAlpha(alpha)
fun whiteAlpha(alpha: Double) = Color.white.withAlpha(alpha)

private inline fun <reified T: Number> normalize(min: Number, max: Number, value: Number): T = when (value) {
    is Int    -> max(min.toInt(), min(max.toInt(), value.toInt())) as T
    is Double -> max(min.toDouble(), min(max.toDouble(), value.toDouble())) as T
    else      -> error("Expected parameters if type Int or Double")
}

@Suppress("EnumEntryName")
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
class QuotedString(val value: String) {
    override fun toString(): String = "'$value'"
}

val String.quoted get() = QuotedString(this)

@Suppress("EnumEntryName")
enum class Direction {
    initial, inherit, unset,

    ltr, rtl;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
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

class FlexBasis(val value: String) {
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

    override fun toString(): String = value
}

val LinearDimension.basis get() = FlexBasis(toString())

@Suppress("EnumEntryName")
enum class FlexWrap {
    initial, inherit, unset,

    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Float {
    initial, inherit, unset,

    left, right, none;

    override fun toString(): String = name.hyphenize()
}

class FontWeight(val value: String) {
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

    override fun toString(): String = value
}

class FontStyle(val value: String) {
    companion object {
        val initial = FontStyle("initial")
        val inherit = FontStyle("inherit")
        val unset = FontStyle("unset")

        val normal = FontStyle("normal")
        val italic = FontStyle("italic")
    }

    override fun toString(): String = value
}

@Suppress("EnumEntryName")
enum class FlexDirection {
    initial, inherit, unset,

    column, columnReverse, row, rowReverse;

    override fun toString() = name.hyphenize()
}

enum class Grow {
    NONE, GROW, SHRINK, GROW_SHRINK
}

@Suppress("EnumEntryName")
enum class Hyphens {
    initial, inherit, unset,

    none, manual, auto;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ListStyleType {
    initial, inherit, unset,

    none, disc, circle, square, decimal;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Outline {
    initial, inherit, unset,

    none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Overflow {
    initial, inherit, unset,

    visible, hidden, scroll, auto;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class OverflowWrap {
    initial, inherit, unset,

    normal, breakWord;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class PointerEvents {
    initial, inherit, unset,

    auto, none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Position {
    initial, inherit, unset,

    static, relative, absolute, fixed, sticky;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ScrollBehavior {
    initial, inherit, unset,

    auto, smooth;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextAlign {
    initial, inherit, unset,

    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class TableLayout {
    initial, inherit, unset,

    auto, fixed;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextOverflow {
    initial, inherit, unset,

    clip, ellipsis;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextTransform {
    initial, inherit, unset,

    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class UserSelect {
    initial, inherit, unset,

    none, auto, text, contain, all;

    override fun toString() = name
}

class VerticalAlign(val value: String) {
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

    override fun toString() = value
}

val LinearDimension.up get() = VerticalAlign(toString())
val LinearDimension.down get() = VerticalAlign((-this).toString())

@Suppress("EnumEntryName")
enum class Visibility {
    initial, inherit, unset,

    visible, hidden, collapse;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class WhiteSpace {
    initial, inherit, unset,

    normal, nowrap, pre, preWrap, preLine;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordBreak {
    initial, inherit, unset,

    normal, breakAll, breakWord, keepAll;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordWrap {
    initial, inherit, unset,

    normal, breakWord;

    override fun toString() = name.hyphenize()
}

class Image(val value: String) {
    companion object {
        val none = Image("none")
    }

    override fun toString() = value
}
