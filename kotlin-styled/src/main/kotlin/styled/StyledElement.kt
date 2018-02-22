@file:Suppress("unused")

package styled

import kotlinext.js.*
import styled.properties.*
import kotlin.reflect.*

open class StyledElement {
    val declarations = HashMap<String, Any>()

    inner class WithDefault<T : Any>(val default: () -> T) {
        operator fun getValue(thisRef: Any, property: KProperty<*>): T {
            val ex = declarations.containsKey(property.name)
            if (!ex) {
                declarations[property.name] = default()
            }
            return declarations[property.name] as T
        }

        operator fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
            declarations[property.name] = value
        }
    }

    var alignContent: Align by declarations
    var alignItems: Align by declarations
    var alignSelf: Align by declarations
    var animation by WithDefault { Animations() }

    var background: String by declarations
    var backgroundAttachment: BackgroundAttachment by declarations
    var backgroundColor: Color by declarations
    var backgroundImage: Image by declarations
    var backgroundPosition: String by declarations
    var backgroundRepeat: BackgroundRepeat by declarations
    var backgroundSize: String by declarations

    var border: String by declarations
    var borderTop: String by declarations
    var borderRight: String by declarations
    var borderBottom: String by declarations
    var borderLeft: String by declarations
    var borderSpacing: LinearDimension by declarations

    var borderRadius: LinearDimension by declarations
    var borderTopLeftRadius: LinearDimension by declarations
    var borderTopRightRadius: LinearDimension by declarations
    var borderBottomLeftRadius: LinearDimension by declarations
    var borderBottomRightRadius: LinearDimension by declarations

    var borderStyle: BorderStyle by declarations
    var borderTopStyle: BorderStyle by declarations
    var borderRightStyle: BorderStyle by declarations
    var borderBottomStyle: BorderStyle by declarations
    var borderLeftStyle: BorderStyle by declarations

    var borderWidth: LinearDimension by declarations
    var borderTopWidth: LinearDimension by declarations
    var borderRightWidth: LinearDimension by declarations
    var borderBottomWidth: LinearDimension by declarations
    var borderLeftWidth: LinearDimension by declarations

    var borderColor: Color by declarations
    var borderTopColor: Color by declarations
    var borderRightColor: Color by declarations
    var borderBottomColor: Color by declarations
    var borderLeftColor: Color by declarations

    var bottom: LinearDimension by declarations
    var boxSizing: BoxSizing by declarations
    var boxShadow by WithDefault { BoxShadows() }

    var clear: Clear by declarations
    var color: Color by declarations
    var content: QuotedString by declarations
    var cursor: Cursor by declarations

    var direction: Direction by declarations
    var display: Display by declarations

    var filter: String by declarations
    var flexDirection: FlexDirection by declarations
    var flexGrow: Double by declarations
    var flexShrink: Double by declarations
    var flexBasis: FlexBasis by declarations
    var flexWrap: FlexWrap by declarations
    var float: Float by declarations
    var fontFamily: String by declarations
    var fontSize: LinearDimension by declarations
    var fontWeight: FontWeight by declarations
    var fontStyle: FontStyle by declarations

    var height: LinearDimension by declarations

    var hyphens: Hyphens by declarations

    var justifyContent: JustifyContent by declarations

    var left: LinearDimension by declarations
    var letterSpacing: LinearDimension by declarations
    var lineHeight: LineHeight by declarations
    var listStyleType: ListStyleType by declarations

    var margin: String by declarations
    var marginTop: LinearDimension by declarations
    var marginRight: LinearDimension by declarations
    var marginBottom: LinearDimension by declarations
    var marginLeft: LinearDimension by declarations
    var minWidth: LinearDimension by declarations
    var maxWidth: LinearDimension by declarations
    var minHeight: LinearDimension by declarations
    var maxHeight: LinearDimension by declarations

    var opacity: Number by declarations
    var outline: Outline by declarations
    var overflow: Overflow by declarations
    var overflowX: Overflow by declarations
    var overflowY: Overflow by declarations
    var overflowWrap: OverflowWrap by declarations

    var padding: String by declarations
    var paddingTop: LinearDimension by declarations
    var paddingRight: LinearDimension by declarations
    var paddingBottom: LinearDimension by declarations
    var paddingLeft: LinearDimension by declarations
    var pointerEvents: PointerEvents by declarations
    var position: Position by declarations

    var right: LinearDimension by declarations

    var scrollBehavior: ScrollBehavior by declarations

    var textAlign: TextAlign by declarations
    var textDecoration: TextDecoration by declarations
    var textOverflow: TextOverflow by declarations
    var textTransform: TextTransform by declarations
    var top: LinearDimension by declarations
    var transform by WithDefault { Transforms() }
    var transition by WithDefault { Transitions() }

    var verticalAlign: VerticalAlign by declarations
    var visibility: Visibility by declarations

    var whiteSpace: WhiteSpace by declarations
    var width: LinearDimension by declarations
    var wordBreak: WordBreak by declarations
    var wordWrap: WordWrap by declarations

    var userSelect: UserSelect by declarations

    var tableLayout: TableLayout by declarations
    var borderCollapse: BorderCollapse by declarations

    var zIndex: Int by declarations

    fun put(key: String, value: String) {
        declarations[key] = value
    }
}

fun StyledElement.flex(flexGrow: Double = 0.0, flexShrink: Double = 0.0, flexBasis: FlexBasis? = null) {
    this.flexGrow = flexGrow
    this.flexShrink = flexShrink
    flexBasis?.let { this.flexBasis = it }
}

fun StyledElement.flex(flexGrow: Double = 0.0, flexShrink: Double = 0.0, flexBasis: LinearDimension) =
    flex(flexGrow, flexShrink, flexBasis.basis)

fun StyledElement.grow(grow: Grow) {
    when (grow) {
        Grow.GROW -> flex(1.0, 0.0)
        Grow.SHRINK -> flex(0.0, 1.0)
        Grow.NONE -> flex(0.0, 0.0)
        Grow.GROW_SHRINK -> flex(1.0, 1.0)
    }
    fun put(key: String, value: String) {
        declarations[key] = value
    }
}

private fun getShorthandValue(top: LinearDimension?,
                              right: LinearDimension?,
                              bottom: LinearDimension?,
                              left: LinearDimension?): String {
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

fun StyledElement.margin(top: LinearDimension? = null,
                         right: LinearDimension? = null,
                         bottom: LinearDimension? = null,
                         left: LinearDimension? = null) {
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

fun StyledElement.margin(top: LinearDimension, right: LinearDimension, bottom: LinearDimension) =
    margin(top, right, bottom, right)

fun StyledElement.padding(top: LinearDimension? = null,
                          right: LinearDimension? = null,
                          bottom: LinearDimension? = null,
                          left: LinearDimension? = null) {
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

fun StyledElement.padding(top: LinearDimension, right: LinearDimension, bottom: LinearDimension) =
    padding(top, right, bottom, right)

