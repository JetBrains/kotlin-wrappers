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
    @Suppress("SpellCheckingInspection")
    companion object {
        val initial = Color("initial")
        val inherit = Color("inherit")
        val unset = Color("unset")

        val transparent = Color("transparent")

        // https://www.w3.org/TR/2018/REC-css-color-3-20180619/
        val aliceblue = Color("aliceblue")
        val antiquewhite = Color("antiquewhite")
        val aqua = Color("aqua")
        val aquamarine = Color("aquamarine")
        val azure = Color("azure")
        val beige = Color("beige")
        val bisque = Color("bisque")
        val black = Color("black")
        val blanchedalmond = Color("blanchedalmond")
        val blue = Color("blue")
        val blueviolet = Color("blueviolet")
        val brown = Color("brown")
        val burlywood = Color("burlywood")
        val cadetblue = Color("cadetblue")
        val chartreuse = Color("chartreuse")
        val chocolate = Color("chocolate")
        val coral = Color("coral")
        val cornflowerblue = Color("cornflowerblue")
        val cornsilk = Color("cornsilk")
        val crimson = Color("crimson")
        val cyan = Color("cyan")
        val darkblue = Color("darkblue")
        val darkcyan = Color("darkcyan")
        val darkgoldenrod = Color("darkgoldenrod")
        val darkgray = Color("darkgray")
        val darkgreen = Color("darkgreen")
        val darkgrey = Color("darkgrey")
        val darkkhaki = Color("darkkhaki")
        val darkmagenta = Color("darkmagenta")
        val darkolivegreen = Color("darkolivegreen")
        val darkorange = Color("darkorange")
        val darkorchid = Color("darkorchid")
        val darkred = Color("darkred")
        val darksalmon = Color("darksalmon")
        val darkseagreen = Color("darkseagreen")
        val darkslateblue = Color("darkslateblue")
        val darkslategray = Color("darkslategray")
        val darkslategrey = Color("darkslategrey")
        val darkturquoise = Color("darkturquoise")
        val darkviolet = Color("darkviolet")
        val deeppink = Color("deeppink")
        val deepskyblue = Color("deepskyblue")
        val dimgray = Color("dimgray")
        val dimgrey = Color("dimgrey")
        val dodgerblue = Color("dodgerblue")
        val firebrick = Color("firebrick")
        val floralwhite = Color("floralwhite")
        val forestgreen = Color("forestgreen")
        val fuchsia = Color("fuchsia")
        val gainsboro = Color("gainsboro")
        val ghostwhite = Color("ghostwhite")
        val gold = Color("gold")
        val goldenrod = Color("goldenrod")
        val gray = Color("gray")
        val green = Color("green")
        val greenyellow = Color("greenyellow")
        val grey = Color("grey")
        val honeydew = Color("honeydew")
        val hotpink = Color("hotpink")
        val indianred = Color("indianred")
        val indigo = Color("indigo")
        val ivory = Color("ivory")
        val khaki = Color("khaki")
        val lavender = Color("lavender")
        val lavenderblush = Color("lavenderblush")
        val lawngreen = Color("lawngreen")
        val lemonchiffon = Color("lemonchiffon")
        val lightblue = Color("lightblue")
        val lightcoral = Color("lightcoral")
        val lightcyan = Color("lightcyan")
        val lightgoldenrodyellow = Color("lightgoldenrodyellow")
        val lightgray = Color("lightgray")
        val lightgreen = Color("lightgreen")
        val lightgrey = Color("lightgrey")
        val lightpink = Color("lightpink")
        val lightsalmon = Color("lightsalmon")
        val lightseagreen = Color("lightseagreen")
        val lightskyblue = Color("lightskyblue")
        val lightslategray = Color("lightslategray")
        val lightslategrey = Color("lightslategrey")
        val lightsteelblue = Color("lightsteelblue")
        val lightyellow = Color("lightyellow")
        val lime = Color("lime")
        val limegreen = Color("limegreen")
        val linen = Color("linen")
        val magenta = Color("magenta")
        val maroon = Color("maroon")
        val mediumaquamarine = Color("mediumaquamarine")
        val mediumblue = Color("mediumblue")
        val mediumorchid = Color("mediumorchid")
        val mediumpurple = Color("mediumpurple")
        val mediumseagreen = Color("mediumseagreen")
        val mediumslateblue = Color("mediumslateblue")
        val mediumspringgreen = Color("mediumspringgreen")
        val mediumturquoise = Color("mediumturquoise")
        val mediumvioletred = Color("mediumvioletred")
        val midnightblue = Color("midnightblue")
        val mintcream = Color("mintcream")
        val mistyrose = Color("mistyrose")
        val moccasin = Color("moccasin")
        val navajowhite = Color("navajowhite")
        val navy = Color("navy")
        val oldlace = Color("oldlace")
        val olive = Color("olive")
        val olivedrab = Color("olivedrab")
        val orange = Color("orange")
        val orangered = Color("orangered")
        val orchid = Color("orchid")
        val palegoldenrod = Color("palegoldenrod")
        val palegreen = Color("palegreen")
        val paleturquoise = Color("paleturquoise")
        val palevioletred = Color("palevioletred")
        val papayawhip = Color("papayawhip")
        val peachpuff = Color("peachpuff")
        val peru = Color("peru")
        val pink = Color("pink")
        val plum = Color("plum")
        val powderblue = Color("powderblue")
        val purple = Color("purple")
        val red = Color("red")
        val rosybrown = Color("rosybrown")
        val royalblue = Color("royalblue")
        val saddlebrown = Color("saddlebrown")
        val salmon = Color("salmon")
        val sandybrown = Color("sandybrown")
        val seagreen = Color("seagreen")
        val seashell = Color("seashell")
        val sienna = Color("sienna")
        val silver = Color("silver")
        val skyblue = Color("skyblue")
        val slateblue = Color("slateblue")
        val slategray = Color("slategray")
        val slategrey = Color("slategrey")
        val snow = Color("snow")
        val springgreen = Color("springgreen")
        val steelblue = Color("steelblue")
        val tan = Color("tan")
        val teal = Color("teal")
        val thistle = Color("thistle")
        val tomato = Color("tomato")
        val turquoise = Color("turquoise")
        val violet = Color("violet")
        val wheat = Color("wheat")
        val white = Color("white")
        val whitesmoke = Color("whitesmoke")
        val yellow = Color("yellow")
        val yellowgreen = Color("yellowgreen")
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
