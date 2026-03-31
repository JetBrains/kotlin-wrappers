package react

internal fun createElementOrNull(
    block: context(ChildrenBuilder) () -> Unit,
): ReactElement<*>? =
    Fragment.create { block() }
        .takeIf { it.props.children != null }
