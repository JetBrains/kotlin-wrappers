package react

fun <P : Props> FC(
    fn: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElementOrNull { fn(props) }
    }
    return component.unsafeCast<FC<P>>()
}
