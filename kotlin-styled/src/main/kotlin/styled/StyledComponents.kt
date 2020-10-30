package styled

import kotlinext.js.*
import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.*
import org.w3c.dom.*
import react.*
import react.dom.*
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
fun keyframesName(string: String): String {
    val keyframes = keyframes(string)
    val keyframesInternal = css(keyframes.rules).asDynamic()
    val name = keyframes.getName()
    when {
        keyframesInternal is String -> injectGlobalKeyframeStyle(name, keyframesInternal)
        keyframesInternal is Array<String> -> injectGlobalKeyframeStyle(name, keyframesInternal[0])
        else -> injectGlobals(keyframesInternal)
    }
    return keyframes.getName()
}

private fun injectGlobalKeyframeStyle(name: String, style: String) {
    if (style.startsWith("@-webkit-keyframes") || style.startsWith("@keyframes")) {
        injectGlobal(style)
    } else {
        injectGlobals(arrayOf(
                "@-webkit-keyframes $name {$style}",
                "@keyframes $name {$style}"
        ))
    }
}

private fun injectGlobals(strings: Array<String>) {
    val globalStyle = devOverrideUseRef { createGlobalStyle(strings) }
    Promise.resolve(Unit).then {
        GlobalStyles.add(globalStyle)
    }
}

private external interface GlobalStylesComponentProps : RProps {
    var globalStyles: List<Any>
}

private object GlobalStyles {
    private val component = functionalComponent<GlobalStylesComponentProps> { props ->
        props.globalStyles.forEach {
            child(it, jsObject {}, emptyList())
        }
    }

    private val root by kotlin.lazy {
        val element = window.document.body!!.appendChild(window.document.createElement("div")) as Element
        element.setAttribute("id", "sc-global-styles")
        element
    }

    private val styles = mutableListOf<Component<RProps, RState>>()

    fun add(globalStyle: Component<RProps, RState>) {
        styles.add(globalStyle)
        val reactElement = createElement<GlobalStylesComponentProps>(GlobalStyles.component, jsObject {
            this.globalStyles = styles
        })
        render(reactElement, root)
    }
}

/**
 * @deprecated Use [createGlobalStyle] instead
 */
fun injectGlobal(string: String) {
    val globalStyle = devOverrideUseRef { createGlobalStyle(string) }
    Promise.resolve(Unit).then {
        GlobalStyles.add(globalStyle)
    }
}

@JsModule("react")
@JsNonModule
external object ReactModule

private fun <T> devOverrideUseRef(action: () -> T): T {
    return if (js("process.env.NODE_ENV !== 'production'")) {
        // (Very) dirty hack: styled-components calls useRef() in development mode to check if a component
        // has been created dynamically. We can't allow this call to happen because it breaks rendering, so
        // we temporarily redefine useRef.
        val useRef = ReactModule.asDynamic().useRef
        ReactModule.asDynamic().useRef = {
            throw Error("invalid hook call")
        }
        val result = action()
        ReactModule.asDynamic().useRef = useRef
        result
    } else action()
}

/**
 * @deprecated Use [createGlobalStyle] instead
 */
fun injectGlobal(handler: CSSBuilder.() -> Unit) {
    injectGlobal(CSSBuilder().apply { handler() }.toString())
}

object Styled {
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut(type) {
            devOverrideUseRef { rawStyled(type)({ it.css }) }
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
