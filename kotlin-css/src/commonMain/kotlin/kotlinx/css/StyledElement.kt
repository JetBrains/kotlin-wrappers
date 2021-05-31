@file:Suppress("unused")

package kotlinx.css

import kotlinx.css.properties.*
import kotlin.reflect.*

open class StyledElement {
    val declarations = LinkedHashMap<String, Any>()

    fun put(key: String, value: String) {
        declarations[key] = value
    }
}

private class CSSProperty<T>(private val default: (() -> T)? = null) {
    operator fun getValue(thisRef: StyledElement, property: KProperty<*>): T {
        default?.let { default ->
            if (!thisRef.declarations.containsKey(property.name)) {
                thisRef.declarations[property.name] = default() as Any
            }
        }

        @Suppress("UNCHECKED_CAST")
        return thisRef.declarations[property.name] as T
    }

    operator fun setValue(thisRef: StyledElement, property: KProperty<*>, value: T) {
        thisRef.declarations[property.name] = value as Any
    }
}

var StyledElement.alignContent: Align by CSSProperty()
var StyledElement.alignItems: Align by CSSProperty()
var StyledElement.alignSelf: Align by CSSProperty()
var StyledElement.animation by CSSProperty { Animations() }
var StyledElement.appearance: Appearance by CSSProperty()

var StyledElement.background: String by CSSProperty()
var StyledElement.backgroundAttachment: BackgroundAttachment by CSSProperty()
var StyledElement.backgroundClip: BackgroundClip by CSSProperty()
var StyledElement.backgroundColor: Color by CSSProperty()
var StyledElement.backgroundImage: Image by CSSProperty()
var StyledElement.backgroundOrigin: BackgroundOrigin by CSSProperty()
var StyledElement.backgroundPosition: String by CSSProperty()
var StyledElement.backgroundRepeat: BackgroundRepeat by CSSProperty()
var StyledElement.backgroundSize: String by CSSProperty()

var StyledElement.border: String by CSSProperty()
var StyledElement.borderTop: String by CSSProperty()
var StyledElement.borderRight: String by CSSProperty()
var StyledElement.borderBottom: String by CSSProperty()
var StyledElement.borderLeft: String by CSSProperty()
var StyledElement.borderSpacing: LinearDimension by CSSProperty()

var StyledElement.borderRadius: LinearDimension by CSSProperty()
var StyledElement.borderTopLeftRadius: LinearDimension by CSSProperty()
var StyledElement.borderTopRightRadius: LinearDimension by CSSProperty()
var StyledElement.borderBottomLeftRadius: LinearDimension by CSSProperty()
var StyledElement.borderBottomRightRadius: LinearDimension by CSSProperty()

var StyledElement.borderStyle: BorderStyle by CSSProperty()
var StyledElement.borderTopStyle: BorderStyle by CSSProperty()
var StyledElement.borderRightStyle: BorderStyle by CSSProperty()
var StyledElement.borderBottomStyle: BorderStyle by CSSProperty()
var StyledElement.borderLeftStyle: BorderStyle by CSSProperty()

var StyledElement.borderWidth: LinearDimension by CSSProperty()
var StyledElement.borderTopWidth: LinearDimension by CSSProperty()
var StyledElement.borderRightWidth: LinearDimension by CSSProperty()
var StyledElement.borderBottomWidth: LinearDimension by CSSProperty()
var StyledElement.borderLeftWidth: LinearDimension by CSSProperty()

var StyledElement.borderColor: Color by CSSProperty()
var StyledElement.borderTopColor: Color by CSSProperty()
var StyledElement.borderRightColor: Color by CSSProperty()
var StyledElement.borderBottomColor: Color by CSSProperty()
var StyledElement.borderLeftColor: Color by CSSProperty()

var StyledElement.bottom: LinearDimension by CSSProperty()
var StyledElement.boxSizing: BoxSizing by CSSProperty()
var StyledElement.boxShadow by CSSProperty { BoxShadows() }

var StyledElement.clear: Clear by CSSProperty()
var StyledElement.color: Color by CSSProperty()
var StyledElement.columnGap: LinearDimension by CSSProperty()
var StyledElement.contain: Contain by CSSProperty()
var StyledElement.content: QuotedString by CSSProperty()
var StyledElement.cursor: Cursor by CSSProperty()

var StyledElement.direction: Direction by CSSProperty()
var StyledElement.display: Display by CSSProperty()

var StyledElement.filter: String by CSSProperty()
var StyledElement.flexDirection: FlexDirection by CSSProperty()
var StyledElement.flexGrow: Double by CSSProperty()
var StyledElement.flexShrink: Double by CSSProperty()
var StyledElement.flexBasis: FlexBasis by CSSProperty()
var StyledElement.flexWrap: FlexWrap by CSSProperty()
var StyledElement.float: Float by CSSProperty()
var StyledElement.fontFamily: String by CSSProperty()
var StyledElement.fontSize: LinearDimension by CSSProperty()
var StyledElement.fontWeight: FontWeight by CSSProperty()
var StyledElement.fontStyle: FontStyle by CSSProperty()

var StyledElement.gap: LinearDimension by CSSProperty()
var StyledElement.gridAutoColumns: GridAutoColumns by CSSProperty()
var StyledElement.gridAutoFlow: GridAutoFlow by CSSProperty()
var StyledElement.gridAutoRows: GridAutoRows by CSSProperty()
var StyledElement.gridColumn: GridColumn by CSSProperty()
var StyledElement.gridColumnEnd: GridColumnEnd by CSSProperty()
var StyledElement.gridColumnStart: GridColumnStart by CSSProperty()
var StyledElement.gridRow: GridRow by CSSProperty()
var StyledElement.gridRowEnd: GridRowEnd by CSSProperty()
var StyledElement.gridRowStart: GridRowStart by CSSProperty()
var StyledElement.gridTemplate: GridTemplate by CSSProperty()
var StyledElement.gridTemplateAreas: GridTemplateAreas by CSSProperty()
var StyledElement.gridTemplateColumns: GridTemplateColumns by CSSProperty()
var StyledElement.gridTemplateRows: GridTemplateRows by CSSProperty()

var StyledElement.height: LinearDimension by CSSProperty()

var StyledElement.hyphens: Hyphens by CSSProperty()

var StyledElement.justifyContent: JustifyContent by CSSProperty()
var StyledElement.justifyItems: JustifyItems by CSSProperty()

var StyledElement.left: LinearDimension by CSSProperty()
var StyledElement.letterSpacing: LinearDimension by CSSProperty()
var StyledElement.lineHeight: LineHeight by CSSProperty()
var StyledElement.listStyleType: ListStyleType by CSSProperty()

var StyledElement.margin: String by CSSProperty()
var StyledElement.marginTop: LinearDimension by CSSProperty()
var StyledElement.marginRight: LinearDimension by CSSProperty()
var StyledElement.marginBottom: LinearDimension by CSSProperty()
var StyledElement.marginLeft: LinearDimension by CSSProperty()
var StyledElement.minWidth: LinearDimension by CSSProperty()
var StyledElement.maxWidth: LinearDimension by CSSProperty()
var StyledElement.minHeight: LinearDimension by CSSProperty()
var StyledElement.maxHeight: LinearDimension by CSSProperty()

var StyledElement.objectFit: ObjectFit by CSSProperty()
var StyledElement.objectPosition: String by CSSProperty()
var StyledElement.opacity: Number by CSSProperty()
var StyledElement.outline: Outline by CSSProperty()
var StyledElement.outlineColor: Color by CSSProperty()
var StyledElement.outlineOffset: LinearDimension by CSSProperty()
var StyledElement.outlineWidth: LinearDimension by CSSProperty()
var StyledElement.overflow: Overflow by CSSProperty()
var StyledElement.overflowX: Overflow by CSSProperty()
var StyledElement.overflowY: Overflow by CSSProperty()
var StyledElement.overflowWrap: OverflowWrap by CSSProperty()
var StyledElement.overscrollBehavior: OverscrollBehavior by CSSProperty()

var StyledElement.padding: String by CSSProperty()
var StyledElement.paddingTop: LinearDimension by CSSProperty()
var StyledElement.paddingRight: LinearDimension by CSSProperty()
var StyledElement.paddingBottom: LinearDimension by CSSProperty()
var StyledElement.paddingLeft: LinearDimension by CSSProperty()
var StyledElement.pointerEvents: PointerEvents by CSSProperty()
var StyledElement.position: Position by CSSProperty()

var StyledElement.right: LinearDimension by CSSProperty()
var StyledElement.rowGap: LinearDimension by CSSProperty()

var StyledElement.scrollBehavior: ScrollBehavior by CSSProperty()

var StyledElement.textAlign: TextAlign by CSSProperty()
var StyledElement.textDecoration: TextDecoration by CSSProperty()
var StyledElement.textOverflow: TextOverflow by CSSProperty()
var StyledElement.textTransform: TextTransform by CSSProperty()
var StyledElement.top: LinearDimension by CSSProperty()
var StyledElement.transform by CSSProperty { Transforms() }
var StyledElement.transition by CSSProperty { Transitions() }

var StyledElement.verticalAlign: VerticalAlign by CSSProperty()
var StyledElement.visibility: Visibility by CSSProperty()

var StyledElement.whiteSpace: WhiteSpace by CSSProperty()
var StyledElement.width: LinearDimension by CSSProperty()
var StyledElement.wordBreak: WordBreak by CSSProperty()
var StyledElement.wordWrap: WordWrap by CSSProperty()

var StyledElement.userSelect: UserSelect by CSSProperty()

var StyledElement.tableLayout: TableLayout by CSSProperty()
var StyledElement.borderCollapse: BorderCollapse by CSSProperty()

var StyledElement.zIndex: Int by CSSProperty()

var StyledElement.resize: Resize by CSSProperty()

fun StyledElement.flex(flexGrow: Double = 0.0, flexShrink: Double = 1.0, flexBasis: FlexBasis = FlexBasis.auto) {
    put("flex", "$flexGrow $flexShrink $flexBasis")
}

fun StyledElement.flex(flexGrow: Double = 0.0, flexShrink: Double = 1.0, flexBasis: LinearDimension) =
    flex(flexGrow, flexShrink, flexBasis.basis)

fun StyledElement.grow(grow: Grow) {
    when (grow) {
        Grow.GROW -> flex(1.0, 0.0)
        Grow.SHRINK -> flex(0.0, 1.0)
        Grow.NONE -> flex(0.0, 0.0)
        Grow.GROW_SHRINK -> flex(1.0, 1.0)
    }
}

private fun getShorthandValue(
    top: LinearDimension?,
    right: LinearDimension?,
    bottom: LinearDimension?,
    left: LinearDimension?
): String {
    return if (top == bottom && right == left) {
        if (top == right) {
            "$top"
        } else {
            "$top $right"
        }
    } else {
        if (right == left) {
            "$top $right $bottom"
        } else {
            "$top $right $bottom $left"
        }
    }
}

fun StyledElement.margin(
    top: LinearDimension? = null,
    right: LinearDimension? = null,
    bottom: LinearDimension? = null,
    left: LinearDimension? = null
) {
    if (top != null && right != null && bottom != null && left != null) {
        margin = getShorthandValue(top, right, bottom, left)
    } else {
        top?.let { this.marginTop = it }
        right?.let { this.marginRight = it }
        bottom?.let { this.marginBottom = it }
        left?.let { this.marginLeft = it }
    }
}

fun StyledElement.margin(all: LinearDimension?) = margin(all, all, all, all)

fun StyledElement.margin(vertical: LinearDimension? = null, horizontal: LinearDimension? = null) =
    margin(vertical, horizontal, vertical, horizontal)

fun StyledElement.margin(top: LinearDimension, horizontal: LinearDimension, bottom: LinearDimension) =
    margin(top, horizontal, bottom, horizontal)

fun StyledElement.padding(
    top: LinearDimension? = null,
    right: LinearDimension? = null,
    bottom: LinearDimension? = null,
    left: LinearDimension? = null
) {
    if (top != null && right != null && bottom != null && left != null) {
        padding = getShorthandValue(top, right, bottom, left)
    } else {
        top?.let { this.paddingTop = it }
        right?.let { this.paddingRight = it }
        bottom?.let { this.paddingBottom = it }
        left?.let { this.paddingLeft = it }
    }
}

fun StyledElement.padding(all: LinearDimension?) = padding(all, all, all, all)

fun StyledElement.padding(vertical: LinearDimension? = null, horizontal: LinearDimension? = null) =
    padding(vertical, horizontal, vertical, horizontal)

fun StyledElement.padding(top: LinearDimension, horizontal: LinearDimension, bottom: LinearDimension) =
    padding(top, horizontal, bottom, horizontal)
