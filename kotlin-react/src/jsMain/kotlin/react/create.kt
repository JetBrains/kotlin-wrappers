package react

import js.core.jso

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    createElement(this)

fun <T, P : PropsWithValue<T>> ElementType<P>.create(
    value: T,
): ReactElement<P> =
    createElement(
        type = this,
        props = jso {
            this.value = value
        }
    )

fun <P> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P>
        where P : Props,
              P : ChildrenBuilder {
    val builder = ChildrenBuilder()

    val props = builder
        .unsafeCast<P>()
        .apply(block)

    val children = builder.children
        ?: emptyArray()

    return createElement(
        type = this,
        props = props,
        children = children,
    )
}
