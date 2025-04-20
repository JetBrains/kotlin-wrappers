@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
    "EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package react

import js.array.ReadonlyArray
import js.objects.unsafeJso
import js.reflect.Reflect.deleteProperty
import js.symbol.Symbol

// child array
private val CHILD_ARRAY: Symbol = Symbol("@@child-array")

private inline var ChildrenBuilder.childArray: ReadonlyArray<ReactNode?>?
    get() = asDynamic()[CHILD_ARRAY]
    set(value) {
        asDynamic()[CHILD_ARRAY] = value
    }

fun ChildrenBuilder.getChildArray(): ReadonlyArray<ReactNode?>? =
    asDynamic()[CHILD_ARRAY]

fun Props.getChildArray(): ReadonlyArray<ReactNode?>? =
    asDynamic()[CHILD_ARRAY]

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

sealed external interface ChildrenBuilder {
    inline operator fun ReactNode?.unaryPlus() {
        addChildNode(this)
    }

    inline operator fun String?.unaryPlus() {
        addChildNode(ReactNode(this))
    }

    inline operator fun Char.unaryPlus() {
        addChildNode(ReactNode(this))
    }

    inline fun <P : Props> child(
        type: ElementType<P>,
        props: P,
    ) {
        addChild(type, props)
    }

    @ElementBuilder
    inline operator fun <P : Props> ElementType<P>.invoke() {
        addChild(this)
    }

    @ElementBuilder
    inline operator fun <P : Props> ElementType<P>.invoke(
        noinline block: @ReactDsl P.() -> Unit,
    ) {
        addChild(
            type = this,
            block = block,
        )
    }

    @ElementBuilder
    inline operator fun <T> Provider<T>.invoke(
        value: T,
        noinline block: @ReactDsl ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            provider = this,
            value = value,
            block = block,
        )
    }
}

@PublishedApi
internal fun ChildrenBuilder.addChildNode(
    node: ReactNode?,
) {
    if (childArray != null) {
        childArray.asDynamic().push(node)
    } else {
        childArray = arrayOf(node)
    }
}

private fun <P : Props> childProps(
    props: P?,
    defaultKey: Key?,
): P? {
    defaultKey ?: return props

    props ?: return unsafeJso {
        key = defaultKey
    }

    if (props.key != null)
        return props

    return unsafeJso {
        +props

        key = defaultKey
    }
}

private fun <P : Props> ChildrenBuilder.addChildElement(
    type: ElementType<P>,
    props: P? = null,
    children: ReadonlyArray<ReactNode?>? = null,
    defaultKey: Key?,
) {
    val childProps = childProps(props, defaultKey)
    val element = if (children != null) {
        createElement(
            type = type,
            props = childProps,
            children = children,
        )
    } else {
        createElement(
            type = type,
            props = childProps,
        )
    }

    addChildNode(element)
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
) {
    addChildElement(
        type = type,
        defaultKey = getDefaultKey()
    )
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
    props: P,
) {
    addChildElement(
        type = type,
        props = props,
        defaultKey = getDefaultKey()
    )
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
    block: P.() -> Unit,
) {
    val defaultKey = getDefaultKey()
    val props: P = unsafeJso(block)

    addChildElement(
        type = type,
        props = props,
        children = props.getChildArray(),
        defaultKey = defaultKey,
    )
}

@PublishedApi
internal fun <T> ChildrenBuilder.addChild(
    provider: Provider<T>,
    value: T,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
) {
    addChild(
        type = provider,
        block = {
            this.value = value
            block()
        }
    )
}
