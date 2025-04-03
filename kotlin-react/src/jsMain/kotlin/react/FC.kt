package react

fun FC(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> =
    {
        createElementOrNull(block)
    }.unsafeCast<FC<Props>>()

fun <P : Props> FC(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> =
    { props: P ->
        createElementOrNull { block(props) }
    }.unsafeCast<FC<P>>()

fun FC(
    displayName: String,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = FC(block)
    component.displayName = displayName
    return component
}

fun <P : Props> FC(
    displayName: String,
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
