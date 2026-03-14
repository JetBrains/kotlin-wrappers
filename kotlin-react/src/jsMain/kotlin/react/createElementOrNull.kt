package react

internal fun createElementOrNull(
    block: ChildrenBuilder.() -> Unit,
): ReactElement<*>? =
    Fragment.create(block)
        .takeIf { it.props.children != null }
