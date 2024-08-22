@file:Suppress("EnumEntryName")

package kotlinx.css

abstract class CssValue(open val value: String) {
    override fun toString() = value
}

enum class Align {
    inherit, initial, revert, revertLayer, unset,

    auto, stretch, center, start, end, selfStart, selfEnd, flexStart, flexEnd, baseline;

    override fun toString() = name.hyphenize()
}

enum class Appearance {
    inherit, initial, revert, revertLayer, unset,

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
    inherit, initial, revert, revertLayer, unset,

    scroll, fixed, local;

    override fun toString() = name.hyphenize()
}

enum class BackgroundClip {
    inherit, initial, revert, revertLayer, unset,

    borderBox, paddingBox, contentBox, text;

    override fun toString() = name.hyphenize()
}

enum class BackgroundOrigin {
    inherit, initial, revert, revertLayer, unset,

    borderBox, paddingBox, contentBox;

    override fun toString() = name.hyphenize()
}

enum class BackgroundRepeat {
    inherit, initial, revert, revertLayer, unset,

    repeatX, repeatY, repeat, noRepeat;

    override fun toString() = name.hyphenize()
}

enum class BorderCollapse {
    inherit, initial, revert, revertLayer, unset,

    separate, collapse;

    override fun toString() = name.hyphenize()
}

enum class BorderStyle {
    inherit, initial, revert, revertLayer, unset,

    none, dotted, dashed, solid;

    override fun toString() = name.hyphenize()
}

enum class BoxSizing {
    inherit, initial, revert, revertLayer, unset,

    contentBox, borderBox;

    override fun toString() = name.hyphenize()
}

enum class BreakInside {
    inherit, initial, revert, revertLayer, unset,

    auto, avoid, avoidPage, avoidColumn, avoidRegion;

    override fun toString() = name.hyphenize()
}

enum class Clear {
    inherit, initial, revert, revertLayer, unset,

    none, left, right, both;

    override fun toString() = name.hyphenize()
}

enum class Contain {
    inherit, initial, revert, revertLayer, unset,

    none, strict, content, size, layout, style, paint;

    override fun toString() = name.hyphenize()
}

data class ContainerName(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(vararg value: String) : this(value.joinToString(" "))

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")
    }
}

enum class ContainerType {
    inherit, initial, revert, revertLayer, unset,

    normal, size, inlineSize;

    override fun toString() = name.hyphenize()
}

enum class Cursor {
    inherit, initial, revert, revertLayer, unset,

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
    inherit, initial, revert, revertLayer, unset,

    ltr, rtl;

    override fun toString() = name.hyphenize()
}

enum class Display {
    inherit, initial, revert, revertLayer, unset,

    block, `inline`, runIn,

    flow, flowRoot, table, flex, grid, subgrid,

    listItem,

    tableRowGroup, tableHeaderGroup, tableFooterGroup, tableRow, tableCell, tableColumnGroup, tableColumn, tableCaption,

    contents, none,

    inlineBlock, inlineListItem, inlineTable, inlineFlex, inlineGrid;

    override fun toString() = name.hyphenize()
}

data class FlexBasis(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
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
    inherit, initial, revert, revertLayer, unset,

    column, columnReverse, row, rowReverse;

    override fun toString() = name.hyphenize()
}

enum class FlexWrap {
    inherit, initial, revert, revertLayer, unset,

    nowrap, wrap, wrapReverse;

    override fun toString() = name.hyphenize()
}

enum class Float {
    inherit, initial, revert, revertLayer, unset,

    left, right, none;

    override fun toString() = name.hyphenize()
}

enum class FontStyle {
    inherit, initial, revert, revertLayer, unset,

    normal, italic;

    override fun toString() = name.hyphenize()
}

data class FontWeight(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FontWeight("inherit")
        val initial = FontWeight("initial")
        val revert = FontWeight("revert")
        val revertLayer = FontWeight("revert-layer")
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

data class GridArea(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridArea("auto")
    }
}

data class GridAutoColumns(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoColumns) : this(values.joinToString(" "))

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridAutoColumns("auto")
        val maxContent = GridAutoColumns("max-content")
        val minContent = GridAutoColumns("min-content")

        fun fitContent(argument: GridAutoColumns) = GridAutoColumns("minmax(auto, max(auto, $argument))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridAutoColumns("minmax($min, $max)")
        fun minMax(min: GridAutoColumns, max: GridAutoColumns) = GridAutoColumns("minmax($min, $max)")
    }
}

data class GridAutoFlow(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = GridAutoFlow("inherit")
        val initial = GridAutoFlow("initial")
        val revert = GridAutoFlow("revert")
        val revertLayer = GridAutoFlow("revert-layer")
        val unset = GridAutoFlow("unset")

        val column = GridAutoFlow("column")
        val columnDense = GridAutoFlow("column dense")
        val dense = GridAutoFlow("dense")
        val row = GridAutoFlow("row")
        val rowDense = GridAutoFlow("row dense")
    }
}

data class GridAutoRows(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridAutoRows("auto")
        val maxContent = GridAutoRows("max-content")
        val minContent = GridAutoRows("min-content")

        fun fitContent(argument: GridAutoRows) = GridAutoRows("minmax(auto, max(auto, $argument))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridAutoRows("minmax($min, $max)")
        fun minMax(min: GridAutoRows, max: GridAutoRows) = GridAutoRows("minmax($min, $max)")
    }
}

data class GridColumn(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridColumn("auto")
    }
}

data class GridColumnEnd(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(value: Int) : this(value.toString())

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridColumnEnd("auto")
    }
}

data class GridColumnStart(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(value: Int) : this(value.toString())

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridColumnStart("auto")
    }
}

data class GridRow(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridRow("auto")
    }
}

data class GridRowEnd(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(value: Int) : this(value.toString())

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridRowEnd("auto")
    }
}

data class GridRowStart(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(value: Int) : this(value.toString())

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridRowStart("auto")
    }
}

data class GridTemplate(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val none = GridTemplate("none")
    }
}

data class GridTemplateAreas(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val none = GridTemplateAreas("none")
    }
}

data class GridTemplateColumns(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridTemplateColumns("auto")
        val maxContent = GridTemplateColumns("max-content")
        val minContent = GridTemplateColumns("min-content")
        val none = GridTemplateColumns("none")

        val subgrid = GridTemplateColumns("subgrid")
        val masonry = GridTemplateColumns("masonry")

        fun fitContent(dim: LinearDimension) = GridTemplateColumns("min(max-content, max(auto, $dim))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridTemplateColumns("minmax($min, $max)")
        fun minMax(min: GridTemplateColumns, max: GridTemplateColumns) = GridTemplateColumns("minmax($min, $max)")
        fun repeat(argument: String) = GridTemplateColumns("repeat($argument)")
    }
}

data class GridTemplateRows(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(vararg dims: LinearDimension) : this(dims.joinToString(" "))

    constructor(vararg values: GridAutoRows) : this(values.joinToString(" "))

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val auto = GridTemplateRows("auto")
        val maxContent = GridTemplateRows("max-content")
        val minContent = GridTemplateRows("min-content")
        val none = GridTemplateRows("none")

        val subgrid = GridTemplateColumns("subgrid")
        val masonry = GridTemplateColumns("masonry")

        fun fitContent(dim: LinearDimension) = GridTemplateRows("min(max-content, max(auto, $dim))")
        fun minMax(min: LinearDimension, max: LinearDimension) = GridTemplateRows("minmax($min, $max)")
        fun minMax(min: GridTemplateRows, max: GridTemplateRows) = GridTemplateRows("minmax($min, $max)")
        fun repeat(argument: String) = GridTemplateRows("repeat($argument)")
    }
}

enum class Hyphens {
    inherit, initial, revert, revertLayer, unset,

    none, manual, auto;

    override fun toString() = name.hyphenize()
}

data class Image(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = FlexBasis("inherit")
        val initial = FlexBasis("initial")
        val revert = FlexBasis("revert")
        val revertLayer = FlexBasis("revert-layer")
        val unset = FlexBasis("unset")

        val none = Image("none")
    }
}

enum class Isolation {
    inherit, initial, revert, revertLayer, unset,

    auto, isolate;

    override fun toString() = name.hyphenize()
}

enum class JustifyContent {
    inherit, initial, revert, revertLayer, unset,

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
    inherit, initial, revert, revertLayer, unset,

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

enum class JustifySelf {
    inherit, initial, revert, revertLayer, unset,

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

enum class ListStylePosition {
    inherit, initial, revert, revertLayer, unset,

    inside, outside;

    override fun toString() = name.hyphenize()
}

enum class ListStyleType {
    inherit, initial, revert, revertLayer, unset,

    none, disc, circle, square, decimal;

    override fun toString() = name.hyphenize()
}

enum class ObjectFit {
    inherit, initial, revert, revertLayer, unset,

    contain, cover, fill, none, scaleDown;

    override fun toString() = name.hyphenize()
}

data class Order(override val value: String) : CssValue(value) {
    override fun toString() = value

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
    inherit, initial, revert, revertLayer, unset,

    none;

    override fun toString() = name.hyphenize()
}

enum class OutlineStyle {
    inherit, initial, revert, revertLayer, unset,

    auto, none, dotted, dashed, solid, double, groove, ridge, inset, outset;

    override fun toString() = name.hyphenize()
}

enum class Overflow {
    inherit, initial, revert, revertLayer, unset,

    visible, hidden, scroll, auto;

    override fun toString() = name.hyphenize()
}

enum class OverflowAnchor {
    inherit, initial, revert, revertLayer, unset,

    auto, none;

    override fun toString() = name.hyphenize()
}

enum class OverflowWrap {
    inherit, initial, revert, revertLayer, unset,

    normal, anywhere, breakWord;

    override fun toString() = name.hyphenize()
}

enum class OverscrollBehavior {
    inherit, initial, revert, revertLayer, unset,

    auto, contain, none;

    override fun toString() = name.hyphenize()
}

enum class PointerEvents {
    inherit, initial, revert, revertLayer, unset,

    auto, none;

    override fun toString() = name.hyphenize()
}

enum class Position {
    inherit, initial, revert, revertLayer, unset,

    static, relative, absolute, fixed, sticky;

    override fun toString() = name.hyphenize()
}

enum class Resize {
    inherit, initial, revert, revertLayer, unset,

    none, both,

    horizontal, vertical,

    block, inline;

    override fun toString() = name.hyphenize()
}

enum class ScrollBehavior {
    inherit, initial, revert, revertLayer, unset,

    auto, smooth;

    override fun toString() = name.hyphenize()
}

enum class TableLayout {
    inherit, initial, revert, revertLayer, unset,

    auto, fixed;

    override fun toString() = name.hyphenize()
}

enum class TextAlign {
    inherit, initial, revert, revertLayer, unset,

    left, right, center, justify, justifyAll, start, end, matchParent;

    override fun toString() = name.hyphenize()
}

enum class TextOverflow {
    inherit, initial, revert, revertLayer, unset,

    clip, ellipsis;

    override fun toString() = name.hyphenize()
}

enum class TextTransform {
    inherit, initial, revert, revertLayer, unset,

    capitalize, uppercase, lowercase, none, fullWidth;

    override fun toString() = name.hyphenize()
}

enum class TextWrap {
    inherit, initial, revert, revertLayer, unset,

    wrap, nowrap, balance, pretty;

    override fun toString() = name.hyphenize()
}

enum class TouchAction {
    inherit, initial, revert, revertLayer, unset,

    auto, none, panX, panLeft, panRight, panY, panUp, panDown, pinchZoom, manipulation;

    override fun toString() = name.hyphenize()
}

enum class UserSelect {
    inherit, initial, revert, revertLayer, unset,

    none, auto, text, contain, all;

    override fun toString() = name.hyphenize()
}

data class VerticalAlign(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = VerticalAlign("inherit")
        val initial = VerticalAlign("initial")
        val revert = VerticalAlign("revert")
        val revertLayer = VerticalAlign("revert-layer")
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
    inherit, initial, revert, revertLayer, unset,

    visible, hidden, collapse;

    override fun toString() = name.hyphenize()
}

enum class WhiteSpace {
    inherit, initial, revert, revertLayer, unset,

    normal, nowrap, pre, preWrap, preLine;

    override fun toString() = name.hyphenize()
}

enum class WordBreak {
    inherit, initial, revert, revertLayer, unset,

    normal, breakAll, breakWord, keepAll;

    override fun toString() = name.hyphenize()
}

enum class WordWrap {
    inherit, initial, revert, revertLayer, unset,

    normal, breakWord;

    override fun toString() = name.hyphenize()
}

// Enquotes the value
data class QuotedString(override val value: String) : CssValue(value) {
    override fun toString(): String = "'$value'"
}

val String.quoted get() = QuotedString(this)

data class RelativePosition(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val inherit = RelativePosition("inherit")
        val initial = RelativePosition("initial")
        val revert = RelativePosition("revert")
        val revertLayer = RelativePosition("revert-layer")
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
