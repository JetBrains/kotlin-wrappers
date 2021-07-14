@file:Suppress("NOTHING_TO_INLINE")

package react

external interface FunctionComponent<in P : RProps> :
    ComponentType<P>

typealias FC<P> = FunctionComponent<P>

/**
 * Get function component from [func]
 */
fun <P : RProps> functionComponent(
    displayName: String? = null,
    func: RBuilder.(props: P) -> Unit,
): FC<P> {
    val fc: dynamic = { props: P ->
        buildElements {
            func(props)
        }
    }
    if (displayName != null) {
        fc.displayName = displayName
    }
    return fc.unsafeCast<FC<P>>()
}

/**
 * Get function component from [func]
 */
inline fun <P : RProps> fc(
    displayName: String? = null,
    noinline func: RBuilder.(props: P) -> Unit,
) =
    functionComponent(displayName, func)
