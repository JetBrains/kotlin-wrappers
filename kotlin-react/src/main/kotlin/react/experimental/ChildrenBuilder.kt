package react.experimental

import kotlinext.js.Object
import kotlinext.js.ReadonlyArray
import react.*

internal inline var ChildrenBuilder.children: ReadonlyArray<ReactNode>?
    get() = asDynamic().children
    set(value) {
        asDynamic().children = value
    }

@ReactDsl
interface ChildrenBuilder {
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
        block: P.() -> Unit,
    ) where P : Props,
            P : ChildrenBuilder {
        val props = ChildrenBuilder()
            .unsafeCast<P>()
            .apply(block)

        child(this, props)
    }

    operator fun <T> Provider<T>.invoke(
        value: T,
        block: Render,
    ) {
        this {
            this.value = value

            block()
        }
    }

    fun PropsWithChildren.children() {
        // TODO: optimize
        children?.forEach(::child)
    }
}

@JsName("createChildrenBuilder")
fun ChildrenBuilder(): ChildrenBuilder =
    ChildrenBuilderImpl()

private class ChildrenBuilderImpl : ChildrenBuilder
