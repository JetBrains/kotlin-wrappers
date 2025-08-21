package react

import js.reflect.unsafeCast


/**
 * Get function component from [func]
 */
fun <P : Props> fc(
    func: RBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElement<P> {
            func(props)
        }
    }
    return unsafeCast(component)
}

/**
 * Get function component from [func] with [displayName]
 */
fun <P : Props> fc(
    displayName: String,
    func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(func).also { it.displayName = displayName }
