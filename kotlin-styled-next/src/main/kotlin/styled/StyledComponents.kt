package styled

import kotlinext.js.clone
import kotlinx.css.CssBuilder
import kotlinx.css.CssDsl
import kotlinx.css.RuleSet
import kotlinx.html.*
import kotlinx.js.delete
import kotlinx.js.jso
import react.*
import react.dom.DOMProps
import react.dom.RDOMBuilder
import react.dom.RDOMBuilderImpl

typealias AnyTagStyledBuilder = StyledDOMBuilder<CommonAttributeGroupFacade>
typealias AnyBuilder = AnyTagStyledBuilder.() -> Unit

typealias HTMLTagBuilder = StyledDOMBuilder<HTMLTag>.() -> Unit

typealias ABuilder = StyledDOMBuilder<A>.() -> Unit
typealias DIVBuilder = StyledDOMBuilder<DIV>.() -> Unit
typealias SPANBuilder = StyledDOMBuilder<SPAN>.() -> Unit
typealias INPUTBuilder = StyledDOMBuilder<INPUT>.() -> Unit

external interface CustomStyledProps : Props {
    var css: CssBuilder?
}

inline fun CustomStyledProps.forwardCss(builder: CssBuilder) {
    css?.let { builder.append(it) }
}

inline fun CustomStyledProps.forwardCss(props: CustomStyledProps) {
    css?.let { c ->
        props.css = (props.css ?: CssBuilder(isHolder = true)).apply {
            append(c)
        }
    }
}

@CssDsl
interface StyledBuilder<P : PropsWithClassName> {
    val css: CssBuilder
    val type: Any
}

inline fun StyledBuilder<*>.css(handler: RuleSet) = css.handler()

interface StyledElementBuilder<P : PropsWithClassName> : RElementBuilder<P>, StyledBuilder<P> {
    fun create(): ReactElement<*>

    companion object {
        operator fun <P : PropsWithClassName> invoke(
            type: ElementType<P>,
            attrs: P = jso(),
        ): StyledElementBuilder<P> = StyledElementBuilderImpl(type, attrs)
    }
}

class StyledElementBuilderImpl<P : PropsWithClassName>(
    override val type: ElementType<P>,
    attrs: P = jso(),
) : StyledElementBuilder<P>, RElementBuilderImpl<P>(attrs) {
    override val css = CssBuilder()

    override fun create() = Styled.createElement(type, css, attrs, childList)
}

@ReactDsl
interface StyledDOMBuilder<out T : Tag> : RDOMBuilder<T>, StyledBuilder<DOMProps> {
    override val type get() = attrs.tagName

    override fun create() = Styled.createElement(type, css, domProps, childList)

    companion object {
        operator fun <T : Tag> invoke(factory: (TagConsumer<Unit>) -> T): StyledDOMBuilder<T> =
            StyledDOMBuilderImpl(factory)
    }
}

class StyledDOMBuilderImpl<out T : Tag>(factory: (TagConsumer<Unit>) -> T) : StyledDOMBuilder<T>,
    RDOMBuilderImpl<T>(factory) {
    override val css = CssBuilder()
}

typealias StyledHandler<P> = StyledElementBuilder<P>.() -> Unit

fun <P : PropsWithClassName> styled(type: ElementType<P>): RBuilder.(StyledHandler<P>) -> Unit = { handler ->
    child(with(StyledElementBuilder(type)) {
        handler()
        create()
    })
}

inline fun CustomStyledProps.css(noinline handler: RuleSet) {
    css = (css ?: CssBuilder(isHolder = true)).apply(handler)
}

@Suppress("NOTHING_TO_INLINE")
inline fun <P : CustomStyledProps> RElementBuilder<P>.css(noinline handler: RuleSet) = attrs.css(handler)

internal external interface StyledProps : PropsWithClassName, PropsWithRef<Any> {
    var css: CssBuilder

    // keep track of used stylesheets
    var classes: String
}

typealias ClassNameState = HashSet<ClassName>

internal fun customStyled(type: dynamic): ElementType<StyledProps> {
    val fc = forwardRef<Any, StyledProps> { props, rRef ->
        val css = props.css
        val classes = props.classes

        val generatedClasses = if (isDevelopment()) useState<ClassNameState?>(hashSetOf()) else null
        var (isFresh, className) = useStructMemo(css) {
            GlobalStyles.getInjectedClassNames(css).also { (_, selfClassName) ->
                generatedClasses?.checkGeneratedCss(selfClassName, type.toString())
            }
        }

        // className and isFresh are used as dependencies because they have primitive types and are easily comparable in JS.
        // This hook works because className changes every time when [css] is changed, so every [css] is captured exactly once.
        useCustomInsertionEffect(isFresh, className) {
            if (isFresh) {
                GlobalStyles.injectScheduled()
            }
            cleanup {
                GlobalStyles.removeStyles(css)
            }
        }

        useCustomInsertionEffect(classes) {
            // A heuristic for tracking the usage of a new stylesheet.
            // If the element's stylesheets have changed, inject all pending stylesheets.
            GlobalStyles.injectScheduled()
        }

        val newProps = clone(props)
        if (classes.isNotEmpty()) {
            className = "$className $classes"
        }
        if (props.className != undefined) {
            className = "${props.className} $className"
        }
        newProps.className = className
        newProps.ref = rRef
        delete(newProps.css)
        delete(newProps.classes)
        child(createElement(type.unsafeCast<ElementType<StyledProps>>(), newProps))
    }
    fc.asDynamic().displayName = "styled${type.toString().replaceFirstChar { it.titlecase() }}"
    return fc
}

/**
 * Show a warning when too many css blocks are created for one component
 */
internal fun StateInstance<ClassNameState?>.checkGeneratedCss(className: ClassName, type: String) {
    val (classes, setClasses) = this
    // Message was already shown
    if (classes == null) return

    val maxStylesForElement = 50
    val size = classes.size
    classes.add(className)
    if (classes.size > maxStylesForElement) {
        console.warn(
            "Over $maxStylesForElement were generated for $type. Consider using inline styles for frequently changed styles:\n\n" +
                    "styledDiv {\n" +
                    "    inlineStyles {\n" +
                    "        width = 100.px\n" +
                    "        backgroundColor = Color.blue\n" +
                    "    }\n" +
                    "}\n"
        )
        setClasses(null)
    } else {
        if (size != classes.size) {
            setClasses(classes)
        }
    }
}

internal fun List<String>.toClassName(): String {
    return this.joinToString(" ")
}

object Styled {
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut<dynamic, ElementType<StyledProps>>(type) {
            customStyled(type)
        }

    fun createElement(type: Any, css: CssBuilder, props: PropsWithClassName, children: List<ReactNode>): ReactElement<*> {
        val wrappedType = wrap(type)
        val styledProps = props.unsafeCast<StyledProps>()
        styledProps.css = css
        styledProps.classes = css.classes.toClassName()
        return createElement(wrappedType, styledProps, *children.toTypedArray())
    }
}
