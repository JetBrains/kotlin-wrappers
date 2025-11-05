package react

internal fun createElement(
    block: context(ChildrenBuilder) () -> Unit,
): ReactElement<*> {
    val builder = ChildrenBuilder()

    block(builder)

    return Fragment.create {
        children = builder.asReactNode()
    }
}
