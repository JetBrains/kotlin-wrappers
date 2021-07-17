@file:Suppress("NOTHING_TO_INLINE")

package react

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("FunctionComponent", "react.FunctionComponent")
)
typealias FunctionalComponent<P> = FunctionComponent<P>

@Deprecated(
    message = "Legacy type alias",
    ReplaceWith("fc(displayName, func)", "react.fc")
)
inline fun <P : RProps> functionalComponent(
    displayName: String? = null,
    noinline func: RBuilder.(props: P) -> Unit,
): FC<P> =
    if (displayName == null) {
        fc(func)
    } else {
        fc(displayName, func)
    }
