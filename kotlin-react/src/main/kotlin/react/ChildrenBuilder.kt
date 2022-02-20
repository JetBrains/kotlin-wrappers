package react

import kotlinx.js.Object
import kotlinx.js.ReadonlyArray
import kotlinx.js.Symbol

private val CHILDREN = Symbol("@@children")

internal inline var ChildrenBuilder.children: ReadonlyArray<ReactNode>?
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
        element: ReactNode,
    ) {
        if (children != null) {
            children.asDynamic().push(element)
        } else {
            children = arrayOf(element)
        }
    }

    operator fun ReactNode.unaryPlus() {
        child(this)
    }

    operator fun String.unaryPlus() {
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

    operator fun <T> Provider<T>.invoke(
        value: T,
        block: ChildrenBuilder.() -> Unit,
    ) {
        this {
            this.value = value

            block()
        }
    }

    fun PropsWithChildren.children() {
        Children.toArray(children)
            .forEach(::child)
    }
}

@JsName("createChildrenBuilder")
internal fun ChildrenBuilder(): ChildrenBuilder =
    ChildrenBuilderImpl()

private class ChildrenBuilderImpl : ChildrenBuilder
