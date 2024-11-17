package react

import js.objects.jso

fun <P : Props> createElement(
    block: Render,
): ReactElement<P>? {
    val nodes = RBuilder().apply(block).childList

    return when {
        nodes.size == 0 -> null
        nodes.size == 1 && isValidElement(nodes.first()) -> nodes.first().unsafeCastToElement()
        else -> createElement(Fragment, children = nodes.toTypedArray()).unsafeCastToElement()
    }
}

inline fun <P : Props> cloneElement(
    element: ReactElement<P>,
    vararg children: ReactNode?,
    props: P.() -> Unit,
): ReactElement<P> =
    cloneElement(element, jso(props), *children)
