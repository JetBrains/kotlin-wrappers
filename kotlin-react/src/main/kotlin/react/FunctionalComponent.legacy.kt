@file:Suppress("NOTHING_TO_INLINE")

package react

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("FunctionComponent", "react.FunctionComponent")
)
typealias FunctionalComponent<P> = FunctionComponent<P>

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("functionComponent(displayName, func)", "react.functionComponent")
)
inline fun <P : RProps> functionalComponent(
    displayName: String? = null,
    noinline func: RBuilder.(props: P) -> Unit,
) =
    functionComponent(displayName, func)
