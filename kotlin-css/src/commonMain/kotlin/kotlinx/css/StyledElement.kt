@file:Suppress("unused")

package kotlinx.css

import kotlinx.css.properties.*
import kotlin.js.JsName
import kotlin.reflect.KProperty

class CssDeclarations : MutableMap<String, Any> by LinkedHashMap() {
    private var stringDecl: String? = null
        get() = field ?: buildString {
            this@CssDeclarations.forEach { (k, v) ->
                append("${k.hyphenize()}: ${v};\n")
            }
        }.also { field = it }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as CssDeclarations

        return hashCode() == other.hashCode()
                && stringDecl == other.stringDecl
    }

    override fun hashCode(): Int {
        return stringDecl.hashCode()
    }

    override fun toString(): String {
        return stringDecl!!
    }

    operator fun set(name: String, value: Any) {
        put(name, value)
        stringDecl = null
    }
}


interface StyledElement {
    val declarations: CssDeclarations

    fun put(key: String, value: String) {
        declarations[key] = value
    }
}

@JsName("StyledElement_create")
fun StyledElement(): StyledElement {
    return StyledElementImpl()
}

class StyledElementImpl : StyledElement {
    override val declarations = CssDeclarations()
}

private class CssProperty<T>(private val default: (() -> T)? = null) {
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

var StyledElement.alignContent: Align by CssProperty()
var StyledElement.alignItems: Align by CssProperty()
var StyledElement.alignSelf: Align by CssProperty()
var StyledElement.animation by CssProperty { Animations() }
var StyledElement.appearance: Appearance by CssProperty()

var StyledElement.background: String by CssProperty()
var StyledElement.backgroundAttachment: BackgroundAttachment by CssProperty()
var StyledElement.backgroundClip: BackgroundClip by CssProperty()
var StyledElement.backgroundColor: Color by CssProperty()
var StyledElement.backgroundImage: Image by CssProperty()
var StyledElement.backgroundOrigin: BackgroundOrigin by CssProperty()
var StyledElement.backgroundPosition: String by CssProperty()
var StyledElement.backgroundRepeat: BackgroundRepeat by CssProperty()
var StyledElement.backgroundSize: String by CssProperty()

var StyledElement.border: String by CssProperty()
var StyledElement.borderTop: String by CssProperty()
var StyledElement.borderRight: String by CssProperty()
var StyledElement.borderBottom: String by CssProperty()
var StyledElement.borderLeft: String by CssProperty()
var StyledElement.borderSpacing: LinearDimension by CssProperty()

var StyledElement.borderRadius: LinearDimension by CssProperty()
var StyledElement.borderTopLeftRadius: LinearDimension by CssProperty()
var StyledElement.borderTopRightRadius: LinearDimension by CssProperty()
var StyledElement.borderBottomLeftRadius: LinearDimension by CssProperty()
var StyledElement.borderBottomRightRadius: LinearDimension by CssProperty()

var StyledElement.borderStyle: BorderStyle by CssProperty()
var StyledElement.borderTopStyle: BorderStyle by CssProperty()
var StyledElement.borderRightStyle: BorderStyle by CssProperty()
var StyledElement.borderBottomStyle: BorderStyle by CssProperty()
var StyledElement.borderLeftStyle: BorderStyle by CssProperty()

var StyledElement.borderWidth: LinearDimension by CssProperty()
var StyledElement.borderTopWidth: LinearDimension by CssProperty()
var StyledElement.borderRightWidth: LinearDimension by CssProperty()
var StyledElement.borderBottomWidth: LinearDimension by CssProperty()
var StyledElement.borderLeftWidth: LinearDimension by CssProperty()

var StyledElement.borderColor: Color by CssProperty()
var StyledElement.borderTopColor: Color by CssProperty()
var StyledElement.borderRightColor: Color by CssProperty()
var StyledElement.borderBottomColor: Color by CssProperty()
var StyledElement.borderLeftColor: Color by CssProperty()

var StyledElement.bottom: LinearDimension by CssProperty()
var StyledElement.boxSizing: BoxSizing by CssProperty()
var StyledElement.boxShadow by CssProperty { BoxShadows() }

var StyledElement.clear: Clear by CssProperty()
var StyledElement.color: Color by CssProperty()
var StyledElement.columnGap: LinearDimension by CssProperty()
var StyledElement.contain: Contain by CssProperty()
var StyledElement.content: QuotedString by CssProperty()
var StyledElement.cursor: Cursor by CssProperty()

var StyledElement.direction: Direction by CssProperty()
var StyledElement.display: Display by CssProperty()

var StyledElement.filter: String by CssProperty()
var StyledElement.flexDirection: FlexDirection by CssProperty()
var StyledElement.flexGrow: Double by CssProperty()
var StyledElement.flexShrink: Double by CssProperty()
var StyledElement.flexBasis: FlexBasis by CssProperty()
var StyledElement.flexWrap: FlexWrap by CssProperty()
var StyledElement.float: Float by CssProperty()
var StyledElement.fontFamily: String by CssProperty()
var StyledElement.fontSize: LinearDimension by CssProperty()
var StyledElement.fontWeight: FontWeight by CssProperty()
var StyledElement.fontStyle: FontStyle by CssProperty()

var StyledElement.gap: LinearDimension by CssProperty()
var StyledElement.gridAutoColumns: GridAutoColumns by CssProperty()
var StyledElement.gridAutoFlow: GridAutoFlow by CssProperty()
var StyledElement.gridAutoRows: GridAutoRows by CssProperty()
var StyledElement.gridColumn: GridColumn by CssProperty()
var StyledElement.gridColumnEnd: GridColumnEnd by CssProperty()
var StyledElement.gridColumnStart: GridColumnStart by CssProperty()
var StyledElement.gridRow: GridRow by CssProperty()
var StyledElement.gridRowEnd: GridRowEnd by CssProperty()
var StyledElement.gridRowStart: GridRowStart by CssProperty()
var StyledElement.gridTemplate: GridTemplate by CssProperty()
var StyledElement.gridTemplateAreas: GridTemplateAreas by CssProperty()
var StyledElement.gridTemplateColumns: GridTemplateColumns by CssProperty()
var StyledElement.gridTemplateRows: GridTemplateRows by CssProperty()

var StyledElement.height: LinearDimension by CssProperty()

var StyledElement.hyphens: Hyphens by CssProperty()

var StyledElement.isolation: Isolation by CssProperty()

var StyledElement.justifyContent: JustifyContent by CssProperty()
var StyledElement.justifyItems: JustifyItems by CssProperty()

var StyledElement.left: LinearDimension by CssProperty()
var StyledElement.letterSpacing: LinearDimension by CssProperty()
var StyledElement.lineHeight: LineHeight by CssProperty()
var StyledElement.listStyleType: ListStyleType by CssProperty()

var StyledElement.margin: String by CssProperty()
var StyledElement.marginTop: LinearDimension by CssProperty()
var StyledElement.marginRight: LinearDimension by CssProperty()
var StyledElement.marginBottom: LinearDimension by CssProperty()
var StyledElement.marginLeft: LinearDimension by CssProperty()
var StyledElement.minWidth: LinearDimension by CssProperty()
var StyledElement.maxWidth: LinearDimension by CssProperty()
var StyledElement.minHeight: LinearDimension by CssProperty()
var StyledElement.maxHeight: LinearDimension by CssProperty()

var StyledElement.objectFit: ObjectFit by CssProperty()
var StyledElement.objectPosition: String by CssProperty()
var StyledElement.opacity: Number by CssProperty()
var StyledElement.outline: Outline by CssProperty()
var StyledElement.outlineColor: Color by CssProperty()
var StyledElement.outlineOffset: LinearDimension by CssProperty()
var StyledElement.outlineWidth: LinearDimension by CssProperty()
var StyledElement.overflow: Overflow by CssProperty()
var StyledElement.overflowX: Overflow by CssProperty()
var StyledElement.overflowY: Overflow by CssProperty()
var StyledElement.overflowWrap: OverflowWrap by CssProperty()
var StyledElement.overscrollBehavior: OverscrollBehavior by CssProperty()

var StyledElement.padding: String by CssProperty()
var StyledElement.paddingTop: LinearDimension by CssProperty()
var StyledElement.paddingRight: LinearDimension by CssProperty()
var StyledElement.paddingBottom: LinearDimension by CssProperty()
var StyledElement.paddingLeft: LinearDimension by CssProperty()
var StyledElement.pointerEvents: PointerEvents by CssProperty()
var StyledElement.position: Position by CssProperty()

var StyledElement.right: LinearDimension by CssProperty()
var StyledElement.rowGap: LinearDimension by CssProperty()

var StyledElement.scrollBehavior: ScrollBehavior by CssProperty()

var StyledElement.textAlign: TextAlign by CssProperty()
var StyledElement.textDecoration: TextDecoration by CssProperty()
var StyledElement.textOverflow: TextOverflow by CssProperty()
var StyledElement.textTransform: TextTransform by CssProperty()
var StyledElement.top: LinearDimension by CssProperty()
var StyledElement.transform by CssProperty { Transforms() }
var StyledElement.transition by CssProperty { Transitions() }

var StyledElement.verticalAlign: VerticalAlign by CssProperty()
var StyledElement.visibility: Visibility by CssProperty()

var StyledElement.whiteSpace: WhiteSpace by CssProperty()
var StyledElement.width: LinearDimension by CssProperty()
var StyledElement.wordBreak: WordBreak by CssProperty()
var StyledElement.wordWrap: WordWrap by CssProperty()

var StyledElement.userSelect: UserSelect by CssProperty()

var StyledElement.tableLayout: TableLayout by CssProperty()
var StyledElement.borderCollapse: BorderCollapse by CssProperty()

var StyledElement.zIndex: Int by CssProperty()

var StyledElement.resize: Resize by CssProperty()

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
    left: LinearDimension?,
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
    left: LinearDimension? = null,
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
    left: LinearDimension? = null,
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

fun StyledElement.backgroundPosition(position: RelativePosition) {
    backgroundPosition = position.value
}
