package react

import js.internal.InternalApi
import js.objects.Object
import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import js.symbol.Symbol
import react.jsx.runtime.jsxs

// default key
@PublishedApi
internal val DEFAULT_KEY: Symbol = Symbol("@@default-key")

external interface ChildrenBuilder

@InternalApi
inline fun ChildrenBuilder() =
    arrayOf<ReactNode?>().unsafeCast<ChildrenBuilder>()

@InternalApi
inline fun ChildrenBuilder.asReactNode() =
    unsafeCast<ReactNode?>()

private fun ChildrenBuilder.getDefaultKey(): Key? {
    val key: Key? = asDynamic()[DEFAULT_KEY]
    deleteProperty(this, DEFAULT_KEY)
    return key
}

// for compiler plugins
internal fun setDefaultKey(
    builder: ChildrenBuilder,
    key: Key,
) {
    builder.asDynamic()[DEFAULT_KEY] = key
}

private fun ChildrenBuilder.addChildNode(node: ReactNode?) =
    asDynamic().push(node)

private fun <P : Props> ChildrenBuilder.addChildElement(
    type: ElementType<P>,
    props: P = unsafeJso(),
    defaultKey: Key?,
) {
    val key = props.key ?: defaultKey
    deleteProperty(props, "key")

    // TODO: use `jsx` if no children?
    val element = jsxs(
        type = type,
        props = props,
        key = key,
    )

    addChildNode(element)
}


context(builder: ChildrenBuilder)
operator fun ReactNode?.unaryPlus() {
    builder.addChildNode(this)
}

context(builder: ChildrenBuilder)
operator fun String?.unaryPlus() {
    builder.addChildNode(ReactNode(this))
}

context(builder: ChildrenBuilder)
operator fun Char.unaryPlus() {
    builder.addChildNode(ReactNode(this))
}

context(builder: ChildrenBuilder)
fun <P : Props> child(
    type: ElementType<P>,
    props: P,
) {
    builder.addChildElement(
        type = type,
        props = Object.assign(unsafeJso(), props),
        defaultKey = builder.getDefaultKey(),
    )
}

@ElementBuilder
context(builder: ChildrenBuilder)
operator fun <P : Props> ElementType<P>.invoke() {
    builder.addChildElement(
        type = this,
        defaultKey = builder.getDefaultKey(),
    )
}

@ElementBuilder
context(builder: ChildrenBuilder)
operator fun <P : Props> ElementType<P>.invoke(
    block: context(ChildrenBuilder) (@ReactDsl P).() -> Unit,
) {
    val defaultKey = builder.getDefaultKey()

    val props = unsafeJso<P> {
        val builder = ChildrenBuilder()

        context(builder) { block() }

        // TODO: overloads by generics
        asDynamic().children = builder
    }

    builder.addChildElement(
        type = this,
        props = props,
        defaultKey = defaultKey,
    )
}

@ElementBuilder
context(builder: ChildrenBuilder)
operator fun <T> Provider<T>.invoke(
    value: T,
    block: context(ChildrenBuilder) () -> Unit,
) {
    invoke {
        this.value = value

        block()
    }
}
