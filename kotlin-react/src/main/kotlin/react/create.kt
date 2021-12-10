package react

fun ElementType<*>.create(): ReactElement =
    createElement(this)

fun <P> ElementType<P>.create(
    block: @ReactDsl P.() -> Unit,
): ReactElement
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
