package react

import kotlinext.js.jso

fun createElement(block: Render): ReactElement? {
    val nodes = RBuilder().apply(block).childList

    return when {
        nodes.size == 0 -> null
        nodes.size == 1 && isValidElement(nodes.first()) -> nodes.first().unsafeCast<ReactElement>()
        else -> createElement(Fragment, child = nodes.toTypedArray())
    }
}

inline fun <P : Props> cloneElement(
    element: ReactElement,
    vararg child: ReactNode?,
    props: P.() -> Unit,
): ReactElement = cloneElement(element, jso(props), *child)
