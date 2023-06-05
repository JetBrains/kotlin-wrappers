package react

import js.core.Object
import js.core.ReadonlyArray
import js.core.Symbol
import js.core.jso

private val CHILDREN = Symbol("@@children")

internal inline var ChildrenBuilder.children: ReadonlyArray<ReactNode?>?
    get() = asDynamic()[CHILDREN]
    private set(value) {
        asDynamic()[CHILDREN] = value
    }

@ReactDsl
sealed interface ChildrenBuilder {
    operator fun Props?.unaryPlus() {
        Object.assign(this@ChildrenBuilder, this)
    }

    fun child(
        element: ReactNode?,
    ) {
        if (children != null) {
            children.asDynamic().push(element)
        } else {
            children = arrayOf(element)
        }
    }

    operator fun ReactNode?.unaryPlus() {
        child(this)
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

    operator fun <T, P : PropsWithValue<T>> ElementType<P>.invoke(
        value: T,
    ) {
        child(
            type = this,
            props = jso {
                this.value = value
            },
        )
    }

    operator fun <T, P> ElementType<P>.invoke(
        value: T,
        block: @ReactDsl P.() -> Unit,
    ) where P : PropsWithValue<T>,
            P : ChildrenBuilder {
        this {
            this.value = value

            block()
        }
    }

    operator fun <T> Context<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        Provider(
            value = value,
            block = block,
        )
    }

    operator fun <T : Any> RequiredContext<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        Provider(
            value = value,
            block = block,
        )
    }
}

@JsName("createChildrenBuilder")
internal fun ChildrenBuilder(): ChildrenBuilder =
    ChildrenBuilderImpl()

private class ChildrenBuilderImpl : ChildrenBuilder
