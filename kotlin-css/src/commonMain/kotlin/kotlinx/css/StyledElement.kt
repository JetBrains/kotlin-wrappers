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

    override fun equals(other: Any?) = this.calculateEquals(other) { otherDecls ->
        stringDecl == otherDecls.stringDecl
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

typealias StyledElementBuilder = StyledElement.() -> Unit

@JsName("StyledElement_create")
fun StyledElement(): StyledElement {
    return StyledElementImpl()
}

class StyledElementImpl : StyledElement {
    override val declarations = CssDeclarations()
}

class CssProperty<T>(private val default: (() -> T)? = null) {
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

@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.alignContent: Align by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.alignItems: Align by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.alignSelf: Align by CssProperty()
var StyledElement.animation by CssProperty { Animations() }
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationDelay: Time by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationDirection: AnimationDirection by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationDuration: Time by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationFillMode: FillMode by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationIterationCount: Number by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationName: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationPlayState: PlayState by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.animationTimingFunction: Timing by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.appearance: Appearance by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.aspectRatio: AspectRatio by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backdropFilter: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backfaceVisibility: Visibility by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.background: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundAttachment: BackgroundAttachment by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundClip: BackgroundClip by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundImage: Image by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundOrigin: BackgroundOrigin by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundPosition: RelativePosition by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundRepeat: BackgroundRepeat by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.backgroundSize: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.blockSize: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottomColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottomLeftRadius: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottomRightRadius: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottomStyle: BorderStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottomWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderCollapse: BorderCollapse by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderLeftColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderLeftStyle: BorderStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderLeftWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderRadius: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderRightColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderRightStyle: BorderStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderRightWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderSpacing: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderStyle: BorderStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTopColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTopLeftRadius: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTopRightRadius: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTopStyle: BorderStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTopWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.bottom: LinearDimension by CssProperty()
var StyledElement.boxShadow by CssProperty { BoxShadows() }
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.boxSizing: BoxSizing by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.breakInside: BreakInside by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.caretColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.clear: Clear by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.clipPath: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.color: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.columnGap: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.contain: Contain by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.containerName: ContainerName by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.containerType: ContainerType by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.content: QuotedString by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.contentVisibility: ContentVisibility by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.cursor: Cursor by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.direction: Direction by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.display: Display by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.filter: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flexBasis: FlexBasis by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flexDirection: FlexDirection by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flexGrow: Number by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flexShrink: Number by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flexWrap: FlexWrap by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.float: Float by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontFamily: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontFeatureSettings: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontSize: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontSizeAdjust: Number by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontStyle: FontStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.fontWeight: FontWeight by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gap: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridArea: GridArea by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridAutoColumns: GridAutoColumns by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridAutoFlow: GridAutoFlow by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridAutoRows: GridAutoRows by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridColumn: GridColumn by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridColumnEnd: GridColumnEnd by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridColumnStart: GridColumnStart by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridRow: GridRow by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridRowEnd: GridRowEnd by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridRowStart: GridRowStart by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridTemplate: GridTemplate by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridTemplateAreas: GridTemplateAreas by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridTemplateColumns: GridTemplateColumns by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.gridTemplateRows: GridTemplateRows by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.height: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.hyphens: Hyphens by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.inlineSize: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.isolation: Isolation by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.justifyContent: JustifyContent by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.justifyItems: JustifyItems by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.justifySelf: JustifySelf by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.left: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.letterSpacing: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.lineHeight: LineHeight by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.listStylePosition: ListStylePosition by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.listStyleType: ListStyleType by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.marginBottom: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.marginLeft: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.marginRight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.marginTop: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.maxHeight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.maxWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.minHeight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.minWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.objectFit: ObjectFit by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.objectPosition: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.opacity: Number by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.order: Order by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.outline: Outline by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.outlineColor: Color by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.outlineOffset: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.outlineStyle: OutlineStyle by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.outlineWidth: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overflow: Overflow by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overflowAnchor: OverflowAnchor by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overflowWrap: OverflowWrap by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overflowX: Overflow by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overflowY: Overflow by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.overscrollBehavior: OverscrollBehavior by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.paddingBottom: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.paddingLeft: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.paddingRight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.paddingTop: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.pointerEvents: PointerEvents by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.position: Position by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.resize: Resize by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.right: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.rowGap: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollBehavior: ScrollBehavior by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollMarginBottom: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollMarginLeft: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollMarginRight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollMarginTop: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollPaddingBottom: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollPaddingLeft: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollPaddingRight: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.scrollPaddingTop: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.src: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.tableLayout: TableLayout by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.tabSize: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.textAlign: TextAlign by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.textDecoration: TextDecoration by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.textOverflow: TextOverflow by CssProperty()
var StyledElement.textShadow by CssProperty { TextShadows() }
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.textTransform: TextTransform by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.textWrap: TextWrap by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.top: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.touchAction: TouchAction by CssProperty()
var StyledElement.transform by CssProperty { Transforms() }
var StyledElement.transition by CssProperty { Transitions() }
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.transitionDelay: Time by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.transitionDuration: Time by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.transitionProperty: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.transitionTimingFunction: Timing by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.userSelect: UserSelect by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.verticalAlign: VerticalAlign by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.visibility: Visibility by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.whiteSpace: WhiteSpace by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.width: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.willChange: String by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.wordBreak: WordBreak by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.wordSpacing: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.wordWrap: WordWrap by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.zIndex: Int by CssProperty()

internal fun getShorthandValue(
    top: LinearDimension,
    right: LinearDimension,
    bottom: LinearDimension,
    left: LinearDimension,
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

