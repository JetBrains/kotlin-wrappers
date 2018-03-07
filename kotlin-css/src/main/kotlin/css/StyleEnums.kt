package css

@Suppress("EnumEntryName")
enum class Align {
    // Basic keywords
    auto,
    stretch,
    center,
    flexStart,
    flexEnd,
    baseline;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class JustifyContent {
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
    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class BackgroundAttachment {
    scroll, fixed, local;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BorderCollapse {
    separate, collapse, initial, inherit;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class BorderStyle {
    none, dotted, dashed, solid;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class BoxSizing {
    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Clear {
    none, left, right, both;

    override fun toString(): String = name
}

class Color(val value: String) {
    // Reserved for basic constants only, actual theming is done in XTheme and AppTheme
    companion object {
        val transparent = Color("transparent")

        val black = Color("#000")
        val white = Color("#fff")

        val red = Color("#f00")
        val green = Color("#0f0")
        val blue = Color("#00f")

        val gray = Color("#bbb")
        val darkGray = Color("#999")
    }

    override fun toString() = value
}

fun rgb(red: Int, green: Int, blue: Int) = Color("rgb($red, $green, $blue)")
fun rgba(red: Int, green: Int, blue: Int, alpha: Double) = Color("rgba($red, $green, $blue, $alpha)")
fun blackAlpha(alpha: Double) = rgba(0, 0, 0, alpha)
fun whiteAlpha(alpha: Double) = rgba(255, 255, 255, alpha)

@Suppress("EnumEntryName")
enum class Cursor {
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
    ltr, rtl;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Display {
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
    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Float {
    left, right, none;

    override fun toString(): String = name.hyphenize()
}

class FontWeight(val value: String) {
    companion object {
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
        val normal = FontStyle("normal")
        val italic = FontStyle("italic")
    }

    override fun toString(): String = value
}

@Suppress("EnumEntryName")
enum class FlexDirection {
    column, row;

    override fun toString() = name
}

enum class Grow {
    NONE, GROW, SHRINK, GROW_SHRINK
}

@Suppress("EnumEntryName")
enum class Hyphens {
    none, manual, auto;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ListStyleType {
    none, disc, circle, square, decimal;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class Outline {
    none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Overflow {
    visible, hidden, scroll, auto;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class OverflowWrap {
    normal, breakWord;

    override fun toString(): String = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class PointerEvents {
    auto, none;

    override fun toString(): String = name
}

@Suppress("EnumEntryName")
enum class Position {
    static, relative, absolute, fixed, sticky;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class ScrollBehavior {
    auto, smooth;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextAlign {
    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class TableLayout {
    auto, fixed, initial, inherit;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextOverflow {
    clip, ellipsis;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class TextTransform {
    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class UserSelect {
    none, auto, text, contain, all;

    override fun toString() = name
}

class VerticalAlign(val value: String) {
    companion object {
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
    visible, hidden, collapse;

    override fun toString() = name
}

@Suppress("EnumEntryName")
enum class WhiteSpace {
    normal, nowrap, pre, preWrap, preLine;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordBreak {
    normal, breakAll, breakWord, keepAll;

    override fun toString() = name.hyphenize()
}

@Suppress("EnumEntryName")
enum class WordWrap {
    normal, breakWord;

    override fun toString() = name.hyphenize()
}

class Image(val value: String) {
    companion object {
        val none = Image("none")
    }

    override fun toString() = value
}
