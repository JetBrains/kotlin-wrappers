@file:Suppress("NOTHING_TO_INLINE")

package react

@Deprecated(
    message = "Legacy alias for FC",
    replaceWith = ReplaceWith("react.FC"),
)
typealias FunctionComponent<P> = FC<P>

/**
 * Get function component from [func]
 */
@Deprecated(
    message = "Legacy alias for fc",
    replaceWith = ReplaceWith("react.fc"),
)
inline fun <P : Props> functionComponent(
    noinline func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(func)

/**
 * Get function component from [func] with [displayName]
 */
@Deprecated(
    message = "Legacy alias for fc",
    replaceWith = ReplaceWith("react.fc"),
)
inline fun <P : Props> functionComponent(
    displayName: String,
    noinline func: RBuilder.(props: P) -> Unit,
): FC<P> =
    fc(displayName, func)
