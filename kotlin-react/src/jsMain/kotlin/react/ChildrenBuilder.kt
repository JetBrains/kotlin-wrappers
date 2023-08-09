@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
    "EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react

import js.core.ReadonlyArray
import js.core.Symbol
import js.core.jso

private val CHILD_ARRAY = Symbol("@@child-array")

internal inline var ChildrenBuilder.childArray: ReadonlyArray<ReactNode?>?
    get() = asDynamic()[CHILD_ARRAY]
    private set(value) {
        asDynamic()[CHILD_ARRAY] = value
    }

@ReactDsl
sealed external interface ChildrenBuilder {
    inline operator fun ReactNode?.unaryPlus() {
        addChild(this)
    }

    inline operator fun String?.unaryPlus() {
        addChild(ReactNode(this))
    }

    inline operator fun Char.unaryPlus() {
        addChild(ReactNode(this))
    }

    inline fun <P : Props> child(
        type: ElementType<P>,
        props: P,
    ) {
        addChild(type, props)
    }

    inline operator fun <P : Props> ElementType<P>.invoke() {
        addChild(this)
    }

    inline operator fun <P> ElementType<P>.invoke(
        noinline block: @ReactDsl P.() -> Unit,
    ) where P : Props,
            P : ChildrenBuilder {
        addChild(
            type = this,
            block = block,
        )
    }

    @Deprecated("Unsafe call. `value` type check doesn't work")
    inline operator fun <T, P : PropsWithValue<T>> ElementType<P>.invoke(
        value: T,
    ) {
        addChild(
            type = this,
            props = jso { this.value = value },
        )
    }

    inline operator fun <T> Provider<T>.invoke(
        value: T,
        noinline block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            provider = this,
            value = value,
            block = block,
        )
    }

    inline operator fun <T> Context<T>.invoke(
        value: T,
        noinline block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }

    inline operator fun <T : Any> RequiredContext<T>.invoke(
        value: T,
        noinline block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }
}

@PublishedApi
internal fun ChildrenBuilder.addChild(
    element: ReactNode?,
) {
    if (childArray != null) {
        childArray.asDynamic().push(element)
    } else {
        childArray = arrayOf(element)
    }
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
) {
    addChild(createElement(type))
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
    props: P,
) {
    addChild(createElement(type, props))
}

@PublishedApi
internal fun <P> ChildrenBuilder.addChild(
    type: ElementType<P>,
    block: P.() -> Unit,
) where P : Props,
        P : ChildrenBuilder {
    addChild(type.create(block))
}

@PublishedApi
internal fun <T> ChildrenBuilder.addChild(
    provider: Provider<T>,
    value: T,
    block: ChildrenBuilder.() -> Unit,
) {
    addChild(
        type = provider,
        block = {
            this.value = value
            block()
        }
    )
}

@PublishedApi
internal fun <T> ChildrenBuilder.addChild(
    context: Context<T>,
    value: T,
    block: ChildrenBuilder.() -> Unit,
) {
    addChild(
        provider = context.Provider,
        value = value,
        block = block,
    )
}

@PublishedApi
internal fun <T : Any> ChildrenBuilder.addChild(
    context: RequiredContext<T>,
    value: T,
    block: ChildrenBuilder.() -> Unit,
) {
    addChild(
        provider = context.Provider,
        value = value,
        block = block,
    )
}
