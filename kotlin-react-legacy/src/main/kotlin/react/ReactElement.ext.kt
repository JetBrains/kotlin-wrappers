package react

import kotlinx.js.jso

fun <P : Props> createElement(
    block: Render,
): ReactElement<P>? {
    val nodes = RBuilder().apply(block).childList

    return when {
        nodes.size == 0 -> null
        nodes.size == 1 && isValidElement(nodes.first()) -> nodes.first().unsafeCast<ReactElement<P>>()
        else -> createElement(Fragment, children = nodes.toTypedArray()).unsafeCast<ReactElement<P>>()
    }
}

inline fun <P : Props> cloneElement(
    element: ReactElement<P>,
    vararg children: ReactNode?,
    props: P.() -> Unit,
): ReactElement<P> =
    cloneElement(element, jso(props), *children)
