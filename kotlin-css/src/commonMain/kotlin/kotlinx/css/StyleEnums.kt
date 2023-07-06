@file:Suppress("EnumEntryName")

package kotlinx.css

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

enum class BackgroundAttachment {
    initial, inherit, unset,

    scroll, fixed, local;
}

enum class BackgroundClip {
    initial, inherit, unset,

    borderBox, paddingBox, contentBox, text;

    override fun toString() = name.hyphenize()
}

enum class BackgroundOrigin {
    initial, inherit, unset,

    borderBox, paddingBox, contentBox;

    override fun toString() = name.hyphenize()
}

enum class BackgroundRepeat {
    initial, inherit, unset,

    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

enum class BorderCollapse {
    initial, inherit, unset,

    separate, collapse;
}

enum class BorderStyle {
    initial, inherit, unset,

    none, dotted, dashed, solid;
}

enum class BoxSizing {
    initial, inherit, unset,

    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

enum class Clear {
    initial, inherit, unset,

    none, left, right, both;
}

enum class Contain {
    initial, inherit, unset,

    none, strict, content, size, layout, style, paint;
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

enum class Direction {
    initial, inherit, unset,

    ltr, rtl;
}

enum class Display {
    initial, inherit, unset,

    block, `inline`, runIn,

    flow, flowRoot, table, flex, grid, subgrid,

    listItem,

    tableRowGroup, tableHeaderGroup, tableFooterGroup, tableRow, tableCell, tableColumnGroup, tableColumn, tableCaption,

    contents, none,

    inlineBlock, inlineListItem, inlineTable, inlineFlex, inlineGrid;

    override fun toString() = name.hyphenize()
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

enum class FlexDirection {
    initial, inherit, unset,

    column, columnReverse, row, rowReverse;

    override fun toString() = name.hyphenize()
}

enum class FlexWrap {
    initial, inherit, unset,

    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

enum class Float {
    initial, inherit, unset,

    left, right, none;

    override fun toString() = name.hyphenize()
}

enum class FontStyle {
    initial, inherit, unset,

    normal, italic;
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

enum class Hyphens {
    initial, inherit, unset,

    none, manual, auto;
}

class Image(override val value: String) : CssValue(value) {
    companion object {
        val none = Image("none")
    }
}

enum class Isolation {
    initial, inherit, revert, unset,

    auto, isolate;
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

enum class ListStyleType {
    initial, inherit, unset,

    none, disc, circle, square, decimal;

    override fun toString() = name.hyphenize()
}

enum class ObjectFit {
    initial, inherit, unset,

    contain, cover, fill, none, scaleDown;

    override fun toString() = name.hyphenize()
}

class Order(override val value: String) : CssValue(value) {
    constructor(value: Int) : this(value.toString())

    companion object {
        val inherit = Order("inherit")
        val initial = Order("initial")
        val revert = Order("revert")
        val revertLayer = Order("revert-layer")
        val unset = Order("unset")
    }
}

enum class Outline {
    initial, inherit, unset,

    none;
}

enum class OutlineStyle {
    inherit, initial, revert, revertLayer, unset,

    auto, none, dotted, dashed, solid, double, groove, ridge, inset, outset;

    override fun toString() = name.hyphenize()
}

enum class Overflow {
    initial, inherit, unset,

    visible, hidden, scroll, auto;
}

enum class OverflowWrap {
    initial, inherit, unset,

    normal, anywhere, breakWord;

    override fun toString() = name.hyphenize()
}

enum class OverscrollBehavior {
    initial, inherit, unset,

    auto, contain, none;
}

enum class PointerEvents {
    initial, inherit, unset,

    auto, none;
}

enum class Position {
    initial, inherit, unset,

    static, relative, absolute, fixed, sticky;
}

enum class Resize {
    none, both,

    horizontal, vertical,

    block, inline,

    inherit, initial, unset;
}

enum class ScrollBehavior {
    initial, inherit, unset,

    auto, smooth;
}

enum class TableLayout {
    initial, inherit, unset,

    auto, fixed;
}

enum class TextAlign {
    initial, inherit, unset,

    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

enum class TextOverflow {
    initial, inherit, unset,

    clip, ellipsis;
}

enum class TextTransform {
    initial, inherit, unset,

    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

enum class UserSelect {
    initial, inherit, unset,

    none, auto, text, contain, all;
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

// Enquotes the value
class QuotedString(override val value: String) : CssValue(value) {
    override fun toString(): String = "'$value'"
}

val String.quoted get() = QuotedString(this)

class RelativePosition(override val value: String) : CssValue(value) {
    companion object {
        val inherit = RelativePosition("inherit")
        val initial = RelativePosition("initial")
        val unset = RelativePosition("unset")

        val left = RelativePosition("left")
        val center = RelativePosition("center")
        val right = RelativePosition("right")
        val top = RelativePosition("top")
        val bottom = RelativePosition("bottom")

        val leftTop = RelativePosition("left top")
        val leftCenter = RelativePosition("left center")
        val leftBottom = RelativePosition("left bottom")

        val centerTop = RelativePosition("center top")
        val centerCenter = RelativePosition("center center")
        val centerBottom = RelativePosition("center bottom")

        val rightTop = RelativePosition("right top")
        val rightCenter = RelativePosition("right center")
        val rightBottom = RelativePosition("right bottom")

        fun offset(xOffset: LinearDimension, yOffset: LinearDimension? = null): RelativePosition {
            return if (yOffset != null) {
                RelativePosition("${xOffset.value} ${yOffset.value}")
            } else {
                RelativePosition(xOffset.value)
            }
        }

        fun left(xOffset: LinearDimension): RelativePosition {
            return RelativePosition("left ${xOffset.value}")
        }

        fun right(xOffset: LinearDimension): RelativePosition {
            return RelativePosition("right ${xOffset.value}")
        }

        fun top(yOffset: LinearDimension): RelativePosition {
            return RelativePosition("top ${yOffset.value}")
        }

        fun bottom(yOffset: LinearDimension): RelativePosition {
            return RelativePosition("bottom ${yOffset.value}")
        }

        fun leftTop(xOffset: LinearDimension, yOffset: LinearDimension): RelativePosition {
            return RelativePosition("left ${xOffset.value} top ${yOffset.value}")
        }

        fun leftBottom(xOffset: LinearDimension, yOffset: LinearDimension): RelativePosition {
            return RelativePosition("left ${xOffset.value} bottom ${yOffset.value}")
        }

        fun rightTop(xOffset: LinearDimension, yOffset: LinearDimension): RelativePosition {
            return RelativePosition("right ${xOffset.value} top ${yOffset.value}")
        }

        fun rightBottom(xOffset: LinearDimension, yOffset: LinearDimension): RelativePosition {
            return RelativePosition("right ${xOffset.value} bottom ${yOffset.value}")
        }
    }
}
