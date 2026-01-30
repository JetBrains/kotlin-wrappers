package react

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? =
    Fragment.create(block)
        .takeIf { it.props.children != null }
