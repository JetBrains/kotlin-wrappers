package react

import kotlinext.js.*
import kotlin.reflect.*

typealias RRender = RBuilder.() -> Unit

@DslMarker
annotation class ReactDsl

@ReactDsl
interface RBuilder {
    val childList: MutableList<Any>

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

    fun RProps.children() {
        childList.addAll(Children.toArray(children))
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> RProps.children(value: T) {
        childList.add((children as (T) -> Any).invoke(value))
    }

    /**
     * This renderEach implementation ensures that element children are appended in a React-friendly way,
     * as an array. This in turn allows React to understand whether a collection of elements has keys or not:
     *
     * https://reactjs.org/docs/lists-and-keys.html
     *
     * When you use regular forEach, React doesn't understand that those elements belong to a collection and
     * doesn't give you a warning when attrs.key is not set:
     *
     * ```
     * fun RBuilder.someItems() {
     *     items.forEach {
     *         div {
     *             +it
     *         }
     *     }
     * }
     * ```
     *
     * However, if you do this:
     *
     * ```
     * fun RBuilder.someItems() {
     *     items.renderEach {
     *         div {
     *             +it
     *         }
     *     }
     * }
     * ```
     *
     * there will be a proper warning.
     * */
    fun <T> Iterable<T>.renderEach(fn: RBuilder.(T) -> Unit) {
        childList.add(map {
            buildElement { fn(it) }
        }.toTypedArray())
    }


    fun <T> Iterable<T>.renderEachIndexed(fn: RBuilder.(Int, T) -> Unit) {
        childList.add(mapIndexed { index, it ->
            buildElement { fn(index, it) }
        }.toTypedArray())
    }

    fun ReactElement.withKey(newKey: String) {
        val index = childList.indexOf(this)
        if (index >= 0) {
            childList.removeAt(index)
            val elementWithKey = cloneElement(this, jsObject { key = newKey })
            childList.add(index, elementWithKey)
        }
    }

    fun ReactElement.withKey(newKey: Number) = withKey(newKey.toString())
}

@JsName("createBuilder")
fun RBuilder(): RBuilder =
    RBuilderImpl()

open class RBuilderImpl : RBuilder {
    override val childList = mutableListOf<Any>()
}

open class RBuilderMultiple : RBuilderImpl()

fun <T : RBuilder> buildElements(builder: T, handler: T.() -> Unit): dynamic {
    val nodes = builder.apply(handler).childList
    return when (nodes.size) {
        0 -> null
        1 -> nodes.first()
        else -> createElement(Fragment, js {}, *nodes.toTypedArray())
    }
}

fun buildElements(handler: RRender): dynamic = buildElements(RBuilder(), handler)

open class RBuilderSingle : RBuilderImpl()

inline fun <T : RBuilder> buildElement(rBuilder: T, handler: T.() -> Unit): ReactElement =
    rBuilder.apply(handler)
        .childList.first()
        .unsafeCast<ReactElement>()

inline fun buildElement(handler: RRender): ReactElement =
    buildElement(RBuilder(), handler)

interface RElementBuilder<out P : RProps> : RBuilder {
    val attrs: P

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

fun <P : RProps> RElementBuilder(attrs: P): RElementBuilder<P> =
    RElementBuilderImpl(attrs)

open class RElementBuilderImpl<out P : RProps>(override val attrs: P) : RElementBuilder<P>, RBuilderImpl()

typealias RHandler<P> = RElementBuilder<P>.() -> Unit

fun <P : RProps> forwardRef(handler: RBuilder.(P, RRef) -> Unit): RClass<P> =
    rawForwardRef { props, ref ->
        buildElements { handler(props, ref) }
    }

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("FunctionComponent", "react.FunctionComponent")
)
typealias FunctionalComponent<P> = FunctionComponent<P>

typealias FC<P> = FunctionComponent<P>

/**
 * Get functional component from [func]
 */
fun <P : RProps> functionalComponent(
    displayName: String? = null,
    func: RBuilder.(props: P) -> Unit
): FC<P> {
    val fc: dynamic = { props: P ->
        buildElements {
            func(props)
        }
    }
    if (displayName != null) {
        fc.displayName = displayName
    }
    return fc.unsafeCast<FunctionComponent<P>>()
}

