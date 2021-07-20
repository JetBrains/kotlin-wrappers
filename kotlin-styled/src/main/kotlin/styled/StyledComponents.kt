package styled

import kotlinext.js.invoke
import kotlinext.js.jsObject
import kotlinx.browser.window
import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet
import kotlinx.html.*
import org.w3c.dom.Element
import react.*
import react.dom.*
import kotlin.js.Promise

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

interface StyledElementBuilder<P : WithClassName> : RElementBuilder<P>, StyledBuilder<P> {
    fun create(): ReactElement

    companion object {
        operator fun <P : WithClassName> invoke(
            type: ComponentType<P>,
            attrs: P = jsObject(),
        ): StyledElementBuilder<P> = StyledElementBuilderImpl(type, attrs)
    }
}

class StyledElementBuilderImpl<P : WithClassName>(
    override val type: ComponentType<P>,
    attrs: P = jsObject(),
) : StyledElementBuilder<P>, RElementBuilderImpl<P>(attrs) {
    override val css = CSSBuilder()

    override fun create() = Styled.createElement(type, css, attrs, childList)
}

@ReactDsl
interface StyledDOMBuilder<out T : Tag> : RDOMBuilder<T>, StyledBuilder<DOMProps> {
    override val type get() = attrs.tagName

    override fun create() = Styled.createElement(type, css, domProps, childList)

    companion object {
        operator fun <T : Tag> invoke(factory: (TagConsumer<Unit>) -> T): StyledDOMBuilder<T> = StyledDOMBuilderImpl(factory)
    }
}

class StyledDOMBuilderImpl<out T : Tag>(factory: (TagConsumer<Unit>) -> T) : StyledDOMBuilder<T>, RDOMBuilderImpl<T>(factory) {
    override val css = CSSBuilder()
}

typealias StyledHandler<P> = StyledElementBuilder<P>.() -> Unit

fun <P : WithClassName> styled(type: RClass<P>): RBuilder.(StyledHandler<P>) -> Unit = { handler ->
    child(with(StyledElementBuilder(type)) {
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
    var globalStyles: List<ComponentType<RProps>>
}

private object GlobalStyles {
    private val component = fc<GlobalStylesComponentProps> { props ->
        props.globalStyles.forEach {
            child(it, jsObject {}, emptyList())
        }
    }

    private val root by kotlin.lazy {
        val element = window.document.body!!.appendChild(window.document.createElement("div")) as Element
        element.setAttribute("id", "sc-global-styles")
        element
    }

    private val styles = mutableListOf<ComponentType<RProps>>()

    fun add(globalStyle: ComponentType<RProps>) {
        styles.add(globalStyle)
        val reactElement = createElement(component, jsObject {
            this.globalStyles = styles
        })
        render(reactElement, root)
    }
}

fun injectGlobal(css: CSSBuilder) {
    injectGlobal(css.toString())
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

    private fun <T> wrap(type: T): T =
        cache.getOrPut(type) {
            devOverrideUseRef { rawStyled(type)({ it.css }) }
        }

    private fun <P : WithClassName> buildStyledProps(css: CSSBuilder, props: P): P {
        val styledProps = props.unsafeCast<StyledProps>()
        if (css.rules.isNotEmpty() || css.multiRules.isNotEmpty() || css.declarations.isNotEmpty()) {
            styledProps.css = css.toString()
        }
        if (css.classes.isNotEmpty()) {
            styledProps.className = css.classes.joinToString(separator = " ")
        }
        if (css.styleName.isNotEmpty()) {
            styledProps.asDynamic()["data-style"] = css.styleName.joinToString(separator = " ")
        }
        return styledProps.unsafeCast<P>()
    }

    fun createElement(type: String, css: CSSBuilder, props: WithClassName, children: List<Any>): ReactElement {
        val wrappedType = wrap(type)
        val styledProps = buildStyledProps(css, props)
        return createElement(wrappedType, styledProps, *children.toTypedArray())
    }

    fun <P : WithClassName> createElement(type: ComponentType<P>, css: CSSBuilder, props: P, children: List<Any>): ReactElement {
        val wrappedType = wrap(type)
        val styledProps = buildStyledProps(css, props)
        return createElement(wrappedType, styledProps, *children.toTypedArray())
    }
}
