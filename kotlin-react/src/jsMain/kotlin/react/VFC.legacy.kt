package react

@Deprecated("Legacy API. Please use `FC` factory method instead")
fun VFC(
    block: ChildrenBuilder.() -> Unit,
): FC<Props> =
    FC(block)

@Deprecated("Legacy API. Please use `FC` factory method instead")
fun VFC(
    displayName: String,
    block: ChildrenBuilder.() -> Unit,
): FC<Props> =
    FC(displayName, block)
