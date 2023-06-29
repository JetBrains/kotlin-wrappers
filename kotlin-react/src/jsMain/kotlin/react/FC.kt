package react

fun FC(
    block: ChildrenBuilder.() -> Unit,
): VFC {
    val component = {
        createElementOrNull(block)
    }
    return component.unsafeCast<VFC>()
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
): VFC {
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
