package react

import js.core.ReadonlyArray
import js.core.Symbol

private val CHILDREN = Symbol("@@children")

internal inline var ChildrenBuilder.children: ReadonlyArray<ReactNode?>?
    get() = asDynamic()[CHILDREN]
    private set(value) {
        asDynamic()[CHILDREN] = value
    }

@ReactDsl
sealed interface ChildrenBuilder {
    operator fun ReactNode?.unaryPlus() {
        addChild(this)
    }

    operator fun String?.unaryPlus() {
        +ReactNode(this)
    }

    operator fun Char.unaryPlus() {
        +ReactNode(this)
    }

    fun <P : Props> child(
        type: ElementType<P>,
        props: P,
    ) {
        +createElement(type, props)
    }

    operator fun <P : Props> ElementType<P>.invoke() {
        +createElement(this)
    }

    operator fun <P> ElementType<P>.invoke(
        block: @ReactDsl P.() -> Unit,
    ) where P : Props,
            P : ChildrenBuilder {
        +create(block)
    }

    @Deprecated("Unsafe call. `value` type check doesn't work")
    operator fun <T, P : PropsWithValue<T>> ElementType<P>.invoke(
        value: T,
    ) {
        this {
            this.value = value
        }
    }

    operator fun <T> Provider<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            provider = this,
            value = value,
            block = block,
        )
    }

    operator fun <T> Context<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }

    operator fun <T : Any> RequiredContext<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }
}

private fun ChildrenBuilder.addChild(
    element: ReactNode?,
) {
    if (children != null) {
        children.asDynamic().push(element)
    } else {
        children = arrayOf(element)
    }
}

private fun <T> ChildrenBuilder.addChild(
    provider: Provider<T>,
    value: T,
    block: ChildrenBuilder.() -> Unit,
) {
    provider {
        this.value = value

        block()
    }
}

private fun <T> ChildrenBuilder.addChild(
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

private fun <T : Any> ChildrenBuilder.addChild(
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

@JsName("createChildrenBuilder")
internal fun ChildrenBuilder(): ChildrenBuilder =
    ChildrenBuilderImpl()

private class ChildrenBuilderImpl : ChildrenBuilder
