package react

import kotlinext.js.*
import kotlin.reflect.*

@DslMarker
annotation class ReactDsl

@ReactDsl
open class RBuilder {
    val childList = mutableListOf<Any>()

    fun <T : Child> child(element: T): T {
        childList.add(element)
        return element
    }

    operator fun Child.unaryPlus() {
        childList.add(this)
    }

    operator fun String.unaryPlus() {
        childList.add(this)
    }

    fun <P : RProps> child(
        type: Any,
        props: P,
        children: List<Any>
    ): ReactElement =
        child(createElement(type, props, *children.toTypedArray()))

    fun <P : RProps> child(
        type: Any,
        props: P,
        handler: RHandler<P>
    ): ReactElement {
        val children = with(RElementBuilder(props)) {
            handler()
            childList
        }
        return child(type, props, children)
    }

    operator fun <P : RProps> RClass<P>.invoke(
        handler: RHandler<P>
    ): ReactElement =
        child(this, jsObject(), handler)

    operator fun <T> RProvider<T>.invoke(
        value: T,
        handler: RHandler<RProviderProps<T>>
    ): ReactElement =
        child(this, jsObject { this.value = value }, handler)

    operator fun <T> RConsumer<T>.invoke(
        handler: RBuilder.(T) -> Unit
    ): ReactElement =
        child(this, jsObject<RConsumerProps<T>> {
            this.children = { value ->
                buildElements { handler(value) }
            }
        }) {}

    fun <P : RProps> RClass<P>.node(
        props: P,
        children: List<Any> = emptyList()
    ): ReactElement =
        child(this, clone(props), children)

    fun <P : RProps> child(
        klazz: KClass<out Component<P, *>>,
        handler: RHandler<P>
    ): ReactElement =
        klazz.rClass.invoke(handler)

    inline fun <P : RProps, reified C : Component<P, *>> child(
        noinline handler: RHandler<P>
    ): ReactElement =
        child(C::class, handler)

    fun <T, P : RProps> childFunction(
        klazz: KClass<out Component<P, *>>,
        handler: RHandler<P>,
        children: RBuilder.(T) -> Unit
    ): ReactElement =
        child(
            type = klazz.rClass,
            props = RElementBuilder(jsObject<P>()).apply(handler).attrs,
            children = listOf { value: T -> buildElement { children(value) } }
        )

    inline fun <T, P : RProps, reified C : Component<P, *>> childFunction(
        noinline handler: RHandler<P>,
        noinline children: RBuilder.(T) -> Unit
    ): ReactElement =
        childFunction(C::class, handler, children)

    fun <P : RProps> node(
        klazz: KClass<out Component<P, *>>,
        props: P,
        children: List<Any> = emptyList()
    ): ReactElement =
        klazz.rClass.node(props, children)

    inline fun <P : RProps, reified C : Component<P, *>> node(
        props: P,
        children: List<Any> = emptyList()
    ): ReactElement =
        node(C::class, props, children)

    fun RProps.children() {
        childList.addAll(Children.toArray(children))
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> RProps.children(value: T) {
        childList.add((children as (T) -> Any).invoke(value))
    }
}

open class RBuilderMultiple : RBuilder()

fun buildElements(handler: RBuilder.() -> Unit): dynamic {
    val nodes = RBuilder().apply(handler).childList
    return when (nodes.size) {
        0 -> null
        1 -> nodes.first()
        else -> createElement(Fragment, js {}, *nodes.toTypedArray())
    }
}

open class RBuilderSingle : RBuilder()

inline fun buildElement(handler: RBuilder.() -> Unit): ReactElement =
    RBuilder().apply(handler)
        .childList.first()
        .unsafeCast<ReactElement>()

open class RElementBuilder<out P : RProps>(open val attrs: P) : RBuilder() {
    fun attrs(handler: P.() -> Unit) {
        attrs.handler()
    }

    var key: String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.key = value
        }

    var ref: RRef
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.ref = value
        }

    fun ref(handler: (dynamic) -> Unit) {
        attrs.ref(handler)
    }
}

typealias RHandler<P> = RElementBuilder<P>.() -> Unit

fun <P : RProps> forwardRef(handler: RBuilder.(P, RRef) -> Unit): RClass<P> =
    rawForwardRef { props, ref ->
        buildElements { handler(props, ref) }
    }

typealias FunctionalComponent<P> = (props: P) -> dynamic

/**
 * Get functional component from [func]
 */
fun <P : RProps> functionalComponent(
    displayName: String? = null,
    func: RBuilder.(props: P) -> Unit
): FunctionalComponent<P> {
    val fc = { props: P ->
        buildElements {
            func(props)
        }
    }
    if (displayName != null) {
        fc.asDynamic().displayName = displayName
    }
    return fc
}

/**
 * Append functional component [component] as child of current builder
 */
@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun <P : RProps> RBuilder.child(
    component: FunctionalComponent<P>,
    props: P = jsObject(),
    handler: RHandler<P> = {}
): ReactElement =
    child(component, props, handler)

fun <T, P : RProps> RBuilder.childFunction(
    component: FunctionalComponent<P>,
    handler: RHandler<P> = {},
    children: RBuilder.(T) -> Unit
): ReactElement =
    childFunction(component, jsObject<P>(), handler, children)

fun <T, P : RProps> RBuilder.childFunction(
    component: FunctionalComponent<P>,
    props: P,
    handler: RHandler<P> = {},
    children: RBuilder.(T) -> Unit
): ReactElement =
    child(
        type = component,
        props = RElementBuilder(props).apply(handler).attrs,
        children = listOf { value: T -> buildElement { children(value) } }
    )
