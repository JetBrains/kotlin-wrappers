package styled

import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*

typealias AnyTagStyledBuilder = StyledDOMBuilder<CommonAttributeGroupFacade>
typealias AnyBuilder = AnyTagStyledBuilder.() -> Unit

typealias HTMLTagBuilder = StyledDOMBuilder<HTMLTag>.() -> Unit

typealias ABuilder = StyledDOMBuilder<A>.() -> Unit
typealias DIVBuilder = StyledDOMBuilder<DIV>.() -> Unit
typealias SPANBuilder = StyledDOMBuilder<SPAN>.() -> Unit
typealias INPUTBuilder = StyledDOMBuilder<INPUT>.() -> Unit

external interface StyledProps : WithClassName {
    @JsName("_css")
    var css: String

    @JsName("_forwardRef")
    var forwardRef: ((Any?) -> Unit)?

    @JsName("_styleDisplayName")
    var styleDisplayName: String?
}

external interface CustomStyledProps : RProps {
    var css: ArrayList<RuleSet>?
}

inline fun CustomStyledProps.forwardCss(builder: CSSBuilder) {
    if (css != null) {
        for (c in css!!) {
            c.invoke(builder)
        }
    }
}

inline fun CustomStyledProps.forwardCss(props: CustomStyledProps) {
    if (css != null) {
        for (c in css!!) {
            if (props.css == null) {
                props.css = ArrayList()
            }
            props.css!!.add(c)
        }
    }
}

interface StyledBuilder<P : WithClassName> {
    val css: CSSBuilder
    val type: Any
}

inline fun StyledBuilder<*>.css(handler: RuleSet) = css.handler()

class StyledElementBuilder<P : WithClassName>(
    override val type: Any,
    attrs: P = jsObject {}
) : RElementBuilder<P>(attrs), StyledBuilder<P> {
    override val css = CSSBuilder()

    fun create() = Styled.createElement(type, css, attrs, childList)
}

class StyledDOMBuilder<out T : Tag>(factory: (TagConsumer<Unit>) -> T) : RDOMBuilder<T>(factory), StyledBuilder<DOMProps> {
    override val type: Any = attrs.tagName
    override val css = CSSBuilder()

    override fun create() = Styled.createElement(type, css, props, childList)
}

typealias StyledHandler<P> = StyledElementBuilder<P>.() -> Unit

fun <P : WithClassName> styled(type: RClass<P>): RBuilder.(StyledHandler<P>) -> ReactElement = { handler ->
    child(with(StyledElementBuilder<P>(type)) {
        handler()
        create()
    })
}

inline fun CustomStyledProps.css(noinline handler: RuleSet) {
    if (css == null) {
        css = ArrayList()
    }
    css!!.add(handler)
}

inline fun <P : CustomStyledProps> RElementBuilder<P>.css(noinline handler: RuleSet) = attrs.css(handler)

external interface TemplateTag<in T, out R> {
    fun call(ctx: Any?, strings: Array<String>, vararg values: T): R
}

operator fun <T, R> TemplateTag<T, R>.invoke(strings: Array<String>, vararg values: T) =
    this.call(null, strings, *values)

operator fun <T, R> TemplateTag<T, R>.invoke(string: String, vararg values: T) = this(arrayOf(string), *values)
operator fun <T, R> TemplateTag<T, R>.invoke(vararg values: T) = this(emptyArray(), *values)

external interface StylerConfig {
    var displayName: String
    var componentId: String
}

external interface Styler : TemplateTag<(StyledProps) -> String, dynamic> {
    fun withConfig(config: StylerConfig): Styler
}

@JsModule("styled-components")
external object StyledComponents {
    fun default(target: (StyledProps) -> ReactElement): Styler

    // A helper method to create keyframes for animations.
    val keyframes: TemplateTag<Nothing, String>

    // A helper method to write global CSS. It does not return a component, but adds the styles to the stylesheet directly.
    val injectGlobal: TemplateTag<Nothing, Unit>

    // A utility to help identify styled components.
    val isStyledComponent: Boolean
}

object Styled {
    private const val enabledInline = false
    private const val enabledShortCircuit = true
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut(type) {
            val extractAttrs = { styledProps: StyledProps ->
                val props = clone(styledProps)
                styledProps.forwardRef?.let {
                    props.ref = it
                }
                js("delete props._css; delete props._forwardRef; delete props._styleDisplayName;")
                createElement(type, props, props.children)
            }

            val displayName: String = when {
                type is String -> type
                type.displayName != null -> type.displayName
                type.name != null -> type.name
                else -> ""
            }
            extractAttrs.asDynamic().displayName = "__$displayName"

            (StyledComponents.default(extractAttrs))({ it.css })
        }

    fun createElement(type: Any, css: CSSBuilder, props: WithClassName, children: List<Any>): ReactElement {
        if (!enabledInline || css.rules.isNotEmpty()) {
            if (!enabledShortCircuit || css.rules.isNotEmpty() || css.declarations.size > 0) {
                val wrappedType = wrap(type)
                val styledProps = props as StyledProps
                styledProps.css = css.toString()
                if (css.classes.isNotEmpty()) {
                    styledProps.className = css.classes.joinToString(separator = " ")
                }
                val ref = styledProps.asDynamic().ref
                if (ref != null && styledProps.forwardRef == null) {
                    styledProps.forwardRef = ref
                    styledProps.ref = {}
                }
                if (css.styleName != null) {
                    styledProps.asDynamic()["data-style"] = css.styleName
                }
                return createElement(wrappedType, styledProps, *children.toTypedArray())
            }
            else {
                if (css.classes.isNotEmpty()) {
                    props.className = css.classes.joinToString(separator = " ")
                }
                return createElement(type, props, *children.toTypedArray())
            }
        }
        else {
            props.asDynamic().style = css.toStyle()
            return createElement(type, props, *children.toTypedArray())
        }
    }
}
