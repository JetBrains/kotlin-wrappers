package styled

import kotlinext.js.clone
import kotlinext.js.jso
import kotlinx.css.CssBuilder
import kotlinx.css.CssDsl
import kotlinx.css.RuleSet
import kotlinx.html.*
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
    var css: ArrayList<RuleSet>?
}

inline fun CustomStyledProps.forwardCss(builder: CssBuilder) {
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

@CssDsl
interface StyledBuilder<P : PropsWithClassName> {
    val css: CssBuilder
    val type: Any
}

inline fun StyledBuilder<*>.css(handler: RuleSet) = css.handler()

interface StyledElementBuilder<P : PropsWithClassName> : RElementBuilder<P>, StyledBuilder<P> {
    fun create(): ReactElement

    companion object {
        operator fun <P : PropsWithClassName> invoke(
            type: ComponentType<P>,
            attrs: P = jso(),
        ): StyledElementBuilder<P> = StyledElementBuilderImpl(type, attrs)
    }
}

class StyledElementBuilderImpl<P : PropsWithClassName>(
    override val type: ComponentType<P>,
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

fun <P : PropsWithClassName> styled(type: ComponentClass<P>): RBuilder.(StyledHandler<P>) -> Unit = { handler ->
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


internal external interface StyledProps : PropsWithClassName {
    var styledCss: StyledCss
    var classes: List<String>
}

internal fun customStyled(type: String): ComponentType<StyledProps> {
    val fc = forwardRef<StyledProps> { props, rRef ->
        val styledCss = props.styledCss
        val classes = props.classes

        val generatedClasses = if (isDevelopment) useState<HashSet<String>?>(hashSetOf()) else null
        val classNames = useMemo(styledCss, classes) {
            val selfClassName = GlobalStyles.getInjectedClassNames(styledCss, classes)
            if (generatedClasses != null) {
                GlobalStyles.checkGeneratedCss(generatedClasses, selfClassName, type)
            }
            (classes + selfClassName).joinToString(" ")
        }

        useEffect(styledCss) {
            cleanup { GlobalStyles.removeStyles(styledCss) }
        }

        val newProps = clone(props)
        newProps.className = (if (props.className != undefined) props.className + " " else "") + classNames
        newProps.ref = rRef
        newProps.asDynamic().css = undefined
        child(createElement(type, newProps))
    }
    fc.asDynamic().displayName = "styled${type.replaceFirstChar { it.titlecase() }}"
    return fc
}

object Styled {
    private val cache = mutableMapOf<dynamic, dynamic>()

    private fun wrap(type: dynamic) =
        cache.getOrPut<dynamic, ComponentType<StyledProps>>(type) {
            customStyled(type)
        }

    fun createElement(type: Any, css: CssBuilder, props: PropsWithClassName, children: List<ReactNode>): ReactElement {
        val wrappedType = wrap(type)
        val styledProps = props.unsafeCast<StyledProps>()
        styledProps.styledCss = css.toStyledCss()
        styledProps.classes = css.classes
        return createElement(wrappedType, styledProps, *children.toTypedArray())
    }
}
