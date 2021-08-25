package react

import kotlinext.js.jsObject

fun Children.forEachElement(children: Any?, handler: (ReactElement) -> Unit) =
    forEach(children) {
        val element = it.asElementOrNull()
        element?.let(handler)
    }

inline fun <P : Props> cloneElement(
    element: ReactElement,
    vararg child: ReactNode?,
    props: P.() -> Unit,
): ReactElement = cloneElement(element, jsObject(props), *child)

// 16.6+
fun SuspenseProps.fallback(handler: Render) {
    asDynamic().fallback = buildElements(handler)
}
