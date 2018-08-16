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
        val aliceblue = Color("#f0f8ff")
        val antiquewhite = Color("#faebd7")
        val aqua = Color("#00ffff")
        val aquamarine = Color("#7fffd4")
        val azure = Color("#f0ffff")
        val beige = Color("#f5f5dc")
        val bisque = Color("#ffe4c4")
        val black = Color("#000000")
        val blanchedalmond = Color("#ffebcd")
        val blue = Color("#0000ff")
        val blueviolet = Color("#8a2be2")
        val brown = Color("#a52a2a")
        val burlywood = Color("#deb887")
        val cadetblue = Color("#5f9ea0")
        val chartreuse = Color("#7fff00")
        val chocolate = Color("#d2691e")
        val coral = Color("#ff7f50")
        val cornflowerblue = Color("#6495ed")
        val cornsilk = Color("#fff8dc")
        val crimson = Color("#dc143c")
        val cyan = Color("#00ffff")
        val darkblue = Color("#00008b")
        val darkcyan = Color("#008b8b")
        val darkgoldenrod = Color("#b8860b")
        val darkgray = Color("#a9a9a9")
        val darkgreen = Color("#006400")
        val darkgrey = Color("#a9a9a9")
        val darkkhaki = Color("#bdb76b")
        val darkmagenta = Color("#8b008b")
        val darkolivegreen = Color("#556b2f")
        val darkorange = Color("#ff8c00")
        val darkorchid = Color("#9932cc")
        val darkred = Color("#8b0000")
        val darksalmon = Color("#e9967a")
        val darkseagreen = Color("#8fbc8f")
        val darkslateblue = Color("#483d8b")
        val darkslategray = Color("#2f4f4f")
        val darkslategrey = Color("#2f4f4f")
        val darkturquoise = Color("#00ced1")
        val darkviolet = Color("#9400d3")
        val deeppink = Color("#ff1493")
        val deepskyblue = Color("#00bfff")
        val dimgray = Color("#696969")
        val dimgrey = Color("#696969")
        val dodgerblue = Color("#1e90ff")
        val firebrick = Color("#b22222")
        val floralwhite = Color("#fffaf0")
        val forestgreen = Color("#228b22")
        val fuchsia = Color("#ff00ff")
        val gainsboro = Color("#dcdcdc")
        val ghostwhite = Color("#f8f8ff")
        val gold = Color("#ffd700")
        val goldenrod = Color("#daa520")
        val gray = Color("#daa520")
        val green = Color("#008000")
        val greenyellow = Color("#adff2f")
        val grey = Color("#808080")
        val honeydew = Color("#f0fff0")
        val hotpink = Color("#ff69b4")
        val indianred = Color("#cd5c5c")
        val indigo = Color("#4b0082")
        val ivory = Color("#fffff0")
        val khaki = Color("#f0e68c")
        val lavender = Color("#e6e6fa")
        val lavenderblush = Color("#fff0f5")
        val lawngreen = Color("#7cfc00")
        val lemonchiffon = Color("#fffacd")
        val lightblue = Color("#add8e6")
        val lightcoral = Color("#f08080")
        val lightcyan = Color("#e0ffff")
        val lightgoldenrodyellow = Color("#fafad2")
        val lightgray = Color("#d3d3d3")
        val lightgreen = Color("#90ee90")
        val lightgrey = Color("#d3d3d3")
        val lightpink = Color("#ffb6c1")
        val lightsalmon = Color("#ffa07a")
        val lightseagreen = Color("#20b2aa")
        val lightskyblue = Color("#87cefa")
        val lightslategray = Color("#778899")
        val lightslategrey = Color("#778899")
        val lightsteelblue = Color("#b0c4de")
        val lightyellow = Color("#ffffe0")
        val lime = Color("#00ff00")
        val limegreen = Color("#32cd32")
        val linen = Color("#faf0e6")
        val magenta = Color("#ff00ff")
        val maroon = Color("#800000")
        val mediumaquamarine = Color("#66cdaa")
        val mediumblue = Color("#0000cd")
        val mediumorchid = Color("#ba55d3")
        val mediumpurple = Color("#9370db")
        val mediumseagreen = Color("#3cb371")
        val mediumslateblue = Color("#7b68ee")
        val mediumspringgreen = Color("#00fa9a")
        val mediumturquoise = Color("#48d1cc")
        val mediumvioletred = Color("#c71585")
        val midnightblue = Color("#191970")
        val mintcream = Color("#f5fffa")
        val mistyrose = Color("#ffe4e1")
        val moccasin = Color("#ffe4b5")
        val navajowhite = Color("#ffdead")
        val navy = Color("#000080")
        val oldlace = Color("#fdf5e6")
        val olive = Color("#808000")
        val olivedrab = Color("#6b8e23")
        val orange = Color("#ffa500")
        val orangered = Color("#ff4500")
        val orchid = Color("#da70d6")
        val palegoldenrod = Color("#eee8aa")
        val palegreen = Color("#98fb98")
        val paleturquoise = Color("#afeeee")
        val palevioletred = Color("#db7093")
        val papayawhip = Color("#ffefd5")
        val peachpuff = Color("#ffdab9")
        val peru = Color("#cd853f")
        val pink = Color("#ffc0cb")
        val plum = Color("#dda0dd")
        val powderblue = Color("#b0e0e6")
        val purple = Color("#800080")
        val red = Color("#ff0000")
        val rosybrown = Color("#bc8f8f")
        val royalblue = Color("#4169e1")
        val saddlebrown = Color("#8b4513")
        val salmon = Color("#fa8072")
        val sandybrown = Color("#f4a460")
        val seagreen = Color("#2e8b57")
        val seashell = Color("#fff5ee")
        val sienna = Color("#a0522d")
        val silver = Color("#c0c0c0")
        val skyblue = Color("#87ceeb")
        val slateblue = Color("#6a5acd")
        val slategray = Color("#708090")
        val slategrey = Color("#708090")
        val snow = Color("#fffafa")
        val springgreen = Color("#00ff7f")
        val steelblue = Color("#4682b4")
        val tan = Color("#d2b48c")
        val teal = Color("#008080")
        val thistle = Color("#d8bfd8")
        val tomato = Color("#ff6347")
        val turquoise = Color("#40e0d0")
        val violet = Color("#ee82ee")
        val wheat = Color("#f5deb3")
        val white = Color("#ffffff")
        val whitesmoke = Color("#f5f5f5")
        val yellow = Color("#ffff00")
        val yellowgreen = Color("#9acd32")
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
