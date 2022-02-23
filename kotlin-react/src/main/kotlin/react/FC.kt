package react

fun <P : Props> FC(
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElementOrNull { block(props) }
    }
    return component.unsafeCast<FC<P>>()
}

fun <P : Props> FC(
    displayName: String,
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
