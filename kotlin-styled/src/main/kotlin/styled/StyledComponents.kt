package styled

import kotlinext.js.*
import kotlinx.css.*
import kotlinx.html.*
import org.w3c.dom.*
import react.*
import react.dom.*
import kotlin.browser.*
import kotlin.js.*

typealias AnyTagStyledBuilder = StyledDOMBuilder<CommonAttributeGroupFacade>
typealias AnyBuilder = AnyTagStyledBuilder.() -> Unit

typealias HTMLTagBuilder = StyledDOMBuilder<HTMLTag>.() -> Unit

typealias ABuilder = StyledDOMBuilder<A>.() -> Unit
typealias DIVBuilder = StyledDOMBuilder<DIV>.() -> Unit
typealias SPANBuilder = StyledDOMBuilder<SPAN>.() -> Unit
typealias INPUTBuilder = StyledDOMBuilder<INPUT>.() -> Unit

external interface CustomStyledProps : RProps {
    var css: ArrayList<RuleSet>?
}

inline fun CustomStyledProps.forwardCss(builder: CSSBuilder) {
    css?.forEach { it(builder) }
}

inline fun CustomStyledProps.forwardCss(props: CustomStyledProps) {
    css?.forEach { c ->
        if (props.css == null) {
            props.css = ArrayList()
        }
        props.css!!.add(c)
    }
}

interface StyledBuilder<P : WithClassName> {
    val css: CSSBuilder
    val type: Any
}

inline fun StyledBuilder<*>.css(handler: RuleSet) = css.handler()

class StyledElementBuilder<P : WithClassName>(
    override val type: Any,
    attrs: P = jsObject()
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

@Suppress("NOTHING_TO_INLINE")
inline fun <P : CustomStyledProps> RElementBuilder<P>.css(noinline handler: RuleSet) = attrs.css(handler)

/**
 * @deprecated Use [keyframes] and [css] instead
 */
@Suppress("NOTHING_TO_INLINE")
inline fun keyframesName(string: String): String {
    val keyframe = keyframes(string)
    injectGlobal(css(keyframe))

    return keyframe.getName()
}

private var globalStylesCounter = 0

/**
 * @deprecated Use [createGlobalStyle] instead
 */
fun injectGlobal(string: String) {
    val globalStyleComponent = createGlobalStyle(string)
    val element = window.document.body!!.appendChild(window.document.createElement("div")) as Element
    element.setAttribute("id", "sc-global-style-${globalStylesCounter++}")
    val reactElement = createElement(globalStyleComponent, js {})
    Promise.resolve(Unit).then {
        render(reactElement, element)
    }
}

fun injectGlobal(handler: CSSBuilder.() -> Unit) {
    injectGlobal(CSSBuilder().apply { handler() }.toString())
}

object Styled {
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut(type) {
            rawStyled(type)({ it.css })
        }

    fun createElement(type: Any, css: CSSBuilder, props: WithClassName, children: List<Any>): ReactElement {
        if (css.rules.isNotEmpty() || css.multiRules.isNotEmpty() || css.declarations.isNotEmpty()) {
            val wrappedType = wrap(type)
            val styledProps = props.unsafeCast<StyledProps>()
            styledProps.css = css.toString()
            if (css.classes.isNotEmpty()) {
                styledProps.className = css.classes.joinToString(separator = " ")
            }
            if (css.styleName.isNotEmpty()) {
                styledProps.asDynamic()["data-style"] = css.styleName.joinToString(separator = " ")
            }
            return createElement(wrappedType, styledProps, *children.toTypedArray())
        } else {
            if (css.classes.isNotEmpty()) {
                props.className = css.classes.joinToString(separator = " ")
            }
            return createElement(type, props, *children.toTypedArray())
        }
    }
}
