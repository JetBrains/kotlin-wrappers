package react

import js.core.jso

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    createElement(this)

fun <P> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P>
        where P : Props,
              P : ChildrenBuilder {
    val props: P = jso(block)
    val children = props.getChildArray() ?: emptyArray()

    return createElement(
        type = this,
        props = props,
        children = children,
    )
}
