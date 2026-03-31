package react

import js.internal.InternalApi
import js.objects.Object
import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import js.symbol.Symbol
import react.jsx.runtime.jsx

@InternalApi
inline fun ChildrenBuilder.asReactNode() =
    unsafeCast<Array<ReactNode?>>()
        .takeIf { it.isNotEmpty() }
        ?.unsafeCast<ReactNode?>()

// default key
private val DEFAULT_KEY: Symbol = Symbol("@@default-key")

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

sealed external interface ChildrenBuilder

@InternalApi
inline fun ChildrenBuilder() =
    arrayOf<ReactNode?>().unsafeCast<ChildrenBuilder>()

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
    addChildElement(
        type = type,
        props = Object.assign(unsafeJso(), props),
        defaultKey = builder.getDefaultKey(),
    )
}

@ElementBuilder
context(builder: ChildrenBuilder)
operator fun <P : Props> ElementType<P>.invoke() {
    addChildElement(
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

    val builder = ChildrenBuilder()

    val props = unsafeJso<P> {
        context(builder) {
            block()
        }
    }

    addChildElement(
        type = this,
        props = props,
        defaultKey = defaultKey,
        builderChildren = builder.asReactNode(),
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

context(builder: ChildrenBuilder)
private fun <P : Props> addChildElement(
    type: ElementType<P>,
    props: P? = null,
    defaultKey: Key?,
    builderChildren: ReactNode? = null,
) {
    val element = jsx(
        type = type,
        props = props,
        defaultKey = defaultKey,
        builderChildren = builderChildren,
    )

    builder.addChildNode(element)
}

private fun ChildrenBuilder.addChildNode(node: ReactNode?) =
    asDynamic().push(node)
