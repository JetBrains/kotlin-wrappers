@file:Suppress("NOTHING_TO_INLINE")

package react

external interface FunctionComponent<in P : Props> :
    ComponentType<P> {
    var displayName: String?
}


typealias FC<P> = FunctionComponent<P>

/**
 * Get function component from [func]
 */
fun <P : Props> fc(
    func: RBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        buildElements {
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

/**
 * Get function component from [func]
 */
inline fun <P : Props> functionComponent(
    noinline func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(func)

/**
 * Get function component from [func] with [displayName]
 */
inline fun <P : Props> functionComponent(
    displayName: String,
    noinline func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(displayName, func)
