@file:Suppress("unused")

package kotlinx.css

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

class Color(val value: String) {
    companion object {
        val initial = Color("initial")
        val inherit = Color("inherit")
        val unset = Color("unset")

        val transparent = Color("transparent")

        // W3C predefined HTML colors (140)
        //
        val aliceBlue = Color("AliceBlue")
        val antiqueWhite = Color("AntiqueWhite")
        val aqua = Color("Aqua")
        val aquaMarine = Color("AquaMarine")
        val azure = Color("Azure")
        val beige = Color("Beige")
        val bisque = Color("Bisque")
        val black = Color("Black")
        val blanchedAlmond = Color("BlanchedAlmond")
        val blue = Color("Blue")
        val blueViolet = Color("BlueViolet")
        val brown = Color("Brown")
        val burlyWood = Color("BurlyWood")
        val cadetBlue = Color("CadetBlue")
        val chartreuse = Color("Chartreuse")
        val chocolate = Color("Chocolate")
        val coral = Color("Coral")
        val cornFlowerBlue = Color("CornFlowerBlue")
        val cornsilk = Color("Cornsilk")
        val crimson = Color("Crimson")
        val cyan = Color("Cyan")
        val darkBlue = Color("DarkBlue")
        val darkCyan = Color("DarkCyan")
        val darkGoldenRod = Color("DarkGoldenRod")
        val darkGray = Color("DarkGray")
        val darkGreen = Color("DarkGreen")
        val darkKhaki = Color("DarkKhaki")
        val darkMagenta = Color("DarkMagenta")
        val darkOliveGreen = Color("DarkOliveGreen")
        val darkOrange = Color("DarkOrange")
        val darkOrchid = Color("DarkOrchid")
        val darkRed = Color("DarkRed")
        val darkSalmon = Color("DarkSalmon")
        val darkSeaGreen = Color("DarkSeaGreen")
        val darkSlateBlue = Color("DarkSlateBlue")
        val darkSlateGray = Color("DarkSlateGray")
        val darkTurquoise = Color("DarkTurquoise")
        val darkViolet = Color("DarkViolet")
        val deepPink = Color("DeepPink")
        val deepSkyBlue = Color("DeepSkyBlue")
        val dimGray = Color("DimGray")
        val dodgerBlue = Color("DodgerBlue")
        val fireBrick = Color("FireBrick")
        val floralWhite = Color("FloralWhite")
        val forestGreen = Color("ForestGreen")
        val fuchsia = Color("Fuchsia")
        val gainsboro = Color("Gainsboro")
        val ghostWhite = Color("GhostWhite")
        val gold = Color("Gold")
        val goldenRod = Color("GoldenRod")
        val gray = Color("Gray")
        val green = Color("Green")
        val greenYellow = Color("GreenYellow")
        val honeyDew = Color("HoneyDew")
        val hotPink = Color("HotPink")
        val indianRed = Color("IndianRed")
        val indigo = Color("Indigo")
        val ivory = Color("Ivory")
        val khaki = Color("Khaki")
        val lavender = Color("Lavender")
        val lavenderBlush = Color("LavenderBlush")
        val lawnGreen = Color("LawnGreen")
        val lemonChiffon = Color("LemonChiffon")
        val lightBlue = Color("LightBlue")
        val lightCoral = Color("LightCoral")
        val lightCyan = Color("LightCyan")
        val lightGoldenrodYellow = Color("LightGoldenrodYellow")
        val lightGray = Color("LightGray")
        val lightGreen = Color("LightGreen")
        val lightPink = Color("LightPink")
        val lightSalmon = Color("LightSalmon")
        val lightSeaGreen = Color("LightSeaGreen")
        val lightSkyBlue = Color("LightSkyBlue")
        val lightSlateGray = Color("LightSlateGray")
        val lightSteelBlue = Color("LightSteelBlue")
        val lightYellow = Color("LightYellow")
        val lime = Color("Lime")
        val limeGreen = Color("LimeGreen")
        val linen = Color("Linen")
        val magenta = Color("Magenta")
        val maroon = Color("Maroon")
        val mediumAquaMarine = Color("MediumAquaMarine")
        val mediumBlue = Color("MediumBlue")
        val mediumOrchid = Color("MediumOrchid")
        val mediumPurple = Color("MediumPurple")
        val mediumSeaGreen = Color("MediumSeaGreen")
        val mediumSlateBlue = Color("MediumSlateBlue")
        val mediumSpringGreen = Color("MediumSpringGreen")
        val mediumTurquoise = Color("MediumTurquoise")
        val mediumVioletRed = Color("MediumVioletRed")
        val midnightBlue = Color("MidnightBlue")
        val mintCream = Color("MintCream")
        val mistyRose = Color("MistyRose")
        val moccasin = Color("Moccasin")
        val navajoWhite = Color("NavajoWhite")
        val navy = Color("Navy")
        val oldLace = Color("OldLace")
        val olive = Color("Olive")
        val oliveDrab = Color("OliveDrab")
        val orange = Color("Orange")
        val orangeRed = Color("OrangeRed")
        val orchid = Color("Orchid")
        val paleGoldenRod = Color("PaleGoldenRod")
        val paleGreen = Color("PaleGreen")
        val paleTurquoise = Color("PaleTurquoise")
        val paleVioletRed = Color("PaleVioletRed")
        val papayaWhip = Color("PapayaWhip")
        val peachPuff = Color("PeachPuff")
        val peru = Color("Peru")
        val pink = Color("Pink")
        val plum = Color("Plum")
        val powderBlue = Color("PowderBlue")
        val purple = Color("Purple")
        val red = Color("Red")
        val rosyBrown = Color("RosyBrown")
        val royalBlue = Color("RoyalBlue")
        val saddleBrown = Color("SaddleBrown")
        val salmon = Color("Salmon")
        val sandyBrown = Color("SandyBrown")
        val seaGreen = Color("SeaGreen")
        val seaShell = Color("SeaShell")
        val sienna = Color("Sienna")
        val silver = Color("Silver")
        val skyBlue = Color("SkyBlue")
        val slateBlue = Color("SlateBlue")
        val slateGray = Color("SlateGray")
        val snow = Color("Snow")
        val springGreen = Color("SpringGreen")
        val steelBlue = Color("SteelBlue")
        val tan = Color("Tan")
        val teal = Color("Teal")
        val thistle = Color("Thistle")
        val tomato = Color("Tomato")
        val turquoise = Color("Turquoise")
        val violet = Color("Violet")
        val wheat = Color("Wheat")
        val white = Color("White")
        val whiteSmoke = Color("WhiteSmoke")
        val yellow = Color("Yellow")
        val yellowGreen = Color("YellowGreen")
    }

    override fun toString() = value

    fun withAlpha(alpha: Double): Color {
        if (alpha < 0 || alpha > 1) {
            throw IllegalArgumentException("Alpha should be a number between 0.0 (fully transparent) and 1.0 (fully opaque)")
        } else {
            val rgba = toRGBA()
            return Color("rgba(${rgba.red},${rgba.green},${rgba.blue},${alpha * rgba.alpha})")
        }
    }

    private data class RGBA(
        val red: Int,
        val green: Int,
        val blue: Int,
        val alpha: Double = 1.0
    )

    private fun fromRGBANotation(): RGBA {
        // Match for rgb(255, 255, 255) | rgba(255, 255, 255, 0.5)
        val pattern = "^rgba?\\((\\d{1,3}),?\\s*(\\d{1,3}),?\\s*(\\d{1,3}),?\\s*(\\d|(?:\\d?\\.\\d+))?\\)\$"
        val match = Regex(pattern, RegexOption.IGNORE_CASE).find(value)

        fun getColorByte(index: Int): Int {
            val int = match?.groups?.get(index)?.value?.toInt()

            if (int == null || int < 0 || int > 255) {
                throw IllegalArgumentException("Expected rgb or rgba notation, got $value")
            } else {
                return int
            }
        }

        val red = getColorByte(1)
        val green = getColorByte(2)
        val blue = getColorByte(3)
        val alpha = match?.groups?.get(4)?.value?.toDouble() ?: 1.0

        if (alpha < 0 || alpha > 1) {
            throw IllegalArgumentException("Expected rgb or rgba notation, got $value")
        }

        return RGBA(red, green, blue, alpha)
    }

    private fun toRGBA(): RGBA {
        return when {
            value.startsWith("rgb") -> fromRGBANotation()

            // Matches #rgb
            value.startsWith("#") && value.length == 4 -> RGBA(
                (value[1].toString() * 2).toInt(16),
                (value[2].toString() * 2).toInt(16),
                (value[3].toString() * 2).toInt(16)
            )

            // Matches both #rrggbb and #rrggbbaa
            value.startsWith("#") && (value.length == 7 || value.length == 9) -> RGBA(
                (value.substring(1..2)).toInt(16),
                (value.substring(3..4)).toInt(16),
                (value.substring(5..6)).toInt(16)
            )
            else -> throw IllegalArgumentException("Only hexadecimal, rgb, and rgba notations are accepted, got $value")
        }
    }
}

fun rgb(red: Int, green: Int, blue: Int) = Color("rgb($red, $green, $blue)")
fun rgba(red: Int, green: Int, blue: Int, alpha: Double) = Color("rgba($red, $green, $blue, $alpha)")
fun blackAlpha(alpha: Double) = Color.black.withAlpha(alpha)
fun whiteAlpha(alpha: Double) = Color.white.withAlpha(alpha)

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
