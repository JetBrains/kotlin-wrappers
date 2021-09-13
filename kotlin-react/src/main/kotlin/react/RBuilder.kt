package react

import kotlinext.js.js
import kotlinext.js.jso
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
        props: P = jso(),
        handler: RHandler<P>? = null,
    ) {
        if (handler == null) {
            child(createElement(type, props))
            return
        }

        val children = with(RElementBuilder(props)) {
            handler()
            childList
        }
        child(type, props, children)
    }

    private fun <P : Props> child(
        type: ElementType<P>,
        props: P,
        children: List<ReactNode>,
    ) {
        child(createElement(type, props, *children.toTypedArray()))
    }

    operator fun <P : Props> ElementType<P>.invoke() {
        child(createElement(this))
    }

    operator fun <P : Props> ElementType<P>.invoke(
        handler: RHandler<P>,
    ) {
        child(this, handler = handler)
    }

    operator fun <T> Provider<T>.invoke(
        value: T,
        handler: RHandler<ProviderProps<T>>,
    ) {
        child(this) {
            attrs.value = value
            handler()
        }
    }

    operator fun <T> Consumer<T>.invoke(
        handler: RBuilder.(T) -> Unit,
    ) {
        child(this) {
            attrs.children = { value -> buildElements { handler(value) } }
        }
    }

    fun <P : Props> child(
        klazz: KClass<out Component<P, *>>,
        handler: RHandler<P>,
    ) {
        klazz.react(handler)
    }

    fun PropsWithChildren.children() {
        childList.addAll(Children.toArray(children))
    }

    /**
     * Current implementation doesn't solve any problem,
     * it works in much the same way as a simple `forEach`
     * */
    @Deprecated(message = "Legacy API (use forEach)")
    fun <T> Iterable<T>.renderEach(fn: RBuilder.(T) -> Unit) {
        mapTo(childList) {
            buildElement { fn(it) }
        }
    }

    /**
     * Current implementation doesn't solve any problem,
     * it works in much the same way as a simple `forEachIndexed`
     * */
    @Deprecated(message = "Legacy API (use forEachIndexed)")
    fun <T> Iterable<T>.renderEachIndexed(fn: RBuilder.(Int, T) -> Unit) {
        mapIndexedTo(childList) { index, it ->
            buildElement { fn(index, it) }
        }
    }

    private fun ReactElement.deprecatedWithKey(newKey: Key) {
        val index = childList.indexOf(this)
        if (index >= 0) {
            childList.removeAt(index)
            val elementWithKey = cloneElement(this, jso { key = newKey })
            childList.add(index, elementWithKey)
        }
    }

    @Deprecated("Legacy API (use cloneElement)")
    fun ReactElement.withKey(newKey: Key) = deprecatedWithKey(newKey)

    @Deprecated("Legacy API (use cloneElement)")
    fun ReactElement.withKey(newKey: Number) = deprecatedWithKey(newKey.toString())
}

@JsName("createBuilder")
fun RBuilder(): RBuilder =
    RBuilderImpl()

inline fun <P : Props, reified C : Component<P, *>> RBuilder.child(
    noinline handler: RHandler<P>,
) {
    child(C::class, handler)
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
