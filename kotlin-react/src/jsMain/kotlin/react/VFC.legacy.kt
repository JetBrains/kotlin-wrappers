package react

@Deprecated("Legacy API. Please use `FC` factory method instead")
fun VFC(
    block: ChildrenBuilder.() -> Unit,
): VFC =
    FC(block)

@Deprecated("Legacy API. Please use `FC` factory method instead")
fun VFC(
    displayName: String,
    block: ChildrenBuilder.() -> Unit,
): VFC =
    FC(displayName, block)
