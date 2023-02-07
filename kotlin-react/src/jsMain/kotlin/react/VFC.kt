package react

fun VFC(
    block: ChildrenBuilder.() -> Unit,
): VFC {
    val component = {
        createElementOrNull(block)
    }
    return component.unsafeCast<VFC>()
}

fun VFC(
    displayName: String,
    block: ChildrenBuilder.() -> Unit,
): VFC {
    val component = VFC(block)
    component.displayName = displayName
    return component
}
