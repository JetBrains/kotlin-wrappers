package react

import js.objects.unsafeJso

fun <P : Props> ElementType<P>.create(): ReactElement<P> =
    createElement(this)

fun <P : Props> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement<P> {
    val props: P = unsafeJso(block)
    val children = props.getChildArray() ?: emptyArray()

    return createElement(
        type = this,
        props = props,
        children = children,
    )
}
