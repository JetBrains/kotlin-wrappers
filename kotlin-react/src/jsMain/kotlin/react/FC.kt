package react

fun FC(
    block: ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = {
        createElementOrNull(block)
    }
    return component.unsafeCast<FC<Props>>()
}

fun <P : Props> FC(
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElementOrNull { block(props) }
    }
    return component.unsafeCast<FC<P>>()
}

fun FC(
    displayName: String,
    block: ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = FC(block)
    component.displayName = displayName
    return component
}

fun <P : Props> FC(
    displayName: String,
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
