package react

external interface FC<in P : Props> :
    ComponentType<P> {
    var displayName: String?
}

/**
 * Get function component from [func]
 */
fun <P : Props> fc(
    func: RBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElement {
            func(props)
        }
    }
    return component.unsafeCast<FC<P>>()
}

/**
 * Get function component from [func] with [displayName]
 */
fun <P : Props> fc(
    displayName: String,
    func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(func).also { it.displayName = displayName }
