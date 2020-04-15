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

external interface StylerConfig {
    var displayName: String
    var componentId: String
}

external interface Styler : TemplateTag<(StyledProps) -> String, dynamic> {
    fun withConfig(config: StylerConfig): Styler
}

external interface Keyframes {
    fun getName(): String
}

@JsModule("styled-components")
external object StyledComponents {
    fun default(target: dynamic): Styler

    // A helper method to create keyframes for animations.
    val keyframes: TemplateTag<Nothing, Keyframes>

    // A helper function to generate CSS from a template literal with interpolations.
    // You need to use this if you return a template literal with functions inside an
    // interpolation due to how tagged template literals work in JavaScript.
    val css: TemplateTag<dynamic, String>

    // A helper function to generate a special StyledComponent that handles global styles.
    // Normally, styled components are automatically scoped to a local CSS class and therefore
    // isolated from other components. In the case of createGlobalStyle, this limitation is removed
    // and things like CSS resets or base stylesheets can be applied.
    val createGlobalStyle: TemplateTag<Nothing, Component<RProps, RState>>

    // A utility to help identify styled components.
    val isStyledComponent: Boolean
}

/**
 * @deprecated Use [StyledComponents.keyframes] and [StyledComponents.css] instead
 */
inline fun StyledComponents.keyframesName(string: String): String {
    val keyframe = keyframes(string)
    injectGlobal(css(keyframe))

    return keyframe.getName()
}

private var globalStylesCounter = 0

/**
 * @deprecated Use [StyledComponents.createGlobalStyle] instead
 */
fun StyledComponents.injectGlobal(string: String) {
    val globalStyleComponent = createGlobalStyle(string)
    val element = window.document.body!!.appendChild(window.document.createElement("div")) as Element
    element.setAttribute("id", "sc-global-style-${globalStylesCounter++}")
    val reactElement = createElement(globalStyleComponent, jsObject())
    Promise.resolve(Unit).then {
        render(reactElement, element)
    }
}

fun StyledComponents.injectGlobal(handler: CSSBuilder.() -> Unit) {
    StyledComponents.injectGlobal(CSSBuilder().apply { handler() }.toString())
}

object Styled {
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut(type) {
            (StyledComponents.default(type))({ it.css })
        }

    fun createElement(type: Any, css: CSSBuilder, props: WithClassName, children: List<Any>): ReactElement {
        if (css.rules.isNotEmpty() || css.declarations.isNotEmpty()) {
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
