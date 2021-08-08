package react

import kotlinext.js.clone
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlin.reflect.KClass

typealias Render = RBuilder.() -> Unit

@ReactDsl
interface RBuilder {
    val childList: MutableList<ReactNode>

    fun child(element: ReactNode) {
        childList.add(element)
    }

    operator fun ReactNode.unaryPlus() {
        child(this)
    }

    operator fun String.unaryPlus() {
        child(ReactNode(this))
    }

    fun <P : Props> child(
        type: ElementType<P>,
        props: P,
        children: List<Any>,
    ) {
        child(createElement(type, props, *children.toTypedArray()))
    }

    fun <P : Props> child(
        type: ElementType<P>,
        props: P,
        handler: RHandler<P>,
    ) {
        val children = with(RElementBuilder(props)) {
            handler()
            childList
        }
        child(type, props, children)
    }

    operator fun <P : Props> ElementType<P>.invoke(
        handler: RHandler<P>,
    ) {
        child(this, jsObject(), handler)
    }

    operator fun <T> Provider<T>.invoke(
        value: T,
        handler: RHandler<ProviderProps<T>>,
    ) {
        child(this, jsObject { this.value = value }, handler)
    }

    operator fun <T> Consumer<T>.invoke(
        handler: RBuilder.(T) -> Unit,
    ) {
        child(this, jsObject<ConsumerProps<T>> {
            this.children = { value ->
                buildElements { handler(value) }
            }
        }) {}
    }

    @Deprecated(
        message = "Ambiguous API",
        replaceWith = ReplaceWith("child(this, props, children)"),
    )
    fun <P : Props> ComponentClass<P>.node(
        props: P,
        children: List<Any> = emptyList(),
    ) {
        child(this, clone(props), children)
    }

    fun <P : Props> child(
        klazz: KClass<out Component<P, *>>,
        handler: RHandler<P>,
    ) {
        klazz.react.invoke(handler)
    }

    @Deprecated(
        message = "Ambiguous API",
        replaceWith = ReplaceWith("child(klazz.react, props, children)"),
    )
    fun <P : Props> node(
        klazz: KClass<out Component<P, *>>,
        props: P,
        children: List<Any> = emptyList(),
    ) {
        child(klazz.react, props, children)
    }

    fun PropsWithChildren.children() {
        childList.addAll(Children.toArray(children))
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
        mapTo(childList) {
            buildElement { fn(it) }
        }
    }


    fun <T> Iterable<T>.renderEachIndexed(fn: RBuilder.(Int, T) -> Unit) {
        mapIndexedTo(childList) { index, it ->
            buildElement { fn(index, it) }
        }
    }

    fun ReactElement.withKey(newKey: Key) {
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

inline fun <P : Props, reified C : Component<P, *>> RBuilder.child(
    noinline handler: RHandler<P>,
) {
    child(C::class, handler)
}

@Deprecated(
    message = "Ambiguous API",
    ReplaceWith("child(C::class.rClass, props, children)"),
)
inline fun <P : Props, reified C : Component<P, *>> RBuilder.node(
    props: P,
    children: List<Any> = emptyList(),
) {
    child(C::class.react, props, children)
}

open class RBuilderImpl : RBuilder {
    override val childList = mutableListOf<ReactNode>()
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

fun buildElements(handler: Render): dynamic = buildElements(RBuilder(), handler)

open class RBuilderSingle : RBuilderImpl()

inline fun <T : RBuilder> buildElement(rBuilder: T, handler: T.() -> Unit): ReactElement =
    rBuilder.apply(handler)
        .childList.first()
        .unsafeCast<ReactElement>()

inline fun buildElement(handler: Render): ReactElement =
    buildElement(RBuilder(), handler)

interface RElementBuilder<out P : Props> : RBuilder {
    val attrs: P

    fun attrs(handler: P.() -> Unit) {
        attrs.handler()
    }

    var key: Key
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.key = value
        }

    var ref: Ref<*>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            attrs.ref = value
        }
}

fun <P : Props> RElementBuilder(attrs: P): RElementBuilder<P> =
    RElementBuilderImpl(attrs)

open class RElementBuilderImpl<out P : Props>(override val attrs: P) : RElementBuilder<P>, RBuilderImpl()

typealias RHandler<P> = RElementBuilder<P>.() -> Unit

/**
 * Append function component [component] as child of current builder
 */
@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun <P : Props> RBuilder.child(
    component: FC<P>,
    props: P = jsObject(),
    handler: RHandler<P> = {},
) {
    child(component, props, handler)
}
